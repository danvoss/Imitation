package com.dvoss.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

        // merge two arrays
        String a[] = {"A", "E", "I"};
        String b[] = {"O", "U"};
        List c = new ArrayList(Arrays.asList(a));
        c.addAll(Arrays.asList(b));
        System.out.println(c);

        // fill on initialization
        int array2[] = new int[6];
        Arrays.fill(array2, 10);
        System.out.println(Arrays.toString(array2));
        Arrays.fill(array2, 3, 6, 20);
        System.out.println(Arrays.toString(array2));

        // extend array after initialization
        String[] array3 = new String[] {"A", "B", "C"};
        String[] array4 = new String[5];
        array4[3] = "D";
        array4[4] = "E";
        System.arraycopy(array3, 0, array4, 0, array3.length);
        System.out.println(Arrays.toString(array4));

        // find common elements
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList2.add(0, "A");
        arrayList2.add(1, "B");
        arrayList2.add(2, "C");
        arrayList3.add(0, "A");
        arrayList3.add(1, "B");
        arrayList3.add(2, "E");
        arrayList2.retainAll(arrayList3);  // *
        System.out.println(arrayList2.toString());
        System.out.println(arrayList2.contains("A"));

        // check equality
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {1, 2, 3};
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(arr1, arr3));

    }
}
