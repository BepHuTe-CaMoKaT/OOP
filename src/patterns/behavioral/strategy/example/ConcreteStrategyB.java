package patterns.behavioral.strategy.example;

public class ConcreteStrategyB implements Strategy {
    @Override
    public String algorithmInterface() {
        return "Go to bus stop";
    }
}
