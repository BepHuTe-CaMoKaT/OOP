package patterns.behavioral.visitor.example;

public class ConcreteVisitor2 implements Visitor {

    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        concreteElementA.operationA();
    }

    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        concreteElementB.operationB();
    }
}
