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
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		Board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialsetup() {
		placeNewPiece('b', 6, new Rook(Board, Color.WHITE));
		placeNewPiece('e', 8, new King(Board, Color.BLACK));
		placeNewPiece('e', 1,new King(Board, Color.WHITE));
	}
}
