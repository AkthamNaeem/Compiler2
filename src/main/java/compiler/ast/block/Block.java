package main.java.compiler.ast.block;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public abstract class Block implements AstNode {
    // Common block properties could go here
    private int startLine;
    private int endLine;

    // Getters for position information
    public int getStartLine() { return startLine; }
    public int getEndLine() { return endLine; }

    // Setters for position information
    public void setStartLine(int line) { this.startLine = line; }
    public void setEndLine(int line) { this.endLine = line; }

    // Force implementation of visitor pattern
    @Override
    public abstract <T> T accept(AstVisitor<T> visitor);
}