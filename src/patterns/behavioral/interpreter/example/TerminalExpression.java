package patterns.behavioral.interpreter.example;

public class TerminalExpression extends AbstractExpression{

    private boolean data;

    public TerminalExpression(boolean data) {
        this.data = data;
    }

    @Override
    void interpret(Context context) {
        context.addOperand(this.data);
    }
}
