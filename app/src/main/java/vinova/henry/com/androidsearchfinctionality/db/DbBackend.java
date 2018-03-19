package vinova.henry.com.androidsearchfinctionality.db;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import vinova.henry.com.androidsearchfinctionality.ItemObject;

public class DbBackend extends DbObject {
    public DbBackend(Context context) {
        super(context);
    }
    public List<ItemObject> searchDictionaryWords(String searchWord){
        List<ItemObject> mItems = new ArrayList<ItemObject>();
        String query = "Select * from dictionary where word like " + "'%" + searchWord + "%'";
        Cursor cursor = this.getDbConnection().rawQuery(query, null);
        ArrayList<String> wordTerms = new ArrayList<String>();
        if(cursor.moveToFirst()){
            do{
                int id = cursor.getInt(0);
                String word = cursor.getString(cursor.getColumnIndexOrThrow("word"));
                mItems.add(new ItemObject(id, word));
            }while(cursor.moveToNext());
        }
        cursor.close();
        return mItems;
    }
}
