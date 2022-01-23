package com.careerdevs.streamingservicefactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StreamingService();
    }
    public static void StreamingService(){
        //0 scanner
        Scanner scanner= new Scanner(System.in);

        //1 input
        System.out.println("Streaming service name: ");
        String name= scanner.nextLine();

        System.out.println("Year established: ");
        Integer yearEstablished= scanner.nextInt();

        System.out.println("Is there a free option for this streaming service? ");
        Boolean freeOption= scanner.nextBoolean();

        //2 instances
        StreamingService streamingService= new StreamingService(name, yearEstablished, freeOption);

        //3 print
        System.out.println(streamingService);
    }
}
