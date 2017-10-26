package is.ru.hugb;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GameServiceTest {
	@Test
	public void testMakeLegalMove(){
		GameService service = new GameService();
		service.makeMove(1);
		service.makeMove(2);
		service.makeMove(6);
		service.makeMove(9);

		char[] b = service.getBoard();
		assertEquals('X', b[0]);
		assertEquals('O', b[1]);
		assertEquals('X', b[5]);
		assertEquals('O', b[8]);
	}	

	@Test
	public void testMakeIllegalMove(){
		GameService service = new GameService();
		//Legal moves
		service.makeMove(2);
		service.makeMove(6);
		//Illegal moves
		service.makeMove(2);
		service.makeMove(6);
		service.makeMove(0);
		service.makeMove(10);
		service.makeMove(1000);
		service.makeMove(-2);

		char[] b = service.getBoard();
		assertEquals('X', b[1]);
		assertEquals('O', b[5]);
	}

	@Test
	public void testMakeMoveWin(){
		GameService service = new GameService();
		
		service.makeMove(1);
		service.makeMove(4);
		service.makeMove(2);
		service.makeMove(5);
		service.makeMove(3);
		assertEquals(Status.WIN, service.getStatus());
	}


}