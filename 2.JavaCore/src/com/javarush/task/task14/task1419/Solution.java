package com.javarush.task.task14.task1419;

import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
Заполни список exceptions десятью(10) различными исключениями.
Первое исключение уже реализовано в методе initExceptions.*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        for(int i = 0; i < 9; i++) {
            try{
                String s = "ert";
                char ch = s.charAt(8);
            }
            catch(Exception e){
                exceptions.add(e);
            }
        }

        /*
        try{
            Exception e = exceptions.get(100);
        }
        catch (Exception e){
            exceptions.add(e);
        }
        try{
            String s = "4r";
            int a = Integer.parseInt(s);
        }
        catch(Exception e){
            exceptions.add(e);
        }
        try{
            String s = "ert";
            char ch = s.charAt(8);
        }
        catch(Exception e){
            exceptions.add(e);
        }
        //6
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try{
            for(int i = 0; i < exceptions.size() + 2; i++){
                System.out.println(exceptions);
            }
        }catch (Exception e){
            exceptions.add(e);
        }

        try{
            Exception e = exceptions.get(100);
        }
        catch (Exception e){
            exceptions.add(e);
        }
        try{
            String s = "4r";
            int a = Integer.parseInt(s);
        }
        catch(Exception e){
            exceptions.add(e);
        }
        try{
            String s = "ert";
            char ch = s.charAt(8);
        }
        catch(Exception e){
            exceptions.add(e);
        }*/
    }
}
