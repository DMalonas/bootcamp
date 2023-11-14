package org.code_structure.abstract_classes;

public class Motorbike extends Vehicle {
    public Motorbike(String brand) {
        super(brand); // Calls the constructor of the abstract class
    }

    @Override
    public void displayBrand() {
        System.out.println("The brand of the bike is: " + brand);
    }
}