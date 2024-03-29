package com.android.apple.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.apple.R;
import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class DetailActivity extends AppCompatActivity {
    TextView productName;
    TextView productDescription;
    ImageView productImage;
    private Typeface detailDescriptionFont;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        setUpUIViewsDetailActivity();
        setTransitionDialogue();


        getInformationFromMain();


    }

    private void setUpUIViewsDetailActivity() {
        productName = (TextView) findViewById(R.id.tvDetailName);
        productDescription = (TextView) findViewById(R.id.tvDetailDescription);
        productImage = (ImageView) findViewById(R.id.ivDetailImage);
        detailDescriptionFont = Typeface.createFromAsset(this.getAssets(),"fonts/OpenSansCondensed-Bold.ttf");
        productDescription.setTypeface(detailDescriptionFont);
    }
    private void setTransitionDialogue(){
        final TransitionDialogue transitionDialogue =new TransitionDialogue(DetailActivity.this);
        transitionDialogue.startTransitionDialogue();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                transitionDialogue.dismissDialogue();
            }
        },4200);
    }


    private void getInformationFromMain() {
        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null) {
            productImage.setImageResource(mBundle.getInt("Image"));
            productName.setText(mBundle.getString("Name"));
            productDescription.setText(mBundle.getString("Description"));


        }
    }

    @Override
    public void onBackPressed() {
        finish();
        Animatoo.animateSwipeRight(this);
    }
}
