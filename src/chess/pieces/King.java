package chess.pieces;

import boardgame.board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{

	public King(board board, Color color) {
		super(board, color);
	
	}
	@Override
	public String toString() {
		return "K";
	}
}
