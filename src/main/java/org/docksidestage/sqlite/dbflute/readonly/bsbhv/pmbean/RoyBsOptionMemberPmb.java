package org.docksidestage.sqlite.dbflute.readonly.bsbhv.pmbean;

import java.util.*;

import org.dbflute.twowaysql.pmbean.ParameterBean;
import org.dbflute.jdbc.*;
import org.dbflute.cbean.coption.LikeSearchOption;
import org.dbflute.cbean.coption.FromToOption;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.sqlite.dbflute.readonly.allcommon.*;

/**
 * The base class for parameter-bean of OptionMember.
 * @author DBFlute(AutoGenerator)
 */
public class RoyBsOptionMemberPmb implements ParameterBean, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of memberId. */
    protected Integer _memberId;

    /** The parameter of memberName:likePrefix. */
    protected String _memberName;

    /** The option of like-search for memberName. */
    protected LikeSearchOption _memberNameInternalLikeSearchOption;

    /** The parameter of memberAccount:like. */
    protected String _memberAccount;

    /** The option of like-search for memberAccount. */
    protected LikeSearchOption _memberAccountInternalLikeSearchOption;

    /** The parameter of fromFormalizedDate:fromDate. */
    protected java.time.LocalDate _fromFormalizedDate;

    /** The parameter of toFormalizedDate:toDate. */
    protected java.time.LocalDate _toFormalizedDate;

    /** The parameter of memberStatusCode:cls(MemberStatus). */
    protected String _memberStatusCode;

    /** The parameter of displayOrder:ref(MemberStatus) :: refers to DISPLAY_ORDER: {NotNull, INTEGER(2000000000, 10)}. */
    protected Integer _displayOrder;

    /** The parameter of birthdate:fromDate|ref(Member) :: refers to BIRTHDATE: {DATE(2000000000, 10)}. */
    protected java.time.LocalDate _birthdate;

    /** The parameter of status:cls(MemberStatus)|ref(Member.MEMBER_STATUS_CODE) :: refers to MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus}. */
    protected String _status;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the parameter-bean of OptionMember.
     */
    public RoyBsOptionMemberPmb() {
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

    protected void assertFromToOptionValid(String name, FromToOption option) { PmbCustodial.assertFromToOptionValid(name, option); }
    protected FromToOption createFromToOption() { return PmbCustodial.createFromToOption(_timeZone); }

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
        sb.append(dm).append(_memberId);
        sb.append(dm).append(_memberName);
        sb.append(dm).append(_memberAccount);
        sb.append(dm).append(_fromFormalizedDate);
        sb.append(dm).append(_toFormalizedDate);
        sb.append(dm).append(_memberStatusCode);
        sb.append(dm).append(_displayOrder);
        sb.append(dm).append(_birthdate);
        sb.append(dm).append(_status);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] memberId <br>
     * @return The value of memberId. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Integer getMemberId() {
        return _memberId;
    }

    /**
     * [set] memberId <br>
     * @param memberId The value of memberId. (NullAllowed)
     */
    public void setMemberId(Integer memberId) {
        _memberId = memberId;
    }

    /**
     * [get] memberName:likePrefix <br>
     * @return The value of memberName. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getMemberName() {
        return filterStringParameter(_memberName);
    }

    /**
     * [set as prefixSearch] memberName:likePrefix <br>
     * @param memberName The value of memberName. (NullAllowed)
     */
    public void setMemberName_PrefixSearch(String memberName) {
        _memberName = memberName;
        _memberNameInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for memberName. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for memberName. (NullAllowed)
     */
    public LikeSearchOption getMemberNameInternalLikeSearchOption() {
        return _memberNameInternalLikeSearchOption;
    }

    /**
     * [get] memberAccount:like <br>
     * @return The value of memberAccount. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getMemberAccount() {
        return filterStringParameter(_memberAccount);
    }

    /**
     * [set as likeSearch] memberAccount:like <br>
     * @param memberAccount The value of memberAccount. (NullAllowed)
     * @param memberAccountOption The option of likeSearch for memberAccount which is NOT split mode. (NotNull)
     */
    public void setMemberAccount(String memberAccount, LikeSearchOption memberAccountOption) {
        assertLikeSearchOptionValid("memberAccountOption", memberAccountOption);
        _memberAccount = memberAccount;
        _memberAccountInternalLikeSearchOption = memberAccountOption;
    }

    /**
     * Get the internal option of likeSearch for memberAccount. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for memberAccount. (NullAllowed)
     */
    public LikeSearchOption getMemberAccountInternalLikeSearchOption() {
        return _memberAccountInternalLikeSearchOption;
    }

    /**
     * [get] fromFormalizedDate:fromDate <br>
     * @return The value of fromFormalizedDate. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.time.LocalDate getFromFormalizedDate() {
        return _fromFormalizedDate;
    }

    /**
     * [set as fromDate] fromFormalizedDate:fromDate <br>
     * @param fromFormalizedDate The value of fromFormalizedDate. (NullAllowed)
     */
    public void setFromFormalizedDate_FromDate(java.time.LocalDate fromFormalizedDate) {
        _fromFormalizedDate = toLocalDate(createFromToOption().compareAsDate().filterFromDate(toUtilDate(fromFormalizedDate)), java.time.LocalDate.class);
    }

    /**
     * [get] toFormalizedDate:toDate <br>
     * @return The value of toFormalizedDate. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.time.LocalDate getToFormalizedDate() {
        return _toFormalizedDate;
    }

    /**
     * [set as toDate] toFormalizedDate:toDate <br>
     * @param toFormalizedDate The value of toFormalizedDate. (NullAllowed)
     */
    public void setToFormalizedDate_ToDate(java.time.LocalDate toFormalizedDate) {
        _toFormalizedDate = toLocalDate(createFromToOption().compareAsDate().filterToDate(toUtilDate(toFormalizedDate)), java.time.LocalDate.class);
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
     * [get] displayOrder:ref(MemberStatus) :: refers to DISPLAY_ORDER: {NotNull, INTEGER(2000000000, 10)} <br>
     * @return The value of displayOrder. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Integer getDisplayOrder() {
        return _displayOrder;
    }

    /**
     * [set] displayOrder:ref(MemberStatus) :: refers to DISPLAY_ORDER: {NotNull, INTEGER(2000000000, 10)} <br>
     * @param displayOrder The value of displayOrder. (NullAllowed)
     */
    public void setDisplayOrder(Integer displayOrder) {
        _displayOrder = displayOrder;
    }

    /**
     * [get] birthdate:fromDate|ref(Member) :: refers to BIRTHDATE: {DATE(2000000000, 10)} <br>
     * @return The value of birthdate. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.time.LocalDate getBirthdate() {
        return _birthdate;
    }

    /**
     * [set as fromDate] birthdate:fromDate|ref(Member) :: refers to BIRTHDATE: {DATE(2000000000, 10)} <br>
     * @param birthdate The value of birthdate. (NullAllowed)
     */
    public void setBirthdate_FromDate(java.time.LocalDate birthdate) {
        _birthdate = toLocalDate(createFromToOption().compareAsDate().filterFromDate(toUtilDate(birthdate)), java.time.LocalDate.class);
    }

    /**
     * [get] status:cls(MemberStatus)|ref(Member.MEMBER_STATUS_CODE) :: refers to MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * @return The value of status. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getStatus() {
        return filterStringParameter(_status);
    }

    /**
     * [set] status:cls(MemberStatus)|ref(Member.MEMBER_STATUS_CODE) :: refers to MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * @param status The value of status. (NullAllowed)
     */
    public void setStatus(String status) {
        _status = status;
    }

    /**
     * [set as MemberStatus] status:cls(MemberStatus)|ref(Member.MEMBER_STATUS_CODE) :: refers to MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the property)
     */
    public void setStatusAsMemberStatus(RoyCDef.MemberStatus cdef) {
        _status = cdef != null ? cdef.code() : null;
    }

    /**
     * [set as ProvisionalMember] status:cls(MemberStatus)|ref(Member.MEMBER_STATUS_CODE) :: refers to MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     */
    public void setStatus_ProvisionalMember() {
        _status = RoyCDef.MemberStatus.ProvisionalMember.code();
    }

    /**
     * [set as FormalizedMember] status:cls(MemberStatus)|ref(Member.MEMBER_STATUS_CODE) :: refers to MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     */
    public void setStatus_FormalizedMember() {
        _status = RoyCDef.MemberStatus.FormalizedMember.code();
    }

    /**
     * [set as WithdrawalMember] status:cls(MemberStatus)|ref(Member.MEMBER_STATUS_CODE) :: refers to MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     */
    public void setStatus_WithdrawalMember() {
        _status = RoyCDef.MemberStatus.WithdrawalMember.code();
    }
}
