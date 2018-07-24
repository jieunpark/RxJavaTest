package com.example.jepark.rxjavatest;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.jepark.rxjavatest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding mBind = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBind = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initLayout();
    }

    /**
     * 레이아웃 초기화
     */
    private void initLayout() {
        mBind.btnCreate.setOnClickListener(this);
    }

    /**
     * 생성 버튼 클릭
     */
    private void clickCreate() {
        Intent intent = new Intent(MainActivity.this, CreateActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCreate:
                clickCreate();
                break;
        }
    }
}
