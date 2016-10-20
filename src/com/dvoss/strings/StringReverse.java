package com.dvoss.strings;

/**
 * Created by Dan on 10/20/16.
 */

// www.tutorialspoint.com/javaexamples

public class StringReverse {

    public static void main(String[] args) {

        String s = "ABCDEF";
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(s);
        System.out.println(rev);
    }
}
