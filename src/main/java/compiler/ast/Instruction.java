package main.java.compiler.ast;

import main.java.compiler.ast.AstVisitor;
import java.util.ArrayList;
import java.util.List;

public class Instruction extends AstNode {
    private List<AstNode> statements = new ArrayList<>();

    // Get all statements
    public List<AstNode> getStatements() {
        return statements;
    }

    // Add a statement
    public void addStatement(AstNode statement) {
        statements.add(statement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (AstNode stmt : statements) {
            sb.append(stmt.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitInstruction(this);
    }
}