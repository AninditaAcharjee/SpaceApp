package com.example.spaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstQues extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_ques);

        Button right =(Button) findViewById(R.id.option11);
        final Context cont4 =this;

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(cont4, Right1.class);
                startActivity(intent4);
            }
        });


        Button wrong2 =(Button) findViewById(R.id.option12);
        final Context cont2 =this;
        wrong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(cont2, Wrong1.class);
                startActivity(intent2);
            }
        });


    }
}