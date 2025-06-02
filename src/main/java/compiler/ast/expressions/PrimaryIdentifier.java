package main.java.compiler.ast.expressions;

import main.java.compiler.ast.AstVisitor;

public class PrimaryIdentifier extends PrimaryExpression {
    private final String identifier;

    public PrimaryIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        return identifier;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitPrimaryIdentifier(this);
    }
}