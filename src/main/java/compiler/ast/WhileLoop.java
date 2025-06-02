package main.java.compiler.ast;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class WhileLoop extends AstNode {
    private AstNode condition; // expression
    private AstNode body;      // block

    // Getters & Setters
    public AstNode getCondition() {
        return condition;
    }

    public void setCondition(AstNode condition) {
        this.condition = condition;
    }

    public AstNode getBody() {
        return body;
    }

    public void setBody(AstNode body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "while (" + condition + ") {\n\t" + body.toString().replace("\n", "\n\t") + "\n}";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitWhileLoop(this);
    }
}