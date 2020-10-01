package com.example.spaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Document extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_document);

//        TextView textView=(TextView) findViewById(R.id.doc);
//        textView.setText("Earth Right Now\n" );
//        String  string = textView.getText().toString();
//        System.out.println(string);
//
//        TextView textView1=(TextView) findViewById(R.id.doc1);
//        textView.setText("Your Planet Is Changing. We're On It.\n" );
//        String  string1 = textView1.getText().toString();
//        System.out.println(string1);

//        TextView textView2=(TextView) findViewById(R.id.doc2);
//        textView2.setText("Earth Right Now\n" );
//        String  string2 = textView2.getText().toString();
//
//        System.out.println(string2);
//
//        TextView textView3=(TextView) findViewById(R.id.doc3);
//        textView3.setText("Earth Right Now\n" );
//        String  string3 = textView3.getText().toString();
//        System.out.println(string3);
//
//        TextView textView4=(TextView) findViewById(R.id.doc4);
//        textView4.setText("Earth Right Now\n" );
//        String  string4 = textView4.getText().toString();
//        System.out.println(string4);
//
//        TextView textView5=(TextView) findViewById(R.id.doc5);
//        textView5.setText("Earth Right Now\n" );
//        String  string5 = textView5.getText().toString();
//        System.out.println(string5);
//
//        TextView textView6=(TextView) findViewById(R.id.doc6);
//        textView6.setText("Earth Right Now\n" );
//        String  string6 = textView6.getText().toString();
//        System.out.println(string6);
//
//        TextView textView7=(TextView) findViewById(R.id.doc7);
//        textView7.setText("Earth Right Now\n" );
//        String  string7 = textView7.getText().toString();
//        System.out.println(string7);


        Button button =(Button) findViewById(R.id.next_page);
        final Context cont =this;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cont, LetsSee.class);
                startActivity(intent);
            }
        });
    }
}