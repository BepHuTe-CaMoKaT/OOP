package patterns.behavioral.mediator.example;

abstract class Colleague {

    protected Mediator mediator;

    private String receivedMessage;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    abstract void notifyColleague(String message);

    abstract void receive(String message);

    protected String getReceivedMessage() {
        return this.receivedMessage;
    }

    protected void setReceivedMessage(String receivedMessage) {
        this.receivedMessage = receivedMessage;
    }
}
