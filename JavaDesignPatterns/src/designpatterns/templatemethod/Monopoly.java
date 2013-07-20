package designpatterns.templatemethod;

public class Monopoly extends Game {

	/* Implementation of necessary concrete methods */
	void initializeGame() {
		// Initialize players
		// Initialize money
	}

	void makePlay(int player) {
		// Process one turn of player
	}

	boolean endOfGame() {
		// Return true if game is over
		// according to Monopoly rules
		return true;
	}

	void printWinner() {
		// Display who won
	}

}
