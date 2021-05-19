package patterns.behavioral.interpreter.example;

import java.util.List;

public class AndExpression extends AbstractExpression {
    private AbstractExpression first;
    private AbstractExpression second;

    public AndExpression(AbstractExpression first, AbstractExpression second) {
        this.first = first;
        this.second = second;
    }

    @Override
    void interpret(Context context) {
        first.interpret(context);
        second.interpret(context);

        List<Boolean> operands = context.getOperands();

        boolean first = operands.get(0);
        boolean second = operands.get(1);
        boolean res = first&&second;
        context.setResult(res);

    }
}
