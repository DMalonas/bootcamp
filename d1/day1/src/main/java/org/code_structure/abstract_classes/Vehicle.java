package org.code_structure.abstract_classes;

public abstract class Vehicle {
    protected String brand;

    // Constructor to initialize the state
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method
    public abstract void displayBrand();
}

