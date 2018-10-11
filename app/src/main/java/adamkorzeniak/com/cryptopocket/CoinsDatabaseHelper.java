package adamkorzeniak.com.cryptopocket;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CoinsDatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "coins";
    private static final int DB_VERSION = 1;

    public CoinsDatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE COINS ("
                + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "NAME TEXT, "
                + "SYMBOL TEXT, "
                + "COIN_CAP_ID TEXT, "
                + "COIN_CALENDAR_ID TEXT, "
                + "FAVORITE NUMERIC);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
