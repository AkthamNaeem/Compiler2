package main.java.compiler.ast;

import main.java.compiler.ast.arithmeticOperation.CompoundAssignmentOperation;

public interface AstVisitor<T> {
    T visitToken (Token node);
    T visitConstDeclaration (ConstDeclaration node);
    T visitStatement (Statement node);
    T visitCompoundAssignmentOperation (CompoundAssignmentOperation node);


    ///
    T visitLogicalOperator(LogicalOperator node);
    T visitArithmeticOperatorChain(ArithmeticOperatorChain node);
    T visitParenthesizedOperator(ParenthesizedOperator node);
    T visitSimpleOperator(SimpleOperator node);
    T visitInterfaceDeclaration(InterfaceDeclaration node);
    T visitClassDeclaration(ClassDeclaration node);
    T visitModuleDeclaration(ModuleDeclaration node);
    T visitImportSpecifier(ImportSpecifier node);
    T visitImportsDef(ImportsDef node);
    T visitImportArray(ImportArray node);
    T visitImportItem(ImportItem node);
    T visitTupleOptions(TupleOptions node);
    T visitNumberType(NumberType node);
    T visitStringType(StringType node);
    T visitBooleanType(BooleanType node);
    T visitCustomType(CustomType node);
    T visitArrayValues(ArrayValues node);
    T visitObjectNode(ObjectNode node);
    T visitObjectValue(ObjectValue node);
    T visitObjectFunctionCall(ObjectFunctionCall node);
    T visitAssignValue(AssignValue node);
    T visitInterfaceValues(InterfaceValues node);
    T visitInterfaceProperty(InterfaceProperty node);
    T visitInterfaceMethod(InterfaceMethod node);
    T visitClassValue(ClassValue node);
}
