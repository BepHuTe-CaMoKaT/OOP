package patterns.behavioral.chain.example;

public class ConcreteHandler2 extends Handler {

    private boolean handleRequestInvoked = false;

    void handleRequest() {
        handleRequestInvoked = true;
    }

    protected boolean isHandleRequestInvoked() {
        return handleRequestInvoked;
    }
}
