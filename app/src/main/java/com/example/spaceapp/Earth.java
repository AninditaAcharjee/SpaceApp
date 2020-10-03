package com.example.spaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Earth extends AppCompatActivity {

    public static final String KEY = "AIzaSyAYm3DDaqHD1txRJcCK6cPfzUvtY4pnGSY";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earth);

//        youTubePlayerView =findViewById(R.id.player);
//        youTubePlayerView.initialize(KEY,new YouTubePlayer.OnInitializedListener()
//        {
//            @Override
//            public void onInitializationSuccess (YouTubePlayer.Provider provider, YouTubePlayer
//                    youTubePlayer,boolean b){
//                youTubePlayer.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT);
//                youTubePlayer.loadVideo("QKXi08chD2E");
//            }
//
//            @Override
//            public void onInitializationFailure (YouTubePlayer.Provider
//                                                         provider, YouTubeInitializationResult youTubeInitializationResult){
//
//            }
//        });

        Button button =(Button) findViewById(R.id.next_page);
        final Context cont =this;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cont, Document.class);
                startActivity(intent);
            }
        });



    }
}