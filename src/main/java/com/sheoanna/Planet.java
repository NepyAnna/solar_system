package com.sheoanna;

public class Planet {
    private String nameOfPlanet = null;
    private int numberOfSutelites =0;
    private double mass = 0.0; //kg
    private double volume = 0.0; //m3
    private int diameter = 0; //km
    private Integer distance = 0; //km
    private PlanetType type = PlanetType.UNDEFINED;
    private double density;

    public Planet(String name, int sutelites, double mass, double volume, int diameter, Integer distance) {
        this.nameOfPlanet = name;
        this.numberOfSutelites =sutelites;
        this.mass =mass;
        this.volume = volume;
        this.diameter = diameter;
        this.distance = distance;
        this.type = PlanetType.fromMass(mass);
    }

    public void setDensity(double density) {
        this.density = density;
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

    public double getDensity() {
        return density;
    }

    @Override
    public String toString() {
        return "";
    }
}
