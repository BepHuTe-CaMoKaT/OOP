package patterns.behavioral.template.example;

public abstract class AbstractClass {
    public String templateMethod(){
        return this.primitiveOperation1()+this.primitiveOperation2();
    }
    abstract String primitiveOperation1();

    abstract String primitiveOperation2();
}
