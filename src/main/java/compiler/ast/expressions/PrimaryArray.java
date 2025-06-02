package main.java.compiler.ast.expressions;

import main.java.compiler.ast.AstVisitor;
import java.util.List;

public class PrimaryArray extends PrimaryExpression {
    private final List<AstNode> elements;

    public PrimaryArray(List<AstNode> elements) {
        this.elements = elements;
    }

    public List<AstNode> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return elements.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitPrimaryArray(this);
    }
}