package main.java.compiler.ast.expressions;

public class ParenthesizedExpression extends Expression {
    private Expression expression;

    public ParenthesizedExpression(Expression expression) {
        this.expression = expression;
    }

    // Getters & Setters
    @Override
    public String toString() {
        return "(" + expression.toString() + ")";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitParenthesizedExpression(this);
    }
}