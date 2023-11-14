package org.code_structure.constructors;

public class Main {
    public static void main(String[] args) {
        // Using the default constructor
        Book unknownBook = new Book();
        unknownBook.displayInfo(); // Outputs: Unknown by Unknown, published in 0
        unknownBook.setAuthor("Author");

        // Using the parameterized constructor
        Book myBook = new Book("Java Fundamentals", "John Doe", 2021);
        myBook.displayInfo(); // Outputs: Java Fundamentals by John Doe, published in 2021
    }
}