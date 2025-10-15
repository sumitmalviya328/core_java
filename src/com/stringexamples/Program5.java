package com.stringexamples;

public class Program5 {
    public static void main(String[] args)
    {
        String s = "Hello";   // s = Hello
        s = s.toUpperCase();  // s = HELLO
        int sum = 0;
        for(int i=0;i<s.length()/2;i++) // i=2
        {
            int ch1 = s.charAt(i)-64; // ch1 = 5
            int ch2 = s.charAt(s.length()-1-i)-64; // ch2=12

            int diff = Math.abs(ch1-ch2); // abs(-7) => diff = 7
            sum = sum + diff; // sum = 14
        }

        if(s.length()%2 !=0 )
        {
            int ch3 = s.charAt(s.length()/2)-64; // ch3 = 12
            sum = sum + ch3; // sum = 26
        }

        System.out.println(sum); // 26

    }
}