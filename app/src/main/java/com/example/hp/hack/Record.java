package com.example.hp.hack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Record extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_record);
        Button challenge,customworkout;


        challenge=(Button)findViewById(R.id.btn_take_challenges);
        challenge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Record.this, TakeChallenges.class);
                startActivity(i);
            }
        });
        customworkout=(Button)findViewById(R.id.btn_custom_workout);
        customworkout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Record.this, CustomWorkout.class);
                startActivity(i);
            }
        });
    }

}
