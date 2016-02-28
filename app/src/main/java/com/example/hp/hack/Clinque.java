package com.example.hp.hack;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.hp.hack.more.DietMore;
import com.example.hp.hack.more.DonateMore;
import com.example.hp.hack.more.ExerciseListMore;
import com.example.hp.hack.more.FindFriendsMore;
import com.example.hp.hack.more.GetProMore;
import com.example.hp.hack.more.HelpUsMore;
import com.example.hp.hack.more.MyLavelleActivity;
import com.example.hp.hack.more.ReminderMore;
import com.example.hp.hack.more.RewardMore;

public class Clinque extends AppCompatActivity {

  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_more);
      getSupportActionBar().hide();

      Button mylavelle,exercise,reminder,rewards,diet,findfriends,donate,getpro,helpus;

      mylavelle=(Button)findViewById(R.id.mylavelle);
      mylavelle.setOnClickListener(new View.OnClickListener() {
          public void onClick(View v) {
              Intent i = new Intent(Clinque.this, MyLavelleActivity.class);
              startActivity(i);
          }
      });
      exercise=(Button)findViewById(R.id.exercises);
      exercise.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i = new Intent(Clinque.this, ExerciseListMore.class);
              startActivity(i);
          }
      });

      reminder=(Button)findViewById(R.id.reminder);
      reminder.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i = new Intent(Clinque.this, ReminderMore.class);
              startActivity(i);
          }
      });

      rewards=(Button)findViewById(R.id.rewards);
      rewards.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i = new Intent(Clinque.this, RewardMore.class);
              startActivity(i);
          }
      });
      diet=(Button)findViewById(R.id.diet);
      diet.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i = new Intent(Clinque.this, DietMore.class);
              startActivity(i);
          }
      });
      findfriends=(Button)findViewById(R.id.findfriends);
      findfriends.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i = new Intent(Clinque.this, FindFriendsMore.class);
              startActivity(i);
          }
      });
      donate=(Button)findViewById(R.id.donate);
      donate.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i = new Intent(Clinque.this, DonateMore.class);
              startActivity(i);
          }
      });
      getpro=(Button)findViewById(R.id.getpro);
      getpro.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i = new Intent(Clinque.this, GetProMore.class);
              startActivity(i);
          }
      });
      helpus=(Button)findViewById(R.id.helpus);
      helpus.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i = new Intent(Clinque.this, HelpUsMore.class);
              startActivity(i);
          }
      });
    }

}