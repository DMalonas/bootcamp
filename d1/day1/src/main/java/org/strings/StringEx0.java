package org.strings;

public class StringEx0 {
    public static void main(String[] args) {
        String s1 = "Morning";
        String s2 = "Marathon";
        System.out.println(s1 + " " + s2);
        System.out.println(s1 + 100);
// useful methods
        String sub1 = s1.substring(0, 3);
        String sub2 = s1.substring(1, 3);
        System.out.println(sub1);
        System.out.println(sub2);
    }
}

