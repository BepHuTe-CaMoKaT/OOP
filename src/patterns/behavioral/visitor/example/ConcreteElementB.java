package patterns.behavioral.visitor.example;

public class ConcreteElementB implements Element{
    private int counter = 0;

    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    public void operationB() {
        counter++;
    }

    protected int getCounter() {
        return counter;
    }
}
