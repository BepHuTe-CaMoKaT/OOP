package patterns.behavioral.state.example;

public class ConcreteState2 implements State{
    private boolean handleInvoked = false;
    @Override
    public void handle() {
        this.handleInvoked=true;
    }

    public boolean isHandleInvoked() {
        return handleInvoked;
    }
}
