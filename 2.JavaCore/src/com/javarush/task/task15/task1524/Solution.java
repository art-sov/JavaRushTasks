package com.javarush.task.task15.task1524;

public class Solution {
    //статические элементы

    static {
        init();
    }

    public static void init() {
        System.out.println("static void init()");
    }
    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        Solution s = new Solution();
    }

    {
        System.out.println("non-static block");
        printAllFields(this);
    }
    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);
    }

    public Solution() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }
    public String name = "First name";
    public int i = 6;

}
