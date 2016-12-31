package org.docksidestage.sqlite.unit;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import javax.transaction.SystemException;
import javax.transaction.TransactionManager;
import javax.transaction.UserTransaction;

import org.dbflute.bhv.BehaviorSelector;
import org.dbflute.bhv.BehaviorWritable;
import org.dbflute.bhv.writable.DeleteOption;
import org.dbflute.cbean.ConditionBean;
import org.dbflute.utflute.guice.ContainerTestCase;
import org.docksidestage.sqlite.EmbeddedSQLiteUrlFactoryBean;
import org.docksidestage.sqlite.dbflute.allcommon.DBCurrent;
import org.docksidestage.sqlite.dbflute.allcommon.DBFluteModule;
import org.docksidestage.sqlite.dbflute.exbhv.MemberAddressBhv;
import org.docksidestage.sqlite.dbflute.exbhv.MemberLoginBhv;
import org.docksidestage.sqlite.dbflute.exbhv.MemberSecurityBhv;
import org.docksidestage.sqlite.dbflute.exbhv.MemberServiceBhv;
import org.docksidestage.sqlite.dbflute.exbhv.MemberWithdrawalBhv;
import org.docksidestage.sqlite.dbflute.exbhv.PurchaseBhv;

import com.atomikos.icatch.jta.UserTransactionImp;
import com.atomikos.icatch.jta.UserTransactionManager;
import com.atomikos.jdbc.nonxa.AtomikosNonXADataSourceBean;
import com.google.inject.AbstractModule;
import com.google.inject.Module;

/**
 * The test case with container.
 * @author jflute
 * @since 0.9.2 (2009/02/18 Wednesday)
 */
public abstract class UnitContainerTestCase extends ContainerTestCase {

    @Override
    protected boolean isUseTestCaseLooseBinding() {
        return true;
    }
    
    @Override
    protected List<Module> prepareModuleList() {
        final DataSource dataSource = createDataSource();
        final List<Module> moduleList = new ArrayList<Module>();
        moduleList.add(new DBFluteModule(dataSource));
        final TransactionModule transactionModule = createTransactionModule(dataSource);
        if (transactionModule != null) {
            moduleList.add(transactionModule);
        }
        return moduleList;
    }

    protected DataSource createDataSource() {
        AtomikosNonXADataSourceBean bean = new AtomikosNonXADataSourceBean();
        bean.setUniqueResourceName("NONXADBMS");
        bean.setDriverClassName("org.sqlite.JDBC");
        EmbeddedSQLiteUrlFactoryBean factoryBean = new EmbeddedSQLiteUrlFactoryBean();
        factoryBean.setUrlSuffix("/database/maihamadb.db");
        factoryBean.setReferenceClassName(DBCurrent.class.getName());
        String url;
        try {
            url = factoryBean.getObject().toString();
        } catch (Exception e) {
            String msg = "The factoryBean was invalid: " + factoryBean;
            throw new IllegalStateException(msg, e);
        }
        bean.setUrl(url.toString());
        bean.setUser("sa");
        bean.setPassword("");
        bean.setPoolSize(20);
        bean.setBorrowConnectionTimeout(60);
        return bean;
    }

    protected TransactionModule createTransactionModule(DataSource dataSource) {
        return new TransactionModule(dataSource);
    }

    protected static class TransactionModule extends AbstractModule {

        protected final DataSource _dataSource;

        public TransactionModule(DataSource dataSource) {
            if (dataSource == null) {
                String msg = "The argument 'dataSource' should not be null!";
                throw new IllegalArgumentException(msg);
            }
            _dataSource = dataSource;
        }

        @Override
        protected void configure() {
            try {
                final UserTransactionImp userTransactionImp = new UserTransactionImp();
                userTransactionImp.setTransactionTimeout(300);
                UserTransactionManager userTransactionManager = new UserTransactionManager();
                userTransactionManager.setForceShutdown(true);
                userTransactionManager.init();
                bind(UserTransaction.class).toInstance(userTransactionImp);
                bind(TransactionManager.class).toInstance(userTransactionManager);
                bind(DataSource.class).toInstance(_dataSource);
            } catch (SystemException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    private BehaviorSelector _behaviorSelector;

    protected void deleteAll(Class<? extends BehaviorWritable> clazz) {
        BehaviorWritable bhv = _behaviorSelector.select(clazz);
        ConditionBean cb = bhv.newConditionBean();
        bhv.rangeRemove(cb, new DeleteOption<ConditionBean>().allowNonQueryDelete());
    }

    protected void deleteMemberReferrer() {
        deleteAll(MemberAddressBhv.class);
        deleteAll(MemberLoginBhv.class);
        deleteAll(MemberSecurityBhv.class);
        deleteAll(MemberServiceBhv.class);
        deleteAll(MemberWithdrawalBhv.class);
        deleteAll(PurchaseBhv.class);
    }
}
