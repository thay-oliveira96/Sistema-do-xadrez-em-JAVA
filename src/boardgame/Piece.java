package boardgame;

public class Piece {
	protected Position position;
	private board Board;
	public Piece(board board) {
		Board = board;
		position = null;
	}
	protected board getBoard() {
		return Board;
	}
		
}
