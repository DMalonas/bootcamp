package org.operators;

public class XOROperatorExample {
    public static void main(String[] args) {
        // Initialize two boolean variables
        boolean A = true;
        boolean B = false;
        // Perform XOR operation on A and B
        boolean result = A ^ B;
        // Print the result of A XOR B
        System.out.println("A XOR B: " + result);
        // Perform XOR operation with both values true
        result = A ^ A; // This will be false
        System.out.println("A XOR A: " + result);
        // Perform XOR operation with both values false
        result = B ^ B; // This will be false as well
        System.out.println("B XOR B: " + result);
        // Perform XOR operation with A true and B false
        result = A ^ B; // This will be true
        System.out.println("A XOR B: " + result);
        // Perform XOR operation with A false and B true
        result = B ^ A; // This will be true as well
        System.out.println("B XOR A: " + result);
    }
}

