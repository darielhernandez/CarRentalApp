package com.careerdevs.animalfactory;

public class Animal {
    //fields
    public String species;
    public Short legs;
    public Boolean livesOnLand;

    //constructor
    public Animal(String species, short legs, boolean livesOnLand){
        this.species= species;
        this.legs= legs;
        this.livesOnLand= livesOnLand;

    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", legs=" + legs +
                ", livesOnLand=" + livesOnLand +
                '}';
    }
}
