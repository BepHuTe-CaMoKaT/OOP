package patterns.behavioral.visitor.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ObjectStructure {
    private List<Element> children = new ArrayList<>();

    public void add(Element element){
        children.add(element);
    }

    public void remove(Element element){
        children.remove(element);
    }

    public Element getChild(int index) {
        return children.get(index);
    }

    public void acceptAll(Visitor visitor) {
        for (Element element : children) {
            element.accept(visitor);
        }
    }
}
