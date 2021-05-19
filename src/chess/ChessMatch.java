package chess;

import boardgame.Position;
import boardgame.board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	private board Board;
	
	public ChessMatch() {
		Board = new board(8,8);
		initialsetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[Board.getRows()][Board.getColumns()];
		for (int i=0; i<Board.getColumns(); i++) {
			for(int j=0; j<Board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) Board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void initialsetup() {
		Board.placePiece(new Rook(Board, Color.WHITE), new Position(2, 1));
		Board.placePiece(new King(Board, Color.BLACK), new Position(0, 4));
		Board.placePiece(new King(Board, Color.WHITE), new Position(7, 4));
	}
}
