package com.example.hp.hack.health;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hp.hack.R;

public class dashboard_day extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_day);
        getSupportActionBar().hide();
    }
}
