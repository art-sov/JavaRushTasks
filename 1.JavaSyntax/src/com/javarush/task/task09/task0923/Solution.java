package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы из введённой строки.
2. вторая — только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
Пример ввода:
Мама мыла раму.

Пример вывода:
а а ы а а у
М м м л р м .*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] aray = s.toCharArray();
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        for(int i = 0; i < aray.length; i++){
            if(isVowel(aray[i])){
                list1.add(aray[i]);
            }
            else
            {
                if(aray[i] != ' '){
                list2.add(aray[i]);
                }
            }
        }
        for(int i = 0; i < list1.size(); i++){
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
        for(int i = 0; i < list2.size(); i++) {
            //if (!list2.get(i).equals(" ")) {
                System.out.print(list2.get(i) + " ");
            //}
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}