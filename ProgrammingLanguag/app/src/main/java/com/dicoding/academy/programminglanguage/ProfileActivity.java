package com.dicoding.academy.programminglanguage;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

//        if(getSupportActionBar() != null) {
//           getSupportActionBar().setTitle("About");
//        }
//
        // actionbar
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("About");
        String about = actionBar.getTitle().toString();

    }
}
