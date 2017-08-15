package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s1 = s.trim();
        String [] array = s1.split("");
        array[0] = array[0].toUpperCase();

        for(int i = 0; i < array.length; i++)
        {
            if(array[i].equals(" ") && array[i+1] != " "){
                array[i+1] = array[i + 1].toUpperCase();
            }

            System.out.print(array[i]);
        }
    }
}
