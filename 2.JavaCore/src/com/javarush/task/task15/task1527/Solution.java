package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static URI uri;
    public static String s;
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            s = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<String> list = new ArrayList();
        uri = URI.create(s);
        String query = uri.getQuery();
        //System.out.println(query);
        //http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
        String[] parts = query.split("&");

        for (int i = 0; i < parts.length; i++) {
            for (int j = 0; j < parts[i].length(); j++) {
                if (!Character.isDigit(parts[i].charAt(j)) && parts[i].charAt(j) != '=') {
                    System.out.print(parts[i].charAt(j));
                } else break;
            }
            System.out.println(" ");
        }
        if (query.contains("obj=")) {
            System.out.println();
            try {
                alert(Double.parseDouble(query.substring(query.indexOf("=") + 1, query.indexOf("&"))));
            } catch (Exception e) {
                alert(query.substring(query.indexOf("=") + 1, query.indexOf("&")));
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
