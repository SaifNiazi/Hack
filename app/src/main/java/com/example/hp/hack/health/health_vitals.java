package com.example.hp.hack.health;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hp.hack.R;

public class health_vitals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_vitals);
        getSupportActionBar().hide();
    }
}
