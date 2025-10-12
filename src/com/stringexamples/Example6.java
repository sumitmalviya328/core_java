package com.stringexamples;

public class Example6 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        String c = "hello";

        System.out.println(a.compareTo(b));           // 0
        System.out.println(a.compareTo(c));           // -32
        System.out.println(a.compareToIgnoreCase(c)); // 0
    }
}
