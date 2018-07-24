package com.example.jepark.rxjavatest;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jepark.rxjavatest.databinding.ActivityCreateBinding;

import io.reactivex.Observable;

public class CreateActivity extends AppCompatActivity {

    private ActivityCreateBinding mBind = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBind = DataBindingUtil.setContentView(this, R.layout.activity_create);

        Observable.just("Hello,", "RxJava2")
                .subscribe(System.out::println);
    }
}
