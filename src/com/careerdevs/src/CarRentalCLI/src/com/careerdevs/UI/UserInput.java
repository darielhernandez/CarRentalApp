package com.careerdevs.UI;

import java.util.Scanner;

public class UserInput {
    private static Scanner scanner= new Scanner(System.in);

    public static String readString(String question){
        while (true) {

        System.out.print(question+"\nInput: ");
        String inputString= scanner.nextLine();
        if (!inputString.trim().equals("")) {
            return inputString;
        }
            System.out.println("YOu must enter something");
        }


    }
//    public static int readInt (String question){
//        while(true){
//        System.out.println("Number: ");
//
//        int temp= scanner.nextInt();
//        return temp;
//        }
////        return scanner.nextInt();
//     }
}
