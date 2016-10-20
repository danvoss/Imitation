package com.dvoss.strings;

/**
 * Created by Dan on 10/20/16.
 */

// www.tutorialspoint.com/javaexamples

public class CharDelete {

    public static void main(String[] args) {

        String str = "This is my string.";
        System.out.println(removeChar(str, 3));
    }

    public static String removeChar(String s, int i) {
        return s.substring(0, i) + s.substring(i + 1);
    }
}
