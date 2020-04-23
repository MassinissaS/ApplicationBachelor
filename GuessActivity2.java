package com.example.learnexpressions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class GuessActivity2 extends AppCompatActivity {
    Button btnsub;
    public int j;
    EditText Guess;
    ImageButton btnhome;
    TextView textView;
    private ArrayList<String> expression;
    private ArrayList<String> definition;
    private ArrayList<String> difficulty;
    private int i;
    private int min;
    private int max;
    private int num_ex;
    private int n;
    private String data;
    public void setJ(int j) {
        this.j = j;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess2);
        btnsub = findViewById(R.id.submit);
        Guess = findViewById(R.id.Guess);
        j = GuessActivity.getJ();
        btnhome = findViewById(R.id.imageButton);
        final TextView textView = (TextView) findViewById(R.id.textView);

        try {
            difficulty = new ArrayList<>(Files.readAllLines(Paths.get("Level_results.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (j = 0; j <= num_ex; j++) {
            btnhome.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intGuesstoHome = new Intent(GuessActivity2.this, HomeActivity.class);
                    startActivity(intGuesstoHome);
                }
            });
            textView.setText(("Sudden realization, the point at which one suddenly understands something"));
            btnsub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    j = j + 1;
                    GuessActivity.setJ(j);
                    String Guessed = Guess.getText().toString();
                    String toGuess = "Aha moment";
                    if(Guessed == toGuess.toString()){
                        Toast.makeText(GuessActivity2.this,"You made a mistake!",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(GuessActivity2.this,"You guessed it right!",Toast.LENGTH_SHORT).show();
                    }
                    Intent intGuess = new Intent(GuessActivity2.this, GuessActivity2.class);
                    startActivity(intGuess);
                }
            });


            }
                }
            }


