package main.java.compiler.ast.block;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class SingleStatementBlock extends Block {
    @Override
    public <T> T accept (AstVisitor<T> visitor) {
        return null;
    }
}
