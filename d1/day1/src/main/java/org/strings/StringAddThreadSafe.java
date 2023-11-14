package org.strings;

public class StringAddThreadSafe {
    public static void main(String[] args) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < 1000; i++) {
            result.append(i);
        }
        System.out.println(result.substring(0, 30));
    }
}
