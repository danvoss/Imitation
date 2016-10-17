package com.dvoss.strings;

/**
 * Created by Dan on 10/17/16.
 */

// www.tutorialspoint.com/javaexamples

public class StringLastIndex {
    public static void main(String[] args) {
        String str = "Hello, world. Hello, reader.";
        String find = "Hello";
        int index = str.lastIndexOf(find);
        if (index < 0) {
            System.out.printf("'%s' not found.\n", find);
        }
        else {
            System.out.printf("The last index of '%s' is at %s.\n", find, index);
        }
    }
}
