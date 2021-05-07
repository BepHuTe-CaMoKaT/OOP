package patterns.creational.o1FactoryMethod;

public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDev() {
        return new CppDeveloper();
    }
}
