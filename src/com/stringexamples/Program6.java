package com.stringexamples;

public class Program6 {
    public static void main(String[] args)
    {
        String s = "World Wide Web";
        s = s.toUpperCase();  // s = "WORLD WIDE WEB"
        int sum = 0;

        String[] r = s.split(" "); // r = ["WORLD","WIDE","WEB"]
        String res = "";
        for(String a: r)
        {
            sum=0;
            for(int i=0;i<a.length()/2;i++) // i=2
            {
                int ch1 = a.charAt(i)-64; // ch1 = 5
                int ch2 = a.charAt(a.length()-1-i)-64; // ch2=12

                int diff = Math.abs(ch1-ch2); // abs(-7) => diff = 7
                sum = sum + diff; // sum = 14
            }

            if(a.length()%2 !=0 )
            {
                int ch3 = a.charAt(a.length()/2)-64; // ch3 = 12
                sum = sum + ch3; // sum = 26
            }
            res = res + sum;
        }


        System.out.println(res);

    }
}