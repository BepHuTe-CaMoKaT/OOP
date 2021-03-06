package patterns.behavioral.command.example;

public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }
    public void execute(){
        command.execute();
    }
}
