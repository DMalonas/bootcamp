package org.strings;

public class StringFormat {
    public static void main(String[] args) {
        double pi = Math.PI;
        String formatted = String.format("Value of PI: %.2f", pi);
        System.out.println(formatted);
    }
}

