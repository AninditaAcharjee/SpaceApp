package com.example.spaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondQues extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_ques);

        Button right =(Button) findViewById(R.id.option21);
        final Context cont1 =this;
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(cont1, Right2.class);
                startActivity(intent1);
            }
        });

        Button wrong2 =(Button) findViewById(R.id.option22);
        final Context cont2 =this;
        wrong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(cont2, Wrong2.class);
                startActivity(intent2);
            }
        });


    }
}