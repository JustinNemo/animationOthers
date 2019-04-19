package com.nikolaihost.animations2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void animations(View view){

            Log.i("Info", "Button Pressed");

            ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
            ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);

            //bartImageView.animate().translationYBy(1000).setDuration(2000);
            bartImageView.animate().rotation(1000).translationXBy(2000).setDuration(2000);
            //bartImageView.animate().rotation(3600).setDuration(1000);
            //bartImageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1000);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);

        bartImageView.setX(-2000);
        bartImageView.animate().translationXBy(2000).rotation(3600).setDuration(2000);
    }
}
