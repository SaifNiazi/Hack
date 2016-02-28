package com.example.hp.hack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.hp.hack.strength.FullBody;
import com.example.hp.hack.strength.Lowerbody;
import com.example.hp.hack.strength.Upperbody;
import com.example.hp.hack.strength.Corestrength;

public class Strength extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strength);
        getSupportActionBar().hide();

        Button fulls,uppers,lower,cores;
        fulls=(Button)findViewById(R.id.full_body);
        fulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Strength.this, FullBody.class);
                startActivity(i);
            }
        });
        uppers=(Button)findViewById(R.id.upper_body);
        uppers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Strength.this, Upperbody.class);
                startActivity(i);
            }
        });
        lower=(Button)findViewById(R.id.lower_body);
        lower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Strength.this, Lowerbody.class);
                startActivity(i);
            }
        });
        cores=(Button)findViewById(R.id.core_strength);
        cores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Strength.this, Corestrength.class);
                startActivity(i);
            }
        });

    }
}
