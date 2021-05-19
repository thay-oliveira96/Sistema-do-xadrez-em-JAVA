package boardgame;

public class Piece {
	protected Position position;
	private board Board;
	public Piece(board board) {
		this.Board = board;
		position = null;
	}
	protected board getBoard() {
		return Board;
	}
		
}
