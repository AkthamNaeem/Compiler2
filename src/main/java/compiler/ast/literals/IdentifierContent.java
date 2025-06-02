package main.java.compiler.ast.literals;

import main.java.compiler.ast.AstVisitor;

public class IdentifierContent implements LiteralContent {
    private String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return identifier;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitIdentifierContent(this);
    }
}