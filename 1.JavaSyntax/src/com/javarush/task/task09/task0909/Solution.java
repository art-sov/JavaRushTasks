package com.javarush.task.task09.task0909;

/* 
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int[] m = new int[2];
m[8] = 5;*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            int[] m = new int[2];
            m[8] = 5;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
