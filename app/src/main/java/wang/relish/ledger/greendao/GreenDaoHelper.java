package wang.relish.ledger.greendao;

import android.database.sqlite.SQLiteDatabase;

import wang.relish.ledger.App;

public class GreenDaoHelper {

    public static final String DB_NAME = "ledger.db";

    private static DaoMaster.DevOpenHelper devOpenHelper;
    private static SQLiteDatabase db;
    private static DaoMaster daoMaster;
    private static DaoSession daoSession;

    /**
     * 初始化greenDao
     * 建议放在Application 中进行
     */

    public static void initDatabase() {
        devOpenHelper = new DaoMaster.DevOpenHelper(App.getContext(), DB_NAME, null);//数据库名
        db = devOpenHelper.getWritableDatabase();
        daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }

    public static DaoSession getDaoSession() {
        return daoSession;
    }

    public static SQLiteDatabase getDb() {
        return db;
    }
}