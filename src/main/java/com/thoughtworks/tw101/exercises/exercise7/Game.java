package com.thoughtworks.tw101.exercises.exercise7;

/**
 * Created by laurengallinaro on 2/9/16.
 */
import java.util.*;

public class Game {
    private int randNum = (int) (Math.random() * 5);
    private int guess;

    public Game(){

        while (randNum != guess){
            this.checkGuess();
        }
        System.out.println("Correct! the number was " + randNum);

    }

    public boolean checkGuess(){
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number");
        guess = input.nextInt();
        boolean correct = (guess == randNum);
        if (guess > randNum){
            System.out.println("Your guess was too high...");
        }
        else if (guess < randNum){
            System.out.println("Your guess was too low...");
        }
        return correct;
    }

}
