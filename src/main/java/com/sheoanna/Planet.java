package com.sheoanna;

public class Planet {
    private String nameOfPlanet = null;
    private int numberOfSutelites =0;
    private double mass = 0.00;
    private double volume = 0.00;
    private int diameter = 0;
    private int distance = 0;
    private boolean isObservable = false;
    private PlanetType type = PlanetType.UNDEFINED;
    private double density;
    private String isOuterPlanet = null;
    private double orbitalPeriod = 0.00;
    private double rotationPeriod = 0.00;

    public Planet(String name, int sutelites, double mass, double volume, int diameter, int distance, boolean isObservable, double orbitalPeriod, double rotationPeriod) {
        this.nameOfPlanet = name;
        this.numberOfSutelites = sutelites;
        this.mass = mass;
        this.volume = volume;
        this.diameter = diameter;
        this.distance = distance;
        this.type = PlanetType.fromMass(mass);
        this.isOuterPlanet = outerPlanet(distance);
        this.density = densityOfThePlanet();
        this.isObservable = isObservable;
        this.orbitalPeriod = orbitalPeriod;
        this.rotationPeriod = rotationPeriod;
    }

    public double densityOfThePlanet() {
        return this.density = mass/volume;
    }

    public String outerPlanet(Integer distance) {
        if (distance > 508632758){
            return "This planet is an outer";
        } else {
            return "This planet is not outer";
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\nPlanet name: ").append(this.getNameOfPlanet()).append(".\n")
              .append("Number of Sutelites: ").append(this.getNumberOfSutelites()).append(".\n")
              .append("Mass of the planet: ").append(this.getMass()).append(" kg.\n")
              .append("Volume of the planet: ").append(this.getVolume()).append(" m3.\n")
              .append("Diameter of the planet: ").append(this.getDiameter()).append(" km.\n")
              .append("Distance of the planet: ").append(this.getDistance()).append(" km.\n")
              .append("Type of the planet: ").append(this.getType()).append(".\n")
              .append("Density of the planet: ").append(this.getDensity()).append(" kg/km3.\n")
              .append("Is outer planet: ").append(this.getIsOuterPlanet()).append(".\n")
              .append("Is observable: ").append(this.getIsObservable()).append(".\n")
              .append("Orbital Period: ").append(this.getOrbitalPeriod()).append(".\n")
              .append("Rotation Period: ").append(this.getRotationPeriod()).append(".\n");
        return result.toString();
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

    public int getDistance() {
        return distance;
    }

    public PlanetType getType() {
        return type;
    }

    public double getDensity() {
        return density;
    }

    public boolean getIsObservable() {
        return isObservable;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public double getRotationPeriod() {
        return rotationPeriod;
    }
}