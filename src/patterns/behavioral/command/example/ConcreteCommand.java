package patterns.behavioral.command.example;

public class ConcreteCommand {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    public void execute(){
        this.receiver.action();
    }
}
