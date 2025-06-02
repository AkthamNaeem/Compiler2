package main.java.compiler.ast.block;

import main.java.compiler.ast.AstVisitor;
import java.util.ArrayList;
import java.util.List;

public class BlockWithBraces extends Block {
    private final List<AstNode> statements = new ArrayList<>();

    public List<AstNode> getStatements() { return statements; }
    public void addStatement(AstNode statement) { statements.add(statement); }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{\n");
        statements.forEach(stmt -> sb.append("  ").append(stmt).append("\n"));
        return sb.append("}").toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitBlockWithBraces(this);
    }
}