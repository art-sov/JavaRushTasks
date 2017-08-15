package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> intList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 10; i++){
            intList.add(Integer.parseInt(reader.readLine()));
        }
        for(int j = 9; j >= 0; j-- ){
            System.out.println(intList.get(j));
        }
    }
}
