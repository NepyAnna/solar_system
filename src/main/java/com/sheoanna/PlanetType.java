package com.sheoanna;

public enum PlanetType {
    GAS,
    TERRESTRIAL,
    DWARF, 
    UNDEFINED;

    public static PlanetType fromMass(double size) {
        if (size > 1.0E26) {
            return GAS;
        } else if (size > 1.0E23) {
            return TERRESTRIAL;
        } else if (size > 1.0E21) {
            return DWARF;
        } else {
            return UNDEFINED;
        }
    }
}
