package com.example.puzzleapp;

import android.view.MotionEvent;
import android.view.View;

public class PuzzleController implements View.OnTouchListener{

    //initializing variables
    private PuzzleModel puzzleModel;
    private PuzzleView puzzleView;

    public PuzzleController(PuzzleView inPuzzleView){
        puzzleView = inPuzzleView;
        puzzleModel = puzzleView.getPuzzleModel();
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }
}
