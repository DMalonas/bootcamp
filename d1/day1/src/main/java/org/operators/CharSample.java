package org.operators;

public class CharSample {
    public static void main(String[] args) {
        char x = 'a';
        // Escape characters
        char tab = '\t';
        char newline = '\n';
        char carriage_return = '\r';
        char something = '\u6728';
        System.out.println(x);
        System.out.println("tab:|" + tab + "|");
        System.out.println("newline: |" + newline + "|");
        System.out.println("carriage return: |" + carriage_return + "|");
        System.out.println("unicode character: " + something);
    }
}

