package model;


import java.io.*;
import java.util.Scanner;

public class Board {
    private Square[][] square = new Square[8][8];
    private Color turn = Color.WHITE;

    public Board() {
        setBoard(); // Initialize the board
    }

    public Square getSquare(int x, int y) {
        return square[x][y];
    }

    public void setSquare(Square s, int x, int y) {
        square[x][y] = s;
    }


    public void setBoard() {
        // Initialize all squares and set them to empty
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                square[i][j] = new Square();
                square[i][j].setX(i);
                square[i][j].setY(j);
                square[i][j].setPieceAndColor(Piece.EMPTY, Color.NONE);
            }
        }

        // Set pieces for white
        square[0][0].setPieceAndColor(Piece.ROOK, Color.WHITE);
        square[1][0].setPieceAndColor(Piece.KNIGHT, Color.WHITE);
        square[2][0].setPieceAndColor(Piece.BISHOP, Color.WHITE);
        square[3][0].setPieceAndColor(Piece.QUEEN, Color.WHITE);
        square[4][0].setPieceAndColor(Piece.KING, Color.WHITE);
        square[5][0].setPieceAndColor(Piece.BISHOP, Color.WHITE);
        square[6][0].setPieceAndColor(Piece.KNIGHT, Color.WHITE);
        square[7][0].setPieceAndColor(Piece.ROOK, Color.WHITE);

        // Set pieces for black
        square[0][7].setPieceAndColor(Piece.ROOK, Color.BLACK);
        square[1][7].setPieceAndColor(Piece.KNIGHT, Color.BLACK);
        square[2][7].setPieceAndColor(Piece.BISHOP, Color.BLACK);
        square[3][7].setPieceAndColor(Piece.QUEEN, Color.BLACK);
        square[4][7].setPieceAndColor(Piece.KING, Color.BLACK);
        square[5][7].setPieceAndColor(Piece.BISHOP, Color.BLACK);
        square[6][7].setPieceAndColor(Piece.KNIGHT, Color.BLACK);
        square[7][7].setPieceAndColor(Piece.ROOK, Color.BLACK);

        // Set pawns for both white and black
        for (int i = 0; i < 8; i++) {
            square[i][1].setPieceAndColor(Piece.PAWN, Color.WHITE);
            square[i][6].setPieceAndColor(Piece.PAWN, Color.BLACK);
        }
    }

    public boolean playGame() {
        clearConsole();
        printBoard();
        return doMove();
    }

    private void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println("\n");
        }
    }

    public void printBoard() {
        System.out.println(" y:  0  1  2  3  4  5  6  7 ");
        System.out.println("x:");
        for (int i = 0; i < 8; i++) {
            System.out.print(" " + i + "   ");
            for (int j = 0; j < 8; j++) {
                Piece p = square[i][j].getPiece(); // Assuming getPiece() method returns Piece
                Color c = square[i][j].getColor(); // Assuming getColor() method returns Color

                switch (p) {
                    case KING:
                        System.out.print(c == Color.WHITE ? " K " : " k ");
                        break;
                    case QUEEN:
                        System.out.print(c == Color.WHITE ? " Q " : " q ");
                        break;
                    case BISHOP:
                        System.out.print(c == Color.WHITE ? " B " : " b ");
                        break;
                    case KNIGHT:
                        System.out.print(c == Color.WHITE ? " H " : " h ");
                        break;
                    case ROOK:
                        System.out.print(c == Color.WHITE ? " R " : " r ");
                        break;
                    case PAWN:
                        System.out.print(c == Color.WHITE ? " P " : " p ");
                        break;
                    case EMPTY:
                        System.out.print(" _ ");
                        break;
                    default:
                        System.out.print("Wrong");
                        break;
                }
            }
            System.out.println();
        }
    }



    public boolean doMove() {
        Scanner scanner = new Scanner(System.in);
        String move;
        int x1, y1, x2, y2;
        boolean stop = false;

        do {
            System.out.println((turn == Color.WHITE) ? "White move" : "Black move");
            System.out.println("Give 4 input string (e.g. 0103): ");
            move = scanner.nextLine();

            // Check if the input string is of the expected length and format
            if (move.length() != 4 || !move.matches("[0-7]{4}")) {
                System.out.println("Invalid input format. Please enter four digits between 0 and 7.");
                continue;
            }

            x1 = Character.getNumericValue(move.charAt(0));
            y1 = Character.getNumericValue(move.charAt(1));
            x2 = Character.getNumericValue(move.charAt(2));
            y2 = Character.getNumericValue(move.charAt(3));

            if (getSquare(x1, y1).getColor() == turn) {
                if (!makeMove(x1, y1, x2, y2)) {
                    System.out.println("Wrong move");
                } else {
                    Square src = getSquare(x1, y1);
                    Square dest = getSquare(x2, y2);

                    if (dest.getPiece() == Piece.KING) {
                        System.out.println((turn == Color.WHITE) ? "White wins!" : "Black wins!");
                        stop = true;
                    } else {
                        dest.setSpace(src);
                        src.setEmpty();
                        turn = (turn == Color.WHITE) ? Color.BLACK : Color.WHITE;
                    }

                    // Save game state to a file
                    saveToBinFile("./record.dat");
                    printBoard();
                }
            } else {
                System.out.println("Wrong piece, please try again");
            }
        } while (!stop);

        return true;
    }

    public void saveToBinFile(String filename) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(filename))) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    os.writeObject(square[i][j]);
                }
            }
        } catch (IOException e) {
            System.err.println("Cannot open file " + filename);
            e.printStackTrace();
        }
    }

    public boolean makeMove(int x1, int y1, int x2, int y2) {
        // Check if the move is within the bounds of the board
        if (x1 < 0 || x1 > 7 || y1 < 0 || y1 > 7 || x2 < 0 || x2 > 7 || y2 < 0 || y2 > 7) {
            System.out.println("Out of limits move");
            return false;
        }

        Square src = getSquare(x1, y1);
        Square dest = getSquare(x2, y2);

        // Cannot move to a spot already occupied by another same color piece
        if (src.getColor() == dest.getColor()) {
            System.out.println("Same color pieces");
            return false;
        }

        // Check the piece type and call the appropriate method
        switch (src.getPiece()) {
            case KING:
                return checkIfKing(src, dest);
            case QUEEN:
                return checkIfQueen(src, dest);
            case BISHOP:
                return checkIfBishop(src, dest);
            case KNIGHT:
                return checkIfKnight(src, dest);
            case ROOK:
                return checkIfRook(src, dest);
            case PAWN:
                return checkIfPawn(src, dest);
            case EMPTY:
                System.out.println("You do not have a piece there");
                return false;
            default:
                System.err.println("Something went wrong in the switch statement in makeMove()");
                return false;
        }
    }


    /**
     * The method moveKing() ensures that the
     * king will move exactly one step
     * in x AND exactly one step step in y
     * or, exactly one step in x AND 0
     * in y, or exactly one step in Y AND 0
     * in x
     */
    private boolean checkIfKing(Square thisKing, Square thatSpace) {
        int xDiff = Math.abs(thatSpace.getX() - thisKing.getX());
        int yDiff = Math.abs(thatSpace.getY() - thisKing.getY());

        // Check if the move is either one step in any direction or a stationary move
        return (xDiff <= 1 && yDiff <= 1);
    }



    /*
     * Check if we have a legal queen move.
     * The queen is a combination of a rook
     * and a bishop
     */
    private boolean checkIfQueen(Square thisQueen, Square thatSpace) {
        // The queen combines the movement of the rook and bishop
        if (thisQueen.getX() != thatSpace.getX() || thisQueen.getY() != thatSpace.getY()) {
            if (thisQueen.getX() == thatSpace.getX() || thisQueen.getY() == thatSpace.getY()) {
                // Moves like a rook
                return checkIfRook(thisQueen, thatSpace);
            } else if (Math.abs(thisQueen.getX() - thatSpace.getX()) == Math.abs(thisQueen.getY() - thatSpace.getY())) {
                // Moves like a bishop
                return checkIfBishop(thisQueen, thatSpace);
            } else {
                return false;
            }
        }
        return true;
    }


    /*
     * Check if we have a legal the bishop move
     * thisBishop : Square object, the Square object in the start spot
     * thatSpace : Square object, the Square object in the final spot
     *
     */
    private boolean checkIfBishop(Square thisBishop, Square thatSpace) {
        /*
         * The rook moves in such a way, that the absolute
         * value of the difference between the starting line
         * and the destination line is always equal with the
         * absolute value of the difference of the starting
         * column minus the destination column.
         */
        // Check if the move is diagonally valid
        if (Math.abs(thisBishop.getX() - thatSpace.getX()) == Math.abs(thisBishop.getY() - thatSpace.getY())) {
            // Check if the diagonal path is clear
            return moveDiagonal(thisBishop, thatSpace);
        } else {
            return false;
        }
    }


    private boolean checkIfKnight(Square thisKnight, Square thatSpace) {
        /*
         * (If the absolute value of the difference between the starting
         * line minus the destination line is 2 AND the absolute value
         * of the difference between the starting and destination column
         * is 1) OR (the absolute value of the difference between the
         * starting and destination line is 1 AND the absolute value between
         * the starting and destination column is 2) then move the horse
         * else return false
         */
        int xDiff = Math.abs(thisKnight.getX() - thatSpace.getX());
        int yDiff = Math.abs(thisKnight.getY() - thatSpace.getY());

        // Check for L-shape movement: 2 squares in one direction and 1 in the other
        return (xDiff == 2 && yDiff == 1) || (xDiff == 1 && yDiff == 2);
    }



    private boolean checkIfPawn(Square thisPawn, Square thatSpace) {
        // Check for white pawn
        if (thisPawn.getColor() == Color.WHITE) {
            // Move forward in an empty spot
            /**
             * move forward only in empty spot 1, or two spots ahead of starting position
             * if the starting row is equal with the destination row, namely x1 =x2
             * AND
             * ((the destination column is equal to the the starting column + 1, namely y2 = y1 + 1)
             * OR ((the destination column is equal to the starting column + 2) AND (the starting column is equal to 1))
             * AND the destination square is empty
             * then the white pawn has a legal move
             */
            if (thisPawn.getX() == thatSpace.getX() &&
                    (thatSpace.getY() == thisPawn.getY() + 1 || (thatSpace.getY() == thisPawn.getY() + 2 && thisPawn.getY() == 1)) &&
                    thatSpace.getColor() == Color.NONE) {
                return true;
            }
            // Capture diagonally

            /**
             * white pawn takes black piece.
             * (If the destination row is equal to the starting row + 1, namely x2 = x1 + 1 (one down)
             * OR if the destination row is equal to the starting row - 1, namely x2 = x1 - 1 (one up))
             * AND (the destination square has color black) then we can take the piece
             */
            else if ((thisPawn.getX() + 1 == thatSpace.getX() || thisPawn.getX() - 1 == thatSpace.getX()) &&
                    thisPawn.getY() + 1 == thatSpace.getY() && thatSpace.getColor() == Color.BLACK) {
                return true;
            }
        }
        // Check for black pawn
        else if (thisPawn.getColor() == Color.BLACK) {
            if (thisPawn.getX() == thatSpace.getX() &&
                    (thatSpace.getY() == thisPawn.getY() - 1 || (thatSpace.getY() == thisPawn.getY() - 2 && thisPawn.getY() == 6)) &&
                    thatSpace.getColor() == Color.NONE) {
                return true;
            }
            // Capture diagonally
            else if ((thisPawn.getX() + 1 == thatSpace.getX() || thisPawn.getX() - 1 == thatSpace.getX()) &&
                    thisPawn.getY() - 1 == thatSpace.getY() && thatSpace.getColor() == Color.WHITE) {
                return true;
            }
        }
        return false;
    }

    /**
     * Check if we have a legal rook move.
     * thisRook : Square object in the starting position
     * thatSpace : Square object in the destination position
     * The method returns a bool value. The method checks
     * that we stay in the same row AND change column(s)
     * OR that we stay in the same column AND change row(s)
     */
    private boolean checkIfRook(Square thisRook, Square thatSpace) {
        // Check horizontal movement
        if (thisRook.getX() == thatSpace.getX() && thisRook.getY() != thatSpace.getY()) {
            return moveForwardOrBackwards(thisRook, thatSpace);
        }
        // Check vertical movement
        else if (thisRook.getY() == thatSpace.getY() && thisRook.getX() != thatSpace.getX()) {
            return moveUpDown(thisRook, thatSpace);
        }
        return false;
    }


    private boolean moveForwardOrBackwards(Square src, Square dest) {
        int yDiff = dest.getY() - src.getY();
        int yIncrement = Integer.compare(yDiff, 0); // Gets 1 for forward, -1 for backward

        if (yIncrement == -1) {
            return moveBackwards(src, dest);
        } else {
            return moveForward(src, dest);
        }
    }

    /**
     * Move forward
     */
    private boolean moveForward(Square src, Square dest) {
        int yIncrement = 1;
        for (int i = src.getY() + yIncrement; i != dest.getY(); i += yIncrement) {
            if (square[src.getX()][i].getColor() != Color.NONE) {
                return false;
            }
        }
        return true;
    }


    private boolean moveDiagonal(Square src, Square dest) {
        int xDiff = dest.getX() - src.getX();
        int yDiff = dest.getY() - src.getY();
        int xIncrement = Integer.compare(xDiff, 0); // Replace the division for getting the sign
        int yIncrement = Integer.compare(yDiff, 0);

        for (int i = 1; i < Math.abs(xDiff); i++) {
            if (square[src.getX() + xIncrement * i][src.getY() + yIncrement * i].getColor() != Color.NONE) {
                return false;
            }
        }
        return true;
    }


    private boolean moveBackwards(Square src, Square dest) {
        int yStart = src.getY() - 1; // Start checking from the square immediately behind the source
        int yEnd = dest.getY();      // The destination square

        for (int i = yStart; i > yEnd; i--) {
            if (square[src.getX()][i].getColor() != Color.NONE) {
                return false; // Found an obstruction
            }
        }
        return true; // Path is clear
    }

    private boolean moveUpDown(Square src, Square dest) {
        int xDiff = dest.getX() - src.getX();
        int xIncrement = Integer.compare(xDiff, 0); // Gets -1 for up, 1 for down

        if (xIncrement == -1) {
            return moveUp(src, dest);
        } else {
            return moveDown(src, dest);
        }
    }

    private boolean moveUp(Square src, Square dest) {
        // Start checking from the square immediately above the source
        int xStart = src.getX() - 1;
        int xEnd = dest.getX(); // The destination square

        for (int i = xStart; i > xEnd; i--) {
            if (square[i][dest.getY()].getColor() != Color.NONE) {
                return false; // Found an obstruction
            }
        }
        return true; // Path is clear
    }


    private boolean moveDown(Square src, Square dest) {
        // Start checking from the square immediately below the source
        int xStart = src.getX() + 1;
        int xEnd = dest.getX(); // The destination square

        for (int i = xStart; i < xEnd; i++) {
            if (square[i][dest.getY()].getColor() != Color.NONE) {
                return false; // Found an obstruction
            }
        }
        return true; // Path is clear
    }


    public void readFromBinFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    square[i][j] = (Square) ois.readObject();
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
