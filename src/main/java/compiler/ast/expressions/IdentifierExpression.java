package main.java.compiler.ast.expressions;

public class IdentifierExpression extends Expression {
    private String name;

    public IdentifierExpression(String name) {
        this.name = name;
    }

    // Getters & Setters
    @Override
    public String toString() {
        return name;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitIdentifierExpression(this);
    }
}