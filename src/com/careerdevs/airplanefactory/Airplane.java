package com.careerdevs.airplanefactory;

public class Airplane {

    //passengers (int)
    //maxSpeed (float)
    //idCharacter(char)
    //airlineName(string)

    //1. Fields
    public int passengers;
    public float maxSpeed;
    public char idCharacter;
    public String airlineName;

    //2. Constructor(s)
    public Airplane(int passengers, float maxSpeed, char idCharacter, String airlineName){
        this.passengers= passengers;
        this.maxSpeed= maxSpeed;
        this.idCharacter= idCharacter;
        this.airlineName= airlineName;

    }

    //3. Getter/Setter


    //4. Other Methods


    @Override
    public String toString() {
        return "Airplane{" +
                "passengers=" + passengers +
                ", maxSpeed=" + maxSpeed +
                ", idCharacter=" + idCharacter +
                ", airlineName='" + airlineName + '\'' +
                '}';
    }
}
