package com.careerdevs.countryfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Country();

    }
    public static void Country(){
        //0 scanner
        Scanner scanner= new Scanner(System.in);

        //1 input
        System.out.println("Country: ");
        String name= scanner.nextLine();

        System.out.println("Population: ");
        Long population= scanner.nextLong();

        System.out.println("Capital: ");
        String capital= scanner.nextLine();

        //2 instance
        Country country= new Country(name, population, capital);

        //print
        System.out.println(country);
    }
}
