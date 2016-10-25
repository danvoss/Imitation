package com.dvoss.methods;

import com.dvoss.arrays.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

/**
 * Created by Dan on 10/25/16.
 */

// www.tutorialspoint.com/javaexamples

public class Main {

    public static void displayObjectClass(Object o) {
        if (o instanceof Vector) {
            System.out.println("Object is an instance of java.util.Vector");
        }
        else if (o instanceof ArrayList) {
            System.out.println("Object is an instance of java.util.ArrayList");
        }
        else {
            System.out.println("Object is an instance of " + o.getClass());
        }
    }

    public static int sumVarArgs(int... intArray) {
        int sum, i;
        sum = 0;
        for (i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Object test1 = new ArrayList<>();
        Object test2 = new Vector<>();
        Object test3 = new HashMap<>();
        displayObjectClass(test1);
        displayObjectClass(test2);
        displayObjectClass(test3);

        // enum
        for (Car c : Car.values()) {
            System.out.printf("%s costs %s thousand dollars.\n", c, c.getPrice());
        }

        // varargs
        int sum = 0;
        sum = sumVarArgs(new int[] {1, 2, 3});
        System.out.printf("Sum is %s\n", sum);
    }
}
