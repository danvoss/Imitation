package com.dvoss.strings;

/**
 * Created by Dan on 10/20/16.
 */

// www.tutorialspoint.com/javaexamples

public class StringSplit {

    public static void main(String[] args) {

        String s = "Jan-Feb-March";
        String[] temp;
        String delimiter = "-";
        temp = s.split(delimiter);
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
        temp = s.split(delimiter, 2); // limits number of times pattern is applied
        for (int j = 0; j < temp.length; j++) {
            System.out.println(temp[j]);
        }
    }
}
