package patterns.structural.Bridge.example;

public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    public String operation() {
        return this.implementor.implementation();
    }
}
