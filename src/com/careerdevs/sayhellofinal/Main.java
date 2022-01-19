package com.careerdevs.sayhellofinal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        whatIsYourName();
      //  whatIsYourFullName();
        yaFullNameSon();
    }

    public static void whatIsYourName(){
        Scanner scanner= new Scanner(System.in);// variable created to take in user input

        System.out.println("What is your name? ");
        String userInput= scanner.nextLine(); //variable created to store user input

        System.out.println("Hello, nice to meet you " + userInput);

    }

    public static void yaFullNameSon(){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Whats ya name? ");
        String userInput= scanner.nextLine();
        System.out.println("I need ya full name, son!");
        String fullName= scanner.nextLine();

        System.out.println("Pleasure to meet ya " + fullName);
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
