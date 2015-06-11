package org.docksidestage.sqlite.dbflute.vendor;

import java.util.Date;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.SubQuery;
import org.dbflute.exception.SQLFailureException;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.sqlite.dbflute.cbean.MemberCB;
import org.docksidestage.sqlite.dbflute.cbean.MemberLoginCB;
import org.docksidestage.sqlite.dbflute.cbean.PurchaseCB;
import org.docksidestage.sqlite.dbflute.exbhv.MemberBhv;
import org.docksidestage.sqlite.dbflute.exentity.Member;
import org.docksidestage.sqlite.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.7.4 (2010/09/11 Saturday)
 */
public class VendorFunctionTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                            Coalesce
    //                                                                            ========
    public void test_sepcify_derivedReferrer_option_coalesce_basic() throws Exception {
        // ## Arrange ##
        int countAll;
        {
            MemberCB cb = new MemberCB();
            countAll = memberBhv.selectCount(cb);
        }
        {
            MemberCB cb = new MemberCB();
            cb.query().derivedMemberLogin().count(new SubQuery<MemberLoginCB>() {
                public void query(MemberLoginCB subCB) {
                    subCB.specify().columnMemberLoginId();
                }
            }).equal(0);
            memberBhv.selectEntityWithDeletedCheck(cb); // expect no exception
        }
        MemberCB cb = new MemberCB();
        cb.specify().derivedMemberLogin().max(new SubQuery<MemberLoginCB>() {
            public void query(MemberLoginCB subCB) {
                subCB.specify().columnLoginDatetime();
            }
        }, Member.ALIAS_latestLoginDatetime, op -> op.coalesce("1970-01-01"));
        assertTrue(cb.toDisplaySql().contains("coalesce("));

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        assertEquals(countAll, memberList.size());
        boolean exists = false;
        for (Member member : memberList) {
            Date latestLoginDatetime = member.getLatestLoginDatetime();
            String loginDateView = DfTypeUtil.toString(latestLoginDatetime, "yyyy-MM-dd");
            log(member.getMemberName() + ": " + loginDateView);
            if ("1970-01-01".equals(loginDateView)) {
                exists = true;
            }
        }
        assertTrue(exists);
    }

    // ===================================================================================
    //                                                                               Round
    //                                                                               =====
    public void test_sepcify_derivedReferrer_option_round_basic() throws Exception {
        // ## Arrange ##
        int countAll;
        {
            MemberCB cb = new MemberCB();
            countAll = memberBhv.selectCount(cb);
        }
        MemberCB cb = new MemberCB();
        cb.specify().derivedPurchase().avg(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchaseCount();
            }
        }, Member.ALIAS_productKindCount, op -> op.round(0));
        assertTrue(cb.toDisplaySql().contains("round("));

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        assertEquals(countAll, memberList.size());
        boolean existsNotNull = true;
        boolean existsNull = true;
        for (Member member : memberList) {
            log(member.getMemberName() + ": " + member.getProductKindCount());
            if (member.getProductKindCount() != null) {
                existsNotNull = true;
            } else {
                existsNull = true;
            }
        }
        assertTrue(existsNotNull);
        assertTrue(existsNull);
    }

    // ===================================================================================
    //                                                                               Trunc
    //                                                                               =====
    public void test_sepcify_derivedReferrer_option_trunc_basic() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.specify().derivedPurchase().avg(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchaseCount();
            }
        }, Member.ALIAS_productKindCount, op -> op.trunc(0));
        assertTrue(cb.toDisplaySql().contains("trunc("));

        // ## Act ##
        try {
            memberBhv.selectList(cb);

            // ## Assert ##
            fail("SQLite does not support trunc() and truncate()");
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
        }
    }
}
