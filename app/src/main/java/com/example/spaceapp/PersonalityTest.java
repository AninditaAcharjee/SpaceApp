package com.example.spaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.youtube.player.YouTubePlayerView;

//Log.e("tor mata", "button11 "+a);
public class PersonalityTest extends AppCompatActivity {

    int sum = 0, a = 0, b = 0, c = 0, d = 0, max1=0, max2=0, result=0;
    RadioButton radioButton1, radioButton2, radioButton3, radioButton4, radioButton5,radioButton6, radioButton7, radioButton8, radioButton9, radioButton10,radioButton11, radioButton12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality_test);
        radioButton1=findViewById(R.id.choice11);
        radioButton2=findViewById(R.id.choice12);
        radioButton3=findViewById(R.id.choice21);
        radioButton4=findViewById(R.id.choice22);
        radioButton5=findViewById(R.id.choice31);
        radioButton6=findViewById(R.id.choice32);
        radioButton7=findViewById(R.id.choice41);
        radioButton8=findViewById(R.id.choice42);
        radioButton9=findViewById(R.id.choice51);
        radioButton10=findViewById(R.id.choice52);
        radioButton11=findViewById(R.id.choice53);
        radioButton12=findViewById(R.id.choice54);

        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a++;
            }
        });

        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b++;
            }
        });

        radioButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b++;
            }
        });

        radioButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c++;
            }
        });

        radioButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c++;
            }
        });

        radioButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d++;
            }
        });

        radioButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d++;
            }
        });

        radioButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a++;
            }
        });

        radioButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a++;
            }
        });

        radioButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b++;
            }
        });

        radioButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c++;
            }
        });

        radioButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d++;
            }
        });

        Button button=findViewById(R.id.see_the_result);
        final Context cont =this;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                max1 = Math.max(a, b);
                max2=Math.max(c,d);
                result= Math.max(max1,max2);
                if(result==a)
                {
                    Intent intent = new Intent(cont, Person1.class);
                    startActivity(intent);
                }
                else if(result==b)
                {
                    Intent intent2 = new Intent(cont, Person2.class);
                    startActivity(intent2);
                }
                else if(result==c)
                {
                    Intent intent3 = new Intent(cont, Person3.class);
                    startActivity(intent3);
                }
                else
                {
                    Intent intent4 = new Intent(cont, Person4.class);
                    startActivity(intent4);
                }

            }
        });

    }
}