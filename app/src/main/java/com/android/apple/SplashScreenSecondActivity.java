package com.android.apple;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class SplashScreenSecondActivity extends AppCompatActivity {


    Animation bottomAnim;
    TextView splashText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen_second);

        setUpUIViewsSplashScreen();

        setSplashAnimation();

        openMainActivityFromSplash();


    }

    private void setUpUIViewsSplashScreen() {
        //Animation
       // topAnim = AnimationUtils.loadAnimation(this, R.anim.top_splash_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_splash_animation);

        //Hooks
       // splashImage = findViewById(R.id.image_splash_second);
        splashText = findViewById(R.id.text_splash_second);
    }

    private void setSplashAnimation() {
       // splashImage.setAnimation(topAnim);
        splashText.setAnimation(bottomAnim);
    }

    private void openMainActivityFromSplash() {
        int SPLASH_SCREEN_SECOND_TIME = 3200;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent openMainActivityFromSplashScreenActivity = new Intent(SplashScreenSecondActivity.this, MainActivity.class);
                startActivity(openMainActivityFromSplashScreenActivity);
                finish();
            }
        }, SPLASH_SCREEN_SECOND_TIME);
    }
}