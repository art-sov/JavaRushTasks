package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики 1
В статическом блоке инициализировать labels 5 различными парами ключ-значение.*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }

    static{
        labels.put(3.3, "A");
        labels.put(3.7, "s");
        labels.put(3.9, "d");
        labels.put(3.0, "f");
        labels.put(3.1, "g");
    }
}
