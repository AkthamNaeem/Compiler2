package main.java.compiler.ast.values;

public class ComponentBooleanValue extends AstNode {
    private boolean value;

    public ComponentBooleanValue(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    @Override
    public String toString() {
        return Boolean.toString(value);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitComponentBooleanValue(this);
    }
}