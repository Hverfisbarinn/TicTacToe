package is.ru.hugb;

public class Board {
	private char[] board;
	
	Board(){
		board = "123456789".toCharArray();
	}
	
	public static boolean checkIfLegal(int move) {		
		if(move < 0 || move > 9) {
			return false;
		}
		
		return true;
	}	
}