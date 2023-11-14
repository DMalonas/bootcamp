package org.strings;

public class StringInterning {
    public static void main(String[] args) {
        String first = new String("intern").intern();
        String second = "intern";

        System.out.println(first == second); // true
    }
}

