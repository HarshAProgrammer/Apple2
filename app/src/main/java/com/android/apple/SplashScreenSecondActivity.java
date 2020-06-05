package com.android.apple;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class SplashScreenSecondActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN_SECOND_TIME = 3000;


    //variables
    Animation topAnim,bottomAnim;
    ImageView splashImage;
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
       // topAnim = AnimationUtils.loadAnimation(this, R.anim.topsplashanimation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottomsplashanimation);

        //Hooks
       // splashImage = findViewById(R.id.imagesplashsecond);
        splashText = findViewById(R.id.textsplashsecond);
    }

    private void setSplashAnimation() {
       // splashImage.setAnimation(topAnim);
        splashText.setAnimation(bottomAnim);
    }

    private void openMainActivityFromSplash() {
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