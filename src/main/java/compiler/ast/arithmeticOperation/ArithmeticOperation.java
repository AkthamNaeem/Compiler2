package main.java.compiler.ast.arithmeticOperation;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

abstract class ArithmeticOperation implements AstNode {
    public abstract <T> T accept(AstVisitor<T> visitor);
}
