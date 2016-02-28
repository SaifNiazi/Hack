package com.example.hp.hack.strength;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.hp.hack.R;

public class Corestrength extends AppCompatActivity {
    private static final String TAG = "";
    private boolean isImage = false;
    private String reviewImageLink;
    private MediaController mc;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lightcardio);
        VideoView vd = (VideoView) findViewById(R.id.VideoView);

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/"
                + R.raw.bent_leg_twist);

        mc = new MediaController(this);
        vd.setMediaController(mc);

        vd.setVideoURI(uri);
        vd.start();
    }

}
