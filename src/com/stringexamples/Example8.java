package com.stringexamples;
public class Example8 {
    public static void main(String[] args) {
        // int length() - size of the string/ length of the string
        String a = "this is  a test class" ;
        String []r = a.split(" ") ;
        System.out.println(r[0]);
        System.out.println(r[r.length - 1]);
    }

}


