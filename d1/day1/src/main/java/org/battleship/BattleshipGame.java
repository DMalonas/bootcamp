package org.battleship;

public class BattleshipGame {
    public static void main(String[] args) {
        GameBoard playerBoard = new GameBoard();
        Ship ship1 = new Ship();
        Ship.setShipCounter(1);
        Ship ship2 = new Ship();
        Ship.setShipCounter(2);
        int shipCounter = Ship.getShipCounter();
        ship2.hit();

        playerBoard.placeShip(ship1, 2, 3);
        playerBoard.placeShip(ship2, 4, 1);

        System.out.println("Game Board:");
        playerBoard.displayBoard();

        System.out.println("\nPlayer attacks (2,3):");
        playerBoard.attack(2, 3);

        System.out.println("\nGame Board after attack:");
        playerBoard.displayBoard();

        System.out.println("\nPlayer attacks (4,1):");
        playerBoard.attack(4, 1);

        System.out.println("\nGame Board after attack:");
        playerBoard.displayBoard();
    }
}

