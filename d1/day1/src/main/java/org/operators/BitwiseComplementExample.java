package org.operators;

public class BitwiseComplementExample {
    public static void main(String[] args) {
        // The number 10 in 32-bit binary (space separated for clarity):
        // 00000000 00000000 00000000 00001010
        int number = 10;

        // Applying the bitwise NOT operator to the number 10:
        // Before: 00000000 00000000 00000000 00001010
        // After:  11111111 11111111 11111111 11110101
        // All the 0 bits are inverted to 1, and all the 1 bits are inverted to 0.
        int complement = ~number;

        // When we print the complement, it displays as -11 in decimal,
        // because 11110101 is the binary two's complement representation of -11.
        System.out.println("Bitwise NOT of " + number + " is " + complement);
    }
}

