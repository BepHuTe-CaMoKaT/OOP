package patterns.behavioral.memento.example;

public class Originator {

    private int state;

    public void setMemento(Memento memento) {
        this.state = memento.getState();
    }

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

}
