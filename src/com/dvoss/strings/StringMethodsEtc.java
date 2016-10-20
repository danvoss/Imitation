package com.dvoss.strings;

/**
 * Created by Dan on 10/20/16.
 */

// www.tutorialspoint.com/javaexamples

public class StringMethodsEtc {

    public static void main(String[] args) {

        String s = "hello, world!";
        String sUp = s.toUpperCase();
        String sLow = sUp.toLowerCase();
        System.out.println(s);
        System.out.println(sUp);
        System.out.println(sLow);

        String first = "Hello, world!";
        String second = "World, hello!";
        if ((first.regionMatches(7, second.toLowerCase(), 0, 5))) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }



    }
}
