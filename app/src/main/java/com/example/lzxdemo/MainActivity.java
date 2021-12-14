package com.example.lzxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lzxdemo.immersionbar.ImmersionBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImmersionBar.with(this).statusBarDarkFont(true).statusBarColor(R.color.logocolor).init();//沉浸式状态栏
    }
}