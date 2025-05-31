package main.java.compiler.ast.block;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

abstract class Block implements AstNode {
    public abstract <T> T accept(AstVisitor<T> visitor);
}
