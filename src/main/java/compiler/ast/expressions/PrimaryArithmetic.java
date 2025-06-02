package main.java.compiler.ast.expressions;

import main.java.compiler.ast.AstVisitor;
import main.java.compiler.ast.arithmetic.ArithmeticOperation;

public class PrimaryArithmetic extends PrimaryExpression {
    private final ArithmeticOperation operation;

    public PrimaryArithmetic(ArithmeticOperation op) {
        this.operation = op;
    }

    public ArithmeticOperation getOperation() {
        return operation;
    }

    @Override
    public String toString() {
        return operation.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitPrimaryArithmetic(this);
    }
}