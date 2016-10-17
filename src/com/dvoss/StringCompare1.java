package com.dvoss;

/**
 * Created by Dan on 10/17/16.
 */
public class StringCompare1 {
    public static void main(String[] args) {
        String s1 = "HELLO WORLD";
        String s2 = "hello world";
        Object obStr = s1;

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1.compareTo(obStr.toString()));
    }
}
