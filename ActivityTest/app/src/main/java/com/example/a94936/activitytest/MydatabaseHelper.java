package com.example.a94936.activitytest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by 94936 on 2017/11/12.
 */

public class MydatabaseHelper extends SQLiteOpenHelper {
    public static final String CREATE_BOOK ="create table Book ("
            +"id integer primary key autoincrement,"
            +"class_number integer ,"
            +"class_time text,"
            +"weekday text,"
            +"class_state text )";

    public static final String CREATE_Answer="create table Answer("
            +"id integer primary key autoincrement,"
            +"order_class text,"
            +"order_reason text,"
            +"order_weekday text,"
            +"order_time text)";

    public static final String CREATE_Identity="create table Identity("
            +"id integer primary key autoincrement,"
            +"username text,"
            +"password text,"
            +"rank text)";

    public static final String CREATE_Back="create table Back("
            +"id integer primary key autoincrement,"
            +"result text)";

    private Context mContext;

    public MydatabaseHelper (Context context , String name, SQLiteDatabase.CursorFactory factory , int version)
    {
        super (context, name, factory, version);
        mContext =context;
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_BOOK );
        db.execSQL(CREATE_Answer );
        db.execSQL(CREATE_Identity );
        db.execSQL(CREATE_Back);
        Toast .makeText(mContext ,"Creat succeeded",Toast .LENGTH_SHORT ).show() ;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion)
    {
        db.execSQL("drop table if exists Book");
        db.execSQL("drop table if exists Answer");
        db.execSQL("drop table if exists Identity");
        db.execSQL("drop table if exists Back");
        onCreate(db);
    }
}
