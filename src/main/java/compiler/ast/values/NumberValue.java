package main.java.compiler.ast.values;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class NumberValue extends AstNode {
    private Number value;

    public NumberValue(Number value) {
        this.value = value;
    }

    public Number getValue() { return value; }
    public void setValue(Number value) { this.value = value; }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitNumberValue(this);
    }
}