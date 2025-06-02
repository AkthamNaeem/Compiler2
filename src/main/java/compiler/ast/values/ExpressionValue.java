package main.java.compiler.ast.values;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class ExpressionValue extends AstNode {
    private AstNode expression;

    public AstNode getExpression() { return expression; }
    public void setExpression(AstNode expression) { this.expression = expression; }

    @Override
    public String toString() { return expression.toString(); }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitExpressionValue(this);
    }
}