package org.code_structure.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Bike());

        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }
    }
}
