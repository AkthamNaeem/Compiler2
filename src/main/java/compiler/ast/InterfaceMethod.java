package main.java.compiler.ast;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class InterfaceMethod extends AstNode {
    private AstNode method;

    // Getters & Setters
    public AstNode getMethod() {
        return method;
    }

    public void setMethod(AstNode method) {
        this.method = method;
    }

    @Override
    public String toString() {
        return (method != null ? method.toString() : "") + ";";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitInterfaceMethod(this);
    }
}