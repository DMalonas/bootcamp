package org.battleship;

public class GameBoard {
    private final int size = 5; // size of the board
    private Ship[][] board;

    public GameBoard() {
        board = new Ship[size][size];
    }

    public boolean placeShip(Ship ship, int x, int y) {
        if (isWithinBoundary(x, y) || board[x][y] != null) {
            return false; // Invalid placement
        }
        board[x][y] = ship;
        return true;
    }

    private boolean isWithinBoundary(int x, int y) {
        return x < 0 || x >= size || y < 0 || y >= size;
    }

    public boolean attack(int x, int y) {
        if (isWithinBoundary(x, y)) {
            return false; // Miss (out of bounds)
        }

        if (board[x][y] != null) {
            board[x][y].hit(); // Hit the ship
            board[x][y] = null; // Remove the ship from the board
            return true;
        }

        return false; // Miss
    }

    public void displayBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    System.out.print(" ~ "); // water
                } else {
                    System.out.print(" S "); // ship
                }
            }
            System.out.println();
        }
    }
}

