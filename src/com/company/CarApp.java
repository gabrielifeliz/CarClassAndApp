package com.company;

public class CarApp {

    public static void main(String[] args) {

        Car grayJaguar = new Car("gray", "Jaguar");
        Car redCadillac = new Car("red", "Cadillac");
        Car blackInfiniti = new Car("black", "Infiniti");

        System.out.println(grayJaguar.getStart());
        System.out.println(redCadillac.getStart());
        System.out.println(blackInfiniti.getStart());
        System.out.println(grayJaguar.getAccelerate());
        System.out.println(redCadillac.getAccelerate());
        System.out.println(blackInfiniti.getAccelerate());
        System.out.println(grayJaguar.getCheckEmissions());
        System.out.println(grayJaguar.getPassEmissions());
        redCadillac.setSpeed(50);
        System.out.println(redCadillac.getSpeed());
    }
}
