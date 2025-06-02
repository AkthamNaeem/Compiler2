package main.java.compiler.ast.expressions;

public class ComparisonOperation {
    private final ComparisonOperator operator;
    private final AstNode rightOperand;

    public ComparisonOperation(ComparisonOperator operator, AstNode rightOperand) {
        this.operator = operator;
        this.rightOperand = rightOperand;
    }

    // Getters
    public ComparisonOperator getOperator() {
        return operator;
    }

    public AstNode getRightOperand() {
        return rightOperand;
    }
}