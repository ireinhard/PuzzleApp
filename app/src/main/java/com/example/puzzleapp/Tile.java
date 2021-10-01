package com.example.puzzleapp;

import android.graphics.Color;
import android.graphics.Paint;

import java.util.Random;

/**
 * Class that represents a tile on the game board.
*/
public class Tile {
    //Initializing variables
    private int xPos;
    private int yPos;
    private int sideLen = 50;
    private Paint color;
    private int numTile; //holds number of tile, in this case 1-15
    private Random rand = new Random();

    //Constructor method
    public Tile(int inXPos, int inYPos){
        xPos = inXPos;
        yPos = inYPos;
        color = new Paint(Color.RED);
    }

    //setter methods
    public void setxPos(int inXpos){
        xPos = inXpos;
    }

    public void setyPos(int inYPos){
        yPos = inYPos;
    }

    public void setColor(Paint inPaint){
        color = inPaint;
    }


}
