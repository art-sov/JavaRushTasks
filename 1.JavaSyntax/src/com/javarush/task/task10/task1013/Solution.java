package com.javarush.task.task10.task1013;

/* 
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;
        private int weight;
        private int hight;
        private char sex;
        private String name;
        private String surname;

        public Human (int age){
            this.age = age;
        }

        public Human(int age, int weight) {
            this.weight = weight;
            this.age = age;

        }
        public Human (int age, int weight, int hight){
            this.weight = weight;
            this.age = age;
            this.hight = hight;
        }

        public Human (int age, int weight, int hight, char sex) {
            this.weight = weight;
            this.age = age;
            this.hight = hight;
            this.sex = sex;
        }
        public Human (int age, int weight, int hight, char sex, String name) {
            this.weight = weight;
            this.age = age;
            this.hight = hight;
            this.sex = sex;
            this.name = name;
        }
        public Human (int age, int weight, int hight, char sex, String name, String surname) {
            this.weight = weight;
            this.age = age;
            this.hight = hight;
            this.sex = sex;
            this.name = name;
            this.surname = surname;
        }
        public Human (char sex, String name, String surname) {
            this.sex = sex;
            this.name = name;
            this.surname = surname;
        }
        public Human (int weight, int hight, char sex, String name, String surname) {
            this.weight = weight;
            this.hight = hight;
            this.sex = sex;
            this.name = name;
            this.surname = surname;
        }
        public Human (char sex) {
            this.sex = sex;
        }

        public Human (String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
    }
}
