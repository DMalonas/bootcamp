package org.example;

import model.Board;
import model.Square;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Board board = new Board();  // Create Board object with turn = WHITE
        String input;
        boolean newGame = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chess\n");
        System.out.println("Press key: ");

        int option = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                option = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter a number:");
                scanner.nextLine(); // to clear the buffer
            }
        }

        do {
            if (option == 1) {
                System.out.println("Load previous game\n");
                board.setBoard();
                board.readFromBinFile("./record.dat");
            } else {
                board.setBoard();
            }
            scanner.nextLine(); // Consume newline left-over

            while (board.playGame()) {
                // Continue playing the game
            }

            System.out.println("Play again? (y|Y|yes|Yes : continue), (Press any other key to exit)");
            input = scanner.nextLine();

            if (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("yes")) {
                newGame = false;
            }
        } while (newGame);

        scanner.close();
    }



}
