package com.bignerdranch.android.myapplication7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    Button bt2;
    TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bt2=(Button)findViewById(R.id.bt2);
        tv_result=(TextView)findViewById(R.id.tv_result);
        Intent it=getIntent();
        String info=it.getStringExtra("个人信息：");
        tv_result.setText(info);
    }

    public void close(View view) {
        finish();
    }
}
