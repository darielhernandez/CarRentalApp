package com.careerdevs.companyfactory;

public class Company {
    //fields
    public String name;
    public Short yearEstablished;
    public Double marketCap;

    //constructor
    public Company(String name, Short yearEstablished, Double marketCap){
        this.name= name;
        this.yearEstablished= yearEstablished;
        this.marketCap= marketCap;
    }
    //sentence to do
    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", yearEstablished=" + yearEstablished +
                ", marketCap=" + marketCap +
                '}';
    }
}
