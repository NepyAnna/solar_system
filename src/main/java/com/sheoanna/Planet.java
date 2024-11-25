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
    private String isOuterPlanet = null;

    public Planet(String name, int sutelites, double mass, double volume, int diameter, Integer distance) {
        this.nameOfPlanet = name;
        this.numberOfSutelites =sutelites;
        this.mass =mass;
        this.volume = volume;
        this.diameter = diameter;
        this.distance = distance;
        this.type = PlanetType.fromMass(mass);
        this.isOuterPlanet = outerPlanet(distance);
    }

    public void densityOfThePlanet () {
        density = mass/volume;
    }

    public String outerPlanet(Integer distance) {
        if (distance > 508632758){
            return "This planet is an outer.";
        } else {
            return "This planet is not outer.";
        }

    }

    @Override
    public String toString() {
        return "Planet name: " + this.getNameOfPlanet() + "\n" + "Number of Sutelites: " + this.getNumberOfSutelites() + "\n" + "Mass of the planet: " + this.getMass() + " kg\n" + "Volume of the planet: " + this.getVolume() + " m3\n" +
        "Diameter of the planet: " + this.getDiameter() + " km\n" + "Distance of the planet: " + this.getDistance() + " km\n" + "Type of the planet: " + this.getType() + "Denisty of the planet: " + this.getDensity() + " kg/km3\n" + "Is outer planet: " + this.getIsOuterPlanet();
    }

    public String getIsOuterPlanet() {
        return isOuterPlanet;
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

    public double getDensity() {
        return density;
    }
}