package com.careerdevs.airplanefactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Airplane myAirplane= new Airplane(100, 555.5f, 'A', "Delta");
//        System.out.println(myAirplane);
    createAPlane();
    }

    public static void createAPlane(){
        //0th create a Scanner instance
        Scanner scan = new Scanner(System.in);

        //1st take user input
        System.out.println("Enter passengers\nNum: ");
        int passengers= scan.nextInt();
        scan.nextLine(); //clears the \n (new line character)

        System.out.println("Enter max speed\nNum: ");
        float maxSpeed= scan.nextFloat();
        scan.nextLine();

        System.out.println("Enter tail number\nNum: ");
        char idCharacter= scan.nextLine().charAt(0);

        System.out.println("Enter airline name\nNum: ");
        String airlineName= scan.nextLine();


        System.out.println("End of user input..");

        //2nd create an airplane instance
        Airplane airplane= new Airplane(passengers,maxSpeed, idCharacter, airlineName);



        //3rd print the fields value in the terminal
        System.out.println(airplane);
    }
}
