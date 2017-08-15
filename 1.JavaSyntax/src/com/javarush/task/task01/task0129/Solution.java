package com.javarush.task.task01.task0129;

/* 
Считаем длину окружности
Считаем длину окружности
Реализуй метод printCircleLength. Параметр метода — радиус окружности.
Метод должен вывести на экран длину окружности, рассчитанной по формуле: L = 2 * Pi * radius.
Результат — дробное число (тип double).
В качестве значения Pi используй значение 3.14.
*/

public class Solution {
    public static void main(String[] args) {
        printCircleLength(5);
    }

    public static void printCircleLength(int radius) {
        double Pi = 3.14;
        double l = (double)radius * Pi *2;
        System.out.println(l);
    }
}