package com.example.a94936.activitytest;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class orderActivity extends AppCompatActivity {
    private MydatabaseHelper dbHelper;
    private EditText orderroomEdit;
    private EditText order_reason;
    private EditText weekday;
    private Button orderButton;
    private RadioGroup Group;
    private RadioButton RadioButton1;
    private RadioButton RadioButton2;
    private RadioButton RadioButton3;
    private RadioButton RadioButton4;
    private RadioButton RadioButton5;
    int n;
    int b;
    String s4;
    String ordertime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        dbHelper =new MydatabaseHelper(this,"Bookstore.db",null,6);

        orderroomEdit = (EditText) findViewById(R.id.orderroom);
        order_reason = (EditText) findViewById(R.id.orderreason);
        weekday=(EditText) findViewById(R.id.weekday);
        orderButton = (Button) findViewById(R.id.orderButton);
        Group = (RadioGroup) findViewById(R.id.GroupID);
        RadioButton1 = (RadioButton) findViewById(R.id.GroupID_1);
        RadioButton2 = (RadioButton) findViewById(R.id.GroupID_2);
        RadioButton3 = (RadioButton) findViewById(R.id.GroupID_3);
        RadioButton4 = (RadioButton) findViewById(R.id.GroupID_4);
        RadioButton5 = (RadioButton) findViewById(R.id.GroupID_5);

        Group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup Group, int checkedId) {
                if (checkedId == RadioButton1.getId()) {
                    n = 1;
                    ordertime="预约时间为1~2节课";
                    Toast.makeText(orderActivity.this, "预约时间为1~2节课", Toast.LENGTH_SHORT).show();
                } else if (checkedId == RadioButton2.getId()) {
                    n = 2;
                    ordertime="预约时间为3~4节课";
                    Toast.makeText(orderActivity.this, "预约时间为3~4节课", Toast.LENGTH_SHORT).show();
                } else if (checkedId == RadioButton3.getId()) {
                    n = 3;
                    ordertime="预约时间为5~6节课";
                    Toast.makeText(orderActivity.this, "预约时间为5~6节课", Toast.LENGTH_SHORT).show();
                } else if (checkedId == RadioButton4.getId()) {
                    n = 4;
                    ordertime="预约时间为7~8节课";
                    Toast.makeText(orderActivity.this, "预约时间为7~8节课", Toast.LENGTH_SHORT).show();
                } else if (checkedId == RadioButton5.getId()) {
                    n = 5;
                    ordertime="预约时间为9~10节课";
                    Toast.makeText(orderActivity.this, "预约时间为9~10节课", Toast.LENGTH_SHORT).show();
                } else {
                }
            }
        });

        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String orderclass = orderroomEdit.getText().toString() ;
                String orderreason =order_reason .getText().toString() ;
                try{
                    b=Integer.valueOf(weekday.getText().toString());
                }catch(NumberFormatException e){
                    e.printStackTrace();}

                if(b==1)
                {
                    s4="周一";
                }
                else if(b==2)
                {
                    s4="周二";
                }
                else if(b==3)
                {
                    s4="周三";
                }
                else if(b==4)
                {
                    s4="周四";
                }
                else if(b==5)
                {
                    s4="周五";
                }
                else if(b==6)
                {
                    s4="周六";
                }
                else if(b==7)
                {
                    s4="周日";
                }

                SQLiteDatabase  db =dbHelper .getWritableDatabase() ;
                ContentValues  values =new ContentValues() ;
                values.put("order_class",orderclass);
                values.put("order_reason",orderreason );
                values.put("order_weekday",s4 );
                values.put("order_time",ordertime);
                db.insert("Answer",null,values);
                values.clear();


                if (n == 0) {
                    Toast.makeText(orderActivity.this, "请选择一个时间段进行预约", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent();
                    intent.setClass(orderActivity.this, SuccessActivity .class);
                    startActivity(intent);
                }
            }
        });
    }
}
