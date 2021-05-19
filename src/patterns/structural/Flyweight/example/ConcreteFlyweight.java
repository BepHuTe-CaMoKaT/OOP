package patterns.structural.Flyweight.example;

public class ConcreteFlyweight implements Flyweight {

    private Object intrinsicState;

    public ConcreteFlyweight(Object intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    // Using extrinsicState as context and does NOT modify intrinsic state.
    public void operation(Object extrinsicState) {
    }

    public Object getIntrinsicState() {
        return intrinsicState;
    }
}
