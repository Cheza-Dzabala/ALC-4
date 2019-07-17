package com.chezadzabala.phaseonechallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAboutAlc;
    private Button btnMyProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("ALC Android Challenge");
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnAboutAlc = findViewById(R.id.aboutAlc);
        btnMyProfile = findViewById(R.id.myProfile);

        btnAboutAlc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ALCACTIVITY.class));
            }
        });

        btnMyProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));
            }
        });
    }

}
