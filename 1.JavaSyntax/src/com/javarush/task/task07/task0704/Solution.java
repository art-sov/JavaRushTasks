package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] a = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 10; i++){
            String s = reader.readLine();
            a[i] = Integer.parseInt(s);
        }
        for(int i = 0; i < 5; i++){
            int temp = a[i];
            a[i] = a[10 - i -1];
            a[10 - i - 1] = temp;
        }
        for(int i = 0; i < 10; i++){
            System.out.println(a[i]);
        }
    }
}

