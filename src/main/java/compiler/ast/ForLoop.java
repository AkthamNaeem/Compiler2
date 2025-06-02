package main.java.compiler.ast;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class ForLoop extends AstNode {
    // Initialization (either variable declaration or assignment)
    private AstNode initialization;

    // Loop condition (optional)
    private AstNode condition;

    // Update expression (optional)
    private AstNode update;

    // Loop body
    private AstNode body;

    // Getters and Setters
    public AstNode getInitialization() { return initialization; }
    public void setInitialization(AstNode initialization) {
        this.initialization = initialization;
    }

    public AstNode getCondition() { return condition; }
    public void setCondition(AstNode condition) {
        this.condition = condition;
    }

    public AstNode getUpdate() { return update; }
    public void setUpdate(AstNode update) {
        this.update = update;
    }

    public AstNode getBody() { return body; }
    public void setBody(AstNode body) {
        this.body = body;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("for (");

        // Initialization
        if (initialization != null) {
            sb.append(initialization.toString());
        }
        sb.append("; ");

        // Condition
        if (condition != null) {
            sb.append(condition.toString());
        }
        sb.append("; ");

        // Update
        if (update != null) {
            sb.append(update.toString());
        }

        sb.append(") ").append(body.toString());
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitForLoop(this);
    }
}