package ru.geekbrains.postupaylo.homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        if (p.gerRestOfFood() < appetite) {
            System.out.println(String.format("It is not enough food for %s", this.name));
        } else {
            p.decreaseFood(appetite);
            satiety = true;
        }
    }

    public String isCatFull(){
        if (this.satiety)
            return String.format("%s is full and happy", this.name);
        else
            return String.format("%s is hungry. Be careful with your slippers", this.name);
    }
}
