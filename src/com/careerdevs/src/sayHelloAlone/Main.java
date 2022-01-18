package sayHelloAlone;

import java.util.Scanner;


public class Main {
    public static void whatsYourName(String[] args) {

        wussyaname();

    }
public static void wussyaname() {
    Scanner scanner = new Scanner(System.in);//this is going to take the information that the user types in. thats Why you have System.IN
    System.out.println("What is your name, young padawan?");
    String userInput = scanner.nextLine();//this is the variable you create to store the user input
    System.out.println("Wake up, " + userInput +"...\n the Matrix has you");

}
}
