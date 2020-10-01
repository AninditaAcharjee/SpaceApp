package com.example.spaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FifthQues extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_ques);

        Button wrong1 =(Button) findViewById(R.id.option51);
        final Context cont1 =this;
        wrong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(cont1, Wrong5.class);
                startActivity(intent1);
            }
        });

        Button right =(Button) findViewById(R.id.option52);
        final Context cont2 =this;
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(cont2, Right5.class);
                startActivity(intent2);
            }
        });

    }
}