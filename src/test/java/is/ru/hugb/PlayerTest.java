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
	@Test
	public void testIncrementLosses() {
		Player p = new Player("Auddi", 'X');
		p.incrementLosses();
		assertEquals(1, p.getLosses());
	}
	@Test
	public void testIncrementThreeLosses() {
		Player p = new Player("Auddi", 'X');
		p.incrementLosses();
		p.incrementLosses();
		p.incrementLosses();
		assertEquals(3, p.getLosses());
	}
}