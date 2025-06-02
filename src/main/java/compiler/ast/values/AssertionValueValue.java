package main.java.compiler.ast.values;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class AssertionValueValue extends AstNode {
    private AstNode assertionValue;

    public AstNode getAssertionValue() { return assertionValue; }
    public void setAssertionValue(AstNode assertionValue) { this.assertionValue = assertionValue; }

    @Override
    public String toString() { return assertionValue.toString(); }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitAssertionValueValue(this);
    }
}