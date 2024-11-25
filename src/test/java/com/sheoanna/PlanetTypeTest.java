package com.sheoanna;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PlanetTypeTest {
    @Test
    void testFromMass() {
        double mass = 2.5E6;
        assertEquals(PlanetType.GAS, PlanetType.fromMass(mass));

        mass = 1.5E6;
        assertEquals(PlanetType.TERRESTRIAL, PlanetType.fromMass(mass));

        mass = 5E5;
        assertEquals(PlanetType.DWARF, PlanetType.fromMass(mass));

        mass = -1000000;
        assertEquals(PlanetType.UNDEFINED, PlanetType.fromMass(mass));
    }
}
