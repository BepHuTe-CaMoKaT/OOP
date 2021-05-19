package patterns.behavioral.interpreter.example;

import java.util.ArrayList;
import java.util.List;

public class Context {
    private List<Boolean> operands = new ArrayList<>();
    private boolean res;

    public List<Boolean> getOperands() {
        return operands;
    }

    public void addOperand(Boolean operand) {
        operands.add(operand);
    }

    public boolean isResult() {
        return res;
    }

    public void setResult(Boolean result) {
        this.res = result;
    }
}
