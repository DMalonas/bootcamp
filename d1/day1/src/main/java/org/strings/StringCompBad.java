package org.strings;

public class StringCompBad {
    public static void main(String[] args) {
        int x =100;
        System.out.println("" + (x == 100));
        String s1 = new String("ASDQWE");
        String s2 = "ASDQWE";
        String s3 = s1;
        // there's a reason for the different definitions
        System.out.println("s1 == s2 => " + (s1 == s2)); // reference in memory
        System.out.println("s1 == s3 => " + (s1 == s3)); // reference in memory
        System.out.println("s1.equals(s2) => " + s1.equals(s2)); //content from memory positions s1, s2
    }
}
