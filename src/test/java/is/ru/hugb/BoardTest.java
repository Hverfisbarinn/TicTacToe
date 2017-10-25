package is.ru.hugb;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BoardTest {

	@Test
	public void testCheckIfLegal(){
		assertEquals(true, Board.checkIfLegal(0));
		assertEquals(true, Board.checkIfLegal(5));
		assertEquals(false, Board.checkIfLegal(-1));
		assertEquals(false, Board.checkIfLegal(1000));
	}
}