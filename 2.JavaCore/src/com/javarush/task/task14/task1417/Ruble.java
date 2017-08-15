package com.javarush.task.task14.task1417;

/**
 * Created by admin on 20.03.17.
 */
public class Ruble extends Money {

    public double getAmount(){
        return 4;
    }

    public String getCurrencyName(){
        return "RUB";
    }

    public Ruble(double amount){
        super(amount);
    }
}
