package org.strings;

public class StringSplitting {
    public static void main(String[] args) {
        String sentence = "Java is an OOP programming language.";
        String[] words = sentence.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
