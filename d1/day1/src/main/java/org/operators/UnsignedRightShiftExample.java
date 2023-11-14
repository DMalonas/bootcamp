package org.operators;

public class UnsignedRightShiftExample {
    public static void main(String[] args) {
        int s1 = -4;
        int result = s1 >>> 1;
        System.out.println("s1 >>> 1 = " + result);


        int positiveNumber = 8; // 0000 0000 0000 0000 0000 0000 0000 1000 in binary
        int negativeNumber = -8; // 1111 1111 1111 1111 1111 1111 1111 1000 in binary
        int shifted = negativeNumber >>> 1; // Binary: 01111111 11111111 11111111 11111100
        System.out.println(negativeNumber + " unsigned-right-shifted by 1: " + shifted);
    }
}

