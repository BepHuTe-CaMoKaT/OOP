package patterns.structural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();
        developers.add(developerFactory.getDevelopersBySpeciality("java"));
        developers.add(developerFactory.getDevelopersBySpeciality("java"));
        developers.add(developerFactory.getDevelopersBySpeciality("java"));
        developers.add(developerFactory.getDevelopersBySpeciality("java"));
        developers.add(developerFactory.getDevelopersBySpeciality("java"));
        developers.add(developerFactory.getDevelopersBySpeciality("C++"));
        developers.add(developerFactory.getDevelopersBySpeciality("C++"));
        developers.add(developerFactory.getDevelopersBySpeciality("C++"));
        developers.add(developerFactory.getDevelopersBySpeciality("C++"));

        for (Developer developer: developers){
            developer.writeCode();
        }
    }
}
