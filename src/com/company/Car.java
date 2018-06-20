package com.company;

public class Car extends Vehicle {

    private String carMake;
    private String carColor;
    private String start;
    private String stop;
    private String accelerate;
    private String checkEmissions;
    private String passEmissions;
    private String passAnotherCar;

    public Car() {
    }

    public Car(String carColor, String carMake) {
        this.carColor = carColor;
        this.carMake = carMake;
        setStart();
        setAccelerate();
        setCheckEmissions();
        setPassEmissions();
        setStop();
    }

    public String getCheckEmissions() {
        return checkEmissions;
    }

    public void setCheckEmissions() {
        checkEmissions = "The " + carColor + " " + carMake
                + " has stopped to have its emissions checked";
    }

    public String getPassEmissions() {
        return passEmissions;
    }

    public void setPassEmissions() {
        passEmissions = "The " + carColor + " " + carMake
                + " passes its emission test";
    }

    @Override
    public String getStart() {
        return start;
    }

    @Override
    public void setStart() {
        start = "The " + carColor + " " + carMake
                + " is starting";
    }

    @Override
    public String getAccelerate(){
        return accelerate;
    }

    @Override
    public void setAccelerate(){
        accelerate = "The " + carColor + " " + carMake
                + " is accelerating";
    }

    @Override
    public String getStop() {
        return stop;
    }

    @Override
    public void setStop() {
        stop = "The " + carColor + " " + carMake
                + " is stopped";
    }


    public String getCarMake() {
        return carMake;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setPassAnotherCar(Car car) {
        passAnotherCar = "The " + carColor + " " + carMake + " just passed the "
                + car.getCarColor() + " " + car.getCarMake();
    }

    public String getPassAnotherCar() {
        return passAnotherCar;
    }

    @Override
    public String getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = "The " + carColor + " " + carMake
                + " is going " + speed + " mph";
    }
}
