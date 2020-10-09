package com.example.spaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeventhQues extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh_ques);

        Button wrong2 =(Button) findViewById(R.id.option71);
        final Context cont2 =this;
        wrong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(cont2, Wrong7.class);
                startActivity(intent2);
            }
        });

        Button right =(Button) findViewById(R.id.option72);
        final Context cont1 =this;

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(cont1, Right7.class);
                startActivity(intent6);
            }
        });



    }
}