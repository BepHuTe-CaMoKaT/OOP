package patterns.behavioral.mediator.example;

public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void notifyColleague(String message) {
        this.mediator.notifyColleague(this, message);
    }

    public void receive(String message) {
        this.setReceivedMessage(message);
    }
}
