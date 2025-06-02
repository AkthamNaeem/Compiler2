package main.java.compiler.ast.literals;

import main.java.compiler.ast.AstVisitor;

public class NumberContent implements LiteralContent {
    private Number value;

    public Number getValue() {
        return value;
    }

    public void setValue(Number value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitNumberContent(this);
    }
}