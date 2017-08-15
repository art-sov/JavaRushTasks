package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» — «Имя».
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.*/

public class Solution {
    public static HashMap<String, String> createMap() {

        HashMap<String, String> map = new HashMap<>();

        map.put("Ass", "1ss");
        map.put("Bss", "Bss");
        map.put("Gss", "Gss");
        map.put("Jss", "Jss");
        map.put("Uss", "Tss");
        map.put("Rss", "Rss");
        map.put("Wss", "Wss");
        map.put("Qss", "Lss");
        map.put("Css", "Css");
        map.put("Vss", "Vss");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for(HashMap.Entry<String, String> pair: map.entrySet())
        {
            String value = pair.getValue();
            if(name.equals(value))
            {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count2 = 0;
        for(HashMap.Entry<String, String> pair: map.entrySet())
        {
            String key = pair.getKey();
            if (lastName.equals(key))
            {
                count2++;
            }
        }
        return count2;
    }

    public static void main(String[] args) {

    }
}
