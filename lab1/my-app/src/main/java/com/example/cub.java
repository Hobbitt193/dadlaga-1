package com.example;

public class cube {
    private double side;
    public cube(double s){
        this.side = s;
    }

    public double getVolume(){
        return Math.pow(this.side, 3);
    }
}