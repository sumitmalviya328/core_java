package com.oop;

public class Program11 {


    static void visible( int... a)
    {
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a.length-1);
    }
    public static void main(String[] args)
    {

        Program11.visible(10, 11,12,13,14,18);
        
    }
}


