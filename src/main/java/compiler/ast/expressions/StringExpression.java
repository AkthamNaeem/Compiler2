package main.java.compiler.ast.expressions;

public class StringExpression extends Expression {
    private String value;

    public StringExpression(String value) {
        this.value = value;
    }

    // Getters & Setters
    @Override
    public String toString() {
        return "\"" + value + "\"";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitStringExpression(this);
    }
}