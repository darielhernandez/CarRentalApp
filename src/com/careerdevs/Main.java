package com.careerdevs;

import com.careerdevs.sayhellofinal.People;
import com.careerdevs.sayhellofinal.Person;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
//challenge 1(printName)
    public static void main(String[] args) {
//        String firstName= "Dariel";
//        String lastName= "Hernandez";
//        String fullName= firstName + " " + lastName;
////        System.out.println(fullName);
//
//        Person myPerson= new Person(firstName, lastName);
//        System.out.println("Firstname: " + myPerson.firstName);
//        System.out.println("Lastname: " + myPerson.firstName);
//        System.out.println(myPerson.getFullName());


        //THIS IS FOR **PEOPLE**
        Person[] allPeople= new Person[People.firstNames.length];

        for (int i = 0; i < People.firstNames.length; i++){
            //System.out.println(People.firstNames[i])
            String fName= People.firstNames[i];
            String lName= People.lastNames[i];

            Person tempPerson = new Person(fName, lName);
            //add the new Person to the array of persons
            allPeople[i]= tempPerson;
            tempPerson.sayHello();
        }
        System.out.println(Arrays.toString(allPeople));

        }


    //challenge 2(fullName)
    public static void whatIsYourFullName(){
        Scanner scanner= new Scanner(System.in);

        System.out.println("What is your first name? ");
        String firstName= scanner.nextLine();
        System.out.println("What is your last name? ");
        String lastName= scanner.nextLine();

        System.out.println("It is nice to formally meet you, " + firstName +" "+ lastName +"");

//whatIsYourFullName(); //call the function
    }

    //challenge 3(carChallenge)




    }


