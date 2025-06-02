package main.java.compiler.ast.literals;

import main.java.compiler.ast.AstVisitor;

public class ArithmeticOperatorContent implements LiteralContent {
    private AstNode arithmeticExpression;

    public AstNode getArithmeticExpression() {
        return arithmeticExpression;
    }

    public void setArithmeticExpression(AstNode arithmeticExpression) {
        this.arithmeticExpression = arithmeticExpression;
    }

    @Override
    public String toString() {
        return arithmeticExpression.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitArithmeticOperatorContent(this);
    }
}