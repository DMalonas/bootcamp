package org.code_structure.abstract_classes;

import org.code_structure.abstract_classes.Vehicle;

public class Car extends Vehicle {
    public Car(String brand) {
        super(brand); // Calls the constructor of the abstract class
    }

    @Override
    public void displayBrand() {
        System.out.println("The brand of the car is: " + brand);
    }
}
