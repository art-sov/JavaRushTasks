package com.javarush.task.task15.task1530;

/**
 * Created by admin on 17.05.17.
 */
public class LatteMaker extends DrinkMaker {
    @Override
    void getRightCup() {
        System.out.printf("Берем чашку для латте");
    }

    @Override
    void putIngredient() {
        System.out.println("Делаем кофе");
    }

    @Override
    void pour() {
        System.out.println("Заливаем молоком с пенкой");
    }

    public void makeDrink(){
        super.makeDrink();
    }
}
