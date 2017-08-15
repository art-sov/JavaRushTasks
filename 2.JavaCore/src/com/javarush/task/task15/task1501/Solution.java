package com.javarush.task.task15.task1501;

/* 
ООП - Расставить интерфейсы
1. Добавь все возможные интерфейсы из Movable, Sellable, Discountable в класс Clothes.
2. Реализуй их методы.*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable, Sellable, Discountable{
        public boolean isMovable(){
            return true;
        }

        public Object getAllowedAction(String name){
            return new Object();
        }

        public Object getAllowedAction(){
            return new Object();
        }
    }
}
