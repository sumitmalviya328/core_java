package com.stringexamples;

public class Program3 {
    public static void main(String[] args)
    {
        String s = "Hello";
        s = s.toUpperCase(); // HELLO
        for(int i=0;i<s.length();i++)
        {
            System.out.print((int)s.charAt(i)); // 7269767679
        }
    }
}