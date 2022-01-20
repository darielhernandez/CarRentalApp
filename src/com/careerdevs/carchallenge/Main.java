package com.careerdevs.carchallenge;

import com.careerdevs.carchallenge.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        makeACar();
        carObject();
    }
    public static void makeACar(){
        //0. create a scanner
        Scanner scanner= new Scanner(System.in);

        //1st user input
        System.out.println("What is your name?\nName");
        String owner= scanner.nextLine();

        System.out.println("Enter car make: ");
        String make= scanner.nextLine();

        System.out.println("Enter car model: ");
        String model= scanner.nextLine();

        //2. car instance
        Car car= new Car(owner, make, model);

        //3. print
        System.out.println(owner + " owns a " + make +" "+ model);
//        System.out.println("nimbus");
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

