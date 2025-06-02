package main.java.compiler.ast.services;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class ServiceIdentifierValue extends AstNode {
    private String identifier;

    public ServiceIdentifierValue(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() { return identifier; }
    public void setIdentifier(String identifier) { this.identifier = identifier; }

    @Override
    public String toString() {
        return identifier;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitServiceIdentifierValue(this);
    }
}