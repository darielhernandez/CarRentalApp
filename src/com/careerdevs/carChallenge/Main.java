package carChallenge;

public class Main {
    public static void main(String[] args) {
        Car carOne= new Car("Chevy","Camaro SS",10_000, .1f );
        Car CarTwo= new Car("Ford", "Mustang GT", 30_000, .9f);
        Car CarThree= new Car("Dodge", "Charger", 100, .9f);

        System.out.println(carOne.make+" "+ carOne.model);
        System.out.println(carTwo.make+" "+ carTwo.model);
        System.out.println(carThree.make+" "+carThree.model);

        //this is bonus solution***
//        Car[] myCarArr= new Car[3];
//        myCarArr[0]=carOne;
//        myCarArr[1]=carTwo;
//        myCarArr[2]=carThree;

    }
}
