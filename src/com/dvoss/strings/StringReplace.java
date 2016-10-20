package com.dvoss.strings;

/**
 * Created by Dan on 10/20/16.
 */

// www.tutorialspoint.com/javaexamples

public class StringReplace {

    public static void main(String[] args) {

        String s = "Hello, world!";
        System.out.println(s.replace("H", "Y"));
        System.out.println(s.replaceFirst("He", "Ya"));
        System.out.println(s.replaceAll("o", "u"));
    }
}
