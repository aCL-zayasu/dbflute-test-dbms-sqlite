package org.docksidestage.sqlite.dbflute.readonly.bsbhv.pmbean;

import java.util.*;

import org.dbflute.twowaysql.pmbean.ParameterBean;
import org.dbflute.jdbc.*;
import org.dbflute.cbean.coption.LikeSearchOption;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.sqlite.dbflute.readonly.allcommon.*;

/**
 * The base class for parameter-bean of MapLikeSearch.
 * @author DBFlute(AutoGenerator)
 */
public class RoyBsMapLikeSearchPmb implements ParameterBean, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of conditionMap:like. */
    protected Map<String, Object> _conditionMap;

    /** The option of like-search for conditionMap. */
    protected LikeSearchOption _conditionMapInternalLikeSearchOption;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the parameter-bean of MapLikeSearch.
     */
    public RoyBsMapLikeSearchPmb() {
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
        sb.append(dm).append(_conditionMap);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] conditionMap:like <br>
     * @return The value of conditionMap. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Map<String, Object> getConditionMap() {
        return _conditionMap;
    }

    /**
     * [set as likeSearch] conditionMap:like <br>
     * @param conditionMap The value of conditionMap. (NullAllowed)
     * @param conditionMapOption The option of likeSearch for conditionMap which is NOT split mode. (NotNull)
     */
    public void setConditionMap(Map<String, Object> conditionMap, LikeSearchOption conditionMapOption) {
        assertLikeSearchOptionValid("conditionMapOption", conditionMapOption);
        _conditionMap = conditionMap;
        _conditionMapInternalLikeSearchOption = conditionMapOption;
    }

    /**
     * Get the internal option of likeSearch for conditionMap. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for conditionMap. (NullAllowed)
     */
    public LikeSearchOption getConditionMapInternalLikeSearchOption() {
        return _conditionMapInternalLikeSearchOption;
    }
}
