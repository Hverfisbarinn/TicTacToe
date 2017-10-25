package is.ru.hugb;

public class GameService {
	private enum Status{
		ACTIVE,
		WIN,
		DRAW; 
	}
	private Board board;
	private Player player1;
	private Player player2;

	GameService(){
		board = new Board();
		player1 = new Player("Player 1", 'X');
		player2 = new Player("Player 2", 'O');
	}

	public Board getBoard(){
		return board;
	}

	public Player getPlayer1(){
		return Player1;
	}

	public Player getPlayer2(){
		return Player2;
	}
	
}