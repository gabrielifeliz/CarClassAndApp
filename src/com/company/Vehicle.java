package com.company;

public class Vehicle {

    protected String speed = "0";

    public Vehicle() {

    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = "The Speed is going " + speed + " mph";
    }
}
