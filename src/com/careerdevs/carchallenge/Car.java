package com.careerdevs.carchallenge;

public class Car {
    public String company;
    public int horsepower;
    public int speed;

    public Car(String company, int speed, int horsepower) {
        this.company = company;
        this.speed = speed;
        this.horsepower= horsepower;
    }



    public void showCar() {

//        System.out.println(company + "'s cars have a top speed of " + speed + "Km/h\nWith a whopping " + horsepower + "horsepower!");
    }
}
