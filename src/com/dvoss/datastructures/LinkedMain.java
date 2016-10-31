package com.dvoss.datastructures;

import java.util.ArrayList;
import java.util.Collection;
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
        System.out.println("First is " + l.getFirst());
        System.out.println("Last is " + l.getLast());
        l.addFirst("50");
        l.addLast("600");
        System.out.println(l);
        l.addLast("100");
        System.out.println("Index of 200 is " + l.indexOf("200"));
        System.out.println("Last index of 100 is " + l.lastIndexOf("100"));
        l.set(0, "20");
        System.out.println(l);
        System.out.println(l.peek());
        System.out.println(l.poll());
        System.out.println(l.pop());
        System.out.println(l);
        l.subList(4, 6).clear();
        System.out.println(l);
        Collection c = new ArrayList<>();
        c.add("9");
        c.add("99");
        c.add("999");
        l.addAll(c);
        System.out.println(l);
    }

}
