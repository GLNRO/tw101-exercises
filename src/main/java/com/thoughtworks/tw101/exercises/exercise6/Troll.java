package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by laurengallinaro on 2/9/16.
 */
public class Troll implements Monster {
    private int hitpoints = 40;
    private int idNum;
    private String status = "alive";

    public Troll(int id){
        this.idNum = id;
    }

    @Override
    public void takeDamage(int amount) {
        if(status == "alive") {
            hitpoints -= (amount / 2);
            if (hitpoints <= 0){
                status = "dead";
            }
        }
    }

    @Override
    public void reportStatus() {
        System.out.println("Troll " + idNum + " is " + status + " and has " + hitpoints + " hitpoints remaining.");

    }
}
