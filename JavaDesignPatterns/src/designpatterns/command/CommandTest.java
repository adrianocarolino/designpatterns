package designpatterns.command;

import org.junit.Before;
import org.junit.Test;

public class CommandTest {

	private Light lamp;

	private Switch mySwitch;

	@Before
	public void testLamp() {
		lamp = new Light();
		mySwitch = new Switch();
	}

	@Test
	public void testTurnLightOn() {
		Command switchUp = new FlipUpCommand(lamp);
		mySwitch.storeAndExecute(switchUp);
	}

	@Test
	public void testTurnLightOff() {
		Command switchDown = new FlipDownCommand(lamp);
		mySwitch.storeAndExecute(switchDown);
	}

}
