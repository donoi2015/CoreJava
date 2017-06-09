package headfirstdp.headfirst.command.undo;

interface Command {
    void execute();

    void undo();
}
