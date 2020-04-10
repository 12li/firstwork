package com.bignerdranch.android.myapplication7;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button bt_sub;
EditText et_name;
EditText et_hobby;
RadioButton male;
RadioButton female;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_sub=(Button)findViewById(R.id.bt_sub);
        bt_sub.setOnClickListener(this);
        et_name=(EditText)findViewById(R.id.et_name);
        et_hobby=(EditText)findViewById(R.id.et_hobby);
        male=(RadioButton)findViewById(R.id.male);
        female=(RadioButton)findViewById(R.id.female);
    }

    @Override
    public void onClick(View v) {
        String sex1="";
        Intent it=new Intent();
        it.setClass(this,Main2Activity.class);
        if(male.isChecked())
            sex1+=male.getText();
        if(female.isChecked())
            sex1+=female.getText();
        it.putExtra("个人信息：", et_name.getText()+","+sex1+","+et_hobby.getText());
        startActivityForResult(it,10);

    }
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        et_name.setText("");
        et_hobby.setText("");
        female.setChecked(true);

    }

}
