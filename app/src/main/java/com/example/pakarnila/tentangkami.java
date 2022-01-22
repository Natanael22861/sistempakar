package com.example.pakarnila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

public class tentangkami extends AppCompatActivity {
    ImageButton habibii, naell, fitrii, lisaa, jejee;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentangkami);

        habibii = findViewById(R.id.habibii);
        naell = findViewById(R.id.naell);
        fitrii = findViewById(R.id.fitrii);
        lisaa = findViewById(R.id.lisaa);
        jejee = findViewById(R.id.jejee);
        back = findViewById(R.id.back);

        habibii.setOnClickListener(v -> {
            Intent intent = new Intent(tentangkami.this, tentanghabibi.class);
            finish();
            startActivity(intent);
        });
        naell.setOnClickListener(v -> {
            Intent intent = new Intent(tentangkami.this, tentangnael.class);
            finish();
            startActivity(intent);
        });
        fitrii.setOnClickListener(v -> {
            Intent intent = new Intent(tentangkami.this, tentangfitri.class);
            finish();
            startActivity(intent);
        });
        lisaa.setOnClickListener(v -> {
            Intent intent = new Intent(tentangkami.this, tentanglisa.class);
            finish();
            startActivity(intent);
        });
        jejee.setOnClickListener(v -> {
            Intent intent = new Intent(tentangkami.this, tentangjeje.class);
            finish();
            startActivity(intent);
        });
        back.setOnClickListener(v -> {
            Intent intent = new Intent(tentangkami.this, MainActivity.class);
            finish();
            startActivity(intent);
        });
    }
}