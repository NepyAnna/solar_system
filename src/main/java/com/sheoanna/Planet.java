package com.sheoanna;

public class Planet {
    String nameOfPlanet; //null
    int numberOfSutelites;
    double mass; //kg
    double volume; //m3
    int diameter; //km
    Integer distance; //km
    PlanetType type;
    
    boolean observable = false;

    public Planet() {
        this.nameOfPlanet = "";
        this.numberOfSutelites =0;
        this.mass =0.00;
        this.volume = 0.00;
        this.diameter = 0;
        this.distance = 0;
        this.type = PlanetType.UNDEFINED;
    }

    public void densityOfThePlanet () {

    }
    public String getNameOfPlanet() {
        return nameOfPlanet;
    }

    public int getNumberOfSutelites() {
        return numberOfSutelites;
    }

    public double getMass() {
        return mass;
    }

    public double getVolume() {
        return volume;
    }

    public int getDiameter() {
        return diameter;
    }

    public Integer getDistance() {
        return distance;
    }

    public PlanetType getType() {
        return type;
    }

    public boolean isObservable() {
        return observable;
    }
}
