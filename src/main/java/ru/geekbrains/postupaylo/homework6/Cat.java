package ru.geekbrains.postupaylo.homework6;

import java.sql.SQLOutput;

public class Cat extends Animal{
    public Cat(String name){
        super(name);
        this.baseRunDistance = 200;
        this.canSwim = false;
    }

    @Override
    public void swim(int distance){
        System.out.println(this.animalName + " can't swim");
    }
}
