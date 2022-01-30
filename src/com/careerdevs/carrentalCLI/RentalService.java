package com.careerdevs.carrentalCLI;

import java.util.Arrays;
import java.util.Scanner;

public class RentalService {
    public static void main(String[] args) {
        System.out.println("Welcome to the Car Rental CLI!");
//        carRental();
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
