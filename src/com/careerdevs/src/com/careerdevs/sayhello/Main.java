package com.careerdevs.sayhello;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        whatIsYourName();
      //  whatIsYourFullName();
    }

    public static void whatIsYourName(){
        Scanner scanner= new Scanner(System.in);// variable created to take in user input

        System.out.println("What is your name? ");
        String userInput= scanner.nextLine(); //variable created to store user input

        System.out.println("Hello, nice to meet you " + userInput);

    }

    public static void whatIsYourFullName(){
        Scanner scanner= new Scanner(System.in);

        System.out.println("What is your first name? ");
        String firstName= scanner.nextLine();
        System.out.println("What is your last name? ");
        String lastName= scanner.nextLine();

        System.out.println("It is nice to formally meet you, " + firstName +" "+ lastName +"");


    }
}
