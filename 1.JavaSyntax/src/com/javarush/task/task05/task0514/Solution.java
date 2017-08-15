package com.javarush.task.task05.task0514;

/* 
Создать class Person. У человека должно быть имя String name, возраст int age.
Добавь метод initialize(String name, int age), в котором проинициализируй переменные name и age.
В методе main создай объект Person, занеси его ссылку в переменную person.
Вызови метод initialize с любыми значениями.*/

public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Artem", 35);
    }

    static class Person {
        String name;
        int age;
        public void initialize(String a, int b){
            name = a;
            age = b;
        }
    }
}
