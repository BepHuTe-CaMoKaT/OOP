package patterns.behavioral.template.example;

public class ConcreteClass extends AbstractClass{
    @Override
    String primitiveOperation1() {
        return "Template";
    }

    @Override
    String primitiveOperation2() {
        return "Concrete";
    }
}
