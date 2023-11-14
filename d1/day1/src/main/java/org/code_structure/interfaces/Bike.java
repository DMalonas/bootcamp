package org.code_structure.interfaces;

public class Bike implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Bike engine started.");
    }
}
