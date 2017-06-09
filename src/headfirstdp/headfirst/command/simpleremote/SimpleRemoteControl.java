package headfirstdp.headfirst.command.simpleremote;


//
// This is the invoker
//
class SimpleRemoteControl {
    private Command slot;

    public void setCommand(Command command) {
	slot = command;
    }

    public void buttonWasPressed() {
	slot.execute();
    }
}
