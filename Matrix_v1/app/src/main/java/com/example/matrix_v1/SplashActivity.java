package com.example.matrix_v1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

import spencerstudios.com.bungeelib.Bungee;


public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);




        Handler nuevo = new Handler();
        nuevo.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent uno = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(uno);
                Bungee.slideUp(SplashActivity.this);
                finish();

                if(!Python.isStarted()){
                    Python.start(new AndroidPlatform(SplashActivity.this));
                }

            }
        },1500);

    }
}
