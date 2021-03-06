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
 * The base condition-query of PURCHASE_PAYMENT.
 * @author DBFlute(AutoGenerator)
 */
public class RoyBsPurchasePaymentCQ extends RoyAbstractBsPurchasePaymentCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected RoyPurchasePaymentCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public RoyBsPurchasePaymentCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from PURCHASE_PAYMENT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public RoyPurchasePaymentCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected RoyPurchasePaymentCIQ xcreateCIQ() {
        RoyPurchasePaymentCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected RoyPurchasePaymentCIQ xnewCIQ() {
        return new RoyPurchasePaymentCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join PURCHASE_PAYMENT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public RoyPurchasePaymentCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        RoyPurchasePaymentCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _purchasePaymentId;
    public ConditionValue xdfgetPurchasePaymentId()
    { if (_purchasePaymentId == null) { _purchasePaymentId = nCV(); }
      return _purchasePaymentId; }
    protected ConditionValue xgetCValuePurchasePaymentId() { return xdfgetPurchasePaymentId(); }

    /**
     * Add order-by as ascend. <br>
     * PURCHASE_PAYMENT_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchasePaymentCQ addOrderBy_PurchasePaymentId_Asc() { regOBA("PURCHASE_PAYMENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PURCHASE_PAYMENT_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchasePaymentCQ addOrderBy_PurchasePaymentId_Desc() { regOBD("PURCHASE_PAYMENT_ID"); return this; }

    protected ConditionValue _purchaseId;
    public ConditionValue xdfgetPurchaseId()
    { if (_purchaseId == null) { _purchaseId = nCV(); }
      return _purchaseId; }
    protected ConditionValue xgetCValuePurchaseId() { return xdfgetPurchaseId(); }

    /**
     * Add order-by as ascend. <br>
     * PURCHASE_ID: {NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchasePaymentCQ addOrderBy_PurchaseId_Asc() { regOBA("PURCHASE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PURCHASE_ID: {NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchasePaymentCQ addOrderBy_PurchaseId_Desc() { regOBD("PURCHASE_ID"); return this; }

    protected ConditionValue _paymentAmount;
    public ConditionValue xdfgetPaymentAmount()
    { if (_paymentAmount == null) { _paymentAmount = nCV(); }
      return _paymentAmount; }
    protected ConditionValue xgetCValuePaymentAmount() { return xdfgetPaymentAmount(); }

    /**
     * Add order-by as ascend. <br>
     * PAYMENT_AMOUNT: {NotNull, DECIMAL(10,2)(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchasePaymentCQ addOrderBy_PaymentAmount_Asc() { regOBA("PAYMENT_AMOUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PAYMENT_AMOUNT: {NotNull, DECIMAL(10,2)(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchasePaymentCQ addOrderBy_PaymentAmount_Desc() { regOBD("PAYMENT_AMOUNT"); return this; }

    protected ConditionValue _paymentDatetime;
    public ConditionValue xdfgetPaymentDatetime()
    { if (_paymentDatetime == null) { _paymentDatetime = nCV(); }
      return _paymentDatetime; }
    protected ConditionValue xgetCValuePaymentDatetime() { return xdfgetPaymentDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * PAYMENT_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchasePaymentCQ addOrderBy_PaymentDatetime_Asc() { regOBA("PAYMENT_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PAYMENT_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchasePaymentCQ addOrderBy_PaymentDatetime_Desc() { regOBD("PAYMENT_DATETIME"); return this; }

    protected ConditionValue _paymentMethodCode;
    public ConditionValue xdfgetPaymentMethodCode()
    { if (_paymentMethodCode == null) { _paymentMethodCode = nCV(); }
      return _paymentMethodCode; }
    protected ConditionValue xgetCValuePaymentMethodCode() { return xdfgetPaymentMethodCode(); }

    /**
     * Add order-by as ascend. <br>
     * PAYMENT_METHOD_CODE: {NotNull, CHAR(3)(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchasePaymentCQ addOrderBy_PaymentMethodCode_Asc() { regOBA("PAYMENT_METHOD_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PAYMENT_METHOD_CODE: {NotNull, CHAR(3)(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchasePaymentCQ addOrderBy_PaymentMethodCode_Desc() { regOBD("PAYMENT_METHOD_CODE"); return this; }

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
    public RoyBsPurchasePaymentCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchasePaymentCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue xdfgetRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue xgetCValueRegisterUser() { return xdfgetRegisterUser(); }

    /**
     * Add order-by as ascend. <br>
     * REGISTER_USER: {NotNull, VARCHAR(200)(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchasePaymentCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_USER: {NotNull, VARCHAR(200)(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchasePaymentCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public RoyBsPurchasePaymentCQ addOrderBy_RegisterProcess_Asc() { regOBA("REGISTER_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchasePaymentCQ addOrderBy_RegisterProcess_Desc() { regOBD("REGISTER_PROCESS"); return this; }

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
    public RoyBsPurchasePaymentCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchasePaymentCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue xdfgetUpdateUser()
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected ConditionValue xgetCValueUpdateUser() { return xdfgetUpdateUser(); }

    /**
     * Add order-by as ascend. <br>
     * UPDATE_USER: {NotNull, VARCHAR(200)(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchasePaymentCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_USER: {NotNull, VARCHAR(200)(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchasePaymentCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public RoyBsPurchasePaymentCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchasePaymentCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public RoyBsPurchasePaymentCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public RoyBsPurchasePaymentCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, RoyPurchasePaymentCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(RoyPurchasePaymentCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, RoyPurchasePaymentCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(RoyPurchasePaymentCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, RoyPurchasePaymentCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(RoyPurchasePaymentCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, RoyPurchasePaymentCQ> _myselfExistsMap;
    public Map<String, RoyPurchasePaymentCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(RoyPurchasePaymentCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, RoyPurchasePaymentCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(RoyPurchasePaymentCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return RoyPurchasePaymentCB.class.getName(); }
    protected String xCQ() { return RoyPurchasePaymentCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
