package com.example.hp.hack.yoga;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.MediaController;
import android.widget.VideoView;



import java.net.URI;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.hp.hack.R;

public class Yogasun extends Activity {
    private static final String TAG = "";
    private boolean isImage = false;
    private String reviewImageLink;
    private MediaController mc;
    DisplayMetrics dm;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lightcardio);
        VideoView vd = (VideoView) findViewById(R.id.VideoView);
        dm = new DisplayMetrics();
        this.getWindowManager().getDefaultDisplay().getMetrics(dm);
        int height = dm.heightPixels;
        int width = dm.widthPixels;
        vd.setMinimumWidth(width);
        vd.setMinimumHeight(height);

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/"
                + R.raw.mounain_climbers);

        mc = new MediaController(this);
        vd.setMediaController(mc);

        vd.setVideoURI(uri);
        vd.start();
    }

}
