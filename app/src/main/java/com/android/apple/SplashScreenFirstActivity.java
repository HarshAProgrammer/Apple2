package com.android.apple;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class SplashScreenFirstActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN_FIRST_TIME = 200;

    TextView splashTextFirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen_first);

        setUpUIViewsSplashScreenFirst();

        openSecondSplashFromFirst();


    }

    private void setUpUIViewsSplashScreenFirst() {

        splashTextFirst = findViewById(R.id.textsplashfirst);
    }


    private void openSecondSplashFromFirst() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent openSplashScreenSecondActFromSplashScreenFirst = new Intent(SplashScreenFirstActivity.this, SplashScreenSecondActivity.class);
                startActivity(openSplashScreenSecondActFromSplashScreenFirst);
                finish();
            }
        }, SPLASH_SCREEN_FIRST_TIME);
    }
}