package is.ru.hugb;

import org.json.*;
import static spark.Spark.*;

public class TicTacToe {
	private GameService service;

	TicTacToe(){
		service = new GameService();
        get("/makeMove/:move", (req, res) -> makeMove(req.params(":move")));
	}
	
	private JSONObject makeMove(String move) {
		JSONObject obj = new JSONObject();
		obj.put("board", service.getBoard());
		
		service.makeMove(Integer.parseInt(move));
		Status gameStatus = service.getStatus();
		if(gameStatus == Status.WIN) {
			obj.put("status", "win");
			service = new GameService();
		}else if(gameStatus == Status.DRAW) {
			obj.put("status", "draw");
			service = new GameService();
		}else {
			obj.put("status", "inplay");
		}
		
		return obj;
	}

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }

	public static void main(String[] args) {
        staticFileLocation("/public");
        port(getHerokuAssignedPort());
        TicTacToe game = new TicTacToe();
	}
    
}