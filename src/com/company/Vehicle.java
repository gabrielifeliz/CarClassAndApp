package com.company;

public class Vehicle {

    protected int speed = 0;

    protected Vehicle(int speed){
        setSpeed(speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
