package com.careerdevs.UI;

public class TestUI {
    public static void main(String[] args) {
        String userInput= UserInput.readString("Who are you?");
        System.out.println("Nice to meet you, "+ userInput);

//        int input= UserInput.readInt("Enter a number");
//        System.out.println(input);
    }
}
