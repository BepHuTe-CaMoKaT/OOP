package patterns.creational.o5Prototype.example;

public abstract class Prototype implements Cloneable {

    abstract Prototype copyMe() throws CloneNotSupportedException;

}
