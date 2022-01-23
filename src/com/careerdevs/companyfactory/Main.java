package com.careerdevs.companyfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("NIMBUS");
        Company();
    }
    public static void Company(){
        //0 scanner
        Scanner scanner= new Scanner(System.in);

        //1 input
        System.out.println("Company name: ");
        String name= scanner.nextLine();

        System.out.println("Year established: ");
        Short yearEstablished= scanner.nextShort();

        System.out.println("Market Cap: ");
        Double marketCap= scanner.nextDouble();

        //2 instances
        Company company= new Company(name, yearEstablished, marketCap);

        //3 print
        System.out.println(company);
    }
}
