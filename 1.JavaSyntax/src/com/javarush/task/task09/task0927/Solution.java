package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
Есть класс кот – Cat, с полем «имя» (String).
Создать словарь Map<String, Cat> и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех котов и вывести его на экран.*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> map = new HashMap<>();
        map.put("Murchik", new Cat("Murchik"));
        map.put("Mishka", new Cat("Mishka"));
        map.put("Murzik", new Cat("Murzik"));
        map.put("Vaska", new Cat("Vaska"));
        map.put("Butsik", new Cat("Butsik"));
        map.put("Tessa", new Cat("Tessa"));
        map.put("Punya", new Cat("Punya"));
        map.put("Sonya", new Cat("Sonya"));
        map.put("Pushok", new Cat("Pushok"));
        map.put("Gav", new Cat("Gav"));
        //map.put("Roky", new Cat("Roky"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<>();
        for(Map.Entry<String, Cat> pair: map.entrySet()) {
            set.add(pair.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
