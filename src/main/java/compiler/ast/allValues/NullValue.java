package main.java.compiler.ast.allValues;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class NullValue extends AstNode {
    @Override
    public String toString() { return "null"; }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitNullValue(this);
    }
}