package com.javarush.task.task10.task1001;

/* 
Задача №1 на преобразование целых типов
Расставьте правильно операторы приведения типа, чтобы получился ответ: d > 0
int a = 0;
int b = (byte) a + 46;
byte c = (byte) (a*b);
double f = (char) 1234.15;
long d = (short) (a + f / c + b);*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;//a = 0
        int b = (byte) a + 46;//b = 46 tip int
        byte c = (byte) (a * b); //c = 0 tip byte
        double f = (short) 1234.15; // f = 1234.0 tip char
        long d = (char) (a + f / c + b);// short(0 + 1234/0 + 46)
        System.out.println(d);
    }
}
