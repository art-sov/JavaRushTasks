package com.javarush.task.task10.task1003;

/* 
Добавить одну операцию по преобразованию типа, чтобы получался ответ: b=0
float f = (float)128.50;
int i = (int)f;
int b = (int)(i + f);*/

public class Solution {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (int) f;// i = 128
        int b = (byte) (i + f);// (128 + 128.5) = 256
        System.out.println(b);
    }
}
