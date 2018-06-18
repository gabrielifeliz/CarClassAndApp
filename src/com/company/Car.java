package com.company;

public class Car extends Vehicle {

    private String carMake;
    private String carColor;
    private String start;
    private String accelerate;
    private String checkEmissions;
    private String passEmissions;
    private String passAnotherCar;

    public Car(String carMake, String carColor) {
        this.carMake = carMake;
        this.carColor = carColor;
        setStart();
        setAccelerate();
        setCheckEmissions();
        setPassEmissions();
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

    public String getStart() {
        return start;
    }

    public void setStart() {
        start = "The " + carColor + " " + carMake
                + " is starting";
    }

    public String getAccelerate(){
        return accelerate;
    }

    public void setAccelerate(){
        accelerate = "The " + carColor + " " + carMake
                + " is accelerating";
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
}
