package patterns.structural.Flyweight.example;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static Map<String, Flyweight> flyweights = new HashMap<>();

    public static Flyweight getFlyweight(String key, String value) {

        if (key.startsWith("unshared")) {
            flyweights.put(key, new UnsharedConcreteFlyweight(value));
        } else {
            if (!flyweights.containsKey(key)) {
                flyweights.put(key, new ConcreteFlyweight(value));
            }
        }

        return flyweights.get(key);
    }
}
