package designpatterns.templatemethod.tests;

import org.junit.Test;

import designpatterns.templatemethod.Chess;
import designpatterns.templatemethod.Monopoly;

public class TemplateMethodTest {

	@Test
	public void testGame() {
		Chess chess = new Chess();
		chess.playOneGame(2);
		//Monopoly monoploy = new Monopoly();
		//monoploy.playOneGame(4);
	}

}
