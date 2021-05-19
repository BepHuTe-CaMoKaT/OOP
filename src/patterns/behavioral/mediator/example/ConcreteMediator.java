package patterns.behavioral.mediator.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcreteMediator {
    private List<Colleague> colleagues;

    public ConcreteMediator() {
        colleagues = new ArrayList<>();
    }

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    public void notifyColleague(Colleague colleague, String message) {

        for (Colleague receiverColleague : colleagues) {
            if (colleague != receiverColleague) {
                receiverColleague.receive(message);
            }
        }
    }
}
