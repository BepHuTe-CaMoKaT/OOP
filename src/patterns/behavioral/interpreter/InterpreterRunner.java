package patterns.behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEEDev = getJavaEEExpression();
        System.out.println("Does developer knows java core: "+ isJava.interpret("Java Core"));
        System.out.println("Does developer knows java EE: "+ isJavaEEDev.interpret("Spring"));
    }
    public static Expression getJavaExpression(){
        Expression java = new TerminalExpression("java");
        Expression javaCore = new TerminalExpression("Java Core");
        return new OrExpression(java,javaCore);
    }
    public static Expression getJavaEEExpression(){
        Expression java = new TerminalExpression("java");
        Expression spring = new TerminalExpression("Spring");
        return new AndExpression(java,spring);
    }
}
