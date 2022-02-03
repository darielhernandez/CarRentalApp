package com.careerdevs;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RentalServiceTwo {
    public RentalServiceTwo() {
    }

    public static void main(String[] args) {

        Car car1 = new Car("Nissan", "Altima");
        Car car2 = new Car("Toyota", "Corolla");
        Car car3 = new Car("Chevy", "Cruz");

        ArrayList<Car> availableCars = new ArrayList<>();
        ArrayList<Car> rentedCars = new ArrayList<>();

        availableCars.add(car1);
        availableCars.add(car3);
        rentedCars.add(car2);


        System.out.println("Available cars: ");
        for (int i = 0; i < availableCars.size(); i++) {
            System.out.println((i+1)+ ". "+ availableCars.get(i).getName());

        }
    }
}
