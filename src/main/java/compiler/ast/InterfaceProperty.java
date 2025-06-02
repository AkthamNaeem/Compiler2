package main.java.compiler.ast;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class InterfaceProperty extends AstNode {
    private String name;
    private AstNode value;

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AstNode getValue() {
        return value;
    }

    public void setValue(AstNode value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return name + ": " + (value != null ? value.toString() : "");
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitInterfaceProperty(this);
    }
}