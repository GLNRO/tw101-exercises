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
// When the user inputs a number, I want to check that number until it is correct.
// When a user submits a guess, I want it pushed to the guesses array

public class Game {

    private int randNum = (int) (Math.random()*5);
    private ArrayList guesses = new ArrayList<Integer>();
    private Scanner scanner = new Scanner(System.in);
    private int userGuess;


    public void start(){
        System.out.println("Starting the game");
        getInput();
        while (userGuess != randNum){
            checkGuess();
            getInput();
        }
        System.out.println("You guessed " + userGuess + " and the hidden number was " + randNum);
    }

    public void checkGuess(){
        if(userGuess > randNum){
            System.out.println("You guessed too high, try again");
        }
        else if( userGuess < randNum){
            System.out.println("You guessed too low");
        }

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
