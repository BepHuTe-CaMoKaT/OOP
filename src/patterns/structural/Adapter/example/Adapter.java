package patterns.structural.Adapter.example;

public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public String request() {
        return adaptee.specialRequest();
    }
}
