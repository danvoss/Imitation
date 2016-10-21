package com.dvoss.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Dan on 10/21/16.
 */

// www.tutorialspoint.com/javaexamples

public class ArrayExamples {

    public static void main(String[] args) {

        // sort and binary search
        int array1[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        Arrays.sort(array1);
            // print with loop:
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println(" ");
            // print with toString:
        System.out.println(Arrays.toString(array1));

        int indexA1 = Arrays.binarySearch(array1, 2);
        System.out.println(indexA1);

        // find size of 2-dimensional array
        String[][] data = new String[5][10];
        System.out.println(data.length); // 5
        System.out.println(data[data.length - 1].length); // 10

        // reverse an array list
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("A");
        arrayList1.add("B");
        arrayList1.add("C");
        arrayList1.add("D");
        arrayList1.add("E");
        System.out.println("Original: " + arrayList1);
        Collections.reverse(arrayList1);
        System.out.println("Reversed: " + arrayList1);

        // search min and max
        Integer[] numbers1 = {8, 2, 7, 1, 4, 9, 5};
        int min = Collections.min(Arrays.asList(numbers1));
        int max = Collections.max(Arrays.asList(numbers1));
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

    }
}
