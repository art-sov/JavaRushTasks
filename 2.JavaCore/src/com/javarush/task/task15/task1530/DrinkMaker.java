package com.javarush.task.task15.task1530;

/**
 * Created by admin on 17.05.17.
 */
public abstract class DrinkMaker {

    abstract void getRightCup();

    abstract void putIngredient();

    abstract void pour();

    public void makeDrink(){
        getRightCup();
        putIngredient();
        pour();
    }
}

