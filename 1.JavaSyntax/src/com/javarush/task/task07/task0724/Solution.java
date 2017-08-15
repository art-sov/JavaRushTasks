package com.javarush.task.task07.task0724;

/* 
Семейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
 Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться
при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…*/

public class Solution {
    public static void main(String[] args) {
        Human ded1 = new Human("ded1", true, 67);
        Human ded2 = new Human("ded2", true, 67);
        Human bab1 = new Human("bab1", false, 67);
        Human bab2 = new Human("bab2", false, 67);
        Human papa = new Human("papa", true, 25, ded1, bab1);
        Human mama = new Human("mama",false, 25, ded2, bab2);
        Human son1 = new Human("son1", true, 2, papa, mama);
        Human son2 = new Human("son2", true, 2, papa, mama);
        Human doch = new Human("doch", false, 1, papa, mama);

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(bab1);
        System.out.println(bab2);
        System.out.println(papa);
        System.out.println(mama);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(doch);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;
            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















