package com.javarush.task.task14.task1408;

/**
 * Created by admin on 19.03.17.
 */
public class UkrainianHen extends Hen {
    public int getCountOfEggsPerMonth(){
        return 30;
    }

    public String getDescription(){

        String s = super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        return s;
    }
}
