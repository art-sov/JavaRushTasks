package com.javarush.task.task14.task1417;

/**
 * Created by admin on 20.03.17.
 */
public class Hrivna extends Money {

    public double getAmount(){
        return 4;
    }

    public String getCurrencyName(){
        return "HRN";
    }

    public Hrivna(double amount){
        super(amount);
    }
}
