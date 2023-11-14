package org.collections.map;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("Value for 'One': " + map.get("One"));
        System.out.println("Map size: " + map.size());

        map.remove("Two");
        map.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}
