package patterns.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite javaDeveloperJobSite = new JavaDeveloperJobSite();
        javaDeveloperJobSite.addVacancy("First java position");
        javaDeveloperJobSite.addVacancy("Second java position");

        Observer firstSub = new Subscriber("Nick");
        Observer secondSub = new Subscriber("Second");

        javaDeveloperJobSite.addObserver(firstSub);
        javaDeveloperJobSite.addObserver(secondSub);

        javaDeveloperJobSite.addVacancy("Third java position");

        javaDeveloperJobSite.removeVacancy("First java position");

    }
}
