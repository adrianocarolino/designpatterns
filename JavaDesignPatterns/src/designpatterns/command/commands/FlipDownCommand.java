package designpatterns.command.commands;

import designpatterns.command.Command;
import designpatterns.command.receiver.Light;

public class FlipDownCommand implements Command {

	private Light theLight;

	public FlipDownCommand(Light light) {
		this.theLight = light;
	}

	@Override
	public void execute() {
		theLight.turnOff();
	}

}
