package com.sheoanna;

public class SolarController {
    double density;
    Planet planet;
     
    public void densityOfThePlanet () {
        density = planet.getMass()/planet.getVolume();
    }

    public void outerPlanet(Integer distance) {
        if (distance > 314155527 && distance < 508632758){
            
        }

    }
}
/*Пояс астероїдів розташований між 2,1 і 3,4 а.о. Астрономічна одиниця (а.о.) — це відстань між Землею і Сонцем = 149597870 км.
У основному методі класу App необхідно створити дві планети і вивести на екран значення їх атрибутів. Крім того, потрібно 
надрукувати щільність кожної планети та чи є планета зовнішньою планетою Сонячної системи.*/