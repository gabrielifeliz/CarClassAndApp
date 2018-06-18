package com.company;

public class CarApp {

    public static void main(String[] args) {

        Car grayJaguar = new Car("gray", "Jaguar");
        Car redCadillac = new Car("red", "Cadillac");
        Car blackInfiniti = new Car("black", "Infiniti");

        System.out.println(grayJaguar.getStart());
        System.out.println(redCadillac.getStart());
        System.out.println(blackInfiniti.getStart());

    }
}
