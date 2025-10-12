package com.stringexamples;

public class Example3 {
    public static void main(String[] args) {
        // int length() - size of the string/ length of the string
        String a = "Hello";
        System.out.println(a.isEmpty()); // false

        String b = "";
        System.out.println(b.isEmpty());  // true

        String c = null;
        System.out.println(c.isEmpty()); // NullPointerException
    }
}
