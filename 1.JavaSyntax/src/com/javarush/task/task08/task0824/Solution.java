package com.javarush.task.task08.task0824;

/* 
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Human> family = new ArrayList();
        family.add(new Human("son1", true, 20));
        family.add(new Human("son2", true, 15));
        family.add(new Human("doch", false, 7));
        family.add(new Human("papa", true, 40, family.get(0), family.get(1), family.get(2)));
        family.add(new Human("mama", false, 38, family.get(0), family.get(1), family.get(2)));
        family.add(new Human("ded1", true, 70, family.get(3)));
        family.add(new Human("baba1", false, 70, family.get(3)));
        family.add(new Human("ded2", true, 75, family.get(4)));
        family.add(new Human("baba2", false, 75, family.get(4)));

        for(Human h: family){
            System.out.println(h);
        }
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, Human ... child) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            for(Human human: child)
                this.children.add(human);

        }

        Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
