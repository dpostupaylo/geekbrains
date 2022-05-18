package ru.geekbrains.postupaylo.homework7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void encreaseFood(int n) {
        food += n;
    }

    public int gerRestOfFood(){
        return food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
