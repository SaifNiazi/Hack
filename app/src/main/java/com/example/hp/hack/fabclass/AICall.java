package com.example.hp.hack.fabclass;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hp.hack.R;

public class AICall extends AppCompatActivity {
    MediaPlayer mPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_aicall);
        mPlayer = MediaPlayer.create(AICall.this, R.raw.mysoundfile);
        mPlayer.start();
    }
    public void onDestroy() {

        mPlayer.stop();
        super.onDestroy();

    }
}
