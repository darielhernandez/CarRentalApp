package com.careerdevs.animalfactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("nimbus");
        Animal();

    }
    public static void Animal(){
        //0 scanner
        Scanner scanner= new Scanner(System.in);

        //1 input
        System.out.println("Species: ");
        String species= scanner.nextLine();

        System.out.println("How many legs: ");
        Short legs= scanner.nextShort();

        System.out.println("Does this animal live on land? (true/false)");
        Boolean livesOnLand= scanner.nextBoolean();
        //2 instantiate
        Animal animal= new Animal(species, legs, livesOnLand);
        //3 print
        System.out.println(animal);

    }

}

