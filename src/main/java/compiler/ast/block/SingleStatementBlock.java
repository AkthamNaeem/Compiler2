package main.java.compiler.ast.block;

import main.java.compiler.ast.AstVisitor;

public class SingleStatementBlock extends Block {
    private AstNode statement;

    public AstNode getStatement() { return statement; }
    public void setStatement(AstNode statement) { this.statement = statement; }

    @Override
    public String toString() {
        return statement.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitSingleStatementBlock(this);
    }
}