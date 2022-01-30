package com.careerdevs;

public class Car {
    private String make;
    private String model;
    private boolean isRented;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.isRented = isRented= false;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getName(){
        return make + " " + model;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }
}

