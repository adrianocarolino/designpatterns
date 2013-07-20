package designpatterns.templatemethod;

public class Chess extends Game {

	@Override
	/* Implementation of necessary concrete methods */
	void initializeGame() {
		// Initialize players
		// Put the pieces on the board
	}

	@Override
	void makePlay(int player) {
		// Process a turn for the player
	}

	@Override
	boolean endOfGame() {
		// Return true if in Checkmate or
		// Stalemate has been reached
		return true;
	}

	@Override
	void printWinner() {
		// Display the winning player
	}

}
