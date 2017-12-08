package com.example.a94936.activitytest;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class queryshowActivity extends AppCompatActivity {
    private MydatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queryshow);

       dbHelper =new MydatabaseHelper(this,"Bookstore.db",null,6);

        TextView querydatar11 = (TextView) findViewById(R.id.text11);
        TextView querydatar12 = (TextView) findViewById(R.id.text12);
        TextView querydatar13 = (TextView) findViewById(R.id.text13);
        TextView querydatar14 = (TextView) findViewById(R.id.text14);
        TextView querydatar15 = (TextView) findViewById(R.id.text15);
        TextView querydatar21 = (TextView) findViewById(R.id.text21);
        TextView querydatar22 = (TextView) findViewById(R.id.text22);
        TextView querydatar23 = (TextView) findViewById(R.id.text23);
        TextView querydatar24 = (TextView) findViewById(R.id.text24);
        TextView querydatar25 = (TextView) findViewById(R.id.text25);
        TextView querydatar31 = (TextView) findViewById(R.id.text31);
        TextView querydatar32 = (TextView) findViewById(R.id.text32);
        TextView querydatar33 = (TextView) findViewById(R.id.text33);
        TextView querydatar34 = (TextView) findViewById(R.id.text34);
        TextView querydatar35 = (TextView) findViewById(R.id.text35);
        TextView querydatar41 = (TextView) findViewById(R.id.text41);
        TextView querydatar42 = (TextView) findViewById(R.id.text42);
        TextView querydatar43 = (TextView) findViewById(R.id.text43);
        TextView querydatar44 = (TextView) findViewById(R.id.text44);
        TextView querydatar45 = (TextView) findViewById(R.id.text45);
        TextView querydatar51 = (TextView) findViewById(R.id.text51);
        TextView querydatar52 = (TextView) findViewById(R.id.text52);
        TextView querydatar53 = (TextView) findViewById(R.id.text53);
        TextView querydatar54 = (TextView) findViewById(R.id.text54);
        TextView querydatar55 = (TextView) findViewById(R.id.text55);
        TextView querydatar61 = (TextView) findViewById(R.id.text61);
        TextView querydatar62 = (TextView) findViewById(R.id.text62);
        TextView querydatar63 = (TextView) findViewById(R.id.text63);
        TextView querydatar64 = (TextView) findViewById(R.id.text64);
        TextView querydatar65 = (TextView) findViewById(R.id.text65);
        TextView querydatar71 = (TextView) findViewById(R.id.text71);
        TextView querydatar72 = (TextView) findViewById(R.id.text72);
        TextView querydatar73 = (TextView) findViewById(R.id.text73);
        TextView querydatar74 = (TextView) findViewById(R.id.text74);
        TextView querydatar75 = (TextView) findViewById(R.id.text75);

        Intent intent = getIntent();
        String classnumber= intent.getStringExtra("class_number");

        String w1="周一";
        String w2="周一";
        String w3="周三";
        String w4="周四";
        String w5="周五";
        String w6="周六";
        String w7="周日";
        String s1="1~2节";
        String s2="3~4节";
        String s3="5~6节";
        String s4="7~8节";
        String s5="9~10节";



        String selection11 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs11 = new String[]{classnumber,w1,s1};
        SQLiteDatabase db =dbHelper .getWritableDatabase() ;
        Cursor cursor11 =db.query("Book",null,selection11,selectionArgs11,null,null,null);
        if (cursor11.moveToFirst() ){
            do{
                String class_states=cursor11.getString(cursor11.getColumnIndex("class_state") );
                querydatar11.setText(class_states);
            }while(cursor11.moveToNext());
        }
        cursor11.close();

        String selection12 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs12 = new String[]{classnumber,w1,s2};
        Cursor cursor12 =db.query("Book",null,selection12,selectionArgs12,null,null,null);
        if (cursor12.moveToFirst() ){
            do{
                String class_states=cursor12.getString(cursor12.getColumnIndex("class_state") );
                querydatar12.setText(class_states);
            }while(cursor12.moveToNext());
        }
        cursor12.close();

        String selection13 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs13 = new String[]{classnumber,w1,s3};
        Cursor cursor13 =db.query("Book",null,selection13,selectionArgs13,null,null,null);
        if (cursor13.moveToFirst() ){
            do{
                String class_states=cursor13.getString(cursor13.getColumnIndex("class_state") );
                querydatar13.setText(class_states);
            }while(cursor13.moveToNext());
        }
        cursor13.close();


        String selection14 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs14 = new String[]{classnumber,w1,s4};
        Cursor cursor14 =db.query("Book",null,selection14,selectionArgs14,null,null,null);
        if (cursor14.moveToFirst() ){
            do{
                String class_states=cursor14.getString(cursor14.getColumnIndex("class_state") );
                querydatar14.setText(class_states);
            }while(cursor14.moveToNext());
        }
        cursor14.close();


        String selection15 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs15 = new String[]{classnumber,w1,s5};
        Cursor cursor15 =db.query("Book",null,selection15,selectionArgs15,null,null,null);
        if (cursor15.moveToFirst() ){
            do{
                String class_states=cursor15.getString(cursor13.getColumnIndex("class_state") );
                querydatar15.setText(class_states);
            }while(cursor15.moveToNext());
        }
        cursor15.close();

        String selection21 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs21 = new String[]{classnumber,w2,s1};
        Cursor cursor21 =db.query("Book",null,selection21,selectionArgs21,null,null,null);
        if (cursor21.moveToFirst() ){
            do{
                String class_states=cursor21.getString(cursor13.getColumnIndex("class_state") );
                querydatar21.setText(class_states);
            }while(cursor21.moveToNext());
        }
        cursor21.close();

        String selection22 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs22 = new String[]{classnumber,w2,s2};
        Cursor cursor22 =db.query("Book",null,selection22,selectionArgs22,null,null,null);
        if (cursor22.moveToFirst() ){
            do{
                String class_states=cursor22.getString(cursor13.getColumnIndex("class_state") );
                querydatar22.setText(class_states);
            }while(cursor22.moveToNext());
        }
        cursor22.close();

        String selection23 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs23 = new String[]{classnumber,w2,s3};
        Cursor cursor23 =db.query("Book",null,selection23,selectionArgs23,null,null,null);
        if (cursor23.moveToFirst() ){
            do{
                String class_states=cursor23.getString(cursor23.getColumnIndex("class_state") );
                querydatar23.setText(class_states);
            }while(cursor23.moveToNext());
        }
        cursor23.close();

        String selection24 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs24 = new String[]{classnumber,w2,s4};
        Cursor cursor24 =db.query("Book",null,selection24,selectionArgs24,null,null,null);
        if (cursor24.moveToFirst() ){
            do{
                String class_states=cursor24.getString(cursor24.getColumnIndex("class_state") );
                querydatar24.setText(class_states);
            }while(cursor24.moveToNext());
        }
        cursor24.close();

        String selection25 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs25 = new String[]{classnumber,w2,s5};
        Cursor cursor25 =db.query("Book",null,selection25,selectionArgs25,null,null,null);
        if (cursor25.moveToFirst() ){
            do{
                String class_states=cursor25.getString(cursor24.getColumnIndex("class_state") );
                querydatar25.setText(class_states);
            }while(cursor25.moveToNext());
        }
        cursor25.close();

        String selection31 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs31 = new String[]{classnumber,w3,s1};
        Cursor cursor31 =db.query("Book",null,selection31,selectionArgs31,null,null,null);
        if (cursor31.moveToFirst() ){
            do{
                String class_states=cursor31.getString(cursor31.getColumnIndex("class_state") );
                querydatar31.setText(class_states);
            }while(cursor31.moveToNext());
        }
        cursor31.close();

        String selection32 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs32 = new String[]{classnumber,w3,s2};
        Cursor cursor32 =db.query("Book",null,selection32,selectionArgs32,null,null,null);
        if (cursor32.moveToFirst() ){
            do{
                String class_states=cursor32.getString(cursor32.getColumnIndex("class_state") );
                querydatar32.setText(class_states);
            }while(cursor32.moveToNext());
        }
        cursor32.close();

        String selection33 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs33 = new String[]{classnumber,w3,s3};
        Cursor cursor33 =db.query("Book",null,selection33,selectionArgs33,null,null,null);
        if (cursor33.moveToFirst() ){
            do{
                String class_states=cursor33.getString(cursor33.getColumnIndex("class_state") );
                querydatar33.setText(class_states);
            }while(cursor33.moveToNext());
        }
        cursor33.close();

        String selection34 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs34 = new String[]{classnumber,w3,s4};
        Cursor cursor34 =db.query("Book",null,selection34,selectionArgs34,null,null,null);
        if (cursor34.moveToFirst() ){
            do{
                String class_states=cursor34.getString(cursor34.getColumnIndex("class_state") );
                querydatar34.setText(class_states);
            }while(cursor34.moveToNext());
        }
        cursor34.close();

        String selection35 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs35 = new String[]{classnumber,w3,s5};
        Cursor cursor35 =db.query("Book",null,selection35,selectionArgs35,null,null,null);
        if (cursor35.moveToFirst() ){
            do{
                String class_states=cursor35.getString(cursor35.getColumnIndex("class_state") );
                querydatar35.setText(class_states);
            }while(cursor35.moveToNext());
        }
        cursor35.close();

        String selection41 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs41 = new String[]{classnumber,w4,s1};
        Cursor cursor41 =db.query("Book",null,selection41,selectionArgs41,null,null,null);
        if (cursor41.moveToFirst() ){
            do{
                String class_states=cursor41.getString(cursor41.getColumnIndex("class_state") );
                querydatar41.setText(class_states);
            }while(cursor41.moveToNext());
        }
        cursor41.close();

        String selection42 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs42 = new String[]{classnumber,w4,s2};
        Cursor cursor42 =db.query("Book",null,selection42,selectionArgs42,null,null,null);
        if (cursor42.moveToFirst() ){
            do{
                String class_states=cursor42.getString(cursor42.getColumnIndex("class_state") );
                querydatar42.setText(class_states);
            }while(cursor42.moveToNext());
        }
        cursor42.close();

        String selection43 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs43 = new String[]{classnumber,w4,s3};
        Cursor cursor43 =db.query("Book",null,selection43,selectionArgs43,null,null,null);
        if (cursor43.moveToFirst() ){
            do{
                String class_states=cursor43.getString(cursor43.getColumnIndex("class_state") );
                querydatar43.setText(class_states);
            }while(cursor43.moveToNext());
        }
        cursor43.close();

        String selection44 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs44 = new String[]{classnumber,w4,s4};
        Cursor cursor44 =db.query("Book",null,selection44,selectionArgs44,null,null,null);
        if (cursor44.moveToFirst() ){
            do{
                String class_states=cursor44.getString(cursor44.getColumnIndex("class_state") );
                querydatar44.setText(class_states);
            }while(cursor44.moveToNext());
        }
        cursor44.close();

        String selection45 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs45 = new String[]{classnumber,w4,s5};
        Cursor cursor45 =db.query("Book",null,selection44,selectionArgs44,null,null,null);
        if (cursor45.moveToFirst() ){
            do{
                String class_states=cursor45.getString(cursor45.getColumnIndex("class_state") );
                querydatar45.setText(class_states);
            }while(cursor45.moveToNext());
        }
        cursor45.close();

        String selection51 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs51 = new String[]{classnumber,w5,s1};
        Cursor cursor51 =db.query("Book",null,selection51,selectionArgs51,null,null,null);
        if (cursor51.moveToFirst() ){
            do{
                String class_states=cursor51.getString(cursor51.getColumnIndex("class_state") );
                querydatar51.setText(class_states);
            }while(cursor51.moveToNext());
        }
        cursor51.close();

        String selection52 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs52 = new String[]{classnumber,w5,s2};
        Cursor cursor52 =db.query("Book",null,selection51,selectionArgs52,null,null,null);
        if (cursor52.moveToFirst() ){
            do{
                String class_states=cursor52.getString(cursor52.getColumnIndex("class_state") );
                querydatar52.setText(class_states);
            }while(cursor52.moveToNext());
        }
        cursor52.close();

        String selection53 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs53 = new String[]{classnumber,w5,s3};
        Cursor cursor53 =db.query("Book",null,selection53,selectionArgs53,null,null,null);
        if (cursor53.moveToFirst() ){
            do{
                String class_states=cursor53.getString(cursor53.getColumnIndex("class_state") );
                querydatar53.setText(class_states);
            }while(cursor53.moveToNext());
        }
        cursor53.close();

        String selection54 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs54 = new String[]{classnumber,w5,s4};
        Cursor cursor54 =db.query("Book",null,selection54,selectionArgs54,null,null,null);
        if (cursor54.moveToFirst() ){
            do{
                String class_states=cursor54.getString(cursor54.getColumnIndex("class_state") );
                querydatar54.setText(class_states);
            }while(cursor54.moveToNext());
        }
        cursor54.close();

        String selection55 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs55 = new String[]{classnumber,w5,s5};
        Cursor cursor55 =db.query("Book",null,selection55,selectionArgs55,null,null,null);
        if (cursor55.moveToFirst() ){
            do{
                String class_states=cursor55.getString(cursor55.getColumnIndex("class_state") );
                querydatar55.setText(class_states);
            }while(cursor55.moveToNext());
        }
        cursor55.close();

        String selection61 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs61 = new String[]{classnumber,w6,s1};
        Cursor cursor61 =db.query("Book",null,selection61,selectionArgs61,null,null,null);
        if (cursor61.moveToFirst() ){
            do{
                String class_states=cursor61.getString(cursor61.getColumnIndex("class_state") );
                querydatar61.setText(class_states);
            }while(cursor61.moveToNext());
        }
        cursor61.close();

        String selection62 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs62 = new String[]{classnumber,w6,s2};
        Cursor cursor62 =db.query("Book",null,selection62,selectionArgs62,null,null,null);
        if (cursor62.moveToFirst() ){
            do{
                String class_states=cursor62.getString(cursor62.getColumnIndex("class_state") );
                querydatar62.setText(class_states);
            }while(cursor62.moveToNext());
        }
        cursor62.close();

        String selection63 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs63 = new String[]{classnumber,w6,s3};
        Cursor cursor63 =db.query("Book",null,selection63,selectionArgs63,null,null,null);
        if (cursor63.moveToFirst() ){
            do{
                String class_states=cursor63.getString(cursor63.getColumnIndex("class_state") );
                querydatar63.setText(class_states);
            }while(cursor63.moveToNext());
        }
        cursor63.close();

        String selection64 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs64 = new String[]{classnumber,w6,s4};
        Cursor cursor64 =db.query("Book",null,selection64,selectionArgs64,null,null,null);
        if (cursor64.moveToFirst() ){
            do{
                String class_states=cursor64.getString(cursor64.getColumnIndex("class_state") );
                querydatar64.setText(class_states);
            }while(cursor64.moveToNext());
        }
        cursor64.close();

        String selection65 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs65 = new String[]{classnumber,w6,s5};
        Cursor cursor65 =db.query("Book",null,selection65,selectionArgs65,null,null,null);
        if (cursor65.moveToFirst() ){
            do{
                String class_states=cursor65.getString(cursor65.getColumnIndex("class_state") );
                querydatar65.setText(class_states);
            }while(cursor65.moveToNext());
        }
        cursor65.close();

        String selection71 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs71 = new String[]{classnumber,w7,s1};
        Cursor cursor71 =db.query("Book",null,selection71,selectionArgs71,null,null,null);
        if (cursor71.moveToFirst() ){
            do{
                String class_states=cursor71.getString(cursor71.getColumnIndex("class_state") );
                querydatar71.setText(class_states);
            }while(cursor71.moveToNext());
        }
        cursor71.close();

        String selection72 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs72 = new String[]{classnumber,w7,s2};
        Cursor cursor72 =db.query("Book",null,selection72,selectionArgs72,null,null,null);
        if (cursor72.moveToFirst() ){
            do{
                String class_states=cursor72.getString(cursor72.getColumnIndex("class_state") );
                querydatar72.setText(class_states);
            }while(cursor72.moveToNext());
        }
        cursor72.close();

        String selection73 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs73 = new String[]{classnumber,w7,s3};
        Cursor cursor73 =db.query("Book",null,selection73,selectionArgs73,null,null,null);
        if (cursor73.moveToFirst() ){
            do{
                String class_states=cursor73.getString(cursor73.getColumnIndex("class_state") );
                querydatar73.setText(class_states);
            }while(cursor73.moveToNext());
        }
        cursor73.close();

        String selection74 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs74 = new String[]{classnumber,w7,s4};
        Cursor cursor74 =db.query("Book",null,selection74,selectionArgs74,null,null,null);
        if (cursor74.moveToFirst() ){
            do{
                String class_states=cursor74.getString(cursor74.getColumnIndex("class_state") );
                querydatar74.setText(class_states);
            }while(cursor74.moveToNext());
        }
        cursor74.close();

        String selection75 ="class_number=? and weekday=?  and class_time=?";
        String[]selectionArgs75 = new String[]{classnumber,w7,s5};
        Cursor cursor75 =db.query("Book",null,selection75,selectionArgs75,null,null,null);
        if (cursor75.moveToFirst() ){
            do{
                String class_states=cursor75.getString(cursor75.getColumnIndex("class_state") );
                querydatar75.setText(class_states);
            }while(cursor75.moveToNext());
        }
        cursor75.close();

    }
}
