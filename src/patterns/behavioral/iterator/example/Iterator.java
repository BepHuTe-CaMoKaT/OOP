package patterns.behavioral.iterator.example;

public interface Iterator {

    Object first();

    Object next();

    boolean isDone();

    Object currentItem();
}
