package com.dvoss.datastructures;

import java.util.LinkedList;

/**
 * Created by Dan on 10/31/16.
 */

// www.tutorialspoint.com/javaexamples

public class LinkedMain {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("100");
        l.add("200");
        l.add("300");
        l.add("400");
        l.add("500");
        System.out.println("First is" + l.getFirst());
        System.out.println("Last is" + l.getLast());
    }

}
