package com.example.natwestproject;
import java.util.Random;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/rps")
public class RockPaperScissorsService {

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public Response playGame(String player1Move) {
        String player2Move = generateRandomMove();

        String result;
        if (player1Move.equals(player2Move)) {
            result = "It's a tie!";
        } else if (player1Move.equals("rock") && player2Move.equals("scissors") || player1Move.equals("scissors") && player2Move.equals("paper") || player1Move.equals("paper") && player2Move.equals("rock")) {
            result = "Player wins!";
        } else {
            result = "Computer wins!";
        }

        return Response.ok(result).build();
    }

    private String generateRandomMove() {
        Random rnd = new Random();
        int move = rnd.nextInt(3);
        if (move == 0) {
            return "rock";
        } else if (move == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }
}
