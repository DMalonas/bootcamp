package org.strings;

public class StringAddBad {
    public static void main(String[] args) {
        String result = "";
        for(int i = 0; i < 1000; i++) {
            result = result + i; //999 temporary String
        }
        System.out.println(result.substring(0, 30));
    }
}

