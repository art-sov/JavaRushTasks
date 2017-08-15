package com.javarush.task.task09.task0902;

/* 
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
        String name = Thread.currentThread().getStackTrace()[2].getMethodName();
        return name;//напишите тут ваш код
    }

    public static String method2() {
        method3();
        String name = Thread.currentThread().getStackTrace()[2].getMethodName();
        return name;//напишите тут ваш код
    }

    public static String method3() {
        method4();
        String name = Thread.currentThread().getStackTrace()[2].getMethodName();
        return name;//напишите тут ваш код
    }

    public static String method4() {
        method5();
        String name = Thread.currentThread().getStackTrace()[2].getMethodName();
        return name;
    }

    public static String method5() {
        //StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String name = Thread.currentThread().getStackTrace()[2].getMethodName();
        return name;

    }
}
