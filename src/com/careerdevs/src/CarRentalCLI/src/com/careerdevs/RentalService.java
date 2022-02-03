package com.careerdevs;

import java.util.Arrays;
import java.util.Scanner;

public class RentalService {
    public static void main(String[] args) {
        System.out.println("Welcome to the Car Rental CLI!");
//        carRental();

        //storage array
        Car[] carStorage= new Car[3];

        Car car1= new Car("Nissan", "Altima");
        Car car2= new Car("Toyota", "Corolla");
        Car car3= new Car("Chevy", "Cruz");

        //store your instances
        carStorage[0]= car1;
        carStorage[1]= car2;
        carStorage[2]= car3;

        //problem: how do we list just rented/available cars?
        car2.setRented(true);



        //solution: iterate through the array, only display cars where isRented is false
        System.out.println("Available cars: ");
        int listNumber= 1;

        for(int i= 0; i< carStorage.length; i++){
            String carStatus;
            if (!carStorage[i].isRented()){
                carStatus= "Available";
//            System.out.println(listNumber+". "+ carStorage[i].getName());
//            listNumber++;
        }else{
            carStatus= "Unavailable";
        }
        System.out.println((i+1)+". "+ carStorage[i].getName()+" "+carStatus);
    }
    }
    public static void carRental(){
        //0 scanner
        Scanner carScan= new Scanner(System.in);


        //1 input
        System.out.println("To begin, what is your name: ");
        String userName= carScan.nextLine();
        System.out.println("Great! Now, "+ userName + " what kind of car would you like (Enter number)?\n1. Honda Accord\n2. Chevy Cruz\n3. Toyota Corolla");
        Integer carSelection= carScan.nextInt();

//        if (carSelection == 1){
//            System.out.println("You have selected a Honda Accord!");
//        }else if (carSelection == 2){
//            System.out.println("You have selected a Chevy Cruz!");
//        }else if(carSelection == 3){
//            System.out.println("You have selected a Toyota Corolla!");
//        }else{
//            System.out.println("Invalid Selection..");
//        }

        //2

        //3

    }
}

