package com.example.learnexpressions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class StatsActivity extends AppCompatActivity {
    ImageButton btnhome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);
        btnhome = findViewById(R.id.imageButton2);

        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intStatstoHome = new Intent(StatsActivity.this, HomeActivity.class);
                startActivity(intStatstoHome);
            }
        });

    }
}
