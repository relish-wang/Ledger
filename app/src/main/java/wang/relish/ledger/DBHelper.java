package wang.relish.ledger;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * @author Relish Wang
 * @since 2017/09/24
 */
public final class DBHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DB_NAME = "ledger.db";

    private static volatile DBHelper HELPER = null;
    private static volatile SQLiteDatabase DB = null;

    public static SQLiteDatabase getInstance() {
        if (HELPER == null) {
            synchronized (DBHelper.class) {
                if (HELPER == null) {
                    DBHelper helper = new DBHelper();
                    DB = helper.getWritableDatabase();
                    HELPER = helper;
                }
            }
        }
        return DB;
    }


    private DBHelper() {
        super(App.CONTEXT, DB_NAME, null, VERSION, null);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
