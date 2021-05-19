package patterns.structural.Decorator.example;

public class ConcreteDecoratorA extends Decorator {

    private boolean state;

    public void operation() {
        state = true;
        this.component.operation();
    }

    public boolean isState() {
        return state;
    }
}
