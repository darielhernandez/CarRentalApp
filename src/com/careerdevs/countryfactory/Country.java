package com.careerdevs.countryfactory;

public class Country {
    public String name;
    public Long population;
    public String capital;

    public Country(String name, Long population, String capital){
        this.name= name;
        this.population= population;
        this. capital= capital;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name:'" + name + '\'' +
                ", population:" + population +
                ", capital:'" + capital + '\'' +
                '}';
    }
}
