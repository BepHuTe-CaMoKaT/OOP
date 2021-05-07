package patterns.structural.Composite;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer firstJavaDev = new JavaDev();
        Developer secondJavaDev = new JavaDev();
        Developer cppDev = new JavaDev();

        team.addDev(firstJavaDev);
        team.addDev(secondJavaDev);
        team.addDev(cppDev);

        team.writeCode();

    }
}
