package main.java.compiler.ast.assertions;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class AsAssertion extends AstNode {
    private String identifier;
    private AstNode type;

    public String getIdentifier() { return identifier; }
    public void setIdentifier(String identifier) { this.identifier = identifier; }

    public AstNode getType() { return type; }
    public void setType(AstNode type) { this.type = type; }

    @Override
    public String toString() {
        return identifier + " as " + type.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitAsAssertion(this);
    }
}