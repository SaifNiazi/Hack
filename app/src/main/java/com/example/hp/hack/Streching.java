package com.example.hp.hack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hp.hack.streching.Back;
import com.example.hp.hack.streching.Full;
import com.example.hp.hack.streching.Head;
import com.example.hp.hack.streching.Standing;


public class Streching extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_streching);

        getSupportActionBar().hide();


        Button head,full,standing,back;
        head=(Button)findViewById(R.id.head_to_toe_warmup_stretch);
        head.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Streching.this, Head.class);
                startActivity(i);
            }
        });
        full=(Button)findViewById(R.id.full_body_stretch);
        full.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Streching.this, Full.class);
                startActivity(i);
            }
        });
        standing=(Button)findViewById(R.id.standing_only_stretch);
        standing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Streching.this, Standing.class);
                startActivity(i);
            }
        });
        back=(Button)findViewById(R.id.back_strengthening);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Streching.this, Back.class);
                startActivity(i);
            }
        });













    }
}
