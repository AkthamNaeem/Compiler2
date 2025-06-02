package main.java.compiler.ast.operator;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class ParenthesizedOperator extends AstNode {
    private AstNode operator;

    // Getters & Setters
    public AstNode getOperator() {
        return operator;
    }

    public void setOperator(AstNode operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "(" + operator.toString() + ")";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitParenthesizedOperator(this);
    }
}