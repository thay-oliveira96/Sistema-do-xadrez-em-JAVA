package chess;

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
		placeNewPiece('c', 1, new Rook(Board, Color.WHITE));
        placeNewPiece('c', 2, new Rook(Board, Color.WHITE));
        placeNewPiece('d', 2, new Rook(Board, Color.WHITE));
        placeNewPiece('e', 2, new Rook(Board, Color.WHITE));
        placeNewPiece('e', 1, new Rook(Board, Color.WHITE));
        placeNewPiece('d', 1, new King(Board, Color.WHITE));

        placeNewPiece('c', 7, new Rook(Board, Color.BLACK));
        placeNewPiece('c', 8, new Rook(Board, Color.BLACK));
        placeNewPiece('d', 7, new Rook(Board, Color.BLACK));
        placeNewPiece('e', 7, new Rook(Board, Color.BLACK));
        placeNewPiece('e', 8, new Rook(Board, Color.BLACK));
        placeNewPiece('d', 8, new King(Board, Color.BLACK));
	}
}
