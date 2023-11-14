package org.strings;

public class StringTrimAndReplace {
    public static void main(String[] args) {
        String original = "   Java is fun!   ";
        String trimmed = original.trim();
        String replaced = original.replace("Java", "Python");

        System.out.println("Original: '" + original + "'");
        System.out.println("Trimmed: '" + trimmed + "'");
        System.out.println("Replaced: '" + replaced + "'");
    }
}
