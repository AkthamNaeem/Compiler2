package main.java.compiler.ast.values;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class StringValue extends AstNode {
    private String value;

    public StringValue(String value) {
        this.value = value;
    }

    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }

    @Override
    public String toString() {
        return "\"" + value + "\"";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitStringValue(this);
    }
}