package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» — «имя».
Удалить людей, имеющих одинаковые имена.*/

public class Solution {
    public static HashMap<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Petrov","Sasha");
        map.put("Ivanov","Sergey");
        map.put("Sidorov","Artem");
        map.put("Fedorov","Alex");
        map.put("Block","James");
        map.put("Pushkin","Michael");
        map.put("Lermontov","Ivan");
        map.put("Tolstoy","Lev");
        map.put("Bezuhov","Sahsa");
        map.put("Beam","Jim");
        return (HashMap)map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap(map);
        for(Map.Entry<String, String> pair: copy.entrySet()){
            int sizeBefore = map.size();
            removeItemFromMapByValue(map, pair.getValue());
            if(map.size() == sizeBefore - 1){
                map.put(pair.getKey(), pair.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
