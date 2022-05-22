package ru.geekbrains.postupaylo.homework8;

public class NotEnoughFoodException extends Exception{
    public NotEnoughFoodException(String errorMessage){
        super(errorMessage);
    }
}
