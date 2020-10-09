package com.example.spaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Button button =(Button) findViewById(R.id.button);
        final Context cont =this;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cont, FirstQuiz.class);
                startActivity(intent);
            }
        });

        Button button2 =(Button) findViewById(R.id.button2);
        final Context cont2 =this;
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cont2, ThirdQuiz.class);
                startActivity(intent);
            }
        });

        Button button3 =(Button) findViewById(R.id.button3);
        final Context cont3 =this;
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cont3, FifthQuiz.class);
                startActivity(intent);
            }
        });

        Button button4 =(Button) findViewById(R.id.button4);
        final Context cont4 =this;
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cont4, SeventhQuiz.class);
                startActivity(intent);
            }
        });

        Button button5 =(Button) findViewById(R.id.button5);
        final Context cont5 =this;
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cont5, NinthQuiz.class);
                startActivity(intent);
            }
        });



    }
}