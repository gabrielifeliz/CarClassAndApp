package com.company;

public class CarApp {

    public static void main(String[] args) {

        Car grayJaguar = new Car("gray", "Jaguar");
        Car redCadillac = new Car("red", "Cadillac");

        System.out.println(grayJaguar.getStart());
        System.out.println(redCadillac.getStart());
        System.out.println(grayJaguar.getAccelerate());
        System.out.println(redCadillac.getAccelerate());
        System.out.println(grayJaguar.getCheckEmissions());
        System.out.println(grayJaguar.getPassEmissions());
        redCadillac.setSpeed(50);
        System.out.println(redCadillac.getSpeed());
        System.out.println(redCadillac.getStop());
        grayJaguar.setSpeed(70);
        System.out.println(grayJaguar.getSpeed());
        grayJaguar.setPassAnotherCar(redCadillac);
        System.out.println(grayJaguar.getPassAnotherCar());

    }
}
