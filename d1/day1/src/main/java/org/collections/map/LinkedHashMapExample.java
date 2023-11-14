package org.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("Value for 'One': " + map.get("One"));
        System.out.println("Map size: " + map.size());

        map.remove("Two");
        map.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}

