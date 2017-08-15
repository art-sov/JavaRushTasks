package com.javarush.task.task14.task1417;

/**
 * Created by admin on 20.03.17.
 */
public class USD extends Money {
    public double getAmount(){
        return 20;
    }

    public String getCurrencyName(){
        return "USD";
    }

    public USD(double amount){
        super(amount);
    }
}
