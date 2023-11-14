package org.strings;

public class StringAddGood {
    public static void main(String[] args) {
        StringBuilder b = new StringBuilder();
        for(int i = 0; i < 1000; i++) {
            b.append(i);
        }
        String s = "This and that";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i) + ", ");
        }
        System.out.println(";" + b.toString().substring(0, 30));
    }
}

