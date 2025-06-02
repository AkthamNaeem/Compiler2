package main.java.compiler.ast.expressions;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;
import java.util.ArrayList;
import java.util.List;

public class ComparisonExpression extends AstNode {
    private AstNode leftExpression;
    private List<ComparisonOperation> operations = new ArrayList<>();

    // Getters & Setters
    public AstNode getLeftExpression() {
        return leftExpression;
    }

    public void setLeftExpression(AstNode leftExpression) {
        this.leftExpression = leftExpression;
    }

    public List<ComparisonOperation> getOperations() {
        return operations;
    }

    public void addOperation(ComparisonOperation operation) {
        this.operations.add(operation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(leftExpression.toString());

        for (ComparisonOperation op : operations) {
            sb.append(" ")
                    .append(op.getOperator())
                    .append(" ")
                    .append(op.getRightExpression().toString());
        }

        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitComparisonExpression(this);
    }

    // Inner class for chained operations
    public static class ComparisonOperation {
        private String operator;
        private AstNode rightExpression;

        public ComparisonOperation(String operator, AstNode rightExpression) {
            this.operator = operator;
            this.rightExpression = rightExpression;
        }

        // Getters
        public String getOperator() {
            return operator;
        }

        public AstNode getRightExpression() {
            return rightExpression;
        }
    }
}