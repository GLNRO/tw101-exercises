package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by laurengallinaro on 2/13/16.
 */
public class Game {

    private Integer randNum;
    private ArrayList guesses = new ArrayList<Integer>();
    private Scanner scanner = new Scanner(System.in);

    public Game(){
        this.randNum = (int)Math.random()*5;
    }

    public void start(){
        System.out.println("Starting the game");
        getInput();

    }

    public void getInput(){
        String userGuess = scanner.nextLine();
        System.out.println(userGuess);
    }
}
