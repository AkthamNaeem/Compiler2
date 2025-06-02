package main.java.compiler.ast.values;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class ObjectFunctionValue extends AstNode {
    private AstNode objectFunction;

    public AstNode getObjectFunction() { return objectFunction; }
    public void setObjectFunction(AstNode objectFunction) { this.objectFunction = objectFunction; }

    @Override
    public String toString() { return objectFunction.toString(); }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitObjectFunctionValue(this);
    }
}