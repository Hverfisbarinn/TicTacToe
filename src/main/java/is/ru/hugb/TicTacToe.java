package is.ru.hugb;

import static spark.Spark.*;

public class TicTacToe {
	public static void main(String[] args) {
		get("/", (req, res) -> "Hello World");
	}
}