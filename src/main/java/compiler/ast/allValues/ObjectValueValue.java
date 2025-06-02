package main.java.compiler.ast.allValues;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class ObjectValueValue extends AstNode {
    private AstNode objectValue;

    public AstNode getObjectValue() { return objectValue; }
    public void setObjectValue(AstNode objectValue) { this.objectValue = objectValue; }

    @Override
    public String toString() { return objectValue.toString(); }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitObjectValueValue(this);
    }
}