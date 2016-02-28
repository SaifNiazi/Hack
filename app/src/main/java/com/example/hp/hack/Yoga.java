package com.example.hp.hack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.hp.hack.*;
import com.example.hp.hack.yoga.Yogafor;
import com.example.hp.hack.yoga.Yogafull;
import com.example.hp.hack.yoga.Yogapilates;
import com.example.hp.hack.yoga.Yogasun;

public class Yoga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);
        Button yfull,ysun,yfor,ypilates;
        yfull=(Button)findViewById(R.id.yoga_full_sequence);
        yfull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Yoga.this, Yogafull.class);
                startActivity(i);
            }
        });
        ysun=(Button)findViewById(R.id.yoga_sun_salutation);
        ysun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Yoga.this, Yogasun.class);
                startActivity(i);
            }
        });
        yfor=(Button)findViewById(R.id.yoga_for_runners);
        yfor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Yoga.this, Yogafor.class);
                startActivity(i);
            }
        });
        ypilates=(Button)findViewById(R.id.pilates);
        ypilates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Yoga.this, Yogapilates.class);
                startActivity(i);
            }
        });
    }
}
