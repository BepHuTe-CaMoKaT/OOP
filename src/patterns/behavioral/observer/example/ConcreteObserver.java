package patterns.behavioral.observer.example;

public class ConcreteObserver implements Observer{
    private int observerState;
    private ConcreteSubject concreteSubject;

    public ConcreteObserver(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
    }

    @Override
    public void update() {
        observerState=concreteSubject.getState();
    }
    protected int getObserverState(){
        return observerState;
    }
}
