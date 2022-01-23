package com.careerdevs.plantfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("plant");
        Plant();
    }
    public static void Plant(){
        //0 scanner
        Scanner scanner= new Scanner(System.in);

        //1 input
        System.out.println("Plant species: ");
        String name= scanner.nextLine();

        System.out.println("Plant Color\n(If only green, enter green. If green and another color, enter other color. If multi color, enter multi): ");
        String color= scanner.nextLine();

        System.out.println("Does this plant flower(y/n): ");
        Boolean hasFlower= scanner.nextBoolean();

        //2 instances
        Plant plant= new Plant(name, color, hasFlower);

        //3 print
        System.out.println(plant);
    }
}
