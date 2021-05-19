package patterns.behavioral.interpreter.example;

import java.util.List;

public class OrExpression extends AbstractExpression {

    private AbstractExpression firstAbstractExpression;
    private AbstractExpression secondAbstractExpression;

    public OrExpression(AbstractExpression firstAbstractExpression,
                        AbstractExpression secondAbstractExpression) {
        this.firstAbstractExpression = firstAbstractExpression;
        this.secondAbstractExpression = secondAbstractExpression;
    }

    public void interpret(Context context) {

        firstAbstractExpression.interpret(context);
        secondAbstractExpression.interpret(context);

        List<Boolean> operands = context.getOperands();

        boolean firstOperand = operands.get(0);
        boolean secondOperand = operands.get(1);

        boolean result = firstOperand || secondOperand;
        context.setResult(result);
    }
}
