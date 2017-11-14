package com.example.a94936.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class queryshowActivity extends AppCompatActivity {

    private TextView  querydataresult;
    private Button orderbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queryshow);
        querydataresult = (TextView) findViewById(R.id.querydata);
        orderbutton = (Button) findViewById(R.id.button_1);


        Intent intent = getIntent();
        int querydata_1 = intent.getIntExtra("querydata", -1);
        if (querydata_1 == 1) {
            querydataresult.setText("该教室已被预约");
        } else if (querydata_1 == 0) {
            querydataresult.setText("该教室可被预约");
        } else {
            querydataresult.setText("输入不正确");
        }
        orderbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(queryshowActivity.this, orderActivity .class);
                startActivity(intent1);
            }
        });
    }
}

