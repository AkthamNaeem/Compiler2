package main.java.compiler.ast;

public interface AstVisitor<T> {
    T visitToken (Token node);
    T visitConstDeclaration (ConstDeclaration node);
    T visitStatement (Statement node);
    T visitVariableDeclaration (VariableDeclaration node);
    T visitFunctionDeclaration (FunctionDeclaration node);
    T visitBaseFunctionDeclaration (BaseFunctionDeclaration node);
    T visitFunctionAssignDeclaration (FunctionAssignDeclaration node);
    T visitVariableDeclarationWithinClass (VariableDeclarationWithinClass node);
}
