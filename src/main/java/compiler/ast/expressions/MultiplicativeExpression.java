package main.java.compiler.ast.expressions;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;
import java.util.ArrayList;
import java.util.List;

public class MultiplicativeExpression extends AstNode {
    private AstNode leftExpr;
    private final List<Operation> operations = new ArrayList<>();

    // Inner class for (operator + rightExpr) pairs
    public static class Operation {
        private final String operator; // "*", "/", or "%"
        private final AstNode rightExpr;

        public Operation(String operator, AstNode rightExpr) {
            this.operator = operator;
            this.rightExpr = rightExpr;
        }

        // Getters
        public String getOperator() { return operator; }
        public AstNode getRightExpr() { return rightExpr; }
    }

    // Getters & Setters
    public AstNode getLeftExpr() { return leftExpr; }
    public void setLeftExpr(AstNode leftExpr) { this.leftExpr = leftExpr; }

    public List<Operation> getOperations() { return operations; }
    public void addOperation(String operator, AstNode rightExpr) {
        this.operations.add(new Operation(operator, rightExpr));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(leftExpr.toString());

        for (Operation op : operations) {
            sb.append(" ").append(op.operator).append(" ").append(op.rightExpr.toString());
        }

        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitMultiplicativeExpression(this);
    }
}