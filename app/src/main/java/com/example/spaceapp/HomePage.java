package com.example.spaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class HomePage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        ImageButton personalityButton = (ImageButton) findViewById(R.id.personality_button);
        final Context context =this;
        personalityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(context, PersonalityTest.class);
                startActivity(intent);

            }


        });
        ImageButton earthButton =(ImageButton) findViewById(R.id.earth_button);
        final Context cont =this;
        earthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cont, Earth.class);
                startActivity(intent);
            }
        });
    }
}