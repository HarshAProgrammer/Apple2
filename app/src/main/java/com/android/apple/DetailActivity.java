package com.android.apple;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView productDescription;
    ImageView productImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        productDescription = (TextView)findViewById(R.id.tvDetailDescription);
        productImage = (ImageView)findViewById(R.id.ivDetailImage);

        Bundle mBundle = getIntent().getExtras();
        if(mBundle!=null){
            productDescription.setText(mBundle.getString("Description"));
            productImage.setImageResource(mBundle.getInt("Image"));

        }
    }
}
