package com.dvoss.strings;

import java.util.Locale;

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

        // formatting
        double mathE = Math.E;
        System.out.format("%f%n", mathE);
        System.out.format(Locale.GERMAN, "%-10.4f%n", mathE);

        // concatenation
        long startPlus = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            String result = "This is" + "testing the" + "difference" + "between" + "String" + "and" + "StringBuilder";
        }
        long endPlus = System.currentTimeMillis();
        System.out.println("Time for string concatenation with \'+\' : " + (endPlus - startPlus) + "ms");
        long startAppend = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            StringBuilder result = new StringBuilder();
            result.append("This is");
            result.append("testing the");
            result.append("difference");
            result.append("between");
            result.append("String");
            result.append("and");
            result.append("StringBuilder");
        }
        long endAppend = System.currentTimeMillis();
        System.out.println("Time for string concatenation with StringBuilder: " + (endAppend - startAppend) + "ms");

    }
}
