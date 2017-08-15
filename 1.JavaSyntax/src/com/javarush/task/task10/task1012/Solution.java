package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита). Вывести результат на экран.

Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        ArrayList<String> result = new ArrayList<>();
        int[] abcd = new int[33];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < list.get(i).length(); j++){

                if(alphabet.contains(list.get(i).charAt(j))){
                    int k = alphabet.indexOf(list.get(i).charAt(j));
                    abcd[k]++;
                }

            }
        }

        for(int k = 0; k < alphabet.size(); k++) {
            result.add(alphabet.get(k) + " " + abcd[k]);
            System.out.println(result.get(k));
        }
    }
}
