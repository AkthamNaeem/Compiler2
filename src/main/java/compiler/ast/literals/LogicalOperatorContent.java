package main.java.compiler.ast.literals;

import main.java.compiler.ast.AstVisitor;

public class LogicalOperatorContent implements LiteralContent {
    private AstNode logicalExpression;

    public AstNode getLogicalExpression() {
        return logicalExpression;
    }

    public void setLogicalExpression(AstNode logicalExpression) {
        this.logicalExpression = logicalExpression;
    }

    @Override
    public String toString() {
        return logicalExpression.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitLogicalOperatorContent(this);
    }
}