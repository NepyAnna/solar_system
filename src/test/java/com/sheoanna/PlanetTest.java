package com.sheoanna;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlanetTest {
    Planet planet;

    @BeforeEach
    public void setUp() {
       planet = new Planet("Mars", 2, 6.4185E23, 1.6318E11, 6792, 227900000, true, 1.88, 1.00);
    }

    @Test
    void testDensityOfThePlanet() {
        double expectedDensity = planet.getMass()/planet.getVolume();
        assertEquals(expectedDensity, planet.getDensity());
    }

    @Test
    void testGetDensity() {

    }

    @Test
    void testGetDiameter() {

    }

    @Test
    void testGetDistance() {

    }

    @Test
    void testGetIsObservable() {

    }

    @Test
    void testGetIsOuterPlanet() {

    }

    @Test
    void testGetMass() {

    }

    @Test
    void testGetNameOfPlanet() {
        assertEquals("Mars", planet.getNameOfPlanet());
    }

    @Test
    void testGetNumberOfSutelites() {

    }

    @Test
    void testGetOrbitalPeriod() {

    }

    @Test
    void testGetRotationPeriod() {

    }

    @Test
    void testGetType() {
        assertEquals(PlanetType.fromMass(planet.getMass()), planet.getType());
    }

    @Test
    void testGetVolume() {

    }

    @Test
    void testOuterPlanet() {

    }

    @Test
    void testToString() {
        String expected = "\nPlanet name: Mars.\n" +
                          "Number of Sutelites: 2.\n" +
                          "Mass of the planet: 6.4185E23 kg.\n" +
                          "Volume of the planet: 1.6318E11 m3.\n" +
                          "Diameter of the planet: 6792 km.\n" +
                          "Distance of the planet: 227900000 km.\n" +
                          "Type of the planet: " + PlanetType.fromMass(planet.getMass()) + ".\n" +
                          "Density of the planet: " + planet.getDensity() + " kg/km3.\n" +
                          "Is outer planet: This planet is not outer.\n" +
                          "Is observable: true.\n" +
                          "Orbital Period: 1.88.\n" +
                          "Rotation Period: 1.0.\n";
        assertEquals(expected, planet.toString());

    }
}
