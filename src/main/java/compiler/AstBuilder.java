package main.java.compiler;

import main.java.compiler.ast.*;
import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.ConstDeclaration;
import main.java.compiler.ast.Statement;
import main.java.compiler.ast.Token;
import main.java.compiler.ast.arithmeticOperation.CompoundAssignmentOperation;
import main.resources.gen.AngularParser;
import main.resources.gen.AngularParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

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
    };

    @Override
    public AstNode visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        VariableDeclaration varDecl = new VariableDeclaration();
        varDecl.setName(ctx.name.getText());
        if (ctx.type != null) {
            AstNode typeNode = visit(ctx.type);
            varDecl.setType(typeNode);
        }
        if (ctx.value != null) {
            AstNode valueNode = visit(ctx.value);
            varDecl.setValue(valueNode);
        }
        varDecl.setSemi(ctx.SEMI() != null);
        return varDecl;
    }

    @Override
    public AstNode visitVariableDeclarationWithinClass(AngularParser.VariableDeclarationWithinClassContext ctx) {
        VariableDeclarationWithinClass varDecl = new VariableDeclarationWithinClass();
        varDecl.setName(ctx.name.getText());
        if (ctx.type != null) {
            AstNode typeNode = visit(ctx.type);
            varDecl.setType(typeNode);
            varDecl.setNullable(ctx.NULL() != null);
        }
        if (ctx.value != null) {
            AstNode valueNode = visit(ctx.value);
            varDecl.setValue(valueNode);
        }
        return varDecl;
    }

    @Override
    public AstNode visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) {
        FunctionDeclaration funDecl = new FunctionDeclaration();
        if (ctx.func != null) {
            AstNode typeNode = visit(ctx.func);
            funDecl.setFunc(typeNode);
        }
        if (ctx.returnType != null) {
            AstNode valueNode = visit(ctx.returnType);
            funDecl.setReturnType(valueNode);
        }
        return funDecl;
    }

    @Override
    public AstNode visitBaseFunctionDeclaration(AngularParser.BaseFunctionDeclarationContext ctx) {
        BaseFunctionDeclaration baseFunc = new BaseFunctionDeclaration();

        List<AstNode> accessModifiers = new ArrayList<>();
        List<AstNode> functionVariables = new ArrayList<>();

//        for (int i = 0; i < ctx.params.size(); i++) {
//            AngularParser.AccessModifiersContext accessCtx = ctx.params.get(i).accessModifiers();
//            AngularParser.FunctionVariableContext varCtx = ctx.params.get(i).functionVariable();
//
//            if (accessCtx != null) {
//                accessModifiers.add(visit(accessCtx));
//            } else {
//                accessModifiers.add(null);
//            }
//
//            if (varCtx != null) {
//                functionVariables.add(visit(varCtx));
//            }
//        }

        baseFunc.setAccessModifiers(accessModifiers);
        baseFunc.setFunctionVariables(functionVariables);

        // Optional return type
        if (ctx.returnType != null) {
            baseFunc.setAllOptions(visit(ctx.returnType));
        }

        // Required function body
        if (ctx.body != null) {
            baseFunc.setFunctionBody(visit(ctx.body));
        }

        return baseFunc;
    }
    @Override
    public AstNode visitFunctionAssignDeclaration(AngularParser.FunctionAssignDeclarationContext ctx) {
        FunctionAssignDeclaration FuncAssign = new FunctionAssignDeclaration();

        return FuncAssign;
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
}
