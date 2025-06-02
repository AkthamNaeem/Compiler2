package main.java.compiler.ast;

import main.java.compiler.ast.arithmeticOperation.CompoundAssignmentOperation;

public interface AstVisitor<T> {
    T visitInstruction(Instruction node);

    T visitToken (Token node);
    T visitConstDeclaration (ConstDeclaration node);
    T visitStatement (Statement node);
    T visitCompoundAssignmentOperation (CompoundAssignmentOperation node);



    //


    T visitInterfaceObject(InterfaceObject node);
    T visitClassVariableDeclaration(ClassVariableDeclaration node);
    T visitClassMethodDeclaration(ClassMethodDeclaration node);
    T visitClassFunctionCall(ClassFunctionCall node);
    T visitImportModule(ImportModule node);

    T visitJsonValue(JsonValue node);
    T visitSimpleValue(SimpleValue node);
    T visitObjectValueValue(ObjectValueValue node);
    T visitObjectFunctionValue(ObjectFunctionValue node);
    T visitArrayValue(ArrayValue node);
    T visitAssertionValueValue(AssertionValueValue node);
    T visitArrowFunctionValue(ArrowFunctionValue node);
    T visitInterfaceValuesValue(InterfaceValuesValue node);
    T visitExpressionValue(ExpressionValue node);
    T visitNullValue(NullValue node);


    T visitBracketArrayType(BracketArrayType node);
    T visitGenericArrayType(GenericArrayType node);

    T visitSimpleTypeOption(SimpleTypeOption node);
    T visitTupleTypeOption(TupleTypeOption node);
    T visitArrayTypeOption(ArrayTypeOption node);


    T visitStringValue(StringValue node);
    T visitNumberValue(NumberValue node);
    T visitBooleanValue(BooleanValue node);
    T visitIdentifierValue(IdentifierValue node);

    T visitBlockWithBraces(BlockWithBraces node);
    T visitSingleStatementBlock(SingleStatementBlock node);

    T visitAsAssertion(AsAssertion node);
    T visitGenericAssertion(GenericAssertion node);



    T visitServiceStringValue(ServiceStringValue node);
    T visitServiceBooleanValue(ServiceBooleanValue node);
    T visitServiceNumberValue(ServiceNumberValue node);
    T visitServiceIdentifierValue(ServiceIdentifierValue node);

    T visitForLoop(ForLoop node);

    T visitIfStatement(IfStatement node);
    T visitWhileLoop(WhileLoop node);
    T visitDoWhileLoop(DoWhileLoop node);
    T visitForEachLoop(ForEachLoop node);

    T visitClassObjectDeclaration(ClassObjectDeclaration node);

    T visitEnumDeclaration(EnumDeclaration node);
    T visitEnumVariable(EnumVariable node);

    // 
}
