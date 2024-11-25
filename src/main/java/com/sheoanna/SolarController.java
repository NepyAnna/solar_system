package com.sheoanna;

public class SolarController {
    double density;
    Planet planet;
     
    public void densityOfThePlanet () {
        density = planet.getMass()/planet.getVolume();
        planet.setDensity(density);
    }

    public String outerPlanet(Integer distance) {
        if (distance < 508632758){
            return "This plent is an outer planet.";
        } else {
            return "This plent is not an outer planet.";
        }

    }
}
