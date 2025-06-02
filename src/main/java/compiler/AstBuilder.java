package main.java.compiler;

import main.java.compiler.ast.AstNode;
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

    @Override
    public AstNode visitLogicalOperator(AngularParser.LogicalOperatorContext ctx) {
        LogicalOperator opNode = new LogicalOperator();
        opNode.setLeftOp(visit(ctx.leftOp));
        opNode.setOperator(ctx.op.getText());
        opNode.setRightOp(visit(ctx.rightOp));
        return opNode;
    }

    // arithmetic operatorchain :
    @Override
    public AstNode visitArithmeticOperatorChain(AngularParser.ArithmeticOperatorChainContext ctx) {
        ArithmeticOperatorChain chain = new ArithmeticOperatorChain();
        chain.setLeftOp(visit(ctx.leftOp));
        for (int i = 0; i < ctx.ops.size(); i++) {
            chain.addOperator(ctx.ops.get(i).getText());
            chain.addValue(visit(ctx.values.get(i)));
        }
        return chain;
    }
    // paranethesized operator :
    @Override
    public AstNode visitParenthesizedOperator(AngularParser.ParenthesizedOperatorContext ctx) {
        ParenthesizedOperator node = new ParenthesizedOperator();
        node.setOperator(visit(ctx.op));
        return node;
    }


    //SimpleOperator :
    @Override
    public AstNode visitSimpleOperator(AngularParser.SimpleOperatorContext ctx) {
        SimpleOperator node = new SimpleOperator();
        node.setOperator(visit(ctx.op));
        return node;
    }

    @Override
    public AstNode visitInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx) {
        InterfaceDeclaration interfaceDecl = new InterfaceDeclaration();

        interfaceDecl.setName(ctx.name.getText());


        if (ctx.members != null) {
            for (AngularParser.InterfaceObjectContext memberCtx : ctx.members) {
                interfaceDecl.addMember(visit(memberCtx));
            }
        }

        return interfaceDecl;
    }
    @Override
    public AstNode visitClassDeclaration(AngularParser.ClassDeclarationContext ctx) {
        ClassDeclaration classDecl = new ClassDeclaration();

        classDecl.setClassName(ctx.name.getText());

        if (ctx.parent != null) {
            classDecl.setParentClass(ctx.parent.getText());
        }

        if (ctx.members != null) {
            for (AngularParser.ClassBodyContext memberCtx : ctx.members) {
                classDecl.addMember(visit(memberCtx));
            }
        }

        return classDecl;
    }
    @Override
    public AstNode visitModuleDeclaration(AngularParser.ModuleDeclarationContext ctx) {
        ModuleDeclaration moduleDecl = new ModuleDeclaration();

        if (ctx.cls != null) {
            moduleDecl.setExportedDeclaration(visit(ctx.cls));
        }
        else if (ctx.iface != null) {
            moduleDecl.setExportedDeclaration(visit(ctx.iface));
        }

        return moduleDecl;
    }
    @Override
    public AstNode visitImportSpecifier(AngularParser.ImportSpecifierContext ctx) {
        ImportSpecifier specifier = new ImportSpecifier();

        specifier.setName(ctx.name.getText());

        if (ctx.alias != null) {
            specifier.setAlias(ctx.alias.getText());
        }

        return specifier;
    }
    @Override
    public AstNode visitImportsDef(AngularParser.ImportsDefContext ctx) {
        ImportsDef importsDef = new ImportsDef();

        if (ctx.modules != null) {
            for (AngularParser.ImportArrayContext moduleCtx : ctx.modules) {
                importsDef.addModule(visit(moduleCtx));
            }
        }
        return importsDef;
    }
    @Override
    public AstNode visitImportArray(AngularParser.ImportArrayContext ctx) {
        ImportArray importArray = new ImportArray();

        if (ctx.importItems != null) {
            for (AngularParser.ImportItemContext itemCtx : ctx.importItems) {
                importArray.addImportItem(visit(itemCtx));
            }
        }

        return importArray;
    }
}
