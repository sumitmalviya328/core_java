package com.stringexamples;

public class Program1 {
    public static void main(String[] args)
    {
        String s = "Hello";
        s = s.toUpperCase();

        for(int i=0;i<s.length();i++)
        {
            System.out.println(s.charAt(i));
        }
    }
}
