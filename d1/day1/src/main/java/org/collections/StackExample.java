package org.collections;

import java.util.Stack;
import java.util.List;

public class StackExample {
    public static void main(String[] args) {
        List<String> list = new Stack<>();
        list.add("Element 1");
        list.add("Element 2");
        ((Stack<String>)list).push("Element 3");
        ((Stack<String>)list).push("Element 4");
        System.out.println("Contains 'Element 1': " + list.contains("Element 1"));
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("Index of 'Element 3': " + list.indexOf("Element 3"));
        System.out.println("List size: " + list.size());
        ((Stack<String>)list).pop();
        list.forEach(System.out::println);
    }
}

