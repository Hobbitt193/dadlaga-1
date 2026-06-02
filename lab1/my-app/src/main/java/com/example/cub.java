package com.example;

public class cub {
    private double side;
    public cub(double s){
        this.side = s;
    }

    public double getVolume(){
        return Math.pow(this.side, 3);
    }
}