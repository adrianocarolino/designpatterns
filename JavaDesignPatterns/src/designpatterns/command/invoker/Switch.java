package designpatterns.command.invoker;

import java.util.ArrayList;
import java.util.List;

import designpatterns.command.Command;

/* The Invoker class */
public class Switch {
	private List<Command> history = new ArrayList<Command>();

	public Switch() {
	}

	public void storeAndExecute(Command cmd) {
		this.history.add(cmd);
		cmd.execute();
	}
}
