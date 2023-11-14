package org.code_structure.abstract_classes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vehicle aCar = new Car("Toyota");
        aCar.displayBrand(); // Outputs: The brand of the car is: Toyota
        Vehicle aBike = new Motorbike("Piaggio");


        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(aCar);
        vehicles.add(aBike);

        for (Vehicle vehicle : vehicles) {
            vehicle.displayBrand();
        }
    }
}
