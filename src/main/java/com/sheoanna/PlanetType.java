package com.sheoanna;

public enum PlanetType {
    GAS,
    TERRESTRIAL,
    DWARF, 
    UNDEFINED;

    public static PlanetType fromMass(double size) {
        if (size > 2000000) {
            return GAS;
        } else if (size > 1000000) {
            return TERRESTRIAL;
        } else if (size > 0) {
            return DWARF;
        } else {
            return UNDEFINED;
        }
    }
}
