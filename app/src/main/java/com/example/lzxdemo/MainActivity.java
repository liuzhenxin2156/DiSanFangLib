package com.example.lzxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lzxdemo.immersionbar.ImmersionBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImmersionBar.with(this).statusBarDarkFont(true).statusBarColor(R.color.logocolor).init();//沉浸式状态栏

      Button test_btn = findViewById(R.id.test_btn);
        test_btn.setOnClickListener(v -> {

        });
    }
}