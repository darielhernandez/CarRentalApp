package com.careerdevs.plantfactory;

public class Plant {
    public String name;
    public String color;
    public Boolean hasFlower;

    public Plant(String name, String color, Boolean hasFlower){
        this.name= name;
        this.color= color;
        this.hasFlower= hasFlower;

    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", hasFlower=" + hasFlower +
                '}';
    }
}
