package patterns.creational.o1FactoryMethod;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDevBySpeciality("c-+");
        Developer developer = developerFactory.createDev();
        developer.writeCode();
    }

    static DeveloperFactory createDevBySpeciality(String spec){
        if (spec.equalsIgnoreCase("java")) return new JavaDeveloperFactory();
        else if (spec.equalsIgnoreCase("c++")) return new CppDeveloperFactory();
        else {
            throw new RuntimeException(spec + " is unknown");
        }
    }
}
