package com.company;

public class Driver extends Person {

    private String driverName;

    @Override
    public String getDriverName() {
        return driverName;
    }

    @Override
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
}
