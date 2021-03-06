package com.example.spaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Animation topAnim, bottomAnim;
    ImageView image;
    TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        topAnim= AnimationUtils.loadAnimation(this, R.anim.top_animetion);
        bottomAnim= AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        image= findViewById(R.id.imageView);
        text= findViewById(R.id.textView);

        image.setAnimation(topAnim);
        text.setAnimation(bottomAnim);


        int LOGO = 6000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,HomePage.class);
                startActivity(intent);
                finish();
            }
        }, LOGO);
    }

}