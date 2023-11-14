package model;

import java.io.Serializable;

public class Square implements Serializable {
    private Piece piece;
    private Color color;
    private int x, y;

    public Square() {
        setEmpty();
    }

    public void setSpace(Square other) {
        this.piece = other.piece;
        this.color = other.color;
//        this.x = other.x;
//        this.y = other.y;
    }

    public void setEmpty() {
        this.piece = Piece.EMPTY;
        this.color = Color.NONE;
    }


    public void setPieceAndColor(Piece piece, Color color) {
        this.piece = piece;
        this.color = color;
    }

    public Piece getPiece() {
        return piece;
    }

    public Color getColor() {
        return color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}





