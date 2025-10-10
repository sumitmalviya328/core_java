package com.stringexamples;

public class Example1 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";

        String s = new String("Hello");
        String r = new String("Hello");

        // ==, used to compare by references
        System.out.println(a==b); // true
        System.out.println(s==r); // false

        // equle(): to compare by values
        System.out.println(a.equals(b)); // true
        System.out.println(s.equals(r)); // true

    }
}
