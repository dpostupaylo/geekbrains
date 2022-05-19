package ru.geekbrains.postupaylo.homework8;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Barsik", 30) ,
                new Cat("Murzik", 5) ,
                new Cat("Piatno", 15) ,
                new Cat("Tom", 3) ,
                new Cat("Fix", 19) ,
                new Cat("Larry", 20) ,
                new Cat("Oruel", 23) ,
                new Cat("Antony", 19) ,
                new Cat("Andrew", 23) ,
                new Cat("Tomas", 25)
        };
        Plate plate = new Plate(150);
        plate.info();
        plate.info();
        Arrays.stream(cats).forEach( it -> System.out.println(it.isCatFull()) );
    }
}
