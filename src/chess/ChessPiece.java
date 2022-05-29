package chess;

import Aplication.Boardgame.Board;
import Aplication.Boardgame.Piece;

public abstract class ChessPiece extends Piece{

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;

    }


    public Color getColor() {
        return color;
    }
    
}
