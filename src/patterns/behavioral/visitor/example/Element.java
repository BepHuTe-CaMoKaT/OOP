package patterns.behavioral.visitor.example;

public interface Element {
    void accept(Visitor visitor);
}
