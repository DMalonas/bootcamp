package org.operators;

public class PrePostIncDecExample {
    public static void main(String[] args) {
        int a = 5;
        int b = a++;
        System.out.println("b = " + b + " a = " + a);
        // b = 5, a = 6
        int c = ++a;
        System.out.println("c = " + c + " a = " + a);
        // c = 7, a = 7
        int d = a--;
        System.out.println("d = " + d + " a = " + a);
        // d = 7, a = 6
        int e = --a;
        System.out.println("e = " + e + " a = " + a);
        // e = 5, a = 5;
    }
}

