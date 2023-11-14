package org.code_structure.overloading;

public class Main {
    public static void main(String[] args) {
        MathOperations operations = new MathOperations();

        System.out.println(operations.multiply(2, 3)); // Outputs 6 (integer multiplication)
        System.out.println(operations.multiply(2.5, 3.5)); // Outputs 8.75 (double multiplication)
        System.out.println(operations.multiply(2, 3, 4)); // Outputs 24 (integer multiplication with three numbers)
    }
}
