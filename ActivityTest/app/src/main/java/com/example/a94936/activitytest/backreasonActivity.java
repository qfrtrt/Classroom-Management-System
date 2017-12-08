package com.example.a94936.activitytest;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class backreasonActivity extends AppCompatActivity {
    private MydatabaseHelper dbHelper;
    private TextView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backreason);
        dbHelper =new MydatabaseHelper(this,"Bookstore.db",null,5);
        back=(TextView) findViewById(R.id.text_answer );
        Button query=(Button ) findViewById(R.id.query_data);
        query.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                SQLiteDatabase  db =dbHelper .getWritableDatabase() ;
                Cursor cursor =db.query("Back",null,null,null,null,null,null);
                if (cursor.moveToFirst() ){
                    do{
                        String answer=cursor.getString(cursor.getColumnIndex("result") );
                        back.setText("管理员的回答是："+answer);
                    }while(cursor.moveToNext());
                }
                cursor.close();
            }
        });

    }
}
