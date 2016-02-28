package com.example.hp.hack;
import android.app.TabActivity;
import android.os.Bundle;
import android.content.Intent;

import android.view.View;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.ImageView;

import com.example.hp.hack.fabclass.AICall;
import com.example.hp.hack.fabclass.AIChat;
import com.example.hp.hack.fabclass.AugmentedReality;
import com.example.hp.hack.fabclass.MapFind;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;
public class New extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        //fab

        // Create an icon
        ImageView icon = new ImageView(this);
        icon.setImageResource(R.drawable.unnamed);

        FloatingActionButton actionButton = new FloatingActionButton.Builder(this)
                .setContentView(icon)
                .build();
        SubActionButton.Builder itemBuilder = new SubActionButton.Builder(this);
        // repeat many times:
        ImageView itemIcon1 = new ImageView(this);
        itemIcon1.setImageResource(R.drawable.ic_camera_black_24dp);

        ImageView itemIcon2 = new ImageView(this);
        itemIcon2.setImageResource(R.drawable.ic_call_black_24dp);

        ImageView itemIcon3 = new ImageView(this);
        itemIcon3.setImageResource(R.drawable.ic_chat_black_24dp);

        ImageView itemIcon4 = new ImageView(this);
        itemIcon4.setImageResource(R.drawable.ic_share_black_24dp);

        ImageView itemIcon5 = new ImageView(this);
        itemIcon5.setImageResource(R.drawable.ic_people_black_24dp);

        ImageView itemIcon6 = new ImageView(this);
        itemIcon6.setImageResource(R.mipmap.ic_launcher);

        ImageView itemIcon7 = new ImageView(this);
        itemIcon7.setImageResource(R.mipmap.ic_launcher);

        SubActionButton button1 = itemBuilder.setContentView(itemIcon1).build();
        SubActionButton button2 = itemBuilder.setContentView(itemIcon2).build();
        SubActionButton button3 = itemBuilder.setContentView(itemIcon3).build();
        SubActionButton button4 = itemBuilder.setContentView(itemIcon4).build();
        SubActionButton button5 = itemBuilder.setContentView(itemIcon5).build();

        //attach the sub buttons to the main button
        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder(this)
                .addSubActionView(button1)
                .addSubActionView(button2)
                .addSubActionView(button3)
                .addSubActionView(button4)
                .addSubActionView(button5)


                .attachTo(actionButton)
                .build();



        //fab

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.wikitude.sdksamples");
                startActivity(launchIntent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(New.this, AICall.class);
                startActivity(i2);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(New.this, AIChat.class);
                startActivity(i3);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareIt();

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 = new Intent(New.this, MapFind.class);
                startActivity(i5);
            }
        });


        TabHost tabHost = getTabHost();

        // Tab for Photos
        TabSpec stats = tabHost.newTabSpec("Stats");
        stats.setIndicator("Stats");
        // setting Title and Icon for the Tab
        //health.setIndicator("Photos", getResources().getDrawable(R.drawable.icon_photos_tab));
        Intent photosIntent = new Intent(this, Heath.class);
        stats.setContent(photosIntent);

        // Tab for Songs
        TabSpec Workout = tabHost.newTabSpec("Workout");
        Workout.setIndicator("Workout");
        //Workout.setIndicator("Songs", getResources().getDrawable(R.drawable.icon_songs_tab));
        Intent songsIntent = new Intent(this, Workout.class);
        Workout.setContent(songsIntent);

        // Tab for Videos
        TabSpec Diet = tabHost.newTabSpec("Record");
        Diet.setIndicator("Record");
        //Workout.setIndicator("Videos", getResources().getDrawable(R.drawable.icon_videos_tab));
        Intent videosIntent = new Intent(this, Record.class);
        Diet.setContent(videosIntent);
        
        // Tab for Videos
        TabSpec Clinque = tabHost.newTabSpec("More");
        Clinque.setIndicator("More");
        //Workout.setIndicator("Videos", getResources().getDrawable(R.drawable.icon_videos_tab));
        Intent videosIntent3 = new Intent(this, Clinque.class);
        Clinque.setContent(videosIntent3);

        // Adding all TabSpec to TabHost
        tabHost.addTab(stats); // Adding photos tab
        tabHost.addTab(Workout); // Adding songs tab
        tabHost.addTab(Diet);
        tabHost.addTab(Clinque);// Adding videos tab
    }
    private void shareIt() {
//sharing implementation here
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBody = "Welcome to Australian Institute Of Sports\n\nGet Registered and Set yourself in motion! Lavelle!\n Find more details on www.ais.com";
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Australian Institue of Sports, App Link");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(sharingIntent, "Share via"));

    }

}