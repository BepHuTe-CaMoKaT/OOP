package patterns.creational.o4Builder.example;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.createProduct().buildPart1("part1").buildPart2("part2");
    }
}
