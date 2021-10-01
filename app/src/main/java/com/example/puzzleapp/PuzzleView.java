package com.example.puzzleapp;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class PuzzleView extends SurfaceView {

    //Initalizing variables
    private PuzzleModel puzzleModel;

    //Constructor
    public PuzzleView(Context context, AttributeSet attrs){
        super(context, attrs);
        //to enable drawing
        setWillNotDraw(false);
        //creating puzzleModel
        puzzleModel = new PuzzleModel();
    }

    public PuzzleModel getPuzzleModel(){
        return puzzleModel;
    }

    @Override
    protected void onDraw(Canvas canvas) {

    }
}
