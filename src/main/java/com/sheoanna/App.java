package com.sheoanna;

public final class App {
    private App() {
    }

    /**
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Planet mars = new Planet("Mars", 2, 6.4185E23, 1.6318E11, 6792, 227900000, true, 1.88, 1.00);
        Planet jupiter  = new Planet("Jupiter", 95, 1.898E27, 1.431E15, 139820, 778000000, false, 11.86, 0.41);
        System.out.println(mars);
        System.out.println(jupiter);
    }
}
