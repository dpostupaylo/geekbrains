package ru.geekbrains.postupaylo.homework6;

public abstract class Animal {
    protected boolean canSwim = true;
    protected boolean canRun = true;

    protected int baseRunDistance = 1000;
    protected int baseSwimDistance = 1000;
    private static int count = 0;

    protected String animalName = "Animal";

    public Animal(String name){
        this.animalName = name;
        count++;
    }

    public void run(int distance) {
        if (canRun && distance <= baseRunDistance)
            System.out.println(this.animalName + " run: " + distance + " metres");

        if (!(distance <= baseRunDistance))
            System.out.println(this.animalName + " can't run more than " + baseRunDistance + " metres");
    }

    public void swim(int distance) {
        if (canSwim && distance <= baseSwimDistance)
            System.out.println(this.animalName + " swam: " + distance + " metres");

        if (!(distance <= baseSwimDistance))
            System.out.println(this.animalName + " can't swim more than " + baseSwimDistance + " metres");
    }
}
