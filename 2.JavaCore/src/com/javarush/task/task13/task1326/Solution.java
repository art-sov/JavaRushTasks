package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

        String fileName = br1.readLine();

        BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

        ArrayList<Integer> list = new ArrayList<>();

        while(br2.ready()){
            int data = Integer.parseInt(br2.readLine());
            if(data%2 == 0){
                list.add(data);
            }
        }
        br2.close();

        Collections.sort(list);

        for(int x:list){
            System.out.println(x);
        }
    }
}
