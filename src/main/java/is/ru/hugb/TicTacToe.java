package is.ru.hugb;

import static spark.Spark.*;

public class TicTacToe {

	public static void main(String[] args) {
		port(getPort());
		get("/", (req, res) -> "Hello World");
	}

	static int getPort() {
		ProcessBuilder psb = new ProcessBuilder();
		if (psb.environment().get("PORT") != null) {
			return Integer.parseInt(psb.environment().get("PORT"));
		}

		return 4567;
	}

}