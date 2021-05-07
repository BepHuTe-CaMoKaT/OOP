package patterns.creational.o1FactoryMethod;

public class JavaDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDev() {
        return new JavaDeveloper();
    }
}
