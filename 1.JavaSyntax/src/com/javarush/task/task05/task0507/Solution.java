package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.

Пример для чисел 1 2 2 4 5 -1:
2.8

Пример для чисел 4 3 2 1 -1:
2.5*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int sum =0;
        while(true){
            String s = reader.readLine();
            int a = Integer.parseInt(s);
            if(a == -1)
                break;
            sum += a;
            count++;
        }
        double z = (double)sum/(double)count;
        System.out.println(z);
    }
}

