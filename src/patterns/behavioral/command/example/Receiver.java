package patterns.behavioral.command.example;

public class Receiver {
    private boolean operationPerformed = false;

    public void action(){
        operationPerformed=true;
    }

    public boolean isOperationPerformed() {
        return operationPerformed;
    }
}
