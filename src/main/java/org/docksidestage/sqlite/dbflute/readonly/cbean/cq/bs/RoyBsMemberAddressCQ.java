package org.docksidestage.sqlite.dbflute.readonly.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.docksidestage.sqlite.dbflute.readonly.cbean.cq.ciq.*;
import org.docksidestage.sqlite.dbflute.readonly.cbean.*;
import org.docksidestage.sqlite.dbflute.readonly.cbean.cq.*;

/**
 * The base condition-query of MEMBER_ADDRESS.
 * @author DBFlute(AutoGenerator)
 */
public class RoyBsMemberAddressCQ extends RoyAbstractBsMemberAddressCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected RoyMemberAddressCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public RoyBsMemberAddressCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from MEMBER_ADDRESS) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public RoyMemberAddressCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected RoyMemberAddressCIQ xcreateCIQ() {
        RoyMemberAddressCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected RoyMemberAddressCIQ xnewCIQ() {
        return new RoyMemberAddressCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join MEMBER_ADDRESS on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public RoyMemberAddressCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        RoyMemberAddressCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberAddressId;
    public ConditionValue xdfgetMemberAddressId()
    { if (_memberAddressId == null) { _memberAddressId = nCV(); }
      return _memberAddressId; }
    protected ConditionValue xgetCValueMemberAddressId() { return xdfgetMemberAddressId(); }

    /**
     * Add order-by as ascend. <br>
     * MEMBER_ADDRESS_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addOrderBy_MemberAddressId_Asc() { regOBA("MEMBER_ADDRESS_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MEMBER_ADDRESS_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addOrderBy_MemberAddressId_Desc() { regOBD("MEMBER_ADDRESS_ID"); return this; }

    protected ConditionValue _memberId;
    public ConditionValue xdfgetMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue xgetCValueMemberId() { return xdfgetMemberId(); }

    /**
     * Add order-by as ascend. <br>
     * MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER}
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER}
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _validBeginDate;
    public ConditionValue xdfgetValidBeginDate()
    { if (_validBeginDate == null) { _validBeginDate = nCV(); }
      return _validBeginDate; }
    protected ConditionValue xgetCValueValidBeginDate() { return xdfgetValidBeginDate(); }

    /**
     * Add order-by as ascend. <br>
     * VALID_BEGIN_DATE: {NotNull, DATE(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addOrderBy_ValidBeginDate_Asc() { regOBA("VALID_BEGIN_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * VALID_BEGIN_DATE: {NotNull, DATE(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addOrderBy_ValidBeginDate_Desc() { regOBD("VALID_BEGIN_DATE"); return this; }

    protected ConditionValue _validEndDate;
    public ConditionValue xdfgetValidEndDate()
    { if (_validEndDate == null) { _validEndDate = nCV(); }
      return _validEndDate; }
    protected ConditionValue xgetCValueValidEndDate() { return xdfgetValidEndDate(); }

    /**
     * Add order-by as ascend. <br>
     * VALID_END_DATE: {NotNull, DATE(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addOrderBy_ValidEndDate_Asc() { regOBA("VALID_END_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * VALID_END_DATE: {NotNull, DATE(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addOrderBy_ValidEndDate_Desc() { regOBD("VALID_END_DATE"); return this; }

    protected ConditionValue _address;
    public ConditionValue xdfgetAddress()
    { if (_address == null) { _address = nCV(); }
      return _address; }
    protected ConditionValue xgetCValueAddress() { return xdfgetAddress(); }

    /**
     * Add order-by as ascend. <br>
     * ADDRESS: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addOrderBy_Address_Asc() { regOBA("ADDRESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addOrderBy_Address_Desc() { regOBD("ADDRESS"); return this; }

    protected ConditionValue _regionId;
    public ConditionValue xdfgetRegionId()
    { if (_regionId == null) { _regionId = nCV(); }
      return _regionId; }
    protected ConditionValue xgetCValueRegionId() { return xdfgetRegionId(); }

    /**
     * Add order-by as ascend. <br>
     * REGION_ID: {NotNull, INTEGER(2000000000, 10), FK to REGION}
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addOrderBy_RegionId_Asc() { regOBA("REGION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGION_ID: {NotNull, INTEGER(2000000000, 10), FK to REGION}
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addOrderBy_RegionId_Desc() { regOBD("REGION_ID"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerProcess;
    public ConditionValue xdfgetRegisterProcess()
    { if (_registerProcess == null) { _registerProcess = nCV(); }
      return _registerProcess; }
    protected ConditionValue xgetCValueRegisterProcess() { return xdfgetRegisterProcess(); }

    /**
     * Add order-by as ascend. <br>
     * REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addOrderBy_RegisterProcess_Asc() { regOBA("REGISTER_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addOrderBy_RegisterProcess_Desc() { regOBD("REGISTER_PROCESS"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue xdfgetRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue xgetCValueRegisterUser() { return xdfgetRegisterUser(); }

    /**
     * Add order-by as ascend. <br>
     * REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateProcess;
    public ConditionValue xdfgetUpdateProcess()
    { if (_updateProcess == null) { _updateProcess = nCV(); }
      return _updateProcess; }
    protected ConditionValue xgetCValueUpdateProcess() { return xdfgetUpdateProcess(); }

    /**
     * Add order-by as ascend. <br>
     * UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addOrderBy_UpdateProcess_Asc() { regOBA("UPDATE_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addOrderBy_UpdateProcess_Desc() { regOBD("UPDATE_PROCESS"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue xdfgetUpdateUser()
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected ConditionValue xgetCValueUpdateUser() { return xdfgetUpdateUser(); }

    /**
     * Add order-by as ascend. <br>
     * UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public RoyBsMemberAddressCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        RoyMemberAddressCQ bq = (RoyMemberAddressCQ)bqs;
        RoyMemberAddressCQ uq = (RoyMemberAddressCQ)uqs;
        if (bq.hasConditionQueryMember()) {
            uq.queryMember().reflectRelationOnUnionQuery(bq.queryMember(), uq.queryMember());
        }
        if (bq.hasConditionQueryRegion()) {
            uq.queryRegion().reflectRelationOnUnionQuery(bq.queryRegion(), uq.queryRegion());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * MEMBER by my MEMBER_ID, named 'member'.
     * @return The instance of condition-query. (NotNull)
     */
    public RoyMemberCQ queryMember() {
        return xdfgetConditionQueryMember();
    }
    public RoyMemberCQ xdfgetConditionQueryMember() {
        String prop = "member";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMember()); xsetupOuterJoinMember(); }
        return xgetQueRlMap(prop);
    }
    protected RoyMemberCQ xcreateQueryMember() {
        String nrp = xresolveNRP("MEMBER_ADDRESS", "member"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new RoyMemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "member", nrp);
    }
    protected void xsetupOuterJoinMember() { xregOutJo("member"); }
    public boolean hasConditionQueryMember() { return xhasQueRlMap("member"); }

    /**
     * Get the condition-query for relation table. <br>
     * REGION by my REGION_ID, named 'region'.
     * @return The instance of condition-query. (NotNull)
     */
    public RoyRegionCQ queryRegion() {
        return xdfgetConditionQueryRegion();
    }
    public RoyRegionCQ xdfgetConditionQueryRegion() {
        String prop = "region";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryRegion()); xsetupOuterJoinRegion(); }
        return xgetQueRlMap(prop);
    }
    protected RoyRegionCQ xcreateQueryRegion() {
        String nrp = xresolveNRP("MEMBER_ADDRESS", "region"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new RoyRegionCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "region", nrp);
    }
    protected void xsetupOuterJoinRegion() { xregOutJo("region"); }
    public boolean hasConditionQueryRegion() { return xhasQueRlMap("region"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, RoyMemberAddressCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(RoyMemberAddressCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, RoyMemberAddressCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(RoyMemberAddressCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, RoyMemberAddressCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(RoyMemberAddressCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, RoyMemberAddressCQ> _myselfExistsMap;
    public Map<String, RoyMemberAddressCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(RoyMemberAddressCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, RoyMemberAddressCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(RoyMemberAddressCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return RoyMemberAddressCB.class.getName(); }
    protected String xCQ() { return RoyMemberAddressCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
