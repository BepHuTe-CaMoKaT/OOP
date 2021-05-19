package patterns.behavioral.strategy.example;

public class ConcreteStrategyA implements Strategy {
    @Override
    public String algorithmInterface() {
        return "Go to airport";
    }
}
