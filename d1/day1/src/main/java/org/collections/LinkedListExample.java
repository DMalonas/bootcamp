package org.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.addAll(new LinkedList<String>() {{
            add("Element 3");
            add("Element 4");
        }});
        System.out.println("Contains 'Element 1': " + list.contains("Element 1"));
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("Index of 'Element 3': " + list.indexOf("Element 3"));
        System.out.println("List size: " + list.size());
        list.remove("Element 2");
        list.iterator().forEachRemaining(System.out::println);
    }
}

