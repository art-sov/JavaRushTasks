package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 20; i++){
            String s = reader.readLine();
            array[i] = Integer.parseInt(s);
        }
        int[] little1 = new int[10];
        int[] little2 = new int[10];
        for(int i = 0; i < 20; i++){
            if(i < 10){
                little1[i] = array[i];
            }
            else{
                little2[i-10] = array[i];
            }
        }
        for(int i = 0; i < 10; i++)
        System.out.println(little2[i]);
    }
}
