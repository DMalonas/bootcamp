package org.exceptions;

// Usage
public class Main2 {
    public static void main(String[] args) {
        try {
            throw new CustomCheckedException("This is a custom checked exception");
        } catch (CustomCheckedException e) {
            e.printStackTrace();
        }
    }
}
