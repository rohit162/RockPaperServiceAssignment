# RockPaperServiceAssignment
Assignment for natWest
Rock, Paper, Scissors Microservice
This is a simple microservice that allows you to play the classic game of Rock, Paper, Scissors against a computer opponent. The microservice exposes a REST endpoint that accepts a POST request with your move as a parameter, and returns the result of the game.

Running the Microservice
To run the microservice, you will need to have Java and Maven installed on your machine. Once you have these dependencies installed, you can clone this repository and build the microservice using the following command:

mvn clean package

This will build the microservice and create a jar file in the target directory. You can then run the microservice using the following command:

java -jar target/rock-paper-scissors-microservice-0.0.1-SNAPSHOT.jar

The microservice will start up on port 8080 by default. You can change the port by setting the SERVER_PORT environment variable.

Playing the Game
To play the game, you will need to send a POST request to the /play endpoint with your move as a request parameter. Your move can be either rock, paper, or scissors. For example, you can use a tool like curl to send a POST request with the player's move of rock:

curl -X POST -d "move=rock" http://localhost:8080/play


The microservice will respond with the result of the game, which will be either "Player wins", "Computer wins", or "It's a tie".

License
This microservice is licensed under the MIT License. See the LICENSE file for more information.
https://chat.openai.com/LICENSE
