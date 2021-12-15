package com.example.lzxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.lzxdemo.immersionbar.ImmersionBar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImmersionBar.with(this).statusBarDarkFont(true).statusBarColor(R.color.logocolor).init();//沉浸式状态栏

      Button test_btn = findViewById(R.id.test_btn);
        test_btn.setOnClickListener(v -> {
            SimpleDateFormat   formatter   =  new   SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date curDate =  new Date(System.currentTimeMillis());
            formatter.setTimeZone(TimeZone.getTimeZone("GMT+08:00"));
            String format = formatter.format(curDate);
            Log.d("lzx---->"," now time" +format );
        });
    }
}