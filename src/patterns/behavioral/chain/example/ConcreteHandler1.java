package patterns.behavioral.chain.example;

public class ConcreteHandler1 extends Handler {
    private boolean handleRequestInvoke = false;
    @Override
    void handleRequest() {
        handleRequestInvoke=true;
        if (handleRequestInvoke) succesor.handleRequest();
    }

    protected boolean isHandleRequestInvoke() {
        return handleRequestInvoke;
    }
}
