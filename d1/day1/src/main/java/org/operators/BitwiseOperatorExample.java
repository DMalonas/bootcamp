package org.operators;

public class BitwiseOperatorExample {
    public static void main(String[] args) {
        int a0 = 1, a1 = 2, a2 = 4, a3 = 8;
        int s0 = 1000, s1 = -1000;
        System.out.println("a0 or a1 or a2 = " + (a0 | a1 | a2));
        System.out.println("15 and (a0 or a3) = " + (15 & (a0 | a3)));
        System.out.println("s0 >> 1 = " + (s0 >> 1) + ", s0 << 2 = " + (s0 << 2));
        System.out.println("s0 >>> 1 = " + (s0 >>> 1) + " s0 >> 1 = " + (s0 >> 1));
        System.out.println("s1 >>> 1 = " + (s1 >>> 1) + " s1 >> 1 = " + (s1 >> 1));
    }
}

