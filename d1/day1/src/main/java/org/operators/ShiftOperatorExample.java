package org.operators;

public class ShiftOperatorExample {
    public static void main(String[] args) {
        // Starting with a positive number 4
        int positiveNumber = 4; // binary: 0000 0000 0000 0000 0000 0000 0000 0100
        // Left shift the positive number by 1 (multiplies by 2)
        int leftShifted = positiveNumber << 1; // binary after shift: 0000 0000 0000 0000 0000 0000 0000 1000
        // Right shift the positive number by 1 (divides by 2)
        int rightShifted = positiveNumber >> 1; // binary after shift: 0000 0000 0000 0000 0000 0000 0000 0010

        System.out.println("Positive Number: " + positiveNumber);
        System.out.println("Left Shifted (positiveNumber << 1): " + leftShifted);
        System.out.println("Right Shifted (positiveNumber >> 1): " + rightShifted);

        // Starting with a negative number -4
        // In 32-bit binary using two's complement: 1111 1111 1111 1111 1111 1111 1111 1100
        int negativeNumber = -4;
        // Left shift the negative number by 1 (multiplies by 2, stays negative)
        // binary after shift: 1111 1111 1111 1111 1111 1111 1111 1000 (represents -8 in two's complement)
        int leftShiftedNegative = negativeNumber << 1;
        // Right shift the negative number by 1 (divides by 2, stays negative)
        // binary after shift: 1111 1111 1111 1111 1111 1111 1111 1110 (represents -2 in two's complement)
        int rightShiftedNegative = negativeNumber >> 1;

        System.out.println("\nNegative Number: " + negativeNumber);
        System.out.println("Left Shifted (negativeNumber << 1): " + leftShiftedNegative);
        System.out.println("Right Shifted (negativeNumber >> 1): " + rightShiftedNegative);
    }
}

