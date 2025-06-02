package main.java.compiler.ast.values;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class BooleanValue extends AstNode {
    private boolean value;

    public BooleanValue(boolean value) {
        this.value = value;
    }

    public boolean getValue() { return value; }
    public void setValue(boolean value) { this.value = value; }

    @Override
    public String toString() {
        return Boolean.toString(value);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitBooleanValue(this);
    }
}