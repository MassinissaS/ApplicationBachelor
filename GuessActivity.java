package com.example.learnexpressions;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
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

public class GuessActivity extends AppCompatActivity {
    private static int num_ex;
    private int i;
    private int min;
    private int max;
    public static int j;
    public int ex;
    private ArrayList<String> expression;
    private ArrayList<String> definition;
    private ArrayList<String> difficulty;
    Button btn5;
    Button btn10;
    Button btn20;
    Button btnsub;
    EditText guess;
    public void setNum_ex(int num_ex) {
        ex = num_ex;
    }
    public static int getNum_ex() {
        return num_ex;
    }

    public static int getJ() {
        return j;
    }

    public static void setJ(int j) {
        GuessActivity.j = j;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        j = 1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess);
        btn5 = findViewById(R.id.button7);
        btn10 = findViewById(R.id.button8);
        btn20 = findViewById(R.id.button9);
        btnsub = findViewById(R.id.submit);
        guess = findViewById(R.id.Guess);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num_ex = 5;
                Intent intGuess2 = new Intent(GuessActivity.this, GuessActivity2.class);
                startActivity(intGuess2);
                    }
                });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num_ex = 10;
                Intent intGuess2 = new Intent(GuessActivity.this, GuessActivity2.class);
                startActivity(intGuess2);
            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num_ex = 20;
                Intent intGuess2 = new Intent(GuessActivity.this, GuessActivity2.class);
                startActivity(intGuess2);
            }
        });
        }
    }