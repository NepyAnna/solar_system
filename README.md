# solar_system
We need a program that models the concept of a planet in the Solar System.

A planet has the following attributes:
A name of type String with an initial value of null.
A number of satellites of type int with an initial value of zero.
A mass in kilograms of type double with an initial value of zero.
A volume in cubic kilometers of type double with an initial value of zero.
A diameter in kilometers of type int with an initial value of zero.
A mean distance from the Sun in millions of kilometers of type int with an initial value of zero.
A type of planet according to its size, a type in a list with the following possible values: GAS, TERRESTRIAL, and DWARF.
Appears at first glance, of type boolean with an initial value of false.

The class should contain the following methods:
The class should have a constructor that initializes the values ​​of its corresponding attributes.
Define a method that returns the values ​​of the planet's attributes.
Calculate the planet's density as the ratio of its mass to its volume.
Determine whether a planet in the Solar System is considered an outer planet.

Beyond the asteroid belt lies an outer planet. The asteroid belt is located between 2.1 and 3.4 AU. An astronomical unit (AU) is the distance between the Earth and the Sun = 149597870 km.
In the main method of the App class, you need to create two planets and print their attribute values. You also need to print the density of each planet and whether the planet is an outer planet in the Solar System.
Extension:
Add two attributes to the Planet class. The first attribute should represent the orbital period of the planet (in years). The second attribute should represent the rotation period (in days).
Change the class constructor to initialize the values ​​of these two new attributes.
Change the print method to print the values ​​of the new attributes on the screen.
Requirements:
The Planet class must be validated. (Minimum 70% coverage)
Readme should display class diagram
Workflow:
Link to Github repository
Screenshot of Visual Studio Code's Testing section where you can see test coverage


У основному методі класу App необхідно створити дві планети і вивести на екран значення їх атрибутів. Крім того, потрібно надрукувати щільність кожної планети та чи є планета зовнішньою планетою Сонячної системи.
Розширення:
Додайте два атрибути до класу Planet. Перший має представляти орбітальний період планети (у роках). Другий атрибут представляє період обертання (у днях).
Змініть конструктор класу так, щоб він ініціалізував значення цих двох нових атрибутів.
Змініть метод друку так, щоб він відображав значення нових атрибутів на екрані.
Вимоги:
Клас планети повинен бути перевірений. (Мінімум 70% покриття)
Readme має відображати діаграму класів
Результати роботи:
Посилання на репозиторій Github
Знімок екрана розділу «Тестування» коду Visual Studio, де ви можете побачити покриття тестів