package patterns.structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Developer{
    private List<Developer> developers = new ArrayList<Developer>();

    public void addDev(Developer dev){
        developers.add(dev);
    }
    public void removeDev(Developer dev){
        developers.remove(dev);
    }
    @Override
    public void writeCode() {
        System.out.println("Team creates project..\n");
        for (Developer dev:developers){
            dev.writeCode();
        }
    }
}
