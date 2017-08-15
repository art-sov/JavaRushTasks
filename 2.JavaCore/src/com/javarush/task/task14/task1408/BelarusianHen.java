package com.javarush.task.task14.task1408;

/**
 * Created by admin on 19.03.17.
 */
public class BelarusianHen extends Hen {
    public int getCountOfEggsPerMonth(){

        return 5;
    }

    public String getDescription(){

        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
