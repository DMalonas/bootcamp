package org.battleship;

public class Ship {
    private boolean isSunk;

    private static int shipCounter = 0;

    public Ship() {
        isSunk = false;
    }

    public void hit() {
        isSunk = true;
        System.out.println("Hit a ship!");
    }

    public boolean isSunk() {
        return isSunk;
    }

    public void setSunk(boolean sunk) {
        this.isSunk = sunk;
    }

    public static int getShipCounter() {
        return shipCounter;
    }

    public static void setShipCounter(int shipCounter) {
        Ship.shipCounter = shipCounter;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "isSunk=" + isSunk +
                '}';
    }
}

