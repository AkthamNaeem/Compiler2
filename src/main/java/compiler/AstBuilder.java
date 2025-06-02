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
    @Override
    public AstNode visitImportItem(AngularParser.ImportItemContext ctx) {
        ImportItem importItem = new ImportItem();
        importItem.setModule(ctx.module.getText());
        return importItem;
    }
    @Override
    public AstNode visitTupleOptions(AngularParser.TupleOptionsContext ctx) {
        TupleOptions tupleOptions = new TupleOptions();

        if (ctx.types != null) {
            for (AngularParser.TypeOptionsContext typeCtx : ctx.types) {
                tupleOptions.addType(visit(typeCtx));
            }
        }

        return tupleOptions;
    }

    @Override
    public AstNode visitNumberType(AngularParser.NumberTypeContext ctx) {
        return new NumberType();
    }

    @Override
    public AstNode visitStringType(AngularParser.StringTypeContext ctx) {
        return new StringType();
    }

    @Override
    public AstNode visitBooleanType(AngularParser.BooleanTypeContext ctx) {
        return new BooleanType();
    }

    @Override
    public AstNode visitCustomType(AngularParser.CustomTypeContext ctx) {
        CustomType customType = new CustomType();
        customType.setName(ctx.name.getText());
        return customType;
    }
    @Override
    public AstNode visitArrayValues(AngularParser.ArrayValuesContext ctx) {
        ArrayValues arrayValues = new ArrayValues();
        if (ctx.values != null) {
            for (AngularParser.AllValuesContext valueCtx : ctx.values) {
                arrayValues.addValue(visit(valueCtx));
            }
        }
        return arrayValues;
    }

    @Override
    public AstNode visitObject(AngularParser.ObjectContext ctx) {
        ObjectNode objectNode = new ObjectNode();

        objectNode.setParentheses(ctx.LPAREN() != null);

        if (ctx.id != null) {
            objectNode.setIdentifier(ctx.id.getText());
        } else if (ctx.assertion != null) {
            objectNode.setAssertion(visit(ctx.assertion));
        } else if (ctx.THIS() != null) {
            objectNode.setThis(true);
        } else if (ctx.SUPER() != null) {
            objectNode.setSuper(true);
        }

        return objectNode;
    }

    @Override
    public AstNode visitObjectValue(AngularParser.ObjectValueContext ctx) {
        ObjectValue objectValue = new ObjectValue();


        if (ctx.THIS() != null) {
            objectValue.setThis(true);
        } else if (ctx.SUPER() != null) {
            objectValue.setSuper(true);
        }

        objectValue.setObject(visit(ctx.obj));
        objectValue.setProperty(ctx.prop.getText());

        return objectValue;
    }

    @Override
    public AstNode visitObjectFunction(AngularParser.ObjectFunctionContext ctx) {
        ObjectFunctionCall functionCall = new ObjectFunctionCall();

        if (ctx.THIS() != null) {
            functionCall.setThis(true);
        } else if (ctx.SUPER() != null) {
            functionCall.setSuper(true);
        }

        functionCall.setObject(visit(ctx.obj));
        functionCall.setMethodName(ctx.method.getText());

        if (ctx.args != null) {
            for (AngularParser.AllValuesContext argCtx : ctx.args) {
                functionCall.addArgument(visit(argCtx));
            }
        }

        return functionCall;
    }

    @Override
    public AstNode visitAssignValue(AngularParser.AssignValueContext ctx) {
        AssignValue assignValue = new AssignValue();

        if (ctx.target != null) {
            assignValue.setTarget(ctx.target.getText());
        } else if (ctx.objTarget != null) {
            assignValue.setObjTarget(visit(ctx.objTarget));
        }

        assignValue.setValue(visit(ctx.value));

        return assignValue;
    }

    @Override
    public AstNode visitInterfaceValues(AngularParser.InterfaceValuesContext ctx) {
        InterfaceValues interfaceValues = new InterfaceValues();

        if (ctx.members != null) {
            for (AngularParser.InterfaceValueContext memberCtx : ctx.members) {
                interfaceValues.addMember(visit(memberCtx));
            }
        }

        return interfaceValues;
    }

    @Override
    public AstNode visitInterfaceProperty(AngularParser.InterfacePropertyContext ctx) {
        InterfaceProperty property = new InterfaceProperty();
        property.setName(ctx.name.getText());
        property.setValue(visit(ctx.value));
        return property;
    }

    @Override
    public AstNode visitInterfaceMethod(AngularParser.InterfaceMethodContext ctx) {
        InterfaceMethod method = new InterfaceMethod();
        method.setMethod(visit(ctx.method));
        return method;
    }
    @Override
    public AstNode visitClassValue(AngularParser.ClassValueContext ctx) {
        ClassValue classValue = new ClassValue();

        classValue.setClassName(ctx.className.getText());

        if (ctx.args != null) {
            for (AngularParser.AllValuesContext argCtx : ctx.args) {
                classValue.addArgument(visit(argCtx));
            }
        }

        return classValue;
    }

    @Override
    public AstNode visitFunctionCall(AngularParser.FunctionCallContext ctx) {
        FunctionCall functionCall = new FunctionCall();

        if (ctx.name != null) {
            functionCall.setFunctionName(ctx.name.getText());
        } else {
            functionCall.setFunctionName("SUPER");
        }

        if (ctx.args != null) {
            for (AngularParser.AllValuesContext argCtx : ctx.args) {
                functionCall.addArgument(visit(argCtx));
            }
        }

        return functionCall;
    }

    @Override
    public AstNode visitJsonDef(AngularParser.JsonDefContext ctx) {
        JsonDef jsonDef = new JsonDef();

        if (ctx.props != null) {
            for (AngularParser.JsonBodyContext propCtx : ctx.props) {
                jsonDef.addProperty((JsonProperty) visit(propCtx));
            }
        }

        return jsonDef;
    }

    @Override
    public AstNode visitJsonBody(AngularParser.JsonBodyContext ctx) {
        JsonProperty property = new JsonProperty();

        String rawKey = ctx.key.getText();
        property.setKey(rawKey.startsWith("\"") ?
                rawKey.substring(1, rawKey.length() - 1) :
                rawKey);

        if (ctx.value != null) {
            property.setValue(visit(ctx.value));
        }

        return property;
    }
    @Override
    public AstNode visitComparisonExpression(AngularParser.ComparisonExpressionContext ctx) {
        ComparisonExpression expr = new ComparisonExpression();

        expr.setLeftOperand(visit(ctx.leftExpr));

        for (int i = 0; i < ctx.op.size(); i++) {
            Token operatorToken = ctx.op.get(i);
            ComparisonOperator operator = ComparisonOperator.fromToken(operatorToken.getText());
            AstNode rightOperand = visit(ctx.rightExpr.get(i));

            expr.addOperation(new ComparisonOperation(operator, rightOperand));
        }

        return expr;
    }
    @Override
    public AstNode visitAdditiveExpression(AngularParser.AdditiveExpressionContext ctx) {
        AdditiveExpression expr = new AdditiveExpression();

        expr.setLeftExpr(visit(ctx.leftExpr));

        for (int i = 0; i < ctx.op.size(); i++) {
            String operator = ctx.op.get(i).getText(); // "+" or "-"
            AstNode rightExpr = visit(ctx.rightExpr.get(i));
            expr.addOperation(operator, rightExpr);
        }

        return expr;
    }
    @Override
    public AstNode visitMultiplicativeExpression(AngularParser.MultiplicativeExpressionContext ctx) {
        MultiplicativeExpression expr = new MultiplicativeExpression();

        expr.setLeftExpr(visit(ctx.leftExpr));

        for (int i = 0; i < ctx.op.size(); i++) {
            String operator = ctx.op.get(i).getText(); // "*", "/", or "%"
            AstNode rightExpr = visit(ctx.rightExpr.get(i));
            expr.addOperation(operator, rightExpr);
        }

        return expr;
    }

    @Override
    public AstNode visitPrimaryIdentifier(AngularParser.PrimaryIdentifierContext ctx) {
        return new PrimaryIdentifier(ctx.id.getText());
    }

    @Override
    public AstNode visitPrimaryNumber(AngularParser.PrimaryNumberContext ctx) {
        return new PrimaryNumber(ctx.num.getText());
    }

    @Override
    public AstNode visitPrimaryString(AngularParser.PrimaryStringContext ctx) {
        return new PrimaryString(ctx.str.getText());
    }

    @Override
    public AstNode visitPrimaryParenthesized(AngularParser.PrimaryParenthesizedContext ctx) {
        return new PrimaryParenthesized(visit(ctx.expr));
    }

    @Override
    public AstNode visitPrimaryObject(AngularParser.PrimaryObjectContext ctx) {
        return visit(ctx.obj);
    }

    @Override
    public AstNode visitPrimaryArray(AngularParser.PrimaryArrayContext ctx) {
        return visit(ctx.arr);
    }

    @Override
    public AstNode visitPrimaryArithmetic(AngularParser.PrimaryArithmeticContext ctx) {
        return visit(ctx.arith);
    }

    @Override
    public AstNode visitStringConcatenation(AngularParser.StringConcatenationContext ctx) {
        String leftStr = ctx.leftStr.getText();
        leftStr = leftStr.substring(1, leftStr.length() - 1);
        AstNode rightExpr = visit(ctx.rightExpr);
        return new StringConcatenation(leftStr, rightExpr);
    }

    @Override
    public AstNode visitIdentifierConcatenation(AngularParser.IdentifierConcatenationContext ctx) {
        String leftId = ctx.leftId.getText();
        AstNode rightExpr = visit(ctx.rightExpr);
        return new IdentifierConcatenation(leftId, rightExpr);
    }

    @Override
    public AstNode visitNestedAddition(AngularParser.NestedAdditionContext ctx) {
        AdditionExpression leftAdd = (AdditionExpression) visit(ctx.leftAdd);
        AstNode rightExpr = visit(ctx.rightExpr);
        return new NestedAddition(leftAdd, rightExpr);
    }
    @Override
    public AstNode visitStringLiteral(AngularParser.StringLiteralContext ctx) {
        StringLiteral stringLiteral = new StringLiteral();

        // تحديد نوع الاقتباس (عادي أو Template String)
        String openingQuote = ctx.LITERAL(0).getText();
        boolean isTemplate = openingQuote.equals("`");
        stringLiteral.setTemplateLiteral(isTemplate);

        // تجميع المحتوى مع معالجة Escape Sequences
        StringBuilder contentBuilder = new StringBuilder();
        for (TerminalNode node : ctx.literalContent()) {
            contentBuilder.append(processEscapes(node.getText()));
        }

        stringLiteral.setContent(contentBuilder.toString());
        return stringLiteral;
    }

    private String processEscapes(String raw) {
        return raw.replace("\\n", "\n")
                .replace("\\t", "\t")
                .replace("\\\"", "\"")
                .replace("\\\\", "\\");
    }

    @Override
    public AstNode visitTemplateSubstitutionContent(AngularParser.TemplateSubstitutionContentContext ctx) {
        TemplateSubstitutionContent content = new TemplateSubstitutionContent();
        content.setExpression(visit(ctx.templateSubstitution()));
        return content;
    }

    @Override
    public AstNode visitIdentifierContent(AngularParser.IdentifierContentContext ctx) {
        IdentifierContent content = new IdentifierContent();
        content.setIdentifier(ctx.IDENTIFIER().getText());
        return content;
    }

    @Override
    public AstNode visitArithmeticOperatorContent(AngularParser.ArithmeticOperatorContentContext ctx) {
        ArithmeticOperatorContent content = new ArithmeticOperatorContent();
        content.setArithmeticExpression(visit(ctx.arithmeticDeclaration()));
        return content;
    }

    @Override
    public AstNode visitLogicalOperatorContent(AngularParser.LogicalOperatorContentContext ctx) {
        LogicalOperatorContent content = new LogicalOperatorContent();
        content.setLogicalExpression(visit(ctx.logicOperations()));
        return content;
    }

    @Override
    public AstNode visitSymbolContent(AngularParser.SymbolContentContext ctx) {
        SymbolContent content = new SymbolContent();
        content.setSymbol(ctx.symbols().getText());
        return content;
    }

    @Override
    public AstNode visitNumberContent(AngularParser.NumberContentContext ctx) {
        NumberContent content = new NumberContent();
        content.setValue(Double.parseDouble(ctx.NUMBER().getText()));
        return content;
    }

    @Override
    public AstNode visitTemplateSubstitution(AngularParser.TemplateSubstitutionContext ctx) {
        TemplateSubstitution substitution = new TemplateSubstitution();
        substitution.setExpression(visit(ctx.expr)); // معالجة التعبير الداخلي
        return substitution;
    }

    @Override
    public AstNode visitPublicModifier(AngularParser.PublicModifierContext ctx) {
        return new PublicModifier();
    }

    @Override
    public AstNode visitPrivateModifier(AngularParser.PrivateModifierContext ctx) {
        return new PrivateModifier();
    }

    @Override
    public AstNode visitProtectedModifier(AngularParser.ProtectedModifierContext ctx) {
        return new ProtectedModifier();
    }

    @Override
    public AstNode visitComponentDef(AngularParser.ComponentDefContext ctx) {
        ComponentDef component = new ComponentDef();

        for (AngularParser.ComponentPropertyDefContext propCtx : ctx.props) {
            ComponentPropertyDef prop = (ComponentPropertyDef) visit(propCtx);
            component.addProperty(prop);
        }

        return component;
    }

    @Override
    public AstNode visitComponentPropertyDef(AngularParser.ComponentPropertyDefContext ctx) {
        ComponentPropertyDef prop = new ComponentPropertyDef();

        prop.setName(ctx.propertyName().getText());

        if (ctx.propertyValue() != null) {
            prop.setValue(visit(ctx.propertyValue()));
        }

        if (ctx.REQUIRED() != null) {
            prop.setRequired(true);
        }

        return prop;
    }


    @Override
    public AstNode visitComponentDef(AngularParser.ComponentDefContext ctx) {
        ComponentDef component = new ComponentDef();

        if (ctx.props != null) {
            for (AngularParser.ComponentPropertyDefContext propCtx : ctx.props) {
                AstNode property = visit(propCtx);
                if (property instanceof ComponentPropertyDef) {
                    component.addProperty((ComponentPropertyDef) property);
                }
            }
        }

        return component;
    }

    // =============== Property Visit Methods ===============

    @Override
    public AstNode visitSelectorProperty(AngularParser.SelectorPropertyContext ctx) {
        if (ctx.selectorDef() == null) return null;

        SelectorProperty prop = new SelectorProperty();
        prop.setSelector(cleanString(ctx.selectorDef().STRING_LITERAL()));
        return prop;
    }

    @Override
    public AstNode visitStandaloneProperty(AngularParser.StandalonePropertyContext ctx) {
        if (ctx.standaloneDef() == null) return null;

        StandaloneProperty prop = new StandaloneProperty();
        prop.setStandalone(ctx.standaloneDef().TRUE() != null);
        return prop;
    }

    @Override
    public AstNode visitImportsProperty(AngularParser.ImportsPropertyContext ctx) {
        if (ctx.importsDef() == null) return null;

        ImportsProperty prop = new ImportsProperty();
        List<String> imports = new ArrayList<>();

        for (TerminalNode str : ctx.importsDef().STRING_LITERAL()) {
            imports.add(cleanString(str));
        }

        prop.setImports(imports);
        return prop;
    }

    @Override
    public AstNode visitTemplateProperty(AngularParser.TemplatePropertyContext ctx) {
        if (ctx.templateDef() == null) return null;

        TemplateProperty prop = new TemplateProperty();
        prop.setTemplate(cleanTemplate(ctx.templateDef().TEMPLATE_STRING()));
        return prop;
    }

    @Override
    public AstNode visitTemplateUrlProperty(AngularParser.TemplateUrlPropertyContext ctx) {
        if (ctx.templateUrlDef() == null) return null;

        TemplateUrlProperty prop = new TemplateUrlProperty();
        prop.setTemplateUrl(cleanString(ctx.templateUrlDef().STRING_LITERAL()));
        return prop;
    }

    @Override
    public AstNode visitStylesProperty(AngularParser.StylesPropertyContext ctx) {
        if (ctx.stylesDef() == null) return null;

        StylesProperty prop = new StylesProperty();
        List<String> styles = new ArrayList<>();

        for (TerminalNode str : ctx.stylesDef().STRING_LITERAL()) {
            styles.add(cleanString(str));
        }

        prop.setStyles(styles);
        return prop;
    }

    @Override
    public AstNode visitStyleUrlsProperty(AngularParser.StyleUrlsPropertyContext ctx) {
        if (ctx.styleUrlsDef() == null) return null;

        StylesUrlProperty prop = new StylesUrlProperty();
        List<String> urls = new ArrayList<>();

        for (TerminalNode str : ctx.styleUrlsDef().STRING_LITERAL()) {
            urls.add(cleanString(str));
        }

        prop.setStyleUrls(urls);
        return prop;
    }

    @Override
    public AstNode visitComponentCustomProperty(AngularParser.ComponentCustomPropertyContext ctx) {
        if (ctx.prop == null) return null;

        CustomProperty prop = new CustomProperty();
        Map<String, Object> properties = new HashMap<>();

        String key = ctx.prop.IDENTIFIER().getText();
        Object value = parseValue(ctx.prop.value());

        properties.put(key, value);
        prop.setProperties(properties);
        return prop;
    }

    // =============== Helper Methods ===============

    private String cleanString(TerminalNode node) {
        return node != null ?
                node.getText().replaceAll("^['\"]|['\"]$", "") :
                "";
    }

    private String cleanTemplate(TerminalNode node) {
        return node != null ?
                node.getText().replaceAll("^`|`$", "") :
                "";
    }

    private Object parseValue(AngularParser.PropertyValueContext ctx) {
        if (ctx == null) return null;

        if (ctx.STRING_LITERAL() != null) {
            return cleanString(ctx.STRING_LITERAL());
        }
        else if (ctx.NUMBER() != null) {
            try {
                return Double.parseDouble(ctx.NUMBER().getText());
            } catch (NumberFormatException e) {
                return 0;
            }
        }
        else if (ctx.TRUE() != null) {
            return true;
        }
        else if (ctx.FALSE() != null) {
            return false;
        }
        else if (ctx.arrayValue() != null) {
            List<Object> list = new ArrayList<>();
            for (AngularParser.PropertyValueContext item : ctx.arrayValue().propertyValue()) {
                list.add(parseValue(item));
            }
            return list;
        }
        else if (ctx.objectValue() != null) {
            Map<String, Object> map = new HashMap<>();
            for (AngularParser.PropertyPairContext pair : ctx.objectValue().propertyPair()) {
                map.put(pair.IDENTIFIER().getText(), parseValue(pair.propertyValue()));
            }
            return map;
        }

        return null;
    }

    @Override
    public AstNode visitStandaloneDef(AngularParser.StandaloneDefContext ctx) {
        try {
            if (ctx.value == null) {
                throw new CompilationError("Missing boolean value for standalone", ctx);
            }

            boolean value = Boolean.parseBoolean(ctx.value.getText());
            return new StandaloneDef(value);
        } catch (Exception e) {
            throw new CompilationError("Invalid standalone definition: " + e.getMessage(), ctx);
        }
    }
    @Override
    public AstNode visitSelectorDef(AngularParser.SelectorDefContext ctx) {
        if (ctx.selector == null) {
            throw new CompilationError("Selector value is missing", ctx);
        }

        return new SelectorDef(ctx.selector.getText());
    }
    @Override
    public AstNode visitTemplateDef(AngularParser.TemplateDefContext ctx) {
        TemplateDef templateDef = new TemplateDef();

        templateDef.setStartLiteral(ctx.start.getText());
        templateDef.setContent(visit(ctx.content));
        templateDef.setEndLiteral(ctx.end.getText());

        return templateDef;
    }
    @Override
    public AstNode visitTemplateUrlDef(AngularParser.TemplateUrlDefContext ctx) {
        TemplateUrlDef templateUrlDef = new TemplateUrlDef();

        String path = ctx.path.getText();
        if (path.startsWith("\"") && path.endsWith("\"")) {
            path = path.substring(1, path.length() - 1);
        }

        templateUrlDef.setPath(path);
        return templateUrlDef;
    }
    @Override
    public AstNode visitStyleDef(AngularParser.StyleDefContext ctx) {
        StyleDef styleDef = new StyleDef();

        styleDef.setStartLiteral(cleanLiteral(ctx.start));
        styleDef.setEndLiteral(cleanLiteral(ctx.end));

        for (AngularParser.CssRuleContext ruleCtx : ctx.cssRule()) {
            styleDef.addCssRule(visit(ruleCtx));
        }

        return styleDef;
    }

    private String cleanLiteral(Token token) {
        String text = token.getText();
        return text.replaceAll("^`|`$", "");
    }

    @Override
    public AstNode visitStylesDef(AngularParser.StylesDefContext ctx) {
        StylesDef stylesDef = new StylesDef();
        if (ctx.styleDefs != null) {
            for (AngularParser.StyleDefContext styleCtx : ctx.styleDefs) {
                stylesDef.addStyleDef((StyleDef) visit(styleCtx));
            }
        }
        return stylesDef;
    }

    @Override
    public AstNode visitStyleUrlsDef(AngularParser.StyleUrlsDefContext ctx) {
        StyleUrlsDef styleUrlsDef = new StyleUrlsDef();
        if (ctx.urls != null) {
            for (Token urlToken : ctx.urls) {
                styleUrlsDef.addUrl(urlToken.getText());
            }
        }
        return styleUrlsDef;
    }
    @Override
    public AstNode visitComponentProperty(AngularParser.ComponentPropertyContext ctx) {
        ComponentProperty property = new ComponentProperty();

        property.setName(ctx.name.getText());
        property.setValue(visit(ctx.value));

        return property;
    }

    @Override
    public AstNode visitComponentStringValue(AngularParser.ComponentStringValueContext ctx) {
        return new ComponentStringValue(ctx.STRING().getText());
    }

    @Override
    public AstNode visitComponentBooleanValue(AngularParser.ComponentBooleanValueContext ctx) {
        return new ComponentBooleanValue(Boolean.parseBoolean(ctx.BOOLEAN().getText()));
    }

    @Override
    public AstNode visitComponentNumberValue(AngularParser.ComponentNumberValueContext ctx) {
        String numText = ctx.NUMBER().getText();
        return new ComponentNumberValue(
                numText.contains(".") ? Double.parseDouble(numText) : Integer.parseInt(numText)
        );
    }

    @Override
    public AstNode visitComponentObjectValue(AngularParser.ComponentObjectValueContext ctx) {
        ComponentObjectValue objValue = new ComponentObjectValue();
        for (AngularParser.ObjectPropertyContext propCtx : ctx.objectValue().objectProperty()) {
            objValue.addProperty(propCtx.IDENTIFIER().getText(), visit(propCtx.value()));
        }
        return objValue;
    }

    @Override
    public AstNode visitComponentArrayValue(AngularParser.ComponentArrayValueContext ctx) {
        ComponentArrayValue arrayValue = new ComponentArrayValue();
        for (AngularParser.ArrayElementContext elemCtx : ctx.arrayValues().arrayElement()) {
            arrayValue.addElement(visit(elemCtx.value()));
        }
        return arrayValue;
    }

}
