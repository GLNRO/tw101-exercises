package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {

        float avg = 0;
        for(Rectangle rectangle : rectangles){
            avg += rectangle.area();
        }
        return (avg/rectangles.length);
    }
}
