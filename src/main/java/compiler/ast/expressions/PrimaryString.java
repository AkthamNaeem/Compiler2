package main.java.compiler.ast.expressions;

import main.java.compiler.ast.AstVisitor;

public class PrimaryString extends PrimaryExpression {
    private final String value;

    public PrimaryString(String str) {
        this.value = str.substring(1, str.length() - 1); // Remove quotes
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "\"" + value + "\"";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitPrimaryString(this);
    }
}