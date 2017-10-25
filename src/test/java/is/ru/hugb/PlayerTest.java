package is.ru.hugb;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
	@Test
	public void testIncrementWins() {
		Player p = new Player("Auddi", 'X');
		p.incrementWins();
		assertEquals(1, p.getWins());
	}
	@Test
	public void testIncrementThreeWins() {
		Player p = new Player("Auddi", 'X');
		p.incrementWins();
		p.incrementWins();
		p.incrementWins();
		assertEquals(3, p.getWins());
	}
}