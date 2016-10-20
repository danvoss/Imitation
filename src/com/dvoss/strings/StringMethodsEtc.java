package com.dvoss.strings;

/**
 * Created by Dan on 10/20/16.
 */

// www.tutorialspoint.com/javaexamples

public class StringMethodsEtc {

    public static void main(String[] args) {

        // upper-/lowercase
        String s = "hello, world!";
        String sUp = s.toUpperCase();
        String sLow = sUp.toLowerCase();
        System.out.println(s);
        System.out.println(sUp);
        System.out.println(sLow);

        // region matching
        String first = "Hello, world!";
        String second = "World, hello!";
        if ((first.regionMatches(7, second.toLowerCase(), 0, 5))) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        // performance for String literal vs. object
        long start = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            String s1 = "Hello";
            String s2 = "Hello";
        }
        long end = System.currentTimeMillis();
        System.out.println("Time to create String literals: " + (end - start) + "ms");

        long startO = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            String s3 = new String("hello");
            String s4 = new String("hello");
        }
        long endO = System.currentTimeMillis();
        System.out.println("Time to create String objects: " + (endO - startO) + "ms");

        // intern method (returns string with same contents, but guaranteed to be from a pool of unique strings)
        boolean b = (s.intern() == sLow.intern());
        boolean c = (s.intern().equals(sLow.intern()));
        boolean d = (s == sLow);
        boolean e = (s.equals(sLow));
        System.out.println(b); // note: returns true!
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);


    }
}
