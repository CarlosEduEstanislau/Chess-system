package pieces;

import Boardgame.Board;
import Boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece{

    public Pawn(Board board, Color color) {
        super(board, color);
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position p = new Position(0, 0);
       if(this.getColor() == Color.WHITE){
           p.setValues(position.getRow()-1, position.getColumn());
            if(canMove(p)){
                mat[p.getRow()][p.getColumn()] = true;
            }

            p.setValues(position.getRow()-2, position.getColumn());
            Position p2 = new Position(position.getRow()-1, position.getColumn());
            if(canMove(p) && this.getMoveCount() == 0 && canMove(p2)){
                mat[p.getRow()][p.getColumn()] = true;
            }

            p.setValues(position.getRow()-1, position.getColumn()-1);
            if(getBoard().positionExists(p) && this.isThereOpponentPiece(p)){
                mat[p.getRow()][p.getColumn()] = true;
            }

            p.setValues(position.getRow()-1, position.getColumn()+1);
            if(getBoard().positionExists(p) && this.isThereOpponentPiece(p)){
                mat[p.getRow()][p.getColumn()] = true;
            }
            
        
        }
        else{
            p.setValues(position.getRow()+1, position.getColumn());
            if(canMove(p)){
                mat[p.getRow()][p.getColumn()] = true;
            }

            p.setValues(position.getRow()+2, position.getColumn());
            Position p2 = new Position(position.getRow()+1, position.getColumn());
            if(canMove(p) && this.getMoveCount() == 0 && canMove(p2)){
                mat[p.getRow()][p.getColumn()] = true;
            }

            p.setValues(position.getRow()+1, position.getColumn()-1);
            if(getBoard().positionExists(p) && this.isThereOpponentPiece(p)){
                mat[p.getRow()][p.getColumn()] = true;
            }

            p.setValues(position.getRow()+1, position.getColumn()+1);
            if(getBoard().positionExists(p) && this.isThereOpponentPiece(p)){
                mat[p.getRow()][p.getColumn()] = true;
            }
        }

        return mat;
    }

    private boolean canMove(Position p) {
       return getBoard().positionExists(p) && !getBoard().thereIsAPiece(p);
    }

    @Override
    public String toString(){
        return "P";
    }
    
}
