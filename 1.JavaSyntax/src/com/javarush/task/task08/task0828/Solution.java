package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/* 
Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap map = new HashMap();
        map.put("January", 1);
        map.put("February",2);
        map.put("March",3);
        map.put("April",4);
        map.put("May", 5);
        map.put("June", 6);
        map.put("July", 7);
        map.put("August", 8);
        map.put("September", 9);
        map.put("October", 10);
        map.put("November", 11);
        map.put("December",12);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        if(map.containsKey(s)) {
            System.out.println(s + " is " + map.get(s) + " month");
        }
    }



        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        ArrayList<String> list = new ArrayList<>();
        list.add(0, "January");
        list.add(1, "February");
        list.add(2, "March");
        list.add(3, "April");
        list.add(4, "Мay");
        list.add(5, "June");
        list.add(6, "July");
        list.add(7, "August");
        list.add(8, "September");
        list.add(9, "October");
        list.add(10, "November");
        list.add(11, "December");

        for(int i = 0; i < 12; i++){
            if(month.equals(list.get(i))){
                System.out.println(list.get(i) + " is " + (i+1) + " month");
            }
        }*/
    }
