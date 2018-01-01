package org.docksidestage.sqlite.dbflute.readonly.bsbhv.pmbean;

import java.util.*;

import org.dbflute.twowaysql.pmbean.ParameterBean;
import org.dbflute.jdbc.*;
import org.dbflute.cbean.coption.LikeSearchOption;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.sqlite.dbflute.readonly.allcommon.*;

/**
 * The base class for parameter-bean of PurchaseSummaryMember.
 * @author DBFlute(AutoGenerator)
 */
public class RoyBsPurchaseSummaryMemberPmb implements ParameterBean, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of memberNameList:likeContain. */
    protected List<String> _memberNameList;

    /** The option of like-search for memberNameList. */
    protected LikeSearchOption _memberNameListInternalLikeSearchOption;

    /** The parameter of memberStatusCode:cls(MemberStatus). */
    protected String _memberStatusCode;

    /** The parameter of formalizedDatetime. */
    protected java.time.LocalDateTime _formalizedDatetime;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the parameter-bean of PurchaseSummaryMember.
     */
    public RoyBsPurchaseSummaryMemberPmb() {
    }

    // ===================================================================================
    //                                                                       Safety Result
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    public void checkSafetyResult(int safetyMaxResultSize) {
        _safetyMaxResultSize = safetyMaxResultSize;
    }

    /**
     * {@inheritDoc}
     */
    public int getSafetyMaxResultSize() {
        return _safetyMaxResultSize;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    // -----------------------------------------------------
    //                                                String
    //                                                ------
    protected String filterStringParameter(String value) { return isEmptyStringParameterAllowed() ? value : convertEmptyToNull(value); }
    protected boolean isEmptyStringParameterAllowed() { return RoyDBFluteConfig.getInstance().isEmptyStringParameterAllowed(); }
    protected String convertEmptyToNull(String value) { return PmbCustodial.convertEmptyToNull(value); }

    protected void assertLikeSearchOptionValid(String name, LikeSearchOption option) { PmbCustodial.assertLikeSearchOptionValid(name, option); }

    // -----------------------------------------------------
    //                                                  Date
    //                                                  ----
    protected Date toUtilDate(Object date) { return PmbCustodial.toUtilDate(date, _timeZone); }
    protected <DATE> DATE toLocalDate(Date date, Class<DATE> localType) { return PmbCustodial.toLocalDate(date, localType, chooseRealTimeZone()); }
    protected TimeZone chooseRealTimeZone() { return PmbCustodial.chooseRealTimeZone(_timeZone); }

    /**
     * Set time-zone, basically for LocalDate conversion. <br>
     * Normally you don't need to set this, you can adjust other ways. <br>
     * (DBFlute system's time-zone is used as default)
     * @param timeZone The time-zone for filtering. (NullAllowed: if null, default zone)
     */
    public void zone(TimeZone timeZone) { _timeZone = timeZone; }

    // -----------------------------------------------------
    //                                    by Option Handling
    //                                    ------------------
    // might be called by option handling
    protected <NUMBER extends Number> NUMBER toNumber(Object obj, Class<NUMBER> type) { return PmbCustodial.toNumber(obj, type); }
    protected Boolean toBoolean(Object obj) { return PmbCustodial.toBoolean(obj); }
    @SuppressWarnings("unchecked")
    protected <ELEMENT> ArrayList<ELEMENT> newArrayList(ELEMENT... elements) { return PmbCustodial.newArrayList(elements); }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * @return The display string of all parameters. (NotNull)
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(DfTypeUtil.toClassTitle(this)).append(":");
        sb.append(xbuildColumnString());
        return sb.toString();
    }
    protected String xbuildColumnString() {
        final String dm = ", ";
        final StringBuilder sb = new StringBuilder();
        sb.append(dm).append(_memberNameList);
        sb.append(dm).append(_memberStatusCode);
        sb.append(dm).append(_formalizedDatetime);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] memberNameList:likeContain <br>
     * @return The value of memberNameList. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public List<String> getMemberNameList() {
        return _memberNameList;
    }

    /**
     * [set as containSearch] memberNameList:likeContain <br>
     * @param memberNameList The value of memberNameList. (NullAllowed)
     */
    public void setMemberNameList_ContainSearch(List<String> memberNameList) {
        _memberNameList = memberNameList;
        _memberNameListInternalLikeSearchOption = new LikeSearchOption().likeContain();
    }

    /**
     * Get the internal option of likeSearch for memberNameList. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for memberNameList. (NullAllowed)
     */
    public LikeSearchOption getMemberNameListInternalLikeSearchOption() {
        return _memberNameListInternalLikeSearchOption;
    }

    /**
     * [get] memberStatusCode:cls(MemberStatus) <br>
     * @return The value of memberStatusCode. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getMemberStatusCode() {
        return filterStringParameter(_memberStatusCode);
    }

    /**
     * [set] memberStatusCode:cls(MemberStatus) <br>
     * @param memberStatusCode The value of memberStatusCode. (NullAllowed)
     */
    public void setMemberStatusCode(String memberStatusCode) {
        _memberStatusCode = memberStatusCode;
    }

    /**
     * [set as MemberStatus] memberStatusCode:cls(MemberStatus) <br>
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the property)
     */
    public void setMemberStatusCodeAsMemberStatus(RoyCDef.MemberStatus cdef) {
        _memberStatusCode = cdef != null ? cdef.code() : null;
    }

    /**
     * [set as ProvisionalMember] memberStatusCode:cls(MemberStatus) <br>
     */
    public void setMemberStatusCode_ProvisionalMember() {
        _memberStatusCode = RoyCDef.MemberStatus.ProvisionalMember.code();
    }

    /**
     * [set as FormalizedMember] memberStatusCode:cls(MemberStatus) <br>
     */
    public void setMemberStatusCode_FormalizedMember() {
        _memberStatusCode = RoyCDef.MemberStatus.FormalizedMember.code();
    }

    /**
     * [set as WithdrawalMember] memberStatusCode:cls(MemberStatus) <br>
     */
    public void setMemberStatusCode_WithdrawalMember() {
        _memberStatusCode = RoyCDef.MemberStatus.WithdrawalMember.code();
    }

    /**
     * [get] formalizedDatetime <br>
     * @return The value of formalizedDatetime. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.time.LocalDateTime getFormalizedDatetime() {
        return _formalizedDatetime;
    }

    /**
     * [set] formalizedDatetime <br>
     * @param formalizedDatetime The value of formalizedDatetime. (NullAllowed)
     */
    public void setFormalizedDatetime(java.time.LocalDateTime formalizedDatetime) {
        _formalizedDatetime = formalizedDatetime;
    }
}
