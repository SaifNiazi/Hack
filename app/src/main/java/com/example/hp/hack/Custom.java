package com.example.hp.hack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hp.hack.custom.BeginnerFull;
import com.example.hp.hack.custom.CopyWorkout;
import com.example.hp.hack.custom.DesignWorkout;
import com.example.hp.hack.custom.FullBodyCustom;
import com.example.hp.hack.more.MyLavelleActivity;

public class Custom extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
        getSupportActionBar().hide();
    }
}
