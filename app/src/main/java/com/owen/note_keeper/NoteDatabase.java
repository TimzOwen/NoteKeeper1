package com.owen.note_keeper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

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

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
