package com.example.a94936.activitytest;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private MydatabaseHelper dbHelper;
    private EditText classnumberEdit;
    private Button queryButton;
    private Button orderButton;
    private Button back_answer;
    private RadioGroup radioGroup;
    private RadioButton RadioButton1;
    private RadioButton RadioButton2;
    private RadioButton RadioButton3;
    private RadioButton RadioButton4;
    private RadioButton RadioButton5;
    private TextView state;
    public int m;
    public int n;
    public String s3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        dbHelper =new MydatabaseHelper(this,"Bookstore.db",null,4);

        classnumberEdit=(EditText)findViewById(R.id.edit_query) ;
        queryButton  =(Button)findViewById(R.id.queryButton ) ;
        orderButton  =(Button)findViewById(R.id.order_Button) ;
        back_answer  =(Button)findViewById(R.id.back_answer_Bt ) ;
        radioGroup=(RadioGroup)findViewById(R.id.radioGroupID);
        RadioButton1=(RadioButton)findViewById(R.id.GroupID_1);
        RadioButton2=(RadioButton)findViewById(R.id.GroupID_2);
        RadioButton3=(RadioButton)findViewById(R.id.GroupID_3);
        RadioButton4=(RadioButton)findViewById(R.id.GroupID_4);
        RadioButton5=(RadioButton)findViewById(R.id.GroupID_5);
        state=(TextView)findViewById(R.id.class_state);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == RadioButton1.getId()) {
                    n=1;
                    s3="1~2节";
                    Toast.makeText(SecondActivity .this,"查询时间为1~2节课",Toast.LENGTH_SHORT).show();
                } else if (checkedId == RadioButton2.getId()) {
                    n=2;
                    s3="3~4节";
                    Toast.makeText(SecondActivity .this,"查询时间为3~4节课",Toast.LENGTH_SHORT).show();
                }
                else if (checkedId == RadioButton3.getId()) {
                    n=3;
                    s3="5~6节";
                    Toast.makeText(SecondActivity .this,"查询时间为5~6节课",Toast.LENGTH_SHORT).show();
                }
                else if (checkedId == RadioButton4.getId()) {
                    n=4;
                    s3="7~8节";
                    Toast.makeText(SecondActivity .this,"查询时间为7~8节课",Toast.LENGTH_SHORT).show();
                }
                else if (checkedId == RadioButton5.getId()) {
                    n=5;
                    s3="9~10节";
                    Toast.makeText(SecondActivity .this,"查询时间为9~10节课",Toast.LENGTH_SHORT).show();
                }
                else {
                }
            }
        });

        queryButton .setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Classdetail.init();
                try{
                    m = Integer.valueOf(classnumberEdit.getText().toString());
                }catch(NumberFormatException e){
                    e.printStackTrace();}
                if(n==0)
                {
                    Toast.makeText(SecondActivity .this,"请选择一个时间段进行查询",Toast.LENGTH_SHORT).show();
                }
                else {
                    String s1=classnumberEdit.getText().toString();
                    String selection ="class_number=? and class_time=?";
                    String[]selectionArgs = new String[]{s1,s3};
                    SQLiteDatabase db =dbHelper .getWritableDatabase() ;
                    Cursor cursor =db.query("Book",null,selection,selectionArgs,null,null,null);
                    if (cursor.moveToFirst() ){
                        do{
                            String class_states=cursor.getString(cursor.getColumnIndex("class_state") );
                            state.setText("您预约的教室现在的状态为："+class_states);
                        }while(cursor.moveToNext());
                    }
                    cursor.close();
                }
            }
        });

        orderButton .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SecondActivity .this, orderActivity .class);
                startActivity(intent1);
            }
        });

        back_answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(SecondActivity .this,backreasonActivity.class );
                startActivity(intent );
            }
        });

    }
}
