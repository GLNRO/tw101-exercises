package com.thoughtworks.tw101.introductory_programming_exercises;

import java.util.*;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(3);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        for (int i=0;i<n;i++){
            String spaces = repeat(n-(i+1)," ");
            String stars = repeat((2*i)+1, "*");
            System.out.println(spaces + stars);
        }

    }

    private static String repeat(int n, String character){
        String returnItem = "";
        for(int i=0;i<n;i++){
            returnItem += character;
        }
        return returnItem;
    }


//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        for (int i=0;i<n;i++){
            String spaces = repeat(n-(i+1)," ");
            String stars = repeat((2*i)+1, "*");
            System.out.println(spaces + stars);
        }
        for (int i =(n-2);i>=0;i--){
            String spaces = repeat(n-(i+1)," ");
            String stars = repeat((2*i)+1, "*");
            System.out.println(spaces + stars);
        }
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        for (int i=0;i<n;i++){
            String spaces = repeat(n-(i)," ");
            String stars = repeat((2*i)+1, "*");
            System.out.println(spaces + stars);
        }
        System.out.println("Lauren");
        for (int i =(n-1);i>=0;i--){
            String spaces = repeat(n-(i)," ");
            String stars = repeat((2*i)+1, "*");
            System.out.println(spaces + stars);
        }
    }
}
