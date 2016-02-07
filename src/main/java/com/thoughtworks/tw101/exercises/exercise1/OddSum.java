package com.thoughtworks.tw101.exercises.exercise1;

public class OddSum {

    public static void main(String[] args){
        new OddSum();
    }

    public OddSum(){
        int sum = 0;

        for (int i = 0; i<100;i++){
            if (i%2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
