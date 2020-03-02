package com.example.artista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton exhibitions,watercolor,acrylic,oil,gouache,spray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exhibitions = (ImageButton) findViewById(R.id.mainexhibitions);
        watercolor = (ImageButton) findViewById(R.id.mainwatercolor);
        acrylic = (ImageButton) findViewById(R.id.mainacrylic);
        oil = (ImageButton) findViewById(R.id.mainoil);
        gouache = (ImageButton) findViewById(R.id.maingouache);
        spray = (ImageButton) findViewById(R.id.mainspray);

        exhibitions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, ExhibitionPage.class);
                startActivity(intentLoadNewActivity);
            }
        });

        watercolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, WatercolorPage.class);
                startActivity(intentLoadNewActivity);
            }
        });

        acrylic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, AcrylicPage.class);
                startActivity(intentLoadNewActivity);
            }
        });

        oil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, OilPage.class);
                startActivity(intentLoadNewActivity);
            }
        });

        gouache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, GouachePage.class);
                startActivity(intentLoadNewActivity);
            }
        });

        spray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, SprayPage.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}