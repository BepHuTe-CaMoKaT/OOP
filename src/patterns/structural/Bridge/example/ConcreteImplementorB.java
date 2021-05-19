package patterns.structural.Bridge.example;

public class ConcreteImplementorB implements Implementor {

    public String implementation() {
        return this.getClass().getName();
    }
}
