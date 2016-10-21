package com.dvoss.arrays;

import java.util.Arrays;

/**
 * Created by Dan on 10/21/16.
 */

// www.tutorialspoint.com/javaexamples

public class ArrayExamples {

    public static void main(String[] args) {

        // sort and binary search
        int array1[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println(" ");
        int indexA1 = Arrays.binarySearch(array1, 2);
        System.out.println(indexA1);

    }
}
