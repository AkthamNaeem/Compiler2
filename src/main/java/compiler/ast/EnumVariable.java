package main.java.compiler.ast;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class EnumVariable extends AstNode {
    private AstNode name;
    private String value;

    // Getters & Setters
    public AstNode getName() {
        return name;
    }

    public void setName(AstNode name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return name.toString() + (value != null ? " = " + value : "");
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitEnumVariable(this);
    }
}