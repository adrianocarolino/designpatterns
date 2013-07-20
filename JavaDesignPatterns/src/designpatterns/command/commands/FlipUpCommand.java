package designpatterns.command.commands;

import designpatterns.command.Command;
import designpatterns.command.receiver.Light;

public class FlipUpCommand implements Command {

	 private Light theLight;
	 
	   public FlipUpCommand(Light light) {
	      this.theLight = light;
	   }
	 
	   @Override
	   public void execute(){
	      theLight.turnOn();
	   }
}
