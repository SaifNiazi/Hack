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

public class CustomWorkout extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_custom_workout);

        Button design_workout,copy_workout,beginner_full,fullbody;
        design_workout=(Button)findViewById(R.id.design_workout);
        design_workout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CustomWorkout.this, DesignWorkout.class);
                startActivity(i);
            }
        });
        copy_workout=(Button)findViewById(R.id.copy_workout);
        copy_workout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CustomWorkout.this, CopyWorkout.class);
                startActivity(i);
            }
        });
        beginner_full=(Button)findViewById(R.id.beginner_full);
        beginner_full.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(CustomWorkout.this, BeginnerFull.class);
                startActivity(i);
            }
        });
        fullbody=(Button)findViewById(R.id.fullbody);
        fullbody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CustomWorkout.this, FullBodyCustom.class);
                startActivity(i);
            }
        });
    }

}
