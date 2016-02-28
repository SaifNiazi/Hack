package com.example.hp.hack.custom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hp.hack.R;

public class DesignWorkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design_workout);
        getSupportActionBar().hide();

    }
}
