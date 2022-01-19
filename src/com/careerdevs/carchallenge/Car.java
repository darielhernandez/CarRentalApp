package com.careerdevs.carchallenge;

public class Car {
    public String company;
    public int speed;

    public Car(String company, int speed) {
        this.company = company;
        this.speed = speed;
    }

}

    public void showSpeed() {
        System.out.println(company + "car's speed is " + speed + "Km/hr");
    }
}
