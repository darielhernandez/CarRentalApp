package com.careerdevs.carrentalCLI;

public class Car {
    public String make;
    public String model;
    public Boolean isRented;

    public Car(String make, String model, Boolean isRented) {
        this.make = make;
        this.model = model;
        this.isRented = isRented;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", isRented=" + isRented +
                '}';
    }
}
