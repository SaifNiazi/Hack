package com.example.hp.hack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.hp.hack.cardio.*;

public class Cardio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio);
        getSupportActionBar().hide();


        Button lightc,fullc,bootyc,plyoc;
        lightc=(Button)findViewById(R.id.light_warm_up_cardio);
        lightc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent i = new Intent(Cardio.this, Lightcardio.class);
            //    Intent i = new Intent(Cardio.this, Video.class);
                startActivity(i);
            }
        });
        fullc=(Button)findViewById(R.id.full_intensity_cardio);
        fullc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cardio.this, Fullcardio.class);
                startActivity(i);
            }
        });
        bootyc=(Button)findViewById(R.id.booyt_camp);
        bootyc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cardio.this, Bootycardio.class);
                startActivity(i);
            }
        });
        plyoc=(Button)findViewById(R.id.plyometric_jump_cardio);
        plyoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cardio.this, Ploytcardio.class);
                startActivity(i);
            }
        });
    }
}
