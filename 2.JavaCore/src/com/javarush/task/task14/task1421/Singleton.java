package com.javarush.task.task14.task1421;

/**
 * Created by admin on 20.03.17.
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton(){
    }

    public static Singleton getInstance(){
        return instance;
    }

}
