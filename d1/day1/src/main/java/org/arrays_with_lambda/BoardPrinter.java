package org.arrays_with_lambda;

import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class BoardPrinter {
    public static void printBoard(Object[][] board, int size) {
        String boardString = IntStream.range(0, size)
                                      .mapToObj(i -> 
                                          IntStream.range(0, size)
                                                   .mapToObj(j -> board[i][j] == null ? " ~ " : " S ")
                                                   .collect(Collectors.joining(""))
                                      )
                                      .collect(Collectors.joining("\n"));
        System.out.println(boardString);
    }

    public static void main(String[] args) {
        // Example usage
        Object[][] board = new Object[5][5]; // Replace this with your board initialization
        printBoard(board, 5);
    }
}
