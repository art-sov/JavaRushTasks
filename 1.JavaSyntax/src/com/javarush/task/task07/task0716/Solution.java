package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
лоза*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<>();
        list.add("роза");
        list.add("лоза");
        list.add("лира");
        list.add("липа");
        list.add("лупа");
        list.add("пара");
        list.add("ралли");
        list.add("роль");
        list.add("иск");
        list.add("метод");

        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {

        ArrayList<String> fixList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("р") && list.get(i).contains("л")) {
                fixList.add(list.get(i));
            }
            if (!list.get(i).contains("р") && list.get(i).contains("л")) {
                fixList.add(list.get(i));
                fixList.add(list.get(i));
            }
            if(!list.get(i).contains("л") && !list.get(i).contains("р")){
                    fixList.add(list.get(i));
            }
        }
        return fixList;
    }
}