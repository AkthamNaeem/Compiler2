package main.java.compiler.ast.services;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class ServiceStringValue extends AstNode {
    private String value;

    public ServiceStringValue(String value) {
        // Remove surrounding quotes if present
        this.value = value.startsWith("\"") && value.endsWith("\"")
                ? value.substring(1, value.length() - 1)
                : value;
    }

    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }

    @Override
    public String toString() {
        return "\"" + value + "\"";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitServiceStringValue(this);
    }
}