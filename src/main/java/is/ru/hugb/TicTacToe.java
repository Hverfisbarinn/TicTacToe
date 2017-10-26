package is.ru.hugb;

import static spark.Spark.*;

public class TicTacToe {

	public static void main(String[] args) {
        staticFileLocation("/public");
        get("/", (req, res) -> "");
        port(getHerokuAssignedPort());
	}

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }

}