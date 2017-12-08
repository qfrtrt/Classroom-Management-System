package com.example.a94936.activitytest;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Administartor extends AppCompatActivity {
    private MydatabaseHelper dbHelper;
    private TextView orderclass;
    private TextView  orderreason;
    private TextView  ordertime;
    private Button submit;
    private RadioGroup radioGroup;
    private RadioButton RadioButton1;
    private RadioButton RadioButton2;
    private RadioButton RadioButton3;
    private int n;
    private int i;
    private int j;
    private String class_number;
    private String time;
    private String time1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administartor);
        dbHelper =new MydatabaseHelper(this,"Bookstore.db",null,5);
        orderclass = (TextView ) findViewById(R.id.order_room1);
        orderreason =(TextView)  findViewById(R.id.order_reason1 );
        ordertime=(TextView )findViewById(R.id.order_time1) ;
        submit=(Button )findViewById(R.id.submit);
        radioGroup=(RadioGroup)findViewById(R.id.radio_GroupID);
        RadioButton1=(RadioButton)findViewById(R.id.GroupID_1);
        RadioButton2=(RadioButton)findViewById(R.id.GroupID_2);
        RadioButton3=(RadioButton)findViewById(R.id.GroupID_3 );


        SQLiteDatabase db =dbHelper .getWritableDatabase() ;
        Cursor cursor =db.query("Answer",null,null,null,null,null,null);
        if (cursor.moveToFirst() ){
            do{
                class_number=cursor .getString(cursor .getColumnIndex("order_class") ) ;
                try{
                    i = Integer.valueOf(class_number);
                }catch(NumberFormatException e){
                    e.printStackTrace();}
                orderclass.setText(class_number);
                String reason =cursor.getString(cursor.getColumnIndex("order_reason") );
                orderreason .setText(reason);
                time=cursor.getString(cursor.getColumnIndex("order_time") );
                ordertime.setText(time);
            }while(cursor.moveToNext());
        }
        cursor.close();
        if(time.equals("预约时间为1~2节课"))
        {
            time1="1~2节";
        }
        else if(time.equals("预约时间为3~4节课"))
        {
            time1="3~4节";
        }
        else if(time.equals("预约时间为3~4节课"))
        {
            time1="5~6节";
        }
        else if(time.equals("预约时间为3~4节课"))
        {
            time1="7~8节";
        }
        else if(time.equals("预约时间为3~4节课"))
        {
            time1="9~10节";
        }
        else
        {
        }



        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == RadioButton1.getId()) {
                    SQLiteDatabase  db =dbHelper .getWritableDatabase() ;
                    ContentValues values =new ContentValues() ;
                    values.put("result","同意");
                    db.insert("Back",null,values);
                    values.clear();
                    n=1;
                    /*values.put("class_state","不可预约");
                    db.update("Book",values,"class_number=? and class_time=?",new String []{class_number,time});
                    Toast.makeText( Administartor.this,"同意",Toast.LENGTH_SHORT).show();*/
                } else if (checkedId == RadioButton2.getId()) {
                    SQLiteDatabase  db =dbHelper .getWritableDatabase() ;
                    ContentValues values =new ContentValues() ;
                    values.put("result","不同意");
                    db.insert("Back",null,values);
                    n=2;
                    Toast.makeText(Administartor .this,"不同意",Toast.LENGTH_SHORT).show();
                }else if (checkedId == RadioButton3.getId()) {
                    SQLiteDatabase  db =dbHelper .getWritableDatabase() ;
                    ContentValues values =new ContentValues() ;
                    values.put("result","需当面提交申请");
                    db.insert("Back",null,values);
                    n = 3;
                    Toast.makeText(Administartor.this, "需当面提交申请", Toast.LENGTH_SHORT).show();
                }
                else {
                }
            }
        });


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n==0)
                {
                    Toast.makeText(Administartor.this, "请选择", Toast.LENGTH_SHORT).show();
                }
                else {
                    if(n==1)
                    {
                        SQLiteDatabase  db =dbHelper .getWritableDatabase() ;
                        ContentValues values =new ContentValues() ;
                        values.put("class_state","不可预约");
                        db.update("Book",values,"class_number=?and class_time=?",new String []{class_number,time1});
                    }
                    Intent intent = new Intent(Administartor.this, SuccessActivity .class);
                    startActivity(intent);
                }
            }
        });
    }
}
