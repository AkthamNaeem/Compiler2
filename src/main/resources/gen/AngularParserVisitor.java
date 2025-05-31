// Generated from C:/Users/HP/Desktop/CompilerProject/src/main/resources/AngularParser.g4 by ANTLR 4.13.2
package main.resources.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(AngularParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstStatement(AngularParser.ConstStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStatement(AngularParser.VariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EnumStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumStatement(AngularParser.EnumStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatement(AngularParser.FunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(AngularParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionAssignStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionAssignStatement(AngularParser.FunctionAssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectFunctionStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectFunctionStatement(AngularParser.ObjectFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceStatement(AngularParser.InterfaceStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassStatement(AngularParser.ClassStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassObjectStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassObjectStatement(AngularParser.ClassObjectStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatement(AngularParser.FunctionCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModuleStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleStatement(AngularParser.ModuleStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentStatement(AngularParser.ComponentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ServiceStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceStatement(AngularParser.ServiceStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForLoopStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoopStatement(AngularParser.ForLoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForEachLoopStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachLoopStatement(AngularParser.ForEachLoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatementStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementStatement(AngularParser.IfStatementStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(AngularParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(AngularParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(AngularParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(AngularParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#doWhileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileLoop(AngularParser.DoWhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#forEachLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachLoop(AngularParser.ForEachLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockWithBraces}
	 * labeled alternative in {@link AngularParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockWithBraces(AngularParser.BlockWithBracesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleStatementBlock}
	 * labeled alternative in {@link AngularParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatementBlock(AngularParser.SingleStatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostfixUnaryOperation}
	 * labeled alternative in {@link AngularParser#arithmeticOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixUnaryOperation(AngularParser.PostfixUnaryOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrefixUnaryOperation}
	 * labeled alternative in {@link AngularParser#arithmeticOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixUnaryOperation(AngularParser.PrefixUnaryOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundAssignmentOperation}
	 * labeled alternative in {@link AngularParser#arithmeticOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundAssignmentOperation(AngularParser.CompoundAssignmentOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionAssignDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionAssignDeclaration(AngularParser.FunctionAssignDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classObjectDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassObjectDeclaration(AngularParser.ClassObjectDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableDeclarationWithinClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationWithinClass(AngularParser.VariableDeclarationWithinClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(AngularParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#enumVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumVariable(AngularParser.EnumVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionVariable(AngularParser.FunctionVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionDeclarationWithinClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarationWithinClass(AngularParser.FunctionDeclarationWithinClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#baseFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseFunctionDeclaration(AngularParser.BaseFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(AngularParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(AngularParser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#valueFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueFunctionDeclaration(AngularParser.ValueFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#returnDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnDeclaration(AngularParser.ReturnDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link AngularParser#logicOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(AngularParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link AngularParser#logicOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(AngularParser.GreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link AngularParser#logicOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(AngularParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrictEqual}
	 * labeled alternative in {@link AngularParser#logicOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrictEqual(AngularParser.StrictEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link AngularParser#logicOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqual(AngularParser.NotEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrictNotEqual}
	 * labeled alternative in {@link AngularParser#logicOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrictNotEqual(AngularParser.StrictNotEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link AngularParser#arithmeticDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(AngularParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link AngularParser#arithmeticDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(AngularParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link AngularParser#arithmeticDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(AngularParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link AngularParser#arithmeticDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(AngularParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Modulus}
	 * labeled alternative in {@link AngularParser#arithmeticDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulus(AngularParser.ModulusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LeftParen}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftParen(AngularParser.LeftParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RightParen}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightParen(AngularParser.RightParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LeftBracket}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftBracket(AngularParser.LeftBracketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RightBracket}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightBracket(AngularParser.RightBracketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Semicolon}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon(AngularParser.SemicolonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Colon}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColon(AngularParser.ColonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comma}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma(AngularParser.CommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Dot}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot(AngularParser.DotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QuestionMark}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionMark(AngularParser.QuestionMarkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtSymbol}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtSymbol(AngularParser.AtSymbolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOperator}
	 * labeled alternative in {@link AngularParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(AngularParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticOperatorChain}
	 * labeled alternative in {@link AngularParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperatorChain(AngularParser.ArithmeticOperatorChainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedOperator}
	 * labeled alternative in {@link AngularParser#operatorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedOperator(AngularParser.ParenthesizedOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleOperator}
	 * labeled alternative in {@link AngularParser#operatorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleOperator(AngularParser.SimpleOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfaceObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceObject(AngularParser.InterfaceObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassVariableDeclaration}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVariableDeclaration(AngularParser.ClassVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassMethodDeclaration}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMethodDeclaration(AngularParser.ClassMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassFunctionCall}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassFunctionCall(AngularParser.ClassFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDeclaration(AngularParser.ModuleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importModule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportModule(AngularParser.ImportModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSpecifier(AngularParser.ImportSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importsDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportsDef(AngularParser.ImportsDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportArray(AngularParser.ImportArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportItem(AngularParser.ImportItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BracketArrayType}
	 * labeled alternative in {@link AngularParser#arrayOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketArrayType(AngularParser.BracketArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GenericArrayType}
	 * labeled alternative in {@link AngularParser#arrayOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericArrayType(AngularParser.GenericArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#tupleOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleOptions(AngularParser.TupleOptionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberType}
	 * labeled alternative in {@link AngularParser#typeOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberType(AngularParser.NumberTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringType}
	 * labeled alternative in {@link AngularParser#typeOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringType(AngularParser.StringTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link AngularParser#typeOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(AngularParser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CustomType}
	 * labeled alternative in {@link AngularParser#typeOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomType(AngularParser.CustomTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleTypeOption}
	 * labeled alternative in {@link AngularParser#allOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeOption(AngularParser.SimpleTypeOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TupleTypeOption}
	 * labeled alternative in {@link AngularParser#allOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleTypeOption(AngularParser.TupleTypeOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayTypeOption}
	 * labeled alternative in {@link AngularParser#allOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTypeOption(AngularParser.ArrayTypeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValues(AngularParser.ArrayValuesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link AngularParser#valueOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValue(AngularParser.StringValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberValue}
	 * labeled alternative in {@link AngularParser#valueOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberValue(AngularParser.NumberValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanValue}
	 * labeled alternative in {@link AngularParser#valueOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(AngularParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierValue}
	 * labeled alternative in {@link AngularParser#valueOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierValue(AngularParser.IdentifierValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(AngularParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectValue(AngularParser.ObjectValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectFunction(AngularParser.ObjectFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AsAssertion}
	 * labeled alternative in {@link AngularParser#assertionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsAssertion(AngularParser.AsAssertionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GenericAssertion}
	 * labeled alternative in {@link AngularParser#assertionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAssertion(AngularParser.GenericAssertionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JsonValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonValue(AngularParser.JsonValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleValue(AngularParser.SimpleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectValueValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectValueValue(AngularParser.ObjectValueValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectFunctionValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectFunctionValue(AngularParser.ObjectFunctionValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValue(AngularParser.ArrayValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssertionValueValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertionValueValue(AngularParser.AssertionValueValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrowFunctionValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionValue(AngularParser.ArrowFunctionValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceValuesValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceValuesValue(AngularParser.InterfaceValuesValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionValue(AngularParser.ExpressionValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NullValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullValue(AngularParser.NullValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#assignValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignValue(AngularParser.AssignValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfaceValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceValues(AngularParser.InterfaceValuesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceProperty}
	 * labeled alternative in {@link AngularParser#interfaceValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceProperty(AngularParser.InterfacePropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceMethod}
	 * labeled alternative in {@link AngularParser#interfaceValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethod(AngularParser.InterfaceMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassValue(AngularParser.ClassValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#jsonDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonDef(AngularParser.JsonDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#jsonBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonBody(AngularParser.JsonBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteralExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralExpression(AngularParser.StringLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(AngularParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(AngularParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditionExpressionExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExpressionExpression(AngularParser.AdditionExpressionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(AngularParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpressionExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpressionExpression(AngularParser.ComparisonExpressionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(AngularParser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectValueExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectValueExpression(AngularParser.ObjectValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayValueExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValueExpression(AngularParser.ArrayValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(AngularParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(AngularParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(AngularParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryIdentifier}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryIdentifier(AngularParser.PrimaryIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryNumber}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNumber(AngularParser.PrimaryNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryString}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryString(AngularParser.PrimaryStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryParenthesized}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryParenthesized(AngularParser.PrimaryParenthesizedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryObject}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryObject(AngularParser.PrimaryObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryArray}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryArray(AngularParser.PrimaryArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryArithmetic}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryArithmetic(AngularParser.PrimaryArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NestedAddition}
	 * labeled alternative in {@link AngularParser#additionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedAddition(AngularParser.NestedAdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringConcatenation}
	 * labeled alternative in {@link AngularParser#additionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConcatenation(AngularParser.StringConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierConcatenation}
	 * labeled alternative in {@link AngularParser#additionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierConcatenation(AngularParser.IdentifierConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(AngularParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateSubstitutionContent}
	 * labeled alternative in {@link AngularParser#literalContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateSubstitutionContent(AngularParser.TemplateSubstitutionContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierContent}
	 * labeled alternative in {@link AngularParser#literalContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierContent(AngularParser.IdentifierContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticOperatorContent}
	 * labeled alternative in {@link AngularParser#literalContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperatorContent(AngularParser.ArithmeticOperatorContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOperatorContent}
	 * labeled alternative in {@link AngularParser#literalContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperatorContent(AngularParser.LogicalOperatorContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SymbolContent}
	 * labeled alternative in {@link AngularParser#literalContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolContent(AngularParser.SymbolContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberContent}
	 * labeled alternative in {@link AngularParser#literalContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberContent(AngularParser.NumberContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#templateSubstitution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateSubstitution(AngularParser.TemplateSubstitutionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PublicModifier}
	 * labeled alternative in {@link AngularParser#accessModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublicModifier(AngularParser.PublicModifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrivateModifier}
	 * labeled alternative in {@link AngularParser#accessModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivateModifier(AngularParser.PrivateModifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProtectedModifier}
	 * labeled alternative in {@link AngularParser#accessModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtectedModifier(AngularParser.ProtectedModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDef(AngularParser.ComponentDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectorProperty}
	 * labeled alternative in {@link AngularParser#componentPropertyDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorProperty(AngularParser.SelectorPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StandaloneProperty}
	 * labeled alternative in {@link AngularParser#componentPropertyDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneProperty(AngularParser.StandalonePropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportsProperty}
	 * labeled alternative in {@link AngularParser#componentPropertyDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportsProperty(AngularParser.ImportsPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateProperty}
	 * labeled alternative in {@link AngularParser#componentPropertyDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateProperty(AngularParser.TemplatePropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateUrlProperty}
	 * labeled alternative in {@link AngularParser#componentPropertyDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateUrlProperty(AngularParser.TemplateUrlPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StylesProperty}
	 * labeled alternative in {@link AngularParser#componentPropertyDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesProperty(AngularParser.StylesPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StyleUrlsProperty}
	 * labeled alternative in {@link AngularParser#componentPropertyDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleUrlsProperty(AngularParser.StyleUrlsPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentCustomProperty}
	 * labeled alternative in {@link AngularParser#componentPropertyDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentCustomProperty(AngularParser.ComponentCustomPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#standaloneDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneDef(AngularParser.StandaloneDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#selectorDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorDef(AngularParser.SelectorDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#templateDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateDef(AngularParser.TemplateDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#templateUrlDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateUrlDef(AngularParser.TemplateUrlDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#styleDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleDef(AngularParser.StyleDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#stylesDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesDef(AngularParser.StylesDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#styleUrlsDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleUrlsDef(AngularParser.StyleUrlsDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentProperty(AngularParser.ComponentPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentStringValue}
	 * labeled alternative in {@link AngularParser#componentPropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentStringValue(AngularParser.ComponentStringValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentBooleanValue}
	 * labeled alternative in {@link AngularParser#componentPropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentBooleanValue(AngularParser.ComponentBooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentNumberValue}
	 * labeled alternative in {@link AngularParser#componentPropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentNumberValue(AngularParser.ComponentNumberValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentObjectValue}
	 * labeled alternative in {@link AngularParser#componentPropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentObjectValue(AngularParser.ComponentObjectValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentArrayValue}
	 * labeled alternative in {@link AngularParser#componentPropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentArrayValue(AngularParser.ComponentArrayValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#serviceDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceDef(AngularParser.ServiceDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#serviceProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceProperty(AngularParser.ServicePropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ServiceStringValue}
	 * labeled alternative in {@link AngularParser#servicePropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceStringValue(AngularParser.ServiceStringValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ServiceBooleanValue}
	 * labeled alternative in {@link AngularParser#servicePropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceBooleanValue(AngularParser.ServiceBooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ServiceNumberValue}
	 * labeled alternative in {@link AngularParser#servicePropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceNumberValue(AngularParser.ServiceNumberValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ServiceIdentifierValue}
	 * labeled alternative in {@link AngularParser#servicePropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceIdentifierValue(AngularParser.ServiceIdentifierValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml(AngularParser.HtmlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StandardHtmlElement}
	 * labeled alternative in {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardHtmlElement(AngularParser.StandardHtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelfClosingHtmlElement}
	 * labeled alternative in {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingHtmlElement(AngularParser.SelfClosingHtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTag(AngularParser.HtmlTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#closingHtmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosingHtmlTag(AngularParser.ClosingHtmlTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(AngularParser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NgIfTemplate}
	 * labeled alternative in {@link AngularParser#htmlTemplateType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgIfTemplate(AngularParser.NgIfTemplateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NgForTemplate}
	 * labeled alternative in {@link AngularParser#htmlTemplateType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgForTemplate(AngularParser.NgForTemplateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EventBindingTemplate}
	 * labeled alternative in {@link AngularParser#htmlTemplateType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventBindingTemplate(AngularParser.EventBindingTemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlDataBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDataBinding(AngularParser.HtmlDataBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlTagData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTagData(AngularParser.HtmlTagDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArabicHtmlExpression}
	 * labeled alternative in {@link AngularParser#htmlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArabicHtmlExpression(AngularParser.ArabicHtmlExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierHtmlExpression}
	 * labeled alternative in {@link AngularParser#htmlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierHtmlExpression(AngularParser.IdentifierHtmlExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditionHtmlExpression}
	 * labeled alternative in {@link AngularParser#htmlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionHtmlExpression(AngularParser.AdditionHtmlExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedHtmlExpression}
	 * labeled alternative in {@link AngularParser#htmlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedHtmlExpression(AngularParser.ParenthesizedHtmlExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberHtmlExpression}
	 * labeled alternative in {@link AngularParser#htmlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberHtmlExpression(AngularParser.NumberHtmlExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DataBindingHtmlExpression}
	 * labeled alternative in {@link AngularParser#htmlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataBindingHtmlExpression(AngularParser.DataBindingHtmlExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#cssRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRule(AngularParser.CssRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#cssKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssKey(AngularParser.CssKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericCssValue}
	 * labeled alternative in {@link AngularParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericCssValue(AngularParser.NumericCssValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierCssValue}
	 * labeled alternative in {@link AngularParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierCssValue(AngularParser.IdentifierCssValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColorCssValue}
	 * labeled alternative in {@link AngularParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorCssValue(AngularParser.ColorCssValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#cssSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelector(AngularParser.CssSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#cssKeyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssKeyValue(AngularParser.CssKeyValueContext ctx);
}