package com.oop;

public class Program9 {

    static void display(int a, int b)
    {
       System.out.println("Hello");
    }
    static void show(int a)
    {
       System.out.println("Hi");
    }
    static void visible(int... a)
    {
        System.out.println("Bye");
    }
    public static void main(String[] args)
    {
         Program9.display(10,20);
        Program9.show(80);
        Program9.visible(10,20);
        
    }
}


