package main.java.compiler.ast;

public interface AstNode {
    <T> T accept(AstVisitor<T> visitor);
}
