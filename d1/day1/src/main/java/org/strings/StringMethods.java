package org.strings;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Java Programming";

        System.out.println("Length: " + str.length());
        System.out.println("Char at index 5: " + str.charAt(5));
        System.out.println("Substring: " + str.substring(0, 4));
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Contains 'Pro': " + str.contains("Pro"));
    }
}

