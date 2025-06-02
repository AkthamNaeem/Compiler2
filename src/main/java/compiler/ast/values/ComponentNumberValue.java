package main.java.compiler.ast.values;

public class ComponentNumberValue extends AstNode {
    private Number value;

    public ComponentNumberValue(Number value) {
        this.value = value;
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
        return visitor.visitComponentNumberValue(this);
    }
}