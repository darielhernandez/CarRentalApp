package com.careerdevs.carchallenge;

public class Car {
    public String make;
    public String model;
    public String owner;
    public int mileage;
    public float gasTank;

    public Car(String make, String model, String owner, int mileage, float gasTank) {
        this.make = make;
        this.model= model;
        this.owner= owner;
        this.mileage= mileage;
        this.gasTank= gasTank;

    }

    public Car(String owner, String make, String model) {
    }

    public Car(String make, String model, int mileage, float gasTank) {

    }
}
