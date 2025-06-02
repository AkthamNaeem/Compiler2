package main.java.compiler.ast.values;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class SimpleValue extends AstNode {
    private AstNode valueOptions;

    public AstNode getValueOptions() { return valueOptions; }
    public void setValueOptions(AstNode valueOptions) { this.valueOptions = valueOptions; }

    @Override
    public String toString() { return valueOptions.toString(); }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitSimpleValue(this);
    }
}