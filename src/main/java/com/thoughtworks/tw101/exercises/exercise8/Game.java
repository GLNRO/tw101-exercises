package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by laurengallinaro on 2/13/16.
 */
// When I instantiate the game, I want to initialize a random number, array of guesses, and new scanner reader
// When I start the game, I want to ask a user for their guess
// When the user inputs their guess, I want to parse that input to an integer
// When the user inputs their guess, I want to catch any numformat exceptions and ask them to try again.
//
//

public class Game {

    private Integer randNum;
    private ArrayList guesses = new ArrayList<Integer>();
    private Scanner scanner = new Scanner(System.in);
    private int userGuess;

    public Game(){
        this.randNum = (int)Math.random()*5;
    }

    public void start(){
        System.out.println("Starting the game");
        getInput();
        System.out.println("You guessed " + userGuess + " but you should have have guessed " + randNum);
    }



    public void getInput(){
        System.out.println("Pick a random number...");
        String stringGuess = scanner.nextLine();
        parseGuess(stringGuess);
    }

    public void parseGuess(String input){

        try{
            userGuess = Integer.parseInt(input);
        }
        catch(NumberFormatException e){
            System.out.println("That's not a number, try again...");
            getInput();
        }

    }
}
