package vinova.henry.com.androidsearchfinctionality.db;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;
import android.content.Context;

public class DatabaseConfig extends SQLiteAssetHelper {
    private static final String DATABASE_NAMES = "dictionary";
    private static final int DATABASE_VERSION = 1;
    public DatabaseConfig(Context context) {
        super(context, DATABASE_NAMES, null, DATABASE_VERSION);
    }
}
