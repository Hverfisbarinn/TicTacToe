package is.ru.hugb;

public class Player {
	private String name;
	private char symbol;
	private int wins;
	private int losses;
	
	public Player(String name, char symbol) {
		this.name = name;
		this.symbol = symbol;
		wins = 0;
		losses = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public char getSymbol() {
		return symbol;
	}
	
	public int getWins() {
		return wins;
	}
	
	public int getLosses() {
		return losses;
	}
	
	public void incrementWins() {
		wins++;
	}
}