package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] array = new String[10];
        int[] a = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 10; i++){
            array[i] = reader.readLine();
        }
        for(int i = 0; i < 10; i++){
            a[i] = array[i].length();
            System.out.println(a[i]);
        }

    }
}
