package com.careerdevs;

import com.sun.security.jgss.GSSUtil;

public class Main {

    public static void main(String[] args) {
//    CLIWalkthrough.readInt("Enter number selection: ", 1, 10);
        System.out.println("Welcome to the menu program");
        mainMenu();


    }
    public static void mainMenu(){
        System.out.println("Main Menu");
        System.out.println("1. Menu 1");
        System.out.println("2. Menu 2");
        System.out.println("3. Exit");

        int userSelection= CLIWalkthrough.readInt("Seleect an option", 1, 3);

        if(userSelection== 1){
            //run menu 1
            menuOne();
        }else if (userSelection== 2){
            //run menu 2
            System.out.println("You are on menu 2");

        }else if (userSelection== 3){
            //exit menu
            System.out.println("Thank you for using our program..");
        }

    }
    public static void menuOne(){
        System.out.println("\nYou on menu 1 son\n");
        int userInput= CLIWalkthrough.readInt("Select an option", 1, 3);

        mainMenu();
    }
}
