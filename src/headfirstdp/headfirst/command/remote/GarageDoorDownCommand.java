package headfirstdp.headfirst.command.remote;

public class GarageDoorDownCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
	this.garageDoor = garageDoor;
    }

    public void execute() {
	garageDoor.up();
    }
}
