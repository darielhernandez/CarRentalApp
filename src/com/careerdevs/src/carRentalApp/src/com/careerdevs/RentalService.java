package com.careerdevs;

public class RentalService {
    public static void main(String[] args) {
        System.out.println("NIMBUSSSS ");
        System.out.println("Welcome to the Java Rental CLI ");

    //standard array
        Car[] carStorage= new Car[3];

        //create object instances
        Car car1= new Car("Honda", "Accord");
        Car car2= new Car("Chevy", "Cruz");
        Car car3= new Car("Toyota", "Corolla");

        //store obj instances in list/array
        carStorage[0]= car1;
        carStorage[1]= car2;
        carStorage[2]= car3;

        //problem: how do we list just rented/available cars?
        car2.setRented(true);

        //for loop solution
//        int listNumber= 1;
        for (int i =0; i < carStorage.length; i++) {
            String carStatus;
            if (!carStorage[i].isRented()){
            carStatus= "Available";
            }else{
                carStatus= "Unavailable";
            }
                System.out.println((i+1) + " " + carStorage[i].getName() + " (" + carStatus + ") ");
        }
    }
}
