package com.example.learnexpressions;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

import com.example.learnexpressions.MainActivity;
import com.example.learnexpressions.R;
import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {
    Button btnLogout;
    Button btnFill;
    Button btnGuess;
    Button btnStats;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnLogout = findViewById(R.id.button3);
        btnFill = findViewById(R.id.button4);
        btnGuess = findViewById(R.id.button5);
        btnStats = findViewById(R.id.Statistics);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intToMain = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intToMain);
            }
        });
        btnFill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intToFill = new Intent(HomeActivity.this, FillActivity.class);
                startActivity(intToFill);
            }
        });
        btnGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intToGuess = new Intent(HomeActivity.this, GuessActivity.class);
                startActivity(intToGuess);
            }
        });
        btnStats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intToStats = new Intent(HomeActivity.this, StatsActivity.class);
                startActivity(intToStats);
            }
        });
    }
}

