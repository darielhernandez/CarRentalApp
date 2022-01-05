package com.careerdevs;

public class Person {
    public String firstName;
    public String lastName;
    public int yearOfBirth;

    public Person (String firstName, String lastName){
        this.firstName= firstName;
        this.lastName= lastName;
    }

public String getFullName(){

        return firstName + " " + lastName;
}
//    public int getAge(int currentYear){
//        return currentYear - yearOfBirth;
//
//}

public void sayHello(){
        System.out.println("Hello my name is " + getFullName());
}

}
