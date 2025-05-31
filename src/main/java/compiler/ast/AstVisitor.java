package main.java.compiler.ast;

public interface AstVisitor<T> {
    T visitToken (Token node);
    T visitConstDeclaration (ConstDeclaration node);
    T visitStatement (Statement node);
}
