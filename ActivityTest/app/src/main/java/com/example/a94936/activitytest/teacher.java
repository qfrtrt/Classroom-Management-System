package com.example.a94936.activitytest;

import android.content.ContentValues;
import android.content.Intent;
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

public class teacher extends AppCompatActivity {
    private MydatabaseHelper dbHelper;
    private EditText classnumberEdit;
    private EditText weekdayEdit;
    private TextView state;
    private Button submitButton ;
    private Button queryButton;
    private RadioGroup radioGroup;
    private RadioButton RadioButton1;
    private RadioButton RadioButton2;
    private RadioButton RadioButton3;
    private RadioButton RadioButton4;
    private RadioButton RadioButton5;
    public int m;
    public int n;
    public int b;
    public String s3;
    public String s4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);
        dbHelper =new MydatabaseHelper(this,"Bookstore.db",null,6);

        classnumberEdit=(EditText)findViewById(R.id.ordernumber) ;
        weekdayEdit=(EditText) findViewById(R.id.order_weekday);
        submitButton  =(Button)findViewById(R.id.submit  ) ;
        queryButton=(Button)findViewById(R.id.query);
        radioGroup=(RadioGroup)findViewById(R.id.radio_GroupID);
        RadioButton1=(RadioButton)findViewById(R.id.GroupID_1);
        RadioButton2=(RadioButton)findViewById(R.id.GroupID_2);
        RadioButton3=(RadioButton)findViewById(R.id.GroupID_3);
        RadioButton4=(RadioButton)findViewById(R.id.GroupID_4);
        RadioButton5=(RadioButton)findViewById(R.id.GroupID_5);
        state=(TextView) findViewById(R.id.class_state0 );

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == RadioButton1.getId()) {
                    n=1;
                    s3="1~2节";
                    Toast.makeText(teacher .this,"预约时间为1~2节课",Toast.LENGTH_SHORT).show();
                } else if (checkedId == RadioButton2.getId()) {
                    n=2;
                    s3="3~4节";
                    Toast.makeText(teacher.this,"预约时间为3~4节课",Toast.LENGTH_SHORT).show();
                }
                else if (checkedId == RadioButton3.getId()) {
                    n=3;
                    s3="5~6节";
                    Toast.makeText(teacher.this,"预约时间为5~6节课",Toast.LENGTH_SHORT).show();
                }
                else if (checkedId == RadioButton4.getId()) {
                    n=4;
                    s3="7~8节";
                    Toast.makeText(teacher.this,"预约时间为7~8节课",Toast.LENGTH_SHORT).show();
                }
                else if (checkedId == RadioButton5.getId()) {
                    n=5;
                    s3="9~10节";
                    Toast.makeText(teacher.this,"预约时间为9~10节课",Toast.LENGTH_SHORT).show();
                }
                else {
                }
            }
        });
        queryButton .setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                String x = classnumberEdit.getText().toString();
                Intent intent1 = new Intent();
                intent1.putExtra("class_number", x);
                intent1.setClass(teacher.this,queryshowActivity.class);
                startActivity(intent1);}});

        submitButton .setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try{
                    m = Integer.valueOf(classnumberEdit.getText().toString());
                    b=Integer.valueOf(weekdayEdit.getText().toString());
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


                if(n==0||(m<100||m>110))
                {
                        Toast.makeText(teacher .this,"请检查您的输入是否正确",Toast.LENGTH_SHORT).show();
                }
                else {
                    int a = 0;
                        String s1=classnumberEdit.getText().toString();
                        String selection ="class_number=? and class_time=? and weekday=?";
                        String[]selectionArgs = new String[]{s1,s3,s4};
                        SQLiteDatabase db =dbHelper .getWritableDatabase() ;
                        Cursor cursor =db.query("Book",null,selection,selectionArgs,null,null,null);
                        if (cursor.moveToFirst() ){
                            do{
                                String class_states=cursor.getString(cursor.getColumnIndex("class_state") );
                                state.setText("您预约的教室现在的状态为："+class_states);
                                if(class_states.equals("不可预约") ) {
                                    a=1;
                                }
                            }while(cursor.moveToNext());
                        }
                        cursor.close();
                    if(a==1) {
                        Toast.makeText(teacher.this, "该教室此时不可预约", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        String s2=classnumberEdit.getText().toString();
                        ContentValues values =new ContentValues() ;
                        values.put("class_state","不可预约");
                        db.update("Book",values,"class_number=?and class_time=? and weekday=?",new String []{s2,s3,s4});
                        Intent intent =new Intent(teacher .this,SuccessActivity .class );
                        startActivity(intent );
                    }

                }
            }
        });
    }
}
