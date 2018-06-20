package com.company;

public abstract class Vehicle {

    protected String speed = "0";

    public Vehicle() {

    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = "The Speed is going " + speed + " mph";
    }

    public abstract String getStart();

    public abstract void setStart();

    public abstract String getStop();

    public abstract void setStop();

    public abstract String getAccelerate();

    public abstract void setAccelerate();
}
