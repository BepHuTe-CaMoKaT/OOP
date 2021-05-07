package patterns.structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDevelopersBySpeciality(String speciality){
        Developer developer = developers.get(speciality);
        if(developer == null){
            switch (speciality){
                case "java":
                    System.out.println("Hiring java developer..");
                    developer = new JavaDeveloper();
                    break;
                case "C++":
                    System.out.println("Hiring C++ developer..");
                    developer = new CppDeveloper();

            }
            developers.put(speciality,developer);
        }
        return developer;
    }
}
