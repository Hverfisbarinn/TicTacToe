package is.ru.hugb;

public class Board {
	private static char[] board;
	
	Board(){
		board = "123456789".toCharArray();
	}
	
	public static boolean checkIfLegal(int move) {		
		if(move < 0 || move > 9) {
			return false;
		}
		
		return true;
	}
	
	public static char[] getBoard() {
		return board;
	}
	
	public static boolean mark (int move, char symbol) {
		if(checkIfLegal(move)) {
			board[move-1] = symbol;
			return true;
		}
		return false;
	}
	
}
