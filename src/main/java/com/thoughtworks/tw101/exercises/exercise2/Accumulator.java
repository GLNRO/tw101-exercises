package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {

    private int totalCall = 0;


    public static void main(String[] args){
        Accumulator accumulator = new Accumulator();
    }


    public void increment(){
        totalCall += 1;
    }

    public void total(){
        System.out.println(totalCall);
    }
}
