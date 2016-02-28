package com.example.hp.hack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Workout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
        getSupportActionBar().hide();

        Button strength,yoga,cardio,strech,custom,min5;
        strength=(Button)findViewById(R.id.strength);
        strength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Workout.this, Strength.class);
                startActivity(i);
            }
        });
        strech=(Button)findViewById(R.id.streching);
        strech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Workout.this, Streching.class);
                startActivity(i);
            }
        });
        yoga=(Button)findViewById(R.id.yoga);
        yoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Workout.this, Yoga.class);
                startActivity(i);
            }
        });
        cardio=(Button)findViewById(R.id.cardio);
        cardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Workout.this, Cardio.class);
                startActivity(i);
            }
        });
        custom=(Button)findViewById(R.id.custom);
        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Workout.this, CustomWorkout.class);
                startActivity(i);
            }
        });
        min5=(Button)findViewById(R.id.min5);
        min5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Workout.this, Min5.class);
                startActivity(i);
            }
        });

    }
}
