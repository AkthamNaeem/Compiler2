package main.java.compiler;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.Statement;
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




}
