package com.javarush.task.task09.task0912;

/* 
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int num=Integer.parseInt("XYZ");
System.out.println(num);*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try {

            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}
