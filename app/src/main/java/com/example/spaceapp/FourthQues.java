package com.example.spaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourthQues extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_ques);

        Button wrong1 =(Button) findViewById(R.id.option41);
        final Context cont1 =this;
        wrong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(cont1, Right4.class);
                startActivity(intent1);
            }
        });


        Button right =(Button) findViewById(R.id.option42);
        final Context cont3 =this;
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(cont3, Right4.class);
                startActivity(intent3);
            }
        });


    }
}