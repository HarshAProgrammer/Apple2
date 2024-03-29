package com.android.apple.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.android.apple.R;
import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class SplashScreenFirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen_first);

        openSecondSplashFromFirst();


    }




    private void openSecondSplashFromFirst() {
        int SPLASH_SCREEN_FIRST_TIME = 1000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent openSplashScreenSecondActFromSplashScreenFirst = new Intent(SplashScreenFirstActivity.this, SplashScreenSecondActivity.class);
                startActivity(openSplashScreenSecondActFromSplashScreenFirst);
                finish();
                Animatoo.animateSlideUp(SplashScreenFirstActivity.this);

            }
        }, SPLASH_SCREEN_FIRST_TIME);
    }

    @Override
    public void onBackPressed() {

    }
}