package com.example.spaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TenthQues extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth_ques);

        Button right =(Button) findViewById(R.id.option101);
        final Context cont1 =this;
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(cont1, Right10.class);
                startActivity(intent6);
            }
        });

        Button right2 =(Button) findViewById(R.id.option102);
        final Context cont2 =this;
        right2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(cont2, Right10.class);
                startActivity(intent6);
            }
        });
    }
}