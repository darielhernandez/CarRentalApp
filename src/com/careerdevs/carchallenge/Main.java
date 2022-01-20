package com.careerdevs.carchallenge;

import com.careerdevs.carchallenge.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        makeACar();

    }
    public static void makeACar(){
        //0. create a scanner
        Scanner scanner= new Scanner(System.in);

        //1st user input
        System.out.println("Enter car company: ");
        String company= scanner.nextLine();
//        scanner.nextLine();

        System.out.println("Enter top speed: ");
        int speed= scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter horsepower: ");
        int horsepower= scanner.nextInt();

        System.out.println("End of user input..");

        //2. car instance
        Car car= new Car(company, speed, horsepower);

        //3. print
        System.out.println(car);
//        System.out.println("nimbus");
    }
}

