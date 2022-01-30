package com.careerdevs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//    mainMenu();


//        int testInt = Game.readInt("enter a number", 1, 100);

        //this is a try/catch box example
//        Scanner scan= new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        try{
//            int num= scan.nextInt();
//            System.out.println("Your number is " + num);
//        }catch(Exception e){
//            System.out.println("Bad data given");
//        }
        //

        /*
        Main Menu:
        1. Play game
        2. Display rules
        3. Exit program

        Game Menu:
        1. Generate random number

        Loop: user will keep guessing number until they win (guess correct number) or lose (10 chances)
                when guess is incorrect, user is told if they are high or low and chances

        When loop is over: display to user if they won or lost the game

        when game is over: return to main menu*/

    }
    public static void mainMenu(){
        System.out.println("Main Menu:");
        System.out.println("1. Play game");
        System.out.println("2. Display rules");
        System.out.println("3. Exit");

        int userSelection= Game.readInt("Select menu option: ", 1, 3);

        switch (userSelection){
            //play game
            case 1:
            playGame();
            mainMenu();
            break;
            //display rules
            case 2:
            displayRules();
            mainMenu();
            break;
            //exit
            case 3:
                System.out.println("Thank you for using this program.. \nGoodbye");
        }

    }
    private static void displayRules(){
        System.out.println("\nRULES\n---------------------------------------------------------------\nUser will kep guessing until correct answer or 10 guesses are used");
    }

    public static void mainMenu1(){
        while (true){
        System.out.println("Main Menu:");
        System.out.println("1. Play game");
        System.out.println("2. Display rules");
        System.out.println("3. Exit");

        int userSelection= Game.readInt("Select menu option: ", 1, 3);

        switch (userSelection){
            //play game
            case 1:
                playGame();
                break;
            //display rules
            case 2:
                displayRules();
                break;
            //exit
            case 3:
                System.out.println("Thank you for using this program.. \nGoodbye");
                return;
            default:
                System.out.println("Something is wrong");
                break;
        }

    }
    private static void playGame(){
        System.out.println("Game");

    }
}}
