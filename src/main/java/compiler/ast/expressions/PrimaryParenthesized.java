package main.java.compiler.ast.expressions;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class PrimaryParenthesized extends PrimaryExpression {
    private final AstNode expression;

    public PrimaryParenthesized(AstNode expr) {
        this.expression = expr;
    }

    public AstNode getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "(" + expression.toString() + ")";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitPrimaryParenthesized(this);
    }
}