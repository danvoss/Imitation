package com.dvoss.streams;

import java.util.Random;

import static java.util.stream.Collectors.*;
import static java.util.stream.IntStream.range;

/**
 * Created by Dan on 2/15/17.
 *
 * http://blog.paralleluniverse.co/2014/05/01/modern-java/
 */

public class Jmodern {
    public static void main(String[] args) {
        range(0, 100)
                .mapToObj(i -> randomString(new Random(), 'A', 'Z', 10))
                .sorted()
                .collect(groupingBy(name -> name.charAt(0)))
                .forEach((letter, names) -> System.out.println(letter + "\n\t" + names.stream().collect(joining("\n\t"))));
    }

    public static String randomString(Random r, char from, char to, int length) {
        return r.ints(from, to + 1).limit(length).mapToObj(x -> Character.toString((char)x)).collect(joining());
    }
}
