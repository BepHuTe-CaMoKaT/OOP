package patterns.creational.o5Prototype.example;

public class ConcretePrototype extends Prototype {

    public Prototype copyMe() throws CloneNotSupportedException {
        return (Prototype) this.clone();
    }
}
