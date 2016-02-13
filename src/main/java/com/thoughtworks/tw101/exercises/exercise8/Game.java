package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;

/**
 * Created by laurengallinaro on 2/13/16.
 */
public class Game {

    private int randNum;
    private ArrayList<int> guesses = new ArrayList<int>();

    public Game(){
        this.randNum = (int)Math.random()*5;
    }

    public void start(){
        System.out.println("Starting the game");
    }
}
