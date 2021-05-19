package patterns.behavioral.iterator.example;

public class ConcreteAggregate implements Aggregate {

    private final String[] records = { "first", "second", "third", "fourth" };

    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    protected String[] getRecords() {
        return records;
    }
}
