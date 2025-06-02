package main.java.compiler.ast;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;
import java.util.ArrayList;
import java.util.List;

public class IfStatement extends AstNode {
    private AstNode condition;
    private AstNode thenBlock;

    private List<ElseIfBranch> elseIfBranches = new ArrayList<>();

    private AstNode elseBlock;

    public static class ElseIfBranch {
        private AstNode condition;
        private AstNode block;

        public ElseIfBranch(AstNode condition, AstNode block) {
            this.condition = condition;
            this.block = block;
        }

        public AstNode getCondition() { return condition; }
        public AstNode getBlock() { return block; }
    }

    public AstNode getCondition() { return condition; }
    public void setCondition(AstNode condition) { this.condition = condition; }

    public AstNode getThenBlock() { return thenBlock; }
    public void setThenBlock(AstNode thenBlock) { this.thenBlock = thenBlock; }

    public List<ElseIfBranch> getElseIfBranches() { return elseIfBranches; }
    public void addElseIfBranch(AstNode condition, AstNode block) {
        elseIfBranches.add(new ElseIfBranch(condition, block));
    }

    public AstNode getElseBlock() { return elseBlock; }
    public void setElseBlock(AstNode elseBlock) { this.elseBlock = elseBlock; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("if (").append(condition.toString()).append(") ")
                .append(thenBlock.toString());

        for (ElseIfBranch branch : elseIfBranches) {
            sb.append(" else if (").append(branch.getCondition().toString())
                    .append(") ").append(branch.getBlock().toString());
        }

        if (elseBlock != null) {
            sb.append(" else ").append(elseBlock.toString());
        }

        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitIfStatement(this);
    }
}