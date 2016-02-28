package com.example.hp.hack.custom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hp.hack.R;

public class FullBodyCustom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_body_custom);
        getSupportActionBar().hide();

    }
}
