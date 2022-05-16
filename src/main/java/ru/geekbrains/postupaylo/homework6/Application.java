package ru.geekbrains.postupaylo.homework6;

public class Application {
    public static void main(String[] args) {
        Cat catTom = new Cat("Tom");
        catTom.run(150);
        catTom.run(250);
        catTom.run(350);
        catTom.run(50);
        catTom.run(10);
        catTom.swim(10);

        Dog dogBobik = new Dog("Bobik");
        dogBobik.run(150);
        dogBobik.run(550);
        dogBobik.run(650);
        dogBobik.run(50);
        dogBobik.run(10);
        dogBobik.swim(100);
        dogBobik.swim(1000);
        dogBobik.swim(5);
        dogBobik.swim(1);
    }
}
