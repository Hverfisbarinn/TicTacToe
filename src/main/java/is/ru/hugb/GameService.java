package is.ru.hugb;

public class GameService {
	private enum Status{
		ACTIVE,
		WIN,
		DRAW; 
	}
	private Board board;
	private Player currentPlayer, player1, player2;

	GameService(){
		board = new Board();
		player1 = new Player("Player 1", 'X');
		player2 = new Player("Player 2", 'O');
		currentPlayer = player1;
	}

	public void makeMove(int move){
		if(board.mark(move, currentPlayer.getSymbol())){
			switchPlayer();
		}
	}

	private void switchPlayer() {
		if(currentPlayer == player1){
			currentPlayer = player2;
		}
		else{
			currentPlayer = player1;
		}		
	}

	public char[] getBoard(){
		return board.getBoard();
	}

	public Player getPlayer1(){
		return player1;
	}

	public Player getPlayer2(){
		return player2;
	}
	
}