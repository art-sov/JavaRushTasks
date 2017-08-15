package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней
с начала года — нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 3 2020"));
    }

    public static boolean isDateOdd(String date) {
        Date yearStartTime = new Date();
        Date currentDate = new Date(date);
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);
        yearStartTime.setDate(1);
        yearStartTime.setMonth(0);
        yearStartTime.setYear(currentDate.getYear());

        long msDay = 60 * 60 * 24 * 1000;
        long days = currentDate.getTime() - yearStartTime.getTime();
        int dayCount = (int)(days/msDay);

        System.out.println(dayCount);
        if(dayCount%2 == 0){
            return false;
        }
        else {
            return true;
        }
    }
}
