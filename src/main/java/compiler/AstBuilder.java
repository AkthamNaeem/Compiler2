package main.java.compiler;

import main.java.compiler.ast.*;
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
    }

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



}
