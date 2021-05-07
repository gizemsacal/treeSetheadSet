package com.company;

import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using headSet() with default boolean value
        System.out.println("Boole değeri olmadan headSet kullanma: " + numbers.headSet(5));

        // Using headSet() with specified boolean value
        System.out.println("Boole değeriyle headSet kullanma: " + numbers.headSet(5, true));
    }
}