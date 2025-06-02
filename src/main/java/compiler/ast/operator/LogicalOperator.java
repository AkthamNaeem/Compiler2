package main.java.compiler.ast.operators;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class LogicalOperator extends AstNode {
    private AstNode leftOp;
    private String operator;
    private AstNode rightOp;

    // Getters & Setters
    public AstNode getLeftOp() { return leftOp; }
    public void setLeftOp(AstNode leftOp) { this.leftOp = leftOp; }

    public String getOperator() { return operator; }
    public void setOperator(String operator) { this.operator = operator; }

    public AstNode getRightOp() { return rightOp; }
    public void setRightOp(AstNode rightOp) { this.rightOp = rightOp; }

    @Override
    public String toString() {
        return leftOp.toString() + " " + operator + " " + rightOp.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitLogicalOperator(this);
    }
}