package main.java.compiler.ast.operator;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

abstract class Operator implements AstNode {
    public abstract <T> T accept(AstVisitor<T> visitor);
}
