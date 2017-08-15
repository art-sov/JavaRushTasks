package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
Создать массив, элементами которого будут списки строк.
Заполнить массив любыми данными и вывести их на экран.*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] list = new ArrayList[3];
        ArrayList<String> l1 = new ArrayList<>();


        ArrayList<String> l2 = new ArrayList<>();


        ArrayList<String> l3 = new ArrayList<>();

        l1.add("A");
        l1.add("F");
        l2.add("A");
        l2.add("F");
        l3.add("A");
        l3.add("F");

        list[0] = l1;
        list[1] = l2;
        list[2] = l3;

        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}