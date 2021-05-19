package patterns.creational.o4Builder.example;

abstract class Builder {

    public abstract Builder createProduct();

    public abstract Builder buildPart1(String part);

    public abstract Builder buildPart2(String part);
}
