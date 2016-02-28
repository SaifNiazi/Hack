package com.example.hp.hack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hp.hack.health.dashboard_day;

public class Heath extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_day);
        getSupportActionBar().hide();

        Button recommendation,record,sync,history;
        recommendation=(Button)findViewById(R.id.recommendation);
        recommendation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Heath.this, RecommendationStats.class);
                startActivity(i);
            }
        });

        sync=(Button)findViewById(R.id.sync);
        sync.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Heath.this, Sync.class);
                startActivity(i);
            }
        });

        record=(Button)findViewById(R.id.record);
        record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("nl.sogeti.android.gpstracker");
                startActivity(launchIntent);

            }
        });

        history=(Button)findViewById(R.id.button);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Heath.this, history.class);
                startActivity(i);
            }
        });
    }
}
