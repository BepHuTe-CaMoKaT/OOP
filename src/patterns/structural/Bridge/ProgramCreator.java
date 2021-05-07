package patterns.structural.Bridge;

public class ProgramCreator {


    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new CppDev()),
                new StockExchange(new JavaDev())
        };

        for (Program program: programs){
            program.developProgram();
        }
    }
}
