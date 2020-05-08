package com.owen.note_keeper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static android.provider.Contacts.SettingsColumns.KEY;

public class NoteDatabase extends SQLiteOpenHelper {

    //create the table,dbName and dbVersion using finals.
    private static final int DATABASE_VERSION = 2;
    private static final String DATABASE_NAME = "note_keeper";
    private static final String DATABASE_TABLE = "note_table";

    //variables for column names;
    private static final String KEY_ID = "id";
    private static final String KEY_TITLE = "title";
    private static final String KEY_CONTENT = "content";
    private static final String KEY_DATE = "date";
    private static final String KEY_TIME = "time";

    //Now create a constructor matching super class;
    NoteDatabase(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        //create table and pass in parameter and the key values.
        //Create Table tableName(id INT primary Key,title TEXT, content TEXT,date TEXT, time TEXT)
        String query = "CREATE TABLE " + DATABASE_TABLE + "("+KEY_ID+"INT PRIMARY KEY,"+
                KEY_TITLE + "TEXT,"+
                KEY_CONTENT + "TEXT,"+
                KEY_DATE + "TEXT,"+
                KEY_TIME + "TEXT" +")";
        //We now execute the sql
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        //check if there exist a new version of the db. otherwise drop table
        if (oldVersion>=newVersion)
            return;
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE);
        onCreate(db);

    }
}
