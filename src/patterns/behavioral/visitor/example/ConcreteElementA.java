package patterns.behavioral.visitor.example;

public class ConcreteElementA implements Element{
    private int counter = 0;

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }

    public void operationA() {
        counter++;
    }

    protected int getCounter() {
        return counter;
    }
}
