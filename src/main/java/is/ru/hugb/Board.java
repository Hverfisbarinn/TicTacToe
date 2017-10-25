package is.ru.hugb;

public class Board {
	private static char[] board;
	private final int SIZE = 9;
	private int numberOfMarked;
	
	Board(){
		board = "123456789".toCharArray();
	}
	
	public boolean checkIfLegal(int move) {		
		return checkOutOfBounds(move) && checkIfAlreadyMarked(move);
	}
	
	public char[] getBoard() {
		return board;
	}
	
	public int getNumberOfMarked() {
		return numberOfMarked;
	}
	
	public boolean mark(int move, char symbol) {
		if(checkIfLegal(move)) {
			board[move-1] = symbol;
			numberOfMarked++;
			return true;
		}
		return false;
	}
	
	public boolean isWin () {
		//Check vertical lines
		for(int i = 0; i < SIZE; i+=3) {
			if(board[i] == board[i + 1] && board[i] == board[i + 2]) {
				//win
				return true;
			}
		}
		//Check horizontal lines
		for(int i = 0; i < 3; i++) {
			if(board[i] == board[i + 3] && board[i] == board[i + 6]) {
				//win
				return true;
			}
		}
		
		//Check diagonal lines
		if(board[0] == board[4] && board[0] == board[8]) {
			//win
			return true;
		}
		if(board[2] == board[4] && board[2] == board [6]) {
			//win
			return true;
		}
		return false;
	}
	
	public boolean checkOutOfBounds(int move) {
		if(move <= 0 || move > 9) {
			return false;
		}
		return true;
	}
	
	public boolean checkIfAlreadyMarked(int move) {
		if(board[move-1] == 'X' || board[move-1] == 'O') {
			return false;
		}
		return true;
	}
	
	public boolean isFull() {
		return numberOfMarked == SIZE;
	}
	
}
