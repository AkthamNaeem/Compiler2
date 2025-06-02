package main.java.compiler.ast.expressions;

import main.java.compiler.ast.AstVisitor;

public class PrimaryNumber extends PrimaryExpression {
    private final Number value;

    public PrimaryNumber(String numberText) {
        this.value = parseNumber(numberText);
    }

    private Number parseNumber(String text) {
        return text.contains(".") ? Double.parseDouble(text) : Integer.parseInt(text);
    }

    public Number getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitPrimaryNumber(this);
    }
}