package main.java.compiler.ast.allOptions;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class SimpleTypeOption extends AstNode {
    private AstNode typeOptions;  // The basic type

    public AstNode getTypeOptions() { return typeOptions; }
    public void setTypeOptions(AstNode typeOptions) { this.typeOptions = typeOptions; }

    @Override
    public String toString() {
        return typeOptions.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitSimpleTypeOption(this);
    }
}