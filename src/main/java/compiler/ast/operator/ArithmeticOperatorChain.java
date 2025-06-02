package main.java.compiler.ast.operators;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;
import java.util.ArrayList;
import java.util.List;

public class ArithmeticOperatorChain extends AstNode {
    private AstNode leftOp;
    private List<String> operators = new ArrayList<>();
    private List<AstNode> values = new ArrayList<>();

    // Getters & Setters
    public AstNode getLeftOp() { return leftOp; }
    public void setLeftOp(AstNode leftOp) { this.leftOp = leftOp; }

    public List<String> getOperators() { return operators; }
    public void addOperator(String op) { this.operators.add(op); }

    public List<AstNode> getValues() { return values; }
    public void addValue(AstNode value) { this.values.add(value); }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(leftOp.toString());
        for (int i = 0; i < operators.size(); i++) {
            sb.append(" ").append(operators.get(i)).append(" ").append(values.get(i).toString());
        }
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitArithmeticOperatorChain(this);
    }
}