package main.java.compiler.ast.allValues;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class ArrowFunctionValue extends AstNode {
    private AstNode arrowFunction;

    public AstNode getArrowFunction() { return arrowFunction; }
    public void setArrowFunction(AstNode arrowFunction) { this.arrowFunction = arrowFunction; }

    @Override
    public String toString() { return arrowFunction.toString(); }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitArrowFunctionValue(this);
    }
}