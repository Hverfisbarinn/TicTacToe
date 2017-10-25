package is.ru.hugb;

public class Board {
	private static char[] board;
	
	Board(){
		board = "123456789".toCharArray();
	}
	
	public boolean checkIfLegal(int move) {		
		if(move <= 0 || move > 9) {
			return false;
		}
		
		if(board[move-1] == 'X' || board[move-1] == 'O') {
			return false;
		}
		
		return true;
	}
	
	public char[] getBoard() {
		return board;
	}
	
	public boolean mark(int move, char symbol) {
		if(checkIfLegal(move)) {
			board[move-1] = symbol;
			return true;
		}
		return false;
	}
	
}
