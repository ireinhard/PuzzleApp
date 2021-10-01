package com.example.puzzleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Making surface view and puzzle controller
        PuzzleView puzzleView = (PuzzleView) findViewById(R.id.puzzleView);
        PuzzleController puzzleController = new PuzzleController(puzzleView);

        //Initializing resetButton

        //making su
        puzzleView.setOnTouchListener(puzzleController);
    }

}