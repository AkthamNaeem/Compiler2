package main.java.compiler;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.ConstDeclaration;
import main.java.compiler.ast.Statement;
import main.java.compiler.ast.Token;
import main.java.compiler.ast.arithmeticOperation.CompoundAssignmentOperation;
import main.resources.gen.AngularParser;
import main.resources.gen.AngularParserBaseVisitor;

public class AstBuilder extends AngularParserBaseVisitor<AstNode> {
    @Override
    public AstNode visitConstStatement (AngularParser.ConstStatementContext ctx) {
        AstNode constStatement = visit (ctx.constDeclaration ());
        Statement statement = new Statement ();
        statement.setStatement (constStatement);
        return statement;
    }

    @Override
    public AstNode visitVariableStatement (AngularParser.VariableStatementContext ctx) {
        AstNode variableStatement = visit (ctx.variableDeclaration ());
        Statement statement = new Statement ();
        statement.setStatement (variableStatement);
        return statement;
    }

    @Override
    public AstNode visitEnumStatement (AngularParser.EnumStatementContext ctx) {
        AstNode variableStatement = visit (ctx.enumDeclaration ());
        Statement statement = new Statement ();
        statement.setStatement (variableStatement);
        return statement;
    }

    @Override
    public AstNode visitFunctionStatement (AngularParser.FunctionStatementContext ctx) {
        AstNode variableStatement = visit (ctx.functionDeclaration ());
        Statement statement = new Statement ();
        statement.setStatement (variableStatement);
        return statement;
    }

    @Override
    public AstNode visitAssignmentStatement (AngularParser.AssignmentStatementContext ctx) {
        AstNode variableStatement = visit (ctx.assignValue ());
        Statement statement = new Statement ();
        statement.setStatement (variableStatement);
        return statement;
    }

    @Override
    public AstNode visitFunctionAssignStatement (AngularParser.FunctionAssignStatementContext ctx) {
        AstNode variableStatement = visit (ctx.functionAssignDeclaration ());
        Statement statement = new Statement ();
        statement.setStatement (variableStatement);
        return statement;
    }

    @Override
    public AstNode visitReturnStatement (AngularParser.ReturnStatementContext ctx) {
        AstNode variableStatement = visit (ctx.returnDeclaration ());
        Statement statement = new Statement ();
        statement.setStatement (variableStatement);
        return statement;
    }

    @Override
    public AstNode visitObjectFunctionStatement (AngularParser.ObjectFunctionStatementContext ctx) {
        AstNode variableStatement = visit (ctx.objectFunction ());
        Statement statement = new Statement ();
        statement.setStatement (variableStatement);
        statement.setSemi (true);
        return statement;
    }

    @Override
    public AstNode visitInterfaceStatement (AngularParser.InterfaceStatementContext ctx) {
        AstNode variableStatement = visit (ctx.interfaceDeclaration ());
        Statement statement = new Statement ();
        statement.setStatement (variableStatement);
        return statement;
    }

    @Override
    public AstNode visitClassStatement (AngularParser.ClassStatementContext ctx) {
        AstNode variableStatement = visit (ctx.classDeclaration ());
        Statement statement = new Statement ();
        statement.setStatement (variableStatement);
        return statement;
    }

    @Override
    public AstNode visitClassObjectStatement (AngularParser.ClassObjectStatementContext ctx) {
        AstNode variableStatement = visit (ctx.classObjectDeclaration ());
        Statement statement = new Statement ();
        statement.setStatement (variableStatement);
        return statement;
    }

    @Override
    public AstNode visitFunctionCallStatement (AngularParser.FunctionCallStatementContext ctx) {
        AstNode variableStatement = visit (ctx.functionCall ());
        Statement statement = new Statement ();
        statement.setStatement (variableStatement);
        return statement;
    }

    @Override
    public AstNode visitModuleStatement (AngularParser.ModuleStatementContext ctx) {
        AstNode variableStatement = visit (ctx.moduleDeclaration ());
        Statement statement = new Statement ();
        statement.setStatement (variableStatement);
        return statement;
    }

    @Override
    public AstNode visitImportStatement (AngularParser.ImportStatementContext ctx) {
        AstNode variableStatement = visit (ctx.importModule ());
        Statement statement = new Statement ();
        statement.setStatement (variableStatement);
        return statement;
    }

    @Override
    public AstNode visitComponentStatement (AngularParser.ComponentStatementContext ctx) {
        AstNode variableStatement = visit (ctx.componentDef ());
        Statement statement = new Statement ();
        statement.setStatement (variableStatement);
        return statement;
    }

    @Override
    public AstNode visitServiceStatement (AngularParser.ServiceStatementContext ctx) {
        AstNode variableStatement = visit (ctx.serviceDef ());
        Statement statement = new Statement ();
        statement.setStatement (variableStatement);
        return statement;
    }

    @Override
    public AstNode visitForLoopStatement (AngularParser.ForLoopStatementContext ctx) {
        AstNode variableStatement = visit (ctx.forLoop ());
        Statement statement = new Statement ();
        statement.setStatement (variableStatement);
        return statement;
    }

    @Override
    public AstNode visitForEachLoopStatement (AngularParser.ForEachLoopStatementContext ctx) {
        AstNode variableStatement = visit (ctx.forEachLoop ());
        Statement statement = new Statement ();
        statement.setStatement (variableStatement);
        return statement;
    }

    @Override
    public AstNode visitIfStatementStatement (AngularParser.IfStatementStatementContext ctx) {
        AstNode variableStatement = visit (ctx.ifStatement ());
        Statement statement = new Statement ();
        statement.setStatement (variableStatement);
        return statement;
    }

    @Override
    public AstNode visitDoWhileStatement (AngularParser.DoWhileStatementContext ctx) {
        AstNode variableStatement = visit (ctx.doWhileLoop ());
        Statement statement = new Statement ();
        statement.setStatement (variableStatement);
        return statement;
    }

    @Override
    public AstNode visitWhileStatement (AngularParser.WhileStatementContext ctx) {
        AstNode variableStatement = visit (ctx.whileLoop ());
        Statement statement = new Statement ();
        statement.setStatement (variableStatement);
        return statement;
    }

    @Override
    public AstNode visitConstDeclaration (AngularParser.ConstDeclarationContext ctx) {
        ConstDeclaration constDeclaration = new ConstDeclaration ();

        constDeclaration.setName (ctx.name.getText ());
        if (ctx.type != null) {
            constDeclaration.setType (visit (ctx.type));
        }
        constDeclaration.setValue (visit (ctx.value));

        return constDeclaration;
    }

    @Override
    public AstNode visitPostfixUnaryOperation (AngularParser.PostfixUnaryOperationContext ctx) {
        return super.visitPostfixUnaryOperation (ctx);
    }

    @Override
    public AstNode visitPrefixUnaryOperation (AngularParser.PrefixUnaryOperationContext ctx) {
        return super.visitPrefixUnaryOperation (ctx);
    }

    @Override
    public AstNode visitCompoundAssignmentOperation (AngularParser.CompoundAssignmentOperationContext ctx) {
        CompoundAssignmentOperation compoundAssignmentOperation = new CompoundAssignmentOperation ();
        String name = ctx.id.getText ();
        String operator = ctx.op.getText ();
        AstNode expression = visit (ctx.expression ());
        compoundAssignmentOperation.setName (name);
        compoundAssignmentOperation.setOperator (operator);
        compoundAssignmentOperation.setExpression (expression);
        return compoundAssignmentOperation;
    }

    @Override
    public AstNode visitLessThan (AngularParser.LessThanContext ctx) {
        String operator = ctx.LT ().getText ();
        Token token = new Token ();
        token.setName (operator);
        return token;
    }

    @Override
    public AstNode visitGreaterThan (AngularParser.GreaterThanContext ctx) {
        String operator = ctx.GT ().getText ();
        Token token = new Token ();
        token.setName (operator);
        return token;
    }

    @Override
    public AstNode visitEqual (AngularParser.EqualContext ctx) {
        String operator = ctx.EQ ().getText ();
        Token token = new Token ();
        token.setName (operator);
        return token;
    }

    @Override
    public AstNode visitStrictEqual (AngularParser.StrictEqualContext ctx) {
        String operator = ctx.STRICT_EQ ().getText ();
        Token token = new Token ();
        token.setName (operator);
        return token;
    }

    @Override
    public AstNode visitNotEqual (AngularParser.NotEqualContext ctx) {
        String operator = ctx.NEQ ().getText ();
        Token token = new Token ();
        token.setName (operator);
        return token;
    }

    @Override
    public AstNode visitStrictNotEqual (AngularParser.StrictNotEqualContext ctx) {
        String operator = ctx.STRICT_NEQ ().getText ();
        Token token = new Token ();
        token.setName (operator);
        return token;
    }

    @Override
    public AstNode visitAddition (AngularParser.AdditionContext ctx) {
        String operator = ctx.PLUS ().getText ();
        Token token = new Token ();
        token.setName (operator);
        return token;
    }

    @Override
    public AstNode visitSubtraction (AngularParser.SubtractionContext ctx) {
        String operator = ctx.MINUS ().getText ();
        Token token = new Token ();
        token.setName (operator);
        return token;
    }

    @Override
    public AstNode visitMultiplication (AngularParser.MultiplicationContext ctx) {
        String operator = ctx.MUL ().getText ();
        Token token = new Token ();
        token.setName (operator);
        return token;
    }

    @Override
    public AstNode visitDivision (AngularParser.DivisionContext ctx) {
        String operator = ctx.DIV ().getText ();
        Token token = new Token ();
        token.setName (operator);
        return token;
    }

    @Override
    public AstNode visitModulus (AngularParser.ModulusContext ctx) {
        String operator = ctx.MOD ().getText ();
        Token token = new Token ();
        token.setName (operator);
        return token;
    }

    @Override
    public AstNode visitLeftParen (AngularParser.LeftParenContext ctx) {
        String operator = ctx.LPAREN ().getText ();
        Token token = new Token ();
        token.setName (operator);
        return token;
    }

    @Override
    public AstNode visitRightParen (AngularParser.RightParenContext ctx) {
        String operator = ctx.RPAREN ().getText ();
        Token token = new Token ();
        token.setName (operator);
        return token;
    }

    @Override
    public AstNode visitLeftBracket (AngularParser.LeftBracketContext ctx) {
        String operator = ctx.LBRACK ().getText ();
        Token token = new Token ();
        token.setName (operator);
        return token;
    }

    @Override
    public AstNode visitRightBracket (AngularParser.RightBracketContext ctx) {
        String operator = ctx.RBRACK ().getText ();
        Token token = new Token ();
        token.setName (operator);
        return token;
    }

    @Override
    public AstNode visitSemicolon (AngularParser.SemicolonContext ctx) {
        String operator = ctx.SEMI ().getText ();
        Token token = new Token ();
        token.setName (operator);
        return token;
    }

    @Override
    public AstNode visitColon (AngularParser.ColonContext ctx) {
        String operator = ctx.COLON ().getText ();
        Token token = new Token ();
        token.setName (operator);
        return token;
    }

    @Override
    public AstNode visitComma (AngularParser.CommaContext ctx) {
        String operator = ctx.COMMA ().getText ();
        Token token = new Token ();
        token.setName (operator);
        return token;
    }

    @Override
    public AstNode visitDot (AngularParser.DotContext ctx) {
        String operator = ctx.DOT ().getText ();
        Token token = new Token ();
        token.setName (operator);
        return token;
    }

    @Override
    public AstNode visitQuestionMark (AngularParser.QuestionMarkContext ctx) {
        String operator = ctx.QUESTION ().getText ();
        Token token = new Token ();
        token.setName (operator);
        return token;
    }

    @Override
    public AstNode visitAtSymbol (AngularParser.AtSymbolContext ctx) {
        String operator = ctx.AT ().getText ();
        Token token = new Token ();
        token.setName (operator);
        return token;
    }




    //


    @Override
    public AstNode visitInterfaceObject(AngularParser.InterfaceObjectContext ctx) {
        InterfaceObject node = new InterfaceObject();
        node.setName(ctx.name.getText());
        node.setType(visit(ctx.type));
        return node;
    }

    @Override
    public AstNode visitClassVariableDeclaration(AngularParser.ClassVariableDeclarationContext ctx) {
        ClassVariableDeclaration node = new ClassVariableDeclaration();
        node.setVariableDeclaration(visit(ctx.varDecl));  // زيارة variableDeclarationWithinClass
        return node;
    }

    @Override
    public AstNode visitClassMethodDeclaration(AngularParser.ClassMethodDeclarationContext ctx) {
        ClassMethodDeclaration node = new ClassMethodDeclaration();
        node.setMethodDeclaration(visit(ctx.method));  // زيارة functionDeclarationWithinClass
        return node;
    }

    @Override
    public AstNode visitClassFunctionCall(AngularParser.ClassFunctionCallContext ctx) {
        ClassFunctionCall node = new ClassFunctionCall();
        node.setFunctionCall(visit(ctx.call));  // زيارة functionCall
        return node;
    }


    @Override
    public AstNode visitImportModule(AngularParser.ImportModuleContext ctx) {
        ImportModule node = new ImportModule();

        for (AngularParser.ImportSpecifierContext importCtx : ctx.imports) {
            node.addImport(visit(importCtx));
        }

        String path = ctx.path.getText();
        if (path.startsWith("\"") && path.endsWith("\"")) {
            path = path.substring(1, path.length() - 1);
        }
        node.setPath(path);

        return node;
    }


    @Override
    public AstNode visitJsonValue(AngularParser.JsonValueContext ctx) {
        JsonValue node = new JsonValue();
        node.setJsonDef(visit(ctx.jsonValue));
        return node;
    }

    @Override
    public AstNode visitSimpleValue(AngularParser.SimpleValueContext ctx) {
        SimpleValue node = new SimpleValue();
        node.setValueOptions(visit(ctx.simple));
        return node;
    }

    @Override
    public AstNode visitObjectValueValue(AngularParser.ObjectValueValueContext ctx) {
        ObjectValueValue node = new ObjectValueValue();
        node.setObjectValue(visit(ctx.objVal));
        return node;
    }

    @Override
    public AstNode visitObjectFunctionValue(AngularParser.ObjectFunctionValueContext ctx) {
        ObjectFunctionValue node = new ObjectFunctionValue();
        node.setObjectFunction(visit(ctx.funcCall));
        return node;
    }

    @Override
    public AstNode visitArrayValue(AngularParser.ArrayValueContext ctx) {
        ArrayValue node = new ArrayValue();
        node.setArrayValues(visit(ctx.array));
        return node;
    }

    @Override
    public AstNode visitAssertionValueValue(AngularParser.AssertionValueValueContext ctx) {
        AssertionValueValue node = new AssertionValueValue();
        node.setAssertionValue(visit(ctx.assertion));
        return node;
    }

    @Override
    public AstNode visitArrowFunctionValue(AngularParser.ArrowFunctionValueContext ctx) {
        ArrowFunctionValue node = new ArrowFunctionValue();
        node.setArrowFunction(visit(ctx.arrowFunc));
        return node;
    }

    @Override
    public AstNode visitInterfaceValuesValue(AngularParser.InterfaceValuesValueContext ctx) {
        InterfaceValuesValue node = new InterfaceValuesValue();
        node.setInterfaceValues(visit(ctx.ifaceValue));
        return node;
    }

    @Override
    public AstNode visitExpressionValue(AngularParser.ExpressionValueContext ctx) {
        ExpressionValue node = new ExpressionValue();
        node.setExpression(visit(ctx.expr));
        return node;
    }

    @Override
    public AstNode visitNullValue(AngularParser.NullValueContext ctx) {
        return new NullValue();
    }

    @Override
    public AstNode visitBracketArrayType(AngularParser.BracketArrayTypeContext ctx) {
        BracketArrayType node = new BracketArrayType();
        node.setType(visit(ctx.type));  // Visit the typeOptions rule
        return node;
    }

    @Override
    public AstNode visitGenericArrayType(AngularParser.GenericArrayTypeContext ctx) {
        GenericArrayType node = new GenericArrayType();
        node.setType(visit(ctx.type));  // Visit the typeOptions rule
        return node;
    }


    @Override
    public AstNode visitSimpleTypeOption(AngularParser.SimpleTypeOptionContext ctx) {
        SimpleTypeOption node = new SimpleTypeOption();
        node.setTypeOptions(visit(ctx.simpleType));  // Visit typeOptions
        return node;
    }

    @Override
    public AstNode visitTupleTypeOption(AngularParser.TupleTypeOptionContext ctx) {
        TupleTypeOption node = new TupleTypeOption();
        node.setTupleOptions(visit(ctx.tuple));  // Visit tupleOptions
        return node;
    }

    @Override
    public AstNode visitArrayTypeOption(AngularParser.ArrayTypeOptionContext ctx) {
        ArrayTypeOption node = new ArrayTypeOption();
        node.setArrayOptions(visit(ctx.array));  // Visit arrayOptions
        return node;
    }
}
