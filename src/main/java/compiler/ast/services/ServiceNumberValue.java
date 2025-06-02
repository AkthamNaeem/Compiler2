package main.java.compiler.ast.services;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class ServiceNumberValue extends AstNode {
    private Number value;

    public ServiceNumberValue(Number value) {
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
        return visitor.visitServiceNumberValue(this);
    }
}