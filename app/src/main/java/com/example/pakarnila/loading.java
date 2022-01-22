package com.example.pakarnila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class loading extends AppCompatActivity {
    ImageButton getstarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        getstarted = findViewById(R.id.getstarted);

        getstarted.setOnClickListener(v -> {
            Intent intent = new Intent(loading.this, MainActivity.class);
            finish();
            startActivity(intent);
        });
    }
}