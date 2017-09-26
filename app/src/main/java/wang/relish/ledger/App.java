package wang.relish.ledger;

import android.app.Application;
import android.content.Context;

import wang.relish.ledger.greendao.GreenDaoHelper;

/**
 * @author Relish Wang
 * @since 2017/09/24
 */
public class App extends Application {
    private static Context CONTEXT;

    @Override
    public void onCreate() {
        super.onCreate();
        CONTEXT = this;
        GreenDaoHelper.initDatabase();
    }

    public static Context getContext() {
        return CONTEXT;
    }
}
