package patterns.structural.Facade.example;

public class Generator {

    public static int generate(Node expression) throws Exception {


        if (expression instanceof ExpressionNode) {
            ExpressionNode expressionNode = (ExpressionNode) expression;

            OperandNode rightOperandNode = (OperandNode) expressionNode.getRight();
            OperandNode leftOperandNode = (OperandNode) expressionNode.getLeft();

            return rightOperandNode.getValue() + leftOperandNode.getValue();

        } else {
            throw new Exception("Error in generator");
        }
    }
}
