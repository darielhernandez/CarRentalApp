package com.careerdevs.carchallenge;

import com.careerdevs.carchallenge.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("nimbus");
        carObject();
    }
    public static void carObject(){
        //0. scanner
        Scanner scan= new Scanner(System.in);
        //1. user input
        System.out.println("Make: ");
        String make= scan.nextLine();

        System.out.println("Model: ");
        String model= scan.nextLine();

        System.out.println("Mileage: ");
        int mileage= scan.nextInt();

        System.out.println("Gas Tank(0= empty, .5= half, 1= full): ");
        float gasTank= scan.nextFloat();
        //2. instances
        Car car= new Car(make, model, mileage, gasTank);

        //3. print
        System.out.println("The "+ make +" "+ model + " has " + mileage + " miles on the odometer and " + gasTank + " tank of gas.");
    }
}

