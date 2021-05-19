package patterns.creational.o1FactoryMethod.example;

public class ConcreteCreator extends Creator {

    public Product factoryMethod(String type) {

        if (type.equals("A")) {
            return new ConcreteProductA();
        } else if (type.equals("B")) {
            return new ConcreteProductB();
        }

        return null;
    }
}
