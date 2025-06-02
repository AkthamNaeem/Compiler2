package main.java.compiler.ast;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class DoWhileLoop extends AstNode {
    private AstNode body;      // block
    private AstNode condition; // expression

    // Getters & Setters
    public AstNode getBody() {
        return body;
    }

    public void setBody(AstNode body) {
        this.body = body;
    }

    public AstNode getCondition() {
        return condition;
    }

    public void setCondition(AstNode condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "do {\n\t" +
                body.toString().replace("\n", "\n\t") +
                "\n} while (" + condition + ");";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitDoWhileLoop(this);
    }
}