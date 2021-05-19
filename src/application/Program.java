package application;

import boardgame.Position;
import boardgame.board;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		board Board = new board(8, 8);
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
	}

}
