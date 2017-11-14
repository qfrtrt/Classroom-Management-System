package com.example.a94936.activitytest;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.*;


public class FristActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId() ) {
            case R.id.add_item:
                Toast.makeText(this, "you clicked Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "you clicked Remove", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }

    private MydatabaseHelper dbHelper;
    private EditText usernameEdit;
    private EditText passwordEdit;
    private Button logon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);

        dbHelper =new MydatabaseHelper(this,"Bookstore.db",null,4);
        Button createDatabase=(Button )findViewById(R.id.create_database );
        createDatabase .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper .getWritableDatabase() ;
            }
        }) ;

        Button sign_in=(Button ) findViewById(R.id.sign_in );
        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                SQLiteDatabase db =dbHelper .getWritableDatabase() ;
                ContentValues values =new ContentValues() ;
                values.put("class_number", 101);
                values.put("class_state", "可被预约");
                values.put("class_time", "1~2节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 101);
                values.put("class_state", "可被预约");
                values.put("class_time", "3~4节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 101);
                values.put("class_state", "可被预约");
                values.put("class_time", "5~6节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 101);
                values.put("class_state", "可被预约");
                values.put("class_time", "7~8节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 101);
                values.put("class_state", "可被预约");
                values.put("class_time", "9~10节");
                db.insert("Book",null,values);
                values.clear();

                values.put("class_number", 102);
                values.put("class_state", "可被预约");
                values.put("class_time", "1~2节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 102);
                values.put("class_state", "可被预约");
                values.put("class_time", "3~4节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 102);
                values.put("class_state", "可被预约");
                values.put("class_time", "5~6节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 102);
                values.put("class_state", "可被预约");
                values.put("class_time", "7~8节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 102);
                values.put("class_state", "可被预约");
                values.put("class_time", "9~10节");
                db.insert("Book",null,values);
                values.clear();

                values.put("class_number", 103);
                values.put("class_state", "可被预约");
                values.put("class_time", "1~2节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 103);
                values.put("class_state", "可被预约");
                values.put("class_time", "3~4节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 103);
                values.put("class_state", "可被预约");
                values.put("class_time", "5~6节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 103);
                values.put("class_state", "可被预约");
                values.put("class_time", "7~8节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 103);
                values.put("class_state", "可被预约");
                values.put("class_time", "9~10节");
                db.insert("Book",null,values);
                values.clear();

                values.put("class_number", 104);
                values.put("class_state", "可被预约");
                values.put("class_time", "1~2节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 104);
                values.put("class_state", "可被预约");
                values.put("class_time", "3~4节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 104);
                values.put("class_state", "可被预约");
                values.put("class_time", "5~6节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 104);
                values.put("class_state", "可被预约");
                values.put("class_time", "7~8节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 104);
                values.put("class_state", "可被预约");
                values.put("class_time", "9~10节");
                db.insert("Book",null,values);
                values.clear();

                values.put("class_number", 105);
                values.put("class_state", "可被预约");
                values.put("class_time", "1~2节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 105);
                values.put("class_state", "可被预约");
                values.put("class_time", "3~4节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 105);
                values.put("class_state", "可被预约");
                values.put("class_time", "5~6节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 105);
                values.put("class_state", "可被预约");
                values.put("class_time", "7~8节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 105);
                values.put("class_state", "可被预约");
                values.put("class_time", "9~10节");
                db.insert("Book",null,values);
                values.clear();

                values.put("class_number", 106);
                values.put("class_state", "可被预约");
                values.put("class_time", "1~2节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 106);
                values.put("class_state", "可被预约");
                values.put("class_time", "3~4节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 106);
                values.put("class_state", "可被预约");
                values.put("class_time", "5~6节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 106);
                values.put("class_state", "可被预约");
                values.put("class_time", "7~8节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 106);
                values.put("class_state", "可被预约");
                values.put("class_time", "9~10节");
                db.insert("Book",null,values);
                values.clear();

                values.put("class_number", 107);
                values.put("class_state", "可被预约");
                values.put("class_time", "1~2节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 107);
                values.put("class_state", "可被预约");
                values.put("class_time", "3~4节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 107);
                values.put("class_state", "可被预约");
                values.put("class_time", "5~6节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 107);
                values.put("class_state", "可被预约");
                values.put("class_time", "7~8节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 107);
                values.put("class_state", "可被预约");
                values.put("class_time", "9~10节");
                db.insert("Book",null,values);
                values.clear();

                values.put("class_number", 108);
                values.put("class_state", "可被预约");
                values.put("class_time", "1~2节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 108);
                values.put("class_state", "可被预约");
                values.put("class_time", "3~4节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 108);
                values.put("class_state", "可被预约");
                values.put("class_time", "5~6节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 108);
                values.put("class_state", "可被预约");
                values.put("class_time", "7~8节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 108);
                values.put("class_state", "可被预约");
                values.put("class_time", "9~10节");
                db.insert("Book",null,values);
                values.clear();

                values.put("class_number", 109);
                values.put("class_state", "可被预约");
                values.put("class_time", "1~2节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 109);
                values.put("class_state", "可被预约");
                values.put("class_time", "3~4节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 109);
                values.put("class_state", "可被预约");
                values.put("class_time", "5~6节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 109);
                values.put("class_state", "可被预约");
                values.put("class_time", "7~8节");
                db.insert("Book",null,values);
                values.clear();
                values.put("class_number", 109);
                values.put("class_state", "可被预约");
                values.put("class_time", "9~10节");
                db.insert("Book",null,values);
                values.clear();

                values.put("class_number", 110);
                values.put("class_state", "可被预约");
                values.put("class_time", "1~2节");
                db.insert("Book",null,values);
                values.put("class_number", 110);
                values.put("class_state", "可被预约");
                values.put("class_time", "3~4节");
                db.insert("Book",null,values);
                values.put("class_number", 110);
                values.put("class_state", "可被预约");
                values.put("class_time", "5~6节");
                db.insert("Book",null,values);
                values.put("class_number", 110);
                values.put("class_state", "可被预约");
                values.put("class_time", "7~8节");
                db.insert("Book",null,values);
                values.put("class_number", 110);
                values.put("class_state", "可被预约");
                values.put("class_time", "9~10节");
                db.insert("Book",null,values);


            }
        });

        usernameEdit =(EditText) findViewById(R.id.username);
        passwordEdit  =(EditText) findViewById(R.id.password );


        logon=(Button) findViewById(R.id.logon);
        logon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                String username =usernameEdit .getText().toString() ;
                String password =passwordEdit .getText().toString() ;
                if(username.equals("1111")&password.equals("123456"))
                {
                    Intent intent =new Intent(FristActivity.this,SecondActivity.class );
                    startActivity(intent );
                }
                if(username.equals("2222")&password.equals("123456"))
                {
                    Intent intent =new Intent(FristActivity.this,teacher .class );
                    startActivity(intent );
                }
                else if(username.equals("3333")&password.equals("123456"))
                {
                    Intent intent =new Intent(FristActivity.this,Administartor .class );
                    startActivity(intent );
                }
                else{
                    Toast.makeText(FristActivity.this,"用户名或密码错误",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}