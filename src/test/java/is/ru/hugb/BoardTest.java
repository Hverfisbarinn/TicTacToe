package is.ru.hugb;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BoardTest {

	@Test
	public void testCheckIfOutOfBounds(){
		assertEquals(true, Board.checkIfLegal(0));
		assertEquals(true, Board.checkIfLegal(5));
		assertEquals(false, Board.checkIfLegal(-1));
		assertEquals(false, Board.checkIfLegal(1000));
	}
	
	@Test
	public void testMarkOne() {
		Board b = new Board();
		
		Board.mark(1, 'O');
		Board.mark(-1,'O');
		Board.mark(5,'O');
		Board.mark(200,'O');
		
		char [] board = b.getBoard();
		
		assertEquals(board[0], 'O');
		assertEquals(board[4], 'O');
	}
	
}