package main.java.compiler.ast;

public class BaseFunctionDeclaration implements AstNode {
    @Override
    public <T> T accept (AstVisitor<T> visitor) {
        return null;
    }
}
