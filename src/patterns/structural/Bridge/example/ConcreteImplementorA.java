package patterns.structural.Bridge.example;

public class ConcreteImplementorA implements Implementor {

    public String implementation() {
        return this.getClass().getName();
    }
}
