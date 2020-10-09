package com.example.spaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class FourthQuiz extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_quiz);

        youTubePlayerView =findViewById(R.id.player4);
        youTubePlayerView.initialize(Earth.KEY, new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT);
                youTubePlayer.loadVideo("cu4ZvCguhaw");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        });

        Button firstQuesButton =(Button) findViewById(R.id.go_fourth_ques);
        final Context cont =this;
        firstQuesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cont, FourthQues.class);
                startActivity(intent);
            }
        });
    }
}