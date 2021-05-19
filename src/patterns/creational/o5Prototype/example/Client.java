package patterns.creational.o5Prototype.example;

public class Client {

    private Prototype prototype;

    public Client(Prototype prototype) {

        this.prototype = prototype;
    }

    public Prototype operation() throws CloneNotSupportedException {
        return prototype.copyMe();
    }
}
