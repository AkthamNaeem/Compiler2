// Generated from C:/Users/HP/Desktop/CompilerProject/src/main/resources/AngularParser.g4 by ANTLR 4.13.2
package main.resources.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(AngularParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(AngularParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterConstStatement(AngularParser.ConstStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitConstStatement(AngularParser.ConstStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(AngularParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(AngularParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnumStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEnumStatement(AngularParser.EnumStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEnumStatement(AngularParser.EnumStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatement(AngularParser.FunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatement(AngularParser.FunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(AngularParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(AngularParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionAssignStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionAssignStatement(AngularParser.FunctionAssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionAssignStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionAssignStatement(AngularParser.FunctionAssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectFunctionStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterObjectFunctionStatement(AngularParser.ObjectFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectFunctionStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitObjectFunctionStatement(AngularParser.ObjectFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterfaceStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceStatement(AngularParser.InterfaceStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterfaceStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceStatement(AngularParser.InterfaceStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClassStatement(AngularParser.ClassStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClassStatement(AngularParser.ClassStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassObjectStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClassObjectStatement(AngularParser.ClassObjectStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassObjectStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClassObjectStatement(AngularParser.ClassObjectStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement(AngularParser.FunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement(AngularParser.FunctionCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModuleStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterModuleStatement(AngularParser.ModuleStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModuleStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitModuleStatement(AngularParser.ModuleStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComponentStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterComponentStatement(AngularParser.ComponentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComponentStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitComponentStatement(AngularParser.ComponentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ServiceStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterServiceStatement(AngularParser.ServiceStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ServiceStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitServiceStatement(AngularParser.ServiceStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForLoopStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForLoopStatement(AngularParser.ForLoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForLoopStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForLoopStatement(AngularParser.ForLoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForEachLoopStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForEachLoopStatement(AngularParser.ForEachLoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForEachLoopStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForEachLoopStatement(AngularParser.ForEachLoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatementStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementStatement(AngularParser.IfStatementStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatementStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementStatement(AngularParser.IfStatementStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(AngularParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(AngularParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(AngularParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(AngularParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(AngularParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(AngularParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(AngularParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(AngularParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#doWhileLoop}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileLoop(AngularParser.DoWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#doWhileLoop}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileLoop(AngularParser.DoWhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#forEachLoop}.
	 * @param ctx the parse tree
	 */
	void enterForEachLoop(AngularParser.ForEachLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#forEachLoop}.
	 * @param ctx the parse tree
	 */
	void exitForEachLoop(AngularParser.ForEachLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockWithBraces}
	 * labeled alternative in {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockWithBraces(AngularParser.BlockWithBracesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockWithBraces}
	 * labeled alternative in {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockWithBraces(AngularParser.BlockWithBracesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleStatementBlock}
	 * labeled alternative in {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatementBlock(AngularParser.SingleStatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleStatementBlock}
	 * labeled alternative in {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatementBlock(AngularParser.SingleStatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostfixUnaryOperation}
	 * labeled alternative in {@link AngularParser#arithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void enterPostfixUnaryOperation(AngularParser.PostfixUnaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostfixUnaryOperation}
	 * labeled alternative in {@link AngularParser#arithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void exitPostfixUnaryOperation(AngularParser.PostfixUnaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrefixUnaryOperation}
	 * labeled alternative in {@link AngularParser#arithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void enterPrefixUnaryOperation(AngularParser.PrefixUnaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrefixUnaryOperation}
	 * labeled alternative in {@link AngularParser#arithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void exitPrefixUnaryOperation(AngularParser.PrefixUnaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundAssignmentOperation}
	 * labeled alternative in {@link AngularParser#arithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void enterCompoundAssignmentOperation(AngularParser.CompoundAssignmentOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundAssignmentOperation}
	 * labeled alternative in {@link AngularParser#arithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void exitCompoundAssignmentOperation(AngularParser.CompoundAssignmentOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionAssignDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionAssignDeclaration(AngularParser.FunctionAssignDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionAssignDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionAssignDeclaration(AngularParser.FunctionAssignDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classObjectDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassObjectDeclaration(AngularParser.ClassObjectDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classObjectDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassObjectDeclaration(AngularParser.ClassObjectDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableDeclarationWithinClass}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationWithinClass(AngularParser.VariableDeclarationWithinClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableDeclarationWithinClass}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationWithinClass(AngularParser.VariableDeclarationWithinClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(AngularParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(AngularParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#enumVariable}.
	 * @param ctx the parse tree
	 */
	void enterEnumVariable(AngularParser.EnumVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#enumVariable}.
	 * @param ctx the parse tree
	 */
	void exitEnumVariable(AngularParser.EnumVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionVariable}.
	 * @param ctx the parse tree
	 */
	void enterFunctionVariable(AngularParser.FunctionVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionVariable}.
	 * @param ctx the parse tree
	 */
	void exitFunctionVariable(AngularParser.FunctionVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionDeclarationWithinClass}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarationWithinClass(AngularParser.FunctionDeclarationWithinClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionDeclarationWithinClass}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarationWithinClass(AngularParser.FunctionDeclarationWithinClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#baseFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBaseFunctionDeclaration(AngularParser.BaseFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#baseFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBaseFunctionDeclaration(AngularParser.BaseFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(AngularParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(AngularParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(AngularParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(AngularParser.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#valueFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterValueFunctionDeclaration(AngularParser.ValueFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#valueFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitValueFunctionDeclaration(AngularParser.ValueFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#returnDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterReturnDeclaration(AngularParser.ReturnDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#returnDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitReturnDeclaration(AngularParser.ReturnDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link AngularParser#logicOperations}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(AngularParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link AngularParser#logicOperations}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(AngularParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link AngularParser#logicOperations}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(AngularParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link AngularParser#logicOperations}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(AngularParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link AngularParser#logicOperations}.
	 * @param ctx the parse tree
	 */
	void enterEqual(AngularParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link AngularParser#logicOperations}.
	 * @param ctx the parse tree
	 */
	void exitEqual(AngularParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrictEqual}
	 * labeled alternative in {@link AngularParser#logicOperations}.
	 * @param ctx the parse tree
	 */
	void enterStrictEqual(AngularParser.StrictEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrictEqual}
	 * labeled alternative in {@link AngularParser#logicOperations}.
	 * @param ctx the parse tree
	 */
	void exitStrictEqual(AngularParser.StrictEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link AngularParser#logicOperations}.
	 * @param ctx the parse tree
	 */
	void enterNotEqual(AngularParser.NotEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link AngularParser#logicOperations}.
	 * @param ctx the parse tree
	 */
	void exitNotEqual(AngularParser.NotEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrictNotEqual}
	 * labeled alternative in {@link AngularParser#logicOperations}.
	 * @param ctx the parse tree
	 */
	void enterStrictNotEqual(AngularParser.StrictNotEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrictNotEqual}
	 * labeled alternative in {@link AngularParser#logicOperations}.
	 * @param ctx the parse tree
	 */
	void exitStrictNotEqual(AngularParser.StrictNotEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link AngularParser#arithmeticDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAddition(AngularParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link AngularParser#arithmeticDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAddition(AngularParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link AngularParser#arithmeticDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(AngularParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link AngularParser#arithmeticDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(AngularParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link AngularParser#arithmeticDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(AngularParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link AngularParser#arithmeticDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(AngularParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link AngularParser#arithmeticDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDivision(AngularParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link AngularParser#arithmeticDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDivision(AngularParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Modulus}
	 * labeled alternative in {@link AngularParser#arithmeticDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModulus(AngularParser.ModulusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Modulus}
	 * labeled alternative in {@link AngularParser#arithmeticDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModulus(AngularParser.ModulusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LeftParen}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 */
	void enterLeftParen(AngularParser.LeftParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LeftParen}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 */
	void exitLeftParen(AngularParser.LeftParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RightParen}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 */
	void enterRightParen(AngularParser.RightParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RightParen}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 */
	void exitRightParen(AngularParser.RightParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LeftBracket}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 */
	void enterLeftBracket(AngularParser.LeftBracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LeftBracket}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 */
	void exitLeftBracket(AngularParser.LeftBracketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RightBracket}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 */
	void enterRightBracket(AngularParser.RightBracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RightBracket}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 */
	void exitRightBracket(AngularParser.RightBracketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Semicolon}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon(AngularParser.SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Semicolon}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon(AngularParser.SemicolonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Colon}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 */
	void enterColon(AngularParser.ColonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Colon}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 */
	void exitColon(AngularParser.ColonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comma}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 */
	void enterComma(AngularParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comma}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 */
	void exitComma(AngularParser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Dot}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 */
	void enterDot(AngularParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Dot}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 */
	void exitDot(AngularParser.DotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code QuestionMark}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 */
	void enterQuestionMark(AngularParser.QuestionMarkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QuestionMark}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 */
	void exitQuestionMark(AngularParser.QuestionMarkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtSymbol}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 */
	void enterAtSymbol(AngularParser.AtSymbolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtSymbol}
	 * labeled alternative in {@link AngularParser#symbols}.
	 * @param ctx the parse tree
	 */
	void exitAtSymbol(AngularParser.AtSymbolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOperator}
	 * labeled alternative in {@link AngularParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(AngularParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOperator}
	 * labeled alternative in {@link AngularParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(AngularParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticOperatorChain}
	 * labeled alternative in {@link AngularParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperatorChain(AngularParser.ArithmeticOperatorChainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticOperatorChain}
	 * labeled alternative in {@link AngularParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperatorChain(AngularParser.ArithmeticOperatorChainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedOperator}
	 * labeled alternative in {@link AngularParser#operatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedOperator(AngularParser.ParenthesizedOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedOperator}
	 * labeled alternative in {@link AngularParser#operatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedOperator(AngularParser.ParenthesizedOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleOperator}
	 * labeled alternative in {@link AngularParser#operatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleOperator(AngularParser.SimpleOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleOperator}
	 * labeled alternative in {@link AngularParser#operatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleOperator(AngularParser.SimpleOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceObject}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceObject(AngularParser.InterfaceObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceObject}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceObject(AngularParser.InterfaceObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassVariableDeclaration}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassVariableDeclaration(AngularParser.ClassVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassVariableDeclaration}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassVariableDeclaration(AngularParser.ClassVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassMethodDeclaration}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassMethodDeclaration(AngularParser.ClassMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassMethodDeclaration}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassMethodDeclaration(AngularParser.ClassMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassFunctionCall}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassFunctionCall(AngularParser.ClassFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassFunctionCall}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassFunctionCall(AngularParser.ClassFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclaration(AngularParser.ModuleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclaration(AngularParser.ModuleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importModule}.
	 * @param ctx the parse tree
	 */
	void enterImportModule(AngularParser.ImportModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importModule}.
	 * @param ctx the parse tree
	 */
	void exitImportModule(AngularParser.ImportModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterImportSpecifier(AngularParser.ImportSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitImportSpecifier(AngularParser.ImportSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importsDef}.
	 * @param ctx the parse tree
	 */
	void enterImportsDef(AngularParser.ImportsDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importsDef}.
	 * @param ctx the parse tree
	 */
	void exitImportsDef(AngularParser.ImportsDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importArray}.
	 * @param ctx the parse tree
	 */
	void enterImportArray(AngularParser.ImportArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importArray}.
	 * @param ctx the parse tree
	 */
	void exitImportArray(AngularParser.ImportArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importItem}.
	 * @param ctx the parse tree
	 */
	void enterImportItem(AngularParser.ImportItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importItem}.
	 * @param ctx the parse tree
	 */
	void exitImportItem(AngularParser.ImportItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BracketArrayType}
	 * labeled alternative in {@link AngularParser#arrayOptions}.
	 * @param ctx the parse tree
	 */
	void enterBracketArrayType(AngularParser.BracketArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracketArrayType}
	 * labeled alternative in {@link AngularParser#arrayOptions}.
	 * @param ctx the parse tree
	 */
	void exitBracketArrayType(AngularParser.BracketArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenericArrayType}
	 * labeled alternative in {@link AngularParser#arrayOptions}.
	 * @param ctx the parse tree
	 */
	void enterGenericArrayType(AngularParser.GenericArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenericArrayType}
	 * labeled alternative in {@link AngularParser#arrayOptions}.
	 * @param ctx the parse tree
	 */
	void exitGenericArrayType(AngularParser.GenericArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#tupleOptions}.
	 * @param ctx the parse tree
	 */
	void enterTupleOptions(AngularParser.TupleOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#tupleOptions}.
	 * @param ctx the parse tree
	 */
	void exitTupleOptions(AngularParser.TupleOptionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberType}
	 * labeled alternative in {@link AngularParser#typeOptions}.
	 * @param ctx the parse tree
	 */
	void enterNumberType(AngularParser.NumberTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberType}
	 * labeled alternative in {@link AngularParser#typeOptions}.
	 * @param ctx the parse tree
	 */
	void exitNumberType(AngularParser.NumberTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringType}
	 * labeled alternative in {@link AngularParser#typeOptions}.
	 * @param ctx the parse tree
	 */
	void enterStringType(AngularParser.StringTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringType}
	 * labeled alternative in {@link AngularParser#typeOptions}.
	 * @param ctx the parse tree
	 */
	void exitStringType(AngularParser.StringTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link AngularParser#typeOptions}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(AngularParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link AngularParser#typeOptions}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(AngularParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CustomType}
	 * labeled alternative in {@link AngularParser#typeOptions}.
	 * @param ctx the parse tree
	 */
	void enterCustomType(AngularParser.CustomTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CustomType}
	 * labeled alternative in {@link AngularParser#typeOptions}.
	 * @param ctx the parse tree
	 */
	void exitCustomType(AngularParser.CustomTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleTypeOption}
	 * labeled alternative in {@link AngularParser#allOptions}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeOption(AngularParser.SimpleTypeOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleTypeOption}
	 * labeled alternative in {@link AngularParser#allOptions}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeOption(AngularParser.SimpleTypeOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleTypeOption}
	 * labeled alternative in {@link AngularParser#allOptions}.
	 * @param ctx the parse tree
	 */
	void enterTupleTypeOption(AngularParser.TupleTypeOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleTypeOption}
	 * labeled alternative in {@link AngularParser#allOptions}.
	 * @param ctx the parse tree
	 */
	void exitTupleTypeOption(AngularParser.TupleTypeOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayTypeOption}
	 * labeled alternative in {@link AngularParser#allOptions}.
	 * @param ctx the parse tree
	 */
	void enterArrayTypeOption(AngularParser.ArrayTypeOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayTypeOption}
	 * labeled alternative in {@link AngularParser#allOptions}.
	 * @param ctx the parse tree
	 */
	void exitArrayTypeOption(AngularParser.ArrayTypeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayValues}.
	 * @param ctx the parse tree
	 */
	void enterArrayValues(AngularParser.ArrayValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayValues}.
	 * @param ctx the parse tree
	 */
	void exitArrayValues(AngularParser.ArrayValuesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link AngularParser#valueOptions}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(AngularParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link AngularParser#valueOptions}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(AngularParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberValue}
	 * labeled alternative in {@link AngularParser#valueOptions}.
	 * @param ctx the parse tree
	 */
	void enterNumberValue(AngularParser.NumberValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberValue}
	 * labeled alternative in {@link AngularParser#valueOptions}.
	 * @param ctx the parse tree
	 */
	void exitNumberValue(AngularParser.NumberValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanValue}
	 * labeled alternative in {@link AngularParser#valueOptions}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(AngularParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanValue}
	 * labeled alternative in {@link AngularParser#valueOptions}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(AngularParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierValue}
	 * labeled alternative in {@link AngularParser#valueOptions}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierValue(AngularParser.IdentifierValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierValue}
	 * labeled alternative in {@link AngularParser#valueOptions}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierValue(AngularParser.IdentifierValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(AngularParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(AngularParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectValue}.
	 * @param ctx the parse tree
	 */
	void enterObjectValue(AngularParser.ObjectValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectValue}.
	 * @param ctx the parse tree
	 */
	void exitObjectValue(AngularParser.ObjectValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectFunction}.
	 * @param ctx the parse tree
	 */
	void enterObjectFunction(AngularParser.ObjectFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectFunction}.
	 * @param ctx the parse tree
	 */
	void exitObjectFunction(AngularParser.ObjectFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AsAssertion}
	 * labeled alternative in {@link AngularParser#assertionValue}.
	 * @param ctx the parse tree
	 */
	void enterAsAssertion(AngularParser.AsAssertionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AsAssertion}
	 * labeled alternative in {@link AngularParser#assertionValue}.
	 * @param ctx the parse tree
	 */
	void exitAsAssertion(AngularParser.AsAssertionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenericAssertion}
	 * labeled alternative in {@link AngularParser#assertionValue}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssertion(AngularParser.GenericAssertionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenericAssertion}
	 * labeled alternative in {@link AngularParser#assertionValue}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssertion(AngularParser.GenericAssertionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JsonValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 */
	void enterJsonValue(AngularParser.JsonValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JsonValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 */
	void exitJsonValue(AngularParser.JsonValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 */
	void enterSimpleValue(AngularParser.SimpleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 */
	void exitSimpleValue(AngularParser.SimpleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectValueValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 */
	void enterObjectValueValue(AngularParser.ObjectValueValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectValueValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 */
	void exitObjectValueValue(AngularParser.ObjectValueValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectFunctionValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 */
	void enterObjectFunctionValue(AngularParser.ObjectFunctionValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectFunctionValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 */
	void exitObjectFunctionValue(AngularParser.ObjectFunctionValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 */
	void enterArrayValue(AngularParser.ArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 */
	void exitArrayValue(AngularParser.ArrayValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssertionValueValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 */
	void enterAssertionValueValue(AngularParser.AssertionValueValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssertionValueValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 */
	void exitAssertionValueValue(AngularParser.AssertionValueValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowFunctionValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionValue(AngularParser.ArrowFunctionValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowFunctionValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionValue(AngularParser.ArrowFunctionValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterfaceValuesValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceValuesValue(AngularParser.InterfaceValuesValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterfaceValuesValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceValuesValue(AngularParser.InterfaceValuesValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 */
	void enterExpressionValue(AngularParser.ExpressionValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 */
	void exitExpressionValue(AngularParser.ExpressionValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 */
	void enterNullValue(AngularParser.NullValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullValue}
	 * labeled alternative in {@link AngularParser#allValues}.
	 * @param ctx the parse tree
	 */
	void exitNullValue(AngularParser.NullValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#assignValue}.
	 * @param ctx the parse tree
	 */
	void enterAssignValue(AngularParser.AssignValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#assignValue}.
	 * @param ctx the parse tree
	 */
	void exitAssignValue(AngularParser.AssignValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceValues}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceValues(AngularParser.InterfaceValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceValues}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceValues(AngularParser.InterfaceValuesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterfaceProperty}
	 * labeled alternative in {@link AngularParser#interfaceValue}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceProperty(AngularParser.InterfacePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterfaceProperty}
	 * labeled alternative in {@link AngularParser#interfaceValue}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceProperty(AngularParser.InterfacePropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterfaceMethod}
	 * labeled alternative in {@link AngularParser#interfaceValue}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethod(AngularParser.InterfaceMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterfaceMethod}
	 * labeled alternative in {@link AngularParser#interfaceValue}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethod(AngularParser.InterfaceMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classValue}.
	 * @param ctx the parse tree
	 */
	void enterClassValue(AngularParser.ClassValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classValue}.
	 * @param ctx the parse tree
	 */
	void exitClassValue(AngularParser.ClassValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#jsonDef}.
	 * @param ctx the parse tree
	 */
	void enterJsonDef(AngularParser.JsonDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#jsonDef}.
	 * @param ctx the parse tree
	 */
	void exitJsonDef(AngularParser.JsonDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#jsonBody}.
	 * @param ctx the parse tree
	 */
	void enterJsonBody(AngularParser.JsonBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#jsonBody}.
	 * @param ctx the parse tree
	 */
	void exitJsonBody(AngularParser.JsonBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteralExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralExpression(AngularParser.StringLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteralExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralExpression(AngularParser.StringLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(AngularParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(AngularParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(AngularParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(AngularParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditionExpressionExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpressionExpression(AngularParser.AdditionExpressionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditionExpressionExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpressionExpression(AngularParser.AdditionExpressionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(AngularParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(AngularParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpressionExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionExpression(AngularParser.ComparisonExpressionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpressionExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionExpression(AngularParser.ComparisonExpressionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(AngularParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(AngularParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectValueExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectValueExpression(AngularParser.ObjectValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectValueExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectValueExpression(AngularParser.ObjectValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayValueExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayValueExpression(AngularParser.ArrayValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayValueExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayValueExpression(AngularParser.ArrayValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(AngularParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(AngularParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(AngularParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(AngularParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(AngularParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(AngularParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryIdentifier}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryIdentifier(AngularParser.PrimaryIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryIdentifier}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryIdentifier(AngularParser.PrimaryIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryNumber}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNumber(AngularParser.PrimaryNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryNumber}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNumber(AngularParser.PrimaryNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryString}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryString(AngularParser.PrimaryStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryString}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryString(AngularParser.PrimaryStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryParenthesized}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryParenthesized(AngularParser.PrimaryParenthesizedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryParenthesized}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryParenthesized(AngularParser.PrimaryParenthesizedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryObject}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryObject(AngularParser.PrimaryObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryObject}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryObject(AngularParser.PrimaryObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryArray}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryArray(AngularParser.PrimaryArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryArray}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryArray(AngularParser.PrimaryArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryArithmetic}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryArithmetic(AngularParser.PrimaryArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryArithmetic}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryArithmetic(AngularParser.PrimaryArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NestedAddition}
	 * labeled alternative in {@link AngularParser#additionExpression}.
	 * @param ctx the parse tree
	 */
	void enterNestedAddition(AngularParser.NestedAdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NestedAddition}
	 * labeled alternative in {@link AngularParser#additionExpression}.
	 * @param ctx the parse tree
	 */
	void exitNestedAddition(AngularParser.NestedAdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringConcatenation}
	 * labeled alternative in {@link AngularParser#additionExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringConcatenation(AngularParser.StringConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringConcatenation}
	 * labeled alternative in {@link AngularParser#additionExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringConcatenation(AngularParser.StringConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierConcatenation}
	 * labeled alternative in {@link AngularParser#additionExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierConcatenation(AngularParser.IdentifierConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierConcatenation}
	 * labeled alternative in {@link AngularParser#additionExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierConcatenation(AngularParser.IdentifierConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(AngularParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(AngularParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateSubstitutionContent}
	 * labeled alternative in {@link AngularParser#literalContent}.
	 * @param ctx the parse tree
	 */
	void enterTemplateSubstitutionContent(AngularParser.TemplateSubstitutionContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateSubstitutionContent}
	 * labeled alternative in {@link AngularParser#literalContent}.
	 * @param ctx the parse tree
	 */
	void exitTemplateSubstitutionContent(AngularParser.TemplateSubstitutionContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierContent}
	 * labeled alternative in {@link AngularParser#literalContent}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierContent(AngularParser.IdentifierContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierContent}
	 * labeled alternative in {@link AngularParser#literalContent}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierContent(AngularParser.IdentifierContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticOperatorContent}
	 * labeled alternative in {@link AngularParser#literalContent}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperatorContent(AngularParser.ArithmeticOperatorContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticOperatorContent}
	 * labeled alternative in {@link AngularParser#literalContent}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperatorContent(AngularParser.ArithmeticOperatorContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOperatorContent}
	 * labeled alternative in {@link AngularParser#literalContent}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperatorContent(AngularParser.LogicalOperatorContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOperatorContent}
	 * labeled alternative in {@link AngularParser#literalContent}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperatorContent(AngularParser.LogicalOperatorContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SymbolContent}
	 * labeled alternative in {@link AngularParser#literalContent}.
	 * @param ctx the parse tree
	 */
	void enterSymbolContent(AngularParser.SymbolContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SymbolContent}
	 * labeled alternative in {@link AngularParser#literalContent}.
	 * @param ctx the parse tree
	 */
	void exitSymbolContent(AngularParser.SymbolContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberContent}
	 * labeled alternative in {@link AngularParser#literalContent}.
	 * @param ctx the parse tree
	 */
	void enterNumberContent(AngularParser.NumberContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberContent}
	 * labeled alternative in {@link AngularParser#literalContent}.
	 * @param ctx the parse tree
	 */
	void exitNumberContent(AngularParser.NumberContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#templateSubstitution}.
	 * @param ctx the parse tree
	 */
	void enterTemplateSubstitution(AngularParser.TemplateSubstitutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#templateSubstitution}.
	 * @param ctx the parse tree
	 */
	void exitTemplateSubstitution(AngularParser.TemplateSubstitutionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PublicModifier}
	 * labeled alternative in {@link AngularParser#accessModifiers}.
	 * @param ctx the parse tree
	 */
	void enterPublicModifier(AngularParser.PublicModifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PublicModifier}
	 * labeled alternative in {@link AngularParser#accessModifiers}.
	 * @param ctx the parse tree
	 */
	void exitPublicModifier(AngularParser.PublicModifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrivateModifier}
	 * labeled alternative in {@link AngularParser#accessModifiers}.
	 * @param ctx the parse tree
	 */
	void enterPrivateModifier(AngularParser.PrivateModifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrivateModifier}
	 * labeled alternative in {@link AngularParser#accessModifiers}.
	 * @param ctx the parse tree
	 */
	void exitPrivateModifier(AngularParser.PrivateModifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProtectedModifier}
	 * labeled alternative in {@link AngularParser#accessModifiers}.
	 * @param ctx the parse tree
	 */
	void enterProtectedModifier(AngularParser.ProtectedModifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProtectedModifier}
	 * labeled alternative in {@link AngularParser#accessModifiers}.
	 * @param ctx the parse tree
	 */
	void exitProtectedModifier(AngularParser.ProtectedModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentDef}.
	 * @param ctx the parse tree
	 */
	void enterComponentDef(AngularParser.ComponentDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentDef}.
	 * @param ctx the parse tree
	 */
	void exitComponentDef(AngularParser.ComponentDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectorProperty}
	 * labeled alternative in {@link AngularParser#componentPropertyDef}.
	 * @param ctx the parse tree
	 */
	void enterSelectorProperty(AngularParser.SelectorPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectorProperty}
	 * labeled alternative in {@link AngularParser#componentPropertyDef}.
	 * @param ctx the parse tree
	 */
	void exitSelectorProperty(AngularParser.SelectorPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StandaloneProperty}
	 * labeled alternative in {@link AngularParser#componentPropertyDef}.
	 * @param ctx the parse tree
	 */
	void enterStandaloneProperty(AngularParser.StandalonePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StandaloneProperty}
	 * labeled alternative in {@link AngularParser#componentPropertyDef}.
	 * @param ctx the parse tree
	 */
	void exitStandaloneProperty(AngularParser.StandalonePropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportsProperty}
	 * labeled alternative in {@link AngularParser#componentPropertyDef}.
	 * @param ctx the parse tree
	 */
	void enterImportsProperty(AngularParser.ImportsPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportsProperty}
	 * labeled alternative in {@link AngularParser#componentPropertyDef}.
	 * @param ctx the parse tree
	 */
	void exitImportsProperty(AngularParser.ImportsPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateProperty}
	 * labeled alternative in {@link AngularParser#componentPropertyDef}.
	 * @param ctx the parse tree
	 */
	void enterTemplateProperty(AngularParser.TemplatePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateProperty}
	 * labeled alternative in {@link AngularParser#componentPropertyDef}.
	 * @param ctx the parse tree
	 */
	void exitTemplateProperty(AngularParser.TemplatePropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateUrlProperty}
	 * labeled alternative in {@link AngularParser#componentPropertyDef}.
	 * @param ctx the parse tree
	 */
	void enterTemplateUrlProperty(AngularParser.TemplateUrlPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateUrlProperty}
	 * labeled alternative in {@link AngularParser#componentPropertyDef}.
	 * @param ctx the parse tree
	 */
	void exitTemplateUrlProperty(AngularParser.TemplateUrlPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StylesProperty}
	 * labeled alternative in {@link AngularParser#componentPropertyDef}.
	 * @param ctx the parse tree
	 */
	void enterStylesProperty(AngularParser.StylesPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StylesProperty}
	 * labeled alternative in {@link AngularParser#componentPropertyDef}.
	 * @param ctx the parse tree
	 */
	void exitStylesProperty(AngularParser.StylesPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StyleUrlsProperty}
	 * labeled alternative in {@link AngularParser#componentPropertyDef}.
	 * @param ctx the parse tree
	 */
	void enterStyleUrlsProperty(AngularParser.StyleUrlsPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StyleUrlsProperty}
	 * labeled alternative in {@link AngularParser#componentPropertyDef}.
	 * @param ctx the parse tree
	 */
	void exitStyleUrlsProperty(AngularParser.StyleUrlsPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComponentCustomProperty}
	 * labeled alternative in {@link AngularParser#componentPropertyDef}.
	 * @param ctx the parse tree
	 */
	void enterComponentCustomProperty(AngularParser.ComponentCustomPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComponentCustomProperty}
	 * labeled alternative in {@link AngularParser#componentPropertyDef}.
	 * @param ctx the parse tree
	 */
	void exitComponentCustomProperty(AngularParser.ComponentCustomPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#standaloneDef}.
	 * @param ctx the parse tree
	 */
	void enterStandaloneDef(AngularParser.StandaloneDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#standaloneDef}.
	 * @param ctx the parse tree
	 */
	void exitStandaloneDef(AngularParser.StandaloneDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#selectorDef}.
	 * @param ctx the parse tree
	 */
	void enterSelectorDef(AngularParser.SelectorDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#selectorDef}.
	 * @param ctx the parse tree
	 */
	void exitSelectorDef(AngularParser.SelectorDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#templateDef}.
	 * @param ctx the parse tree
	 */
	void enterTemplateDef(AngularParser.TemplateDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#templateDef}.
	 * @param ctx the parse tree
	 */
	void exitTemplateDef(AngularParser.TemplateDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#templateUrlDef}.
	 * @param ctx the parse tree
	 */
	void enterTemplateUrlDef(AngularParser.TemplateUrlDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#templateUrlDef}.
	 * @param ctx the parse tree
	 */
	void exitTemplateUrlDef(AngularParser.TemplateUrlDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#styleDef}.
	 * @param ctx the parse tree
	 */
	void enterStyleDef(AngularParser.StyleDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#styleDef}.
	 * @param ctx the parse tree
	 */
	void exitStyleDef(AngularParser.StyleDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#stylesDef}.
	 * @param ctx the parse tree
	 */
	void enterStylesDef(AngularParser.StylesDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#stylesDef}.
	 * @param ctx the parse tree
	 */
	void exitStylesDef(AngularParser.StylesDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#styleUrlsDef}.
	 * @param ctx the parse tree
	 */
	void enterStyleUrlsDef(AngularParser.StyleUrlsDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#styleUrlsDef}.
	 * @param ctx the parse tree
	 */
	void exitStyleUrlsDef(AngularParser.StyleUrlsDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterComponentProperty(AngularParser.ComponentPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitComponentProperty(AngularParser.ComponentPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComponentStringValue}
	 * labeled alternative in {@link AngularParser#componentPropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterComponentStringValue(AngularParser.ComponentStringValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComponentStringValue}
	 * labeled alternative in {@link AngularParser#componentPropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitComponentStringValue(AngularParser.ComponentStringValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComponentBooleanValue}
	 * labeled alternative in {@link AngularParser#componentPropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterComponentBooleanValue(AngularParser.ComponentBooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComponentBooleanValue}
	 * labeled alternative in {@link AngularParser#componentPropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitComponentBooleanValue(AngularParser.ComponentBooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComponentNumberValue}
	 * labeled alternative in {@link AngularParser#componentPropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterComponentNumberValue(AngularParser.ComponentNumberValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComponentNumberValue}
	 * labeled alternative in {@link AngularParser#componentPropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitComponentNumberValue(AngularParser.ComponentNumberValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComponentObjectValue}
	 * labeled alternative in {@link AngularParser#componentPropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterComponentObjectValue(AngularParser.ComponentObjectValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComponentObjectValue}
	 * labeled alternative in {@link AngularParser#componentPropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitComponentObjectValue(AngularParser.ComponentObjectValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComponentArrayValue}
	 * labeled alternative in {@link AngularParser#componentPropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterComponentArrayValue(AngularParser.ComponentArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComponentArrayValue}
	 * labeled alternative in {@link AngularParser#componentPropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitComponentArrayValue(AngularParser.ComponentArrayValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#serviceDef}.
	 * @param ctx the parse tree
	 */
	void enterServiceDef(AngularParser.ServiceDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#serviceDef}.
	 * @param ctx the parse tree
	 */
	void exitServiceDef(AngularParser.ServiceDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#serviceProperty}.
	 * @param ctx the parse tree
	 */
	void enterServiceProperty(AngularParser.ServicePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#serviceProperty}.
	 * @param ctx the parse tree
	 */
	void exitServiceProperty(AngularParser.ServicePropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ServiceStringValue}
	 * labeled alternative in {@link AngularParser#servicePropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterServiceStringValue(AngularParser.ServiceStringValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ServiceStringValue}
	 * labeled alternative in {@link AngularParser#servicePropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitServiceStringValue(AngularParser.ServiceStringValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ServiceBooleanValue}
	 * labeled alternative in {@link AngularParser#servicePropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterServiceBooleanValue(AngularParser.ServiceBooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ServiceBooleanValue}
	 * labeled alternative in {@link AngularParser#servicePropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitServiceBooleanValue(AngularParser.ServiceBooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ServiceNumberValue}
	 * labeled alternative in {@link AngularParser#servicePropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterServiceNumberValue(AngularParser.ServiceNumberValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ServiceNumberValue}
	 * labeled alternative in {@link AngularParser#servicePropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitServiceNumberValue(AngularParser.ServiceNumberValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ServiceIdentifierValue}
	 * labeled alternative in {@link AngularParser#servicePropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterServiceIdentifierValue(AngularParser.ServiceIdentifierValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ServiceIdentifierValue}
	 * labeled alternative in {@link AngularParser#servicePropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitServiceIdentifierValue(AngularParser.ServiceIdentifierValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtml(AngularParser.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtml(AngularParser.HtmlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StandardHtmlElement}
	 * labeled alternative in {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterStandardHtmlElement(AngularParser.StandardHtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StandardHtmlElement}
	 * labeled alternative in {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitStandardHtmlElement(AngularParser.StandardHtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelfClosingHtmlElement}
	 * labeled alternative in {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingHtmlElement(AngularParser.SelfClosingHtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelfClosingHtmlElement}
	 * labeled alternative in {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingHtmlElement(AngularParser.SelfClosingHtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTag(AngularParser.HtmlTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTag(AngularParser.HtmlTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#closingHtmlTag}.
	 * @param ctx the parse tree
	 */
	void enterClosingHtmlTag(AngularParser.ClosingHtmlTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#closingHtmlTag}.
	 * @param ctx the parse tree
	 */
	void exitClosingHtmlTag(AngularParser.ClosingHtmlTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(AngularParser.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(AngularParser.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NgIfTemplate}
	 * labeled alternative in {@link AngularParser#htmlTemplateType}.
	 * @param ctx the parse tree
	 */
	void enterNgIfTemplate(AngularParser.NgIfTemplateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NgIfTemplate}
	 * labeled alternative in {@link AngularParser#htmlTemplateType}.
	 * @param ctx the parse tree
	 */
	void exitNgIfTemplate(AngularParser.NgIfTemplateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NgForTemplate}
	 * labeled alternative in {@link AngularParser#htmlTemplateType}.
	 * @param ctx the parse tree
	 */
	void enterNgForTemplate(AngularParser.NgForTemplateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NgForTemplate}
	 * labeled alternative in {@link AngularParser#htmlTemplateType}.
	 * @param ctx the parse tree
	 */
	void exitNgForTemplate(AngularParser.NgForTemplateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EventBindingTemplate}
	 * labeled alternative in {@link AngularParser#htmlTemplateType}.
	 * @param ctx the parse tree
	 */
	void enterEventBindingTemplate(AngularParser.EventBindingTemplateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EventBindingTemplate}
	 * labeled alternative in {@link AngularParser#htmlTemplateType}.
	 * @param ctx the parse tree
	 */
	void exitEventBindingTemplate(AngularParser.EventBindingTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlDataBinding}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDataBinding(AngularParser.HtmlDataBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlDataBinding}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDataBinding(AngularParser.HtmlDataBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlTagData}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTagData(AngularParser.HtmlTagDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlTagData}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTagData(AngularParser.HtmlTagDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArabicHtmlExpression}
	 * labeled alternative in {@link AngularParser#htmlExpression}.
	 * @param ctx the parse tree
	 */
	void enterArabicHtmlExpression(AngularParser.ArabicHtmlExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArabicHtmlExpression}
	 * labeled alternative in {@link AngularParser#htmlExpression}.
	 * @param ctx the parse tree
	 */
	void exitArabicHtmlExpression(AngularParser.ArabicHtmlExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierHtmlExpression}
	 * labeled alternative in {@link AngularParser#htmlExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierHtmlExpression(AngularParser.IdentifierHtmlExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierHtmlExpression}
	 * labeled alternative in {@link AngularParser#htmlExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierHtmlExpression(AngularParser.IdentifierHtmlExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditionHtmlExpression}
	 * labeled alternative in {@link AngularParser#htmlExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditionHtmlExpression(AngularParser.AdditionHtmlExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditionHtmlExpression}
	 * labeled alternative in {@link AngularParser#htmlExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditionHtmlExpression(AngularParser.AdditionHtmlExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedHtmlExpression}
	 * labeled alternative in {@link AngularParser#htmlExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedHtmlExpression(AngularParser.ParenthesizedHtmlExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedHtmlExpression}
	 * labeled alternative in {@link AngularParser#htmlExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedHtmlExpression(AngularParser.ParenthesizedHtmlExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberHtmlExpression}
	 * labeled alternative in {@link AngularParser#htmlExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumberHtmlExpression(AngularParser.NumberHtmlExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberHtmlExpression}
	 * labeled alternative in {@link AngularParser#htmlExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumberHtmlExpression(AngularParser.NumberHtmlExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DataBindingHtmlExpression}
	 * labeled alternative in {@link AngularParser#htmlExpression}.
	 * @param ctx the parse tree
	 */
	void enterDataBindingHtmlExpression(AngularParser.DataBindingHtmlExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DataBindingHtmlExpression}
	 * labeled alternative in {@link AngularParser#htmlExpression}.
	 * @param ctx the parse tree
	 */
	void exitDataBindingHtmlExpression(AngularParser.DataBindingHtmlExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void enterCssRule(AngularParser.CssRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void exitCssRule(AngularParser.CssRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssKey}.
	 * @param ctx the parse tree
	 */
	void enterCssKey(AngularParser.CssKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssKey}.
	 * @param ctx the parse tree
	 */
	void exitCssKey(AngularParser.CssKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericCssValue}
	 * labeled alternative in {@link AngularParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterNumericCssValue(AngularParser.NumericCssValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericCssValue}
	 * labeled alternative in {@link AngularParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitNumericCssValue(AngularParser.NumericCssValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierCssValue}
	 * labeled alternative in {@link AngularParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierCssValue(AngularParser.IdentifierCssValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierCssValue}
	 * labeled alternative in {@link AngularParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierCssValue(AngularParser.IdentifierCssValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColorCssValue}
	 * labeled alternative in {@link AngularParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterColorCssValue(AngularParser.ColorCssValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColorCssValue}
	 * labeled alternative in {@link AngularParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitColorCssValue(AngularParser.ColorCssValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssSelector(AngularParser.CssSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssSelector(AngularParser.CssSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssKeyValue}.
	 * @param ctx the parse tree
	 */
	void enterCssKeyValue(AngularParser.CssKeyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssKeyValue}.
	 * @param ctx the parse tree
	 */
	void exitCssKeyValue(AngularParser.CssKeyValueContext ctx);
}