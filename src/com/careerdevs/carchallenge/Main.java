package carChallenge;

import com.careerdevs.carchallenge.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        Car car1= new Car("Honda", 100);
        car1.showSpeed();

        Car car2= new Car("Jeep", 300);
        car2.showSpeed();


    }
}

