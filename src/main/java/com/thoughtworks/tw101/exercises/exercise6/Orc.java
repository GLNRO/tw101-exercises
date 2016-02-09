package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by laurengallinaro on 2/9/16.
 */
public class Orc implements Monster {

    private int hitpoints = 20;
    private int idNum;
    private String status = "alive";

    public Orc(int id){
        this.idNum = id;
    }

    @Override
    public void takeDamage(int amount) {
        if(status == "alive") {
            hitpoints -= amount;
            if (hitpoints <= 0){
                status = "dead";
            }
        }
    }

    @Override
    public void reportStatus() {
        System.out.println("Orc " + idNum + " is " + status + " and has " + hitpoints + " hitpoints remaining.");

    }
}
