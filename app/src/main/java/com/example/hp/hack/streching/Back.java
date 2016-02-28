package com.example.hp.hack.streching;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;



import java.net.URI;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.hp.hack.R;

public class Back extends Activity {
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
                + R.raw.overheadarmpull);

        mc = new MediaController(this);
        vd.setMediaController(mc);

        vd.setVideoURI(uri);
        vd.start();
    }

}
