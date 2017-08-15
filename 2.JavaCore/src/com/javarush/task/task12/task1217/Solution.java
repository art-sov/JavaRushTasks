package com.javarush.task.task12.task1217;

/* 
Интерфейсы Fly, Run, Swim
Напиши public интерфейсы Fly(летать), Run(бежать/ездить), Swim(плавать).
Добавить в каждый интерфейс по одному методу.*/

public class Solution {
    public static void main(String[] args) {

    }

public interface Fly{
        void getHigh(int high);
}

public interface Run{
        void getSpeed(double speed);
}

public interface Swim{
        void getDeep(double deep);
}
}
