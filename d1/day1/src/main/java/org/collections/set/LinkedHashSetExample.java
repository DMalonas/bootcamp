package org.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // This will not be added as it is a duplicate

        System.out.println("Set contains 'Apple': " + set.contains("Apple"));
        System.out.println("Set size: " + set.size());

        set.remove("Banana");
        set.forEach(System.out::println);
    }
}

