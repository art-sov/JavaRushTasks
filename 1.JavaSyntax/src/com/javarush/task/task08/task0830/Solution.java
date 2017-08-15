package com.javarush.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        for (int i = array.length - 1; i > 1; i--)
        {
            for (int m = 0; m < i; m++)
            {
                if (isGreaterThan(array[m], array[m + 1]) == true)
                {
                    String temp = array[m];
                    array[m] = array[m + 1];
                    array[m + 1] = temp;
                }
            }

        }
    }
    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
