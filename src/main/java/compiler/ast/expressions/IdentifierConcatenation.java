package main.java.compiler.ast.expressions;

import main.java.compiler.ast.AstVisitor;

public class IdentifierConcatenation extends AdditionExpression {
    private String leftId;

    public IdentifierConcatenation(String leftId, AstNode rightExpr) {
        this.leftId = leftId;
        this.rightExpr = rightExpr;
    }

    public String getLeftId() { return leftId; }

    @Override
    public String toString() {
        return leftId + " + " + rightExpr.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitIdentifierConcatenation(this);
    }
}