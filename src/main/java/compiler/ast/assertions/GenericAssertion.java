package main.java.compiler.ast.assertions;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class GenericAssertion extends AstNode {
    private AstNode type;
    private String identifier;

    public AstNode getType() { return type; }
    public void setType(AstNode type) { this.type = type; }

    public String getIdentifier() { return identifier; }
    public void setIdentifier(String identifier) { this.identifier = identifier; }

    @Override
    public String toString() {
        return "<" + type.toString() + ">" + identifier;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitGenericAssertion(this);
    }
}