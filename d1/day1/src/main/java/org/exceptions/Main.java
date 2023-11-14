package org.exceptions;


public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            int result = numbers[1] / 0; // This will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception: Division by zero.");
        }

        try {
            int number = numbers[5]; // This will cause ArrayIndexOutOfBoundsException
            System.out.println("Number at index 5: " + number);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array Index Out Of Bounds Exception: Invalid index.");
        }
    }
}

