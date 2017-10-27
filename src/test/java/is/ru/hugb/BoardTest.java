package is.ru.hugb;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BoardTest {

	@Test
	public void testCheckIfOutOfBounds(){
		Board b = new Board();
		
		assertEquals(false, b.checkIfLegal(0));
		assertEquals(true, b.checkIfLegal(5));
		assertEquals(true, b.checkIfLegal(1));
		assertEquals(false, b.checkIfLegal(1000));
		assertEquals(false, b.checkIfLegal(-1));
	}	
	@Test
	public void testCheckIfLegalAlreadyMarked() {
		Board b = new Board();
		
		b.mark(1, 'O');
		b.mark(2, 'X');
		
		char [] board = b.getBoard();
		
		assertEquals(false, b.checkIfLegal(1));
		assertEquals(false, b.checkIfLegal(2));
	}
	
	@Test
	public void testMarkOne() {
		Board b = new Board();
		
		b.mark(1, 'O');
		b.mark(-1,'O');
		b.mark(5,'O');
		b.mark(200,'O');
		
		char [] board = b.getBoard();
		
		assertEquals(board[0], 'O');
		assertEquals(board[4], 'O');
	}
	
	@Test
	public void testIsWinVertical() {
		Board b = new Board();
		assertEquals(false, b.isWin());
		
		b.mark(1, 'O');
		b.mark(2, 'O');
		b.mark(3, 'O');		
		
		assertEquals(true, b.isWin());
	}
	
	@Test
	public void testIsWinHorizontal() {
		Board b = new Board();
		assertEquals(false, b.isWin());
		
		b.mark(1, 'X');
		b.mark(4, 'X');
		b.mark(7, 'X');		
		
		assertEquals(true, b.isWin());
	}
	
	@Test
	public void testIsWinDiagonal() {
		Board b = new Board();
		assertEquals(false, b.isWin());
		
		b.mark(1, 'O');
		b.mark(5, 'O');
		b.mark(9, 'O');		
		
		assertEquals(true, b.isWin());

		b = new Board();
		assertEquals(false, b.isWin());

		b.mark(3, 'O');
		b.mark(5, 'O');
		b.mark(7, 'O');		

		assertEquals(true, b.isWin());
	}
	
	@Test
	public void testIncrementingNumberOfMarked() {
		Board b = new Board();
		
		b.mark(1, 'O');
		b.mark(5, 'O');
		b.mark(9, 'O');		
		
		assertEquals(3, b.getNumberOfMarked());		
	}
	
	@Test
	public void testIsFull() {
		Board b = new Board();
		
		b.mark(1, 'O');
		b.mark(2, 'X');
		b.mark(3, 'O');
		b.mark(4, 'X');
		b.mark(5, 'O');
		b.mark(6, 'X');	
		b.mark(7, 'O');
		b.mark(8, 'X');
		b.mark(9, 'O');	
		
		assertEquals(true, b.isFull());		
	}
	
	
}