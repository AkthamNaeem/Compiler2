package main.java.compiler.ast;

import main.java.compiler.ast.arithmeticOperation.CompoundAssignmentOperation;

public interface AstVisitor<T> {
    T visitToken (Token node);
    T visitConstDeclaration (ConstDeclaration node);
    T visitStatement (Statement node);
    T visitCompoundAssignmentOperation (CompoundAssignmentOperation node);



    //


    T visitInterfaceObject(InterfaceObject node);
    T visitClassVariableDeclaration(ClassVariableDeclaration node);
    T visitClassMethodDeclaration(ClassMethodDeclaration node);
    T visitClassFunctionCall(ClassFunctionCall node);
    // 
}
