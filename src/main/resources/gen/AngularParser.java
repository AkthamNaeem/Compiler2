// Generated from C:/Users/HP/Desktop/CompilerProject/src/main/resources/AngularParser.g4 by ANTLR 4.13.2
package main.resources.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, FUNCTION=2, IF=3, DO=4, WHILE=5, ELSE=6, FOR=7, LTE=8, GTE=9, 
		STAND_ALONE=10, RETURN=11, IMPORTS=12, IMPORT=13, EXPORT=14, INTERFACE=15, 
		ENUM=16, TYPE=17, IMPLEMENTS=18, EXTENDS=19, SUPER=20, THIS=21, ABSTRACT=22, 
		STATIC=23, ASYNC=24, AWAIT=25, NEW=26, TRY=27, CATCH=28, FINALLY=29, THROW=30, 
		INSTANCEOF=31, IN=32, OF=33, LET=34, CONST=35, VAR=36, AS=37, FROM=38, 
		COMPONENT=39, DIRECTIVE=40, INPUT=41, OUTPUT=42, MODULE=43, INJECTABLE=44, 
		PIPE=45, SERVICE=46, VIEW_CHILD=47, VIEW_CHILDREN=48, CONTENT_CHILD=49, 
		CONTENT_CHILDREN=50, TEMPLATE=51, STYLES=52, TEMPLATEURL=53, STYLEURLS=54, 
		SELECTOR=55, LBRACE=56, RBRACE=57, LPAREN=58, RPAREN=59, LBRACK=60, RBRACK=61, 
		LT=62, GT=63, ASSIGN=64, EQ=65, STRICT_EQ=66, NEQ=67, STRICT_NEQ=68, PLUS=69, 
		PLUSPLUS=70, MINUSMINUS=71, MINUS=72, MUL=73, DIV=74, MOD=75, SEMI=76, 
		COLON=77, COMMA=78, DOT=79, QUESTION=80, AT=81, LITERAL=82, SDOLLAR=83, 
		VBAR=84, HASHTAG=85, UNDERSCORE=86, DATA_BINDING_START=87, DATA_BINDING_END=88, 
		TWO_WAY_BINDING=89, PROPERTY_BINDING=90, ARRAY=91, NG_IF=92, NG_FOR=93, 
		NG_CLASS=94, NG_STYLE=95, NG_SWITCH=96, NG_SWITCH_CASE=97, NG_SWITCH_DEFAULT=98, 
		NG_MODEL_OPTIONS=99, NG_TEMPLATE=100, NG_MODEL=101, ATTRIBUTE_BINDING=102, 
		CLASS_BINDING=103, STYLE_BINDING=104, BOOLEAN_DT=105, STRING_DT=106, NUMBER_DT=107, 
		BOOLEAN=108, NULL=109, PUBLIC=110, PRIVATE=111, PROTECTED=112, STRING=113, 
		NUMBER=114, IDENTIFIER=115, ARABIC=116, LINE_COMMENT=117, BLOCK_COMMENT=118, 
		WS=119;
	public static final int
		RULE_instruction = 0, RULE_statement = 1, RULE_constDeclaration = 2, RULE_variableDeclaration = 3, 
		RULE_forLoop = 4, RULE_ifStatement = 5, RULE_whileLoop = 6, RULE_doWhileLoop = 7, 
		RULE_forEachLoop = 8, RULE_block = 9, RULE_arithmeticOperation = 10, RULE_functionAssignDeclaration = 11, 
		RULE_classObjectDeclaration = 12, RULE_variableDeclarationWithinClass = 13, 
		RULE_enumDeclaration = 14, RULE_enumVariable = 15, RULE_functionVariable = 16, 
		RULE_functionDeclaration = 17, RULE_functionDeclarationWithinClass = 18, 
		RULE_baseFunctionDeclaration = 19, RULE_functionBody = 20, RULE_arrowFunction = 21, 
		RULE_valueFunctionDeclaration = 22, RULE_returnDeclaration = 23, RULE_logicOperations = 24, 
		RULE_arithmeticDeclaration = 25, RULE_symbols = 26, RULE_operator = 27, 
		RULE_operatorDeclaration = 28, RULE_interfaceDeclaration = 29, RULE_interfaceObject = 30, 
		RULE_classDeclaration = 31, RULE_classBody = 32, RULE_moduleDeclaration = 33, 
		RULE_importModule = 34, RULE_importSpecifier = 35, RULE_importsDef = 36, 
		RULE_importArray = 37, RULE_importItem = 38, RULE_arrayOptions = 39, RULE_tupleOptions = 40, 
		RULE_typeOptions = 41, RULE_allOptions = 42, RULE_arrayValues = 43, RULE_valueOptions = 44, 
		RULE_object = 45, RULE_objectValue = 46, RULE_objectFunction = 47, RULE_assertionValue = 48, 
		RULE_allValues = 49, RULE_assignValue = 50, RULE_interfaceValues = 51, 
		RULE_interfaceValue = 52, RULE_classValue = 53, RULE_functionCall = 54, 
		RULE_jsonDef = 55, RULE_jsonBody = 56, RULE_expression = 57, RULE_comparisonExpression = 58, 
		RULE_additiveExpression = 59, RULE_multiplicativeExpression = 60, RULE_primaryExpression = 61, 
		RULE_additionExpression = 62, RULE_stringLiteral = 63, RULE_literalContent = 64, 
		RULE_templateSubstitution = 65, RULE_accessModifiers = 66, RULE_componentDef = 67, 
		RULE_componentPropertyDef = 68, RULE_standaloneDef = 69, RULE_selectorDef = 70, 
		RULE_templateDef = 71, RULE_templateUrlDef = 72, RULE_styleDef = 73, RULE_stylesDef = 74, 
		RULE_styleUrlsDef = 75, RULE_componentProperty = 76, RULE_componentPropertyValue = 77, 
		RULE_serviceDef = 78, RULE_serviceProperty = 79, RULE_servicePropertyValue = 80, 
		RULE_html = 81, RULE_htmlElement = 82, RULE_htmlTag = 83, RULE_closingHtmlTag = 84, 
		RULE_selfClosingTag = 85, RULE_htmlTemplateType = 86, RULE_htmlDataBinding = 87, 
		RULE_htmlTagData = 88, RULE_htmlExpression = 89, RULE_cssRule = 90, RULE_cssKey = 91, 
		RULE_cssValue = 92, RULE_cssSelector = 93, RULE_cssKeyValue = 94;
	private static String[] makeRuleNames() {
		return new String[] {
			"instruction", "statement", "constDeclaration", "variableDeclaration", 
			"forLoop", "ifStatement", "whileLoop", "doWhileLoop", "forEachLoop", 
			"block", "arithmeticOperation", "functionAssignDeclaration", "classObjectDeclaration", 
			"variableDeclarationWithinClass", "enumDeclaration", "enumVariable", 
			"functionVariable", "functionDeclaration", "functionDeclarationWithinClass", 
			"baseFunctionDeclaration", "functionBody", "arrowFunction", "valueFunctionDeclaration", 
			"returnDeclaration", "logicOperations", "arithmeticDeclaration", "symbols", 
			"operator", "operatorDeclaration", "interfaceDeclaration", "interfaceObject", 
			"classDeclaration", "classBody", "moduleDeclaration", "importModule", 
			"importSpecifier", "importsDef", "importArray", "importItem", "arrayOptions", 
			"tupleOptions", "typeOptions", "allOptions", "arrayValues", "valueOptions", 
			"object", "objectValue", "objectFunction", "assertionValue", "allValues", 
			"assignValue", "interfaceValues", "interfaceValue", "classValue", "functionCall", 
			"jsonDef", "jsonBody", "expression", "comparisonExpression", "additiveExpression", 
			"multiplicativeExpression", "primaryExpression", "additionExpression", 
			"stringLiteral", "literalContent", "templateSubstitution", "accessModifiers", 
			"componentDef", "componentPropertyDef", "standaloneDef", "selectorDef", 
			"templateDef", "templateUrlDef", "styleDef", "stylesDef", "styleUrlsDef", 
			"componentProperty", "componentPropertyValue", "serviceDef", "serviceProperty", 
			"servicePropertyValue", "html", "htmlElement", "htmlTag", "closingHtmlTag", 
			"selfClosingTag", "htmlTemplateType", "htmlDataBinding", "htmlTagData", 
			"htmlExpression", "cssRule", "cssKey", "cssValue", "cssSelector", "cssKeyValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'function'", "'if'", "'do'", "'while'", "'else'", "'for'", 
			"'<='", "'>='", "'standalone'", "'return'", "'imports'", "'import'", 
			"'export'", "'interface'", "'enum'", "'type'", "'implements'", "'extends'", 
			"'super'", "'this'", "'abstract'", "'static'", "'async'", "'await'", 
			"'new'", "'try'", "'catch'", "'finally'", "'throw'", "'instanceof'", 
			"'in'", "'of'", "'let'", "'const'", "'var'", "'as'", "'from'", "'@Component'", 
			"'@Directive'", "'@Input'", "'@Output'", "'@NgModule'", "'@Injectable'", 
			"'@Pipe'", "'@Service'", "'@ViewChild'", "'@ViewChildren'", "'@ContentChild'", 
			"'@ContentChildren'", "'template'", "'styles'", "'templateUrl'", "'styleUrls'", 
			"'selector'", "'{'", "'}'", "'('", "')'", "'['", "']'", "'<'", "'>'", 
			"'='", "'=='", "'==='", "'!='", "'!=='", "'+'", "'++'", "'--'", "'-'", 
			"'*'", "'/'", "'%'", "';'", "':'", "','", "'.'", "'?'", "'@'", "'`'", 
			"'$'", "'|'", "'#'", "'_'", "'{{'", "'}}'", null, null, "'Array'", "'*ngIf'", 
			"'*ngFor'", "'ngClass'", "'ngStyle'", "'*ngSwitch'", "'*ngSwitchCase'", 
			"'*ngSwitchDefault'", "'[ngModelOptions]'", "'ng-template'", "'[ngModel]'", 
			null, null, null, "'boolean'", "'string'", "'number'", null, "'null'", 
			"'public'", "'private'", "'protected'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "FUNCTION", "IF", "DO", "WHILE", "ELSE", "FOR", "LTE", 
			"GTE", "STAND_ALONE", "RETURN", "IMPORTS", "IMPORT", "EXPORT", "INTERFACE", 
			"ENUM", "TYPE", "IMPLEMENTS", "EXTENDS", "SUPER", "THIS", "ABSTRACT", 
			"STATIC", "ASYNC", "AWAIT", "NEW", "TRY", "CATCH", "FINALLY", "THROW", 
			"INSTANCEOF", "IN", "OF", "LET", "CONST", "VAR", "AS", "FROM", "COMPONENT", 
			"DIRECTIVE", "INPUT", "OUTPUT", "MODULE", "INJECTABLE", "PIPE", "SERVICE", 
			"VIEW_CHILD", "VIEW_CHILDREN", "CONTENT_CHILD", "CONTENT_CHILDREN", "TEMPLATE", 
			"STYLES", "TEMPLATEURL", "STYLEURLS", "SELECTOR", "LBRACE", "RBRACE", 
			"LPAREN", "RPAREN", "LBRACK", "RBRACK", "LT", "GT", "ASSIGN", "EQ", "STRICT_EQ", 
			"NEQ", "STRICT_NEQ", "PLUS", "PLUSPLUS", "MINUSMINUS", "MINUS", "MUL", 
			"DIV", "MOD", "SEMI", "COLON", "COMMA", "DOT", "QUESTION", "AT", "LITERAL", 
			"SDOLLAR", "VBAR", "HASHTAG", "UNDERSCORE", "DATA_BINDING_START", "DATA_BINDING_END", 
			"TWO_WAY_BINDING", "PROPERTY_BINDING", "ARRAY", "NG_IF", "NG_FOR", "NG_CLASS", 
			"NG_STYLE", "NG_SWITCH", "NG_SWITCH_CASE", "NG_SWITCH_DEFAULT", "NG_MODEL_OPTIONS", 
			"NG_TEMPLATE", "NG_MODEL", "ATTRIBUTE_BINDING", "CLASS_BINDING", "STYLE_BINDING", 
			"BOOLEAN_DT", "STRING_DT", "NUMBER_DT", "BOOLEAN", "NULL", "PUBLIC", 
			"PRIVATE", "PROTECTED", "STRING", "NUMBER", "IDENTIFIER", "ARABIC", "LINE_COMMENT", 
			"BLOCK_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4899934656783313086L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(190);
				statement();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionAssignStatementContext extends StatementContext {
		public FunctionAssignDeclarationContext functionAssignDeclaration() {
			return getRuleContext(FunctionAssignDeclarationContext.class,0);
		}
		public FunctionAssignStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentStatementContext extends StatementContext {
		public ComponentDefContext componentDef() {
			return getRuleContext(ComponentDefContext.class,0);
		}
		public ComponentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModuleStatementContext extends StatementContext {
		public ModuleDeclarationContext moduleDeclaration() {
			return getRuleContext(ModuleDeclarationContext.class,0);
		}
		public ModuleStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterModuleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitModuleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitModuleStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopStatementContext extends StatementContext {
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public ForLoopStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementStatementContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStatementStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfStatementStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfStatementStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfStatementStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceStatementContext extends StatementContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public InterfaceStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends StatementContext {
		public ImportModuleContext importModule() {
			return getRuleContext(ImportModuleContext.class,0);
		}
		public ImportStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends StatementContext {
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectFunctionStatementContext extends StatementContext {
		public ObjectFunctionContext objectFunction() {
			return getRuleContext(ObjectFunctionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ObjectFunctionStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ServiceStatementContext extends StatementContext {
		public ServiceDefContext serviceDef() {
			return getRuleContext(ServiceDefContext.class,0);
		}
		public ServiceStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterServiceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitServiceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitServiceStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstStatementContext extends StatementContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public ConstStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionStatementContext extends StatementContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassStatementContext extends StatementContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ClassStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableStatementContext extends StatementContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends StatementContext {
		public AssignValueContext assignValue() {
			return getRuleContext(AssignValueContext.class,0);
		}
		public AssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassObjectStatementContext extends StatementContext {
		public ClassObjectDeclarationContext classObjectDeclaration() {
			return getRuleContext(ClassObjectDeclarationContext.class,0);
		}
		public ClassObjectStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassObjectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassObjectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassObjectStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EnumStatementContext extends StatementContext {
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public EnumStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEnumStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEnumStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEnumStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends StatementContext {
		public ReturnDeclarationContext returnDeclaration() {
			return getRuleContext(ReturnDeclarationContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallStatementContext extends StatementContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForEachLoopStatementContext extends StatementContext {
		public ForEachLoopContext forEachLoop() {
			return getRuleContext(ForEachLoopContext.class,0);
		}
		public ForEachLoopStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForEachLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForEachLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForEachLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatementContext extends StatementContext {
		public DoWhileLoopContext doWhileLoop() {
			return getRuleContext(DoWhileLoopContext.class,0);
		}
		public DoWhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ConstStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				constDeclaration();
				}
				break;
			case 2:
				_localctx = new VariableStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				variableDeclaration();
				}
				break;
			case 3:
				_localctx = new EnumStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				enumDeclaration();
				}
				break;
			case 4:
				_localctx = new FunctionStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				functionDeclaration();
				}
				break;
			case 5:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				assignValue();
				}
				break;
			case 6:
				_localctx = new FunctionAssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				functionAssignDeclaration();
				}
				break;
			case 7:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(204);
				returnDeclaration();
				}
				break;
			case 8:
				_localctx = new ObjectFunctionStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(205);
				objectFunction();
				setState(206);
				match(SEMI);
				}
				break;
			case 9:
				_localctx = new InterfaceStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(208);
				interfaceDeclaration();
				}
				break;
			case 10:
				_localctx = new ClassStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(209);
				classDeclaration();
				}
				break;
			case 11:
				_localctx = new ClassObjectStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(210);
				classObjectDeclaration();
				}
				break;
			case 12:
				_localctx = new FunctionCallStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(211);
				functionCall();
				}
				break;
			case 13:
				_localctx = new ModuleStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(212);
				moduleDeclaration();
				}
				break;
			case 14:
				_localctx = new ImportStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(213);
				importModule();
				}
				break;
			case 15:
				_localctx = new ComponentStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(214);
				componentDef();
				}
				break;
			case 16:
				_localctx = new ServiceStatementContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(215);
				serviceDef();
				}
				break;
			case 17:
				_localctx = new ForLoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(216);
				forLoop();
				}
				break;
			case 18:
				_localctx = new ForEachLoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(217);
				forEachLoop();
				}
				break;
			case 19:
				_localctx = new IfStatementStatementContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(218);
				ifStatement();
				}
				break;
			case 20:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(219);
				doWhileLoop();
				}
				break;
			case 21:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(220);
				whileLoop();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstDeclarationContext extends ParserRuleContext {
		public Token name;
		public AllOptionsContext type;
		public AllValuesContext value;
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public AllValuesContext allValues() {
			return getRuleContext(AllValuesContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public AllOptionsContext allOptions() {
			return getRuleContext(AllOptionsContext.class,0);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(CONST);
			setState(224);
			((ConstDeclarationContext)_localctx).name = match(IDENTIFIER);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(225);
				match(COLON);
				setState(226);
				((ConstDeclarationContext)_localctx).type = allOptions();
				}
			}

			setState(229);
			match(ASSIGN);
			setState(230);
			((ConstDeclarationContext)_localctx).value = allValues();
			setState(231);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public Token name;
		public AllOptionsContext type;
		public AllValuesContext value;
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode VAR() { return getToken(AngularParser.VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public AllOptionsContext allOptions() {
			return getRuleContext(AllOptionsContext.class,0);
		}
		public AllValuesContext allValues() {
			return getRuleContext(AllValuesContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_la = _input.LA(1);
			if ( !(_la==LET || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(234);
			((VariableDeclarationContext)_localctx).name = match(IDENTIFIER);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(235);
				match(COLON);
				setState(236);
				((VariableDeclarationContext)_localctx).type = allOptions();
				}
			}

			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(239);
				match(ASSIGN);
				setState(240);
				((VariableDeclarationContext)_localctx).value = allValues();
				}
			}

			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(243);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ParserRuleContext {
		public VariableDeclarationContext init;
		public AssignValueContext initAssign;
		public ExpressionContext condition;
		public AssignValueContext update;
		public ArithmeticOperationContext updateOp;
		public BlockContext body;
		public TerminalNode FOR() { return getToken(AngularParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(AngularParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AngularParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public List<AssignValueContext> assignValue() {
			return getRuleContexts(AssignValueContext.class);
		}
		public AssignValueContext assignValue(int i) {
			return getRuleContext(AssignValueContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArithmeticOperationContext arithmeticOperation() {
			return getRuleContext(ArithmeticOperationContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(FOR);
			setState(247);
			match(LPAREN);
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
			case VAR:
				{
				setState(248);
				((ForLoopContext)_localctx).init = variableDeclaration();
				}
				break;
			case SUPER:
			case THIS:
			case LPAREN:
			case LT:
			case IDENTIFIER:
				{
				setState(249);
				((ForLoopContext)_localctx).initAssign = assignValue();
				}
				break;
			case SEMI:
				{
				setState(250);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6052837899189092352L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 61572651159555L) != 0)) {
				{
				setState(253);
				((ForLoopContext)_localctx).condition = expression();
				}
			}

			setState(256);
			match(SEMI);
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(257);
				((ForLoopContext)_localctx).update = assignValue();
				}
				break;
			case 2:
				{
				setState(258);
				((ForLoopContext)_localctx).updateOp = arithmeticOperation();
				}
				break;
			}
			setState(261);
			match(RPAREN);
			setState(262);
			((ForLoopContext)_localctx).body = block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext condition;
		public BlockContext thenBlock;
		public ExpressionContext elseIfCond;
		public BlockContext elseIfBlock;
		public BlockContext elseBlock;
		public List<TerminalNode> IF() { return getTokens(AngularParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(AngularParser.IF, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(AngularParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(AngularParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(AngularParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(AngularParser.RPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(AngularParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(AngularParser.ELSE, i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(IF);
			setState(265);
			match(LPAREN);
			setState(266);
			((IfStatementContext)_localctx).condition = expression();
			setState(267);
			match(RPAREN);
			setState(268);
			((IfStatementContext)_localctx).thenBlock = block();
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(269);
					match(ELSE);
					setState(270);
					match(IF);
					setState(271);
					match(LPAREN);
					setState(272);
					((IfStatementContext)_localctx).elseIfCond = expression();
					setState(273);
					match(RPAREN);
					setState(274);
					((IfStatementContext)_localctx).elseIfBlock = block();
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(281);
				match(ELSE);
				setState(282);
				((IfStatementContext)_localctx).elseBlock = block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends ParserRuleContext {
		public ExpressionContext condition;
		public BlockContext body;
		public TerminalNode WHILE() { return getToken(AngularParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(WHILE);
			setState(286);
			match(LPAREN);
			setState(287);
			((WhileLoopContext)_localctx).condition = expression();
			setState(288);
			match(RPAREN);
			setState(289);
			((WhileLoopContext)_localctx).body = block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileLoopContext extends ParserRuleContext {
		public BlockContext body;
		public ExpressionContext condition;
		public TerminalNode DO() { return getToken(AngularParser.DO, 0); }
		public TerminalNode WHILE() { return getToken(AngularParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDoWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDoWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDoWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileLoopContext doWhileLoop() throws RecognitionException {
		DoWhileLoopContext _localctx = new DoWhileLoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_doWhileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(DO);
			setState(292);
			((DoWhileLoopContext)_localctx).body = block();
			setState(293);
			match(WHILE);
			setState(294);
			match(LPAREN);
			setState(295);
			((DoWhileLoopContext)_localctx).condition = expression();
			setState(296);
			match(RPAREN);
			setState(297);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForEachLoopContext extends ParserRuleContext {
		public Token item;
		public ExpressionContext iterable;
		public BlockContext body;
		public TerminalNode FOR() { return getToken(AngularParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode OF() { return getToken(AngularParser.OF, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode VAR() { return getToken(AngularParser.VAR, 0); }
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForEachLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forEachLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForEachLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForEachLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForEachLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForEachLoopContext forEachLoop() throws RecognitionException {
		ForEachLoopContext _localctx = new ForEachLoopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forEachLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(FOR);
			setState(300);
			match(LPAREN);
			setState(301);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(302);
			((ForEachLoopContext)_localctx).item = match(IDENTIFIER);
			setState(303);
			match(OF);
			setState(304);
			((ForEachLoopContext)_localctx).iterable = expression();
			setState(305);
			match(RPAREN);
			setState(306);
			((ForEachLoopContext)_localctx).body = block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockWithBracesContext extends BlockContext {
		public StatementContext statements;
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockWithBracesContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlockWithBraces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlockWithBraces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlockWithBraces(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleStatementBlockContext extends BlockContext {
		public StatementContext singleStmt;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SingleStatementBlockContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSingleStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSingleStatementBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSingleStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				_localctx = new BlockWithBracesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(LBRACE);
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4899934656783313086L) != 0) || _la==IDENTIFIER) {
					{
					{
					setState(309);
					((BlockWithBracesContext)_localctx).statements = statement();
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(315);
				match(RBRACE);
				}
				break;
			case CLASS:
			case FUNCTION:
			case IF:
			case DO:
			case WHILE:
			case FOR:
			case RETURN:
			case IMPORT:
			case EXPORT:
			case INTERFACE:
			case ENUM:
			case SUPER:
			case THIS:
			case LET:
			case CONST:
			case VAR:
			case COMPONENT:
			case INJECTABLE:
			case LPAREN:
			case LT:
			case IDENTIFIER:
				_localctx = new SingleStatementBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				((SingleStatementBlockContext)_localctx).singleStmt = statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticOperationContext extends ParserRuleContext {
		public ArithmeticOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperation; }
	 
		public ArithmeticOperationContext() { }
		public void copyFrom(ArithmeticOperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompoundAssignmentOperationContext extends ArithmeticOperationContext {
		public Token id;
		public ExpressionContext expr;
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode PLUS() { return getToken(AngularParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(AngularParser.MINUS, 0); }
		public TerminalNode MUL() { return getToken(AngularParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(AngularParser.DIV, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CompoundAssignmentOperationContext(ArithmeticOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCompoundAssignmentOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCompoundAssignmentOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCompoundAssignmentOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrefixUnaryOperationContext extends ArithmeticOperationContext {
		public Token id;
		public TerminalNode PLUSPLUS() { return getToken(AngularParser.PLUSPLUS, 0); }
		public TerminalNode MINUSMINUS() { return getToken(AngularParser.MINUSMINUS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public PrefixUnaryOperationContext(ArithmeticOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPrefixUnaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPrefixUnaryOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPrefixUnaryOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixUnaryOperationContext extends ArithmeticOperationContext {
		public Token id;
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode PLUSPLUS() { return getToken(AngularParser.PLUSPLUS, 0); }
		public TerminalNode MINUSMINUS() { return getToken(AngularParser.MINUSMINUS, 0); }
		public PostfixUnaryOperationContext(ArithmeticOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPostfixUnaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPostfixUnaryOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPostfixUnaryOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperationContext arithmeticOperation() throws RecognitionException {
		ArithmeticOperationContext _localctx = new ArithmeticOperationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arithmeticOperation);
		int _la;
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new PostfixUnaryOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				((PostfixUnaryOperationContext)_localctx).id = match(IDENTIFIER);
				setState(320);
				_la = _input.LA(1);
				if ( !(_la==PLUSPLUS || _la==MINUSMINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				_localctx = new PrefixUnaryOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				_la = _input.LA(1);
				if ( !(_la==PLUSPLUS || _la==MINUSMINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(322);
				((PrefixUnaryOperationContext)_localctx).id = match(IDENTIFIER);
				}
				break;
			case 3:
				_localctx = new CompoundAssignmentOperationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				((CompoundAssignmentOperationContext)_localctx).id = match(IDENTIFIER);
				setState(324);
				_la = _input.LA(1);
				if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 57L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(325);
				match(ASSIGN);
				setState(326);
				((CompoundAssignmentOperationContext)_localctx).expr = expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionAssignDeclarationContext extends ParserRuleContext {
		public Token name;
		public AllOptionsContext type;
		public ValueFunctionDeclarationContext value;
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode VAR() { return getToken(AngularParser.VAR, 0); }
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ValueFunctionDeclarationContext valueFunctionDeclaration() {
			return getRuleContext(ValueFunctionDeclarationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public AllOptionsContext allOptions() {
			return getRuleContext(AllOptionsContext.class,0);
		}
		public FunctionAssignDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionAssignDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionAssignDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionAssignDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionAssignDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionAssignDeclarationContext functionAssignDeclaration() throws RecognitionException {
		FunctionAssignDeclarationContext _localctx = new FunctionAssignDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionAssignDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(330);
			((FunctionAssignDeclarationContext)_localctx).name = match(IDENTIFIER);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(331);
				match(COLON);
				setState(332);
				((FunctionAssignDeclarationContext)_localctx).type = allOptions();
				}
			}

			setState(335);
			match(ASSIGN);
			setState(336);
			((FunctionAssignDeclarationContext)_localctx).value = valueFunctionDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassObjectDeclarationContext extends ParserRuleContext {
		public Token name;
		public ClassValueContext value;
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode VAR() { return getToken(AngularParser.VAR, 0); }
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ClassValueContext classValue() {
			return getRuleContext(ClassValueContext.class,0);
		}
		public ClassObjectDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classObjectDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassObjectDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassObjectDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassObjectDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassObjectDeclarationContext classObjectDeclaration() throws RecognitionException {
		ClassObjectDeclarationContext _localctx = new ClassObjectDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classObjectDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(339);
			((ClassObjectDeclarationContext)_localctx).name = match(IDENTIFIER);
			setState(340);
			match(ASSIGN);
			setState(341);
			((ClassObjectDeclarationContext)_localctx).value = classValue();
			setState(342);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationWithinClassContext extends ParserRuleContext {
		public Token name;
		public AllOptionsContext type;
		public AllValuesContext value;
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public AllOptionsContext allOptions() {
			return getRuleContext(AllOptionsContext.class,0);
		}
		public AllValuesContext allValues() {
			return getRuleContext(AllValuesContext.class,0);
		}
		public TerminalNode VBAR() { return getToken(AngularParser.VBAR, 0); }
		public TerminalNode NULL() { return getToken(AngularParser.NULL, 0); }
		public VariableDeclarationWithinClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationWithinClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDeclarationWithinClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDeclarationWithinClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDeclarationWithinClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationWithinClassContext variableDeclarationWithinClass() throws RecognitionException {
		VariableDeclarationWithinClassContext _localctx = new VariableDeclarationWithinClassContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclarationWithinClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			((VariableDeclarationWithinClassContext)_localctx).name = match(IDENTIFIER);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(345);
				match(COLON);
				setState(346);
				((VariableDeclarationWithinClassContext)_localctx).type = allOptions();
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VBAR) {
					{
					setState(347);
					match(VBAR);
					setState(348);
					match(NULL);
					}
				}

				}
			}

			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(353);
				match(ASSIGN);
				setState(354);
				((VariableDeclarationWithinClassContext)_localctx).value = allValues();
				}
			}

			setState(357);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumDeclarationContext extends ParserRuleContext {
		public Token name;
		public EnumVariableContext enumVariable;
		public List<EnumVariableContext> values = new ArrayList<EnumVariableContext>();
		public TerminalNode ENUM() { return getToken(AngularParser.ENUM, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public List<EnumVariableContext> enumVariable() {
			return getRuleContexts(EnumVariableContext.class);
		}
		public EnumVariableContext enumVariable(int i) {
			return getRuleContext(EnumVariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(ENUM);
			setState(360);
			((EnumDeclarationContext)_localctx).name = match(IDENTIFIER);
			setState(361);
			match(LBRACE);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & 1031L) != 0)) {
				{
				setState(362);
				((EnumDeclarationContext)_localctx).enumVariable = enumVariable();
				((EnumDeclarationContext)_localctx).values.add(((EnumDeclarationContext)_localctx).enumVariable);
				setState(367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(363);
						match(COMMA);
						setState(364);
						((EnumDeclarationContext)_localctx).enumVariable = enumVariable();
						((EnumDeclarationContext)_localctx).values.add(((EnumDeclarationContext)_localctx).enumVariable);
						}
						} 
					}
					setState(369);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(370);
					match(COMMA);
					}
				}

				}
			}

			setState(375);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumVariableContext extends ParserRuleContext {
		public TypeOptionsContext name;
		public Token value;
		public TypeOptionsContext typeOptions() {
			return getRuleContext(TypeOptionsContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public EnumVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEnumVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEnumVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEnumVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumVariableContext enumVariable() throws RecognitionException {
		EnumVariableContext _localctx = new EnumVariableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_enumVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			((EnumVariableContext)_localctx).name = typeOptions();
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(378);
				match(ASSIGN);
				setState(379);
				((EnumVariableContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 7L) != 0)) ) {
					((EnumVariableContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionVariableContext extends ParserRuleContext {
		public Token name;
		public AllOptionsContext type;
		public AllValuesContext value;
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public AllOptionsContext allOptions() {
			return getRuleContext(AllOptionsContext.class,0);
		}
		public AllValuesContext allValues() {
			return getRuleContext(AllValuesContext.class,0);
		}
		public FunctionVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionVariableContext functionVariable() throws RecognitionException {
		FunctionVariableContext _localctx = new FunctionVariableContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			((FunctionVariableContext)_localctx).name = match(IDENTIFIER);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(383);
				match(COLON);
				setState(384);
				((FunctionVariableContext)_localctx).type = allOptions();
				}
			}

			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(387);
				match(ASSIGN);
				setState(388);
				((FunctionVariableContext)_localctx).value = allValues();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TypeOptionsContext returnType;
		public BaseFunctionDeclarationContext func;
		public TerminalNode FUNCTION() { return getToken(AngularParser.FUNCTION, 0); }
		public TypeOptionsContext typeOptions() {
			return getRuleContext(TypeOptionsContext.class,0);
		}
		public BaseFunctionDeclarationContext baseFunctionDeclaration() {
			return getRuleContext(BaseFunctionDeclarationContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(FUNCTION);
			setState(392);
			((FunctionDeclarationContext)_localctx).returnType = typeOptions();
			setState(393);
			((FunctionDeclarationContext)_localctx).func = baseFunctionDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationWithinClassContext extends ParserRuleContext {
		public TypeOptionsContext returnType;
		public BaseFunctionDeclarationContext func;
		public TypeOptionsContext typeOptions() {
			return getRuleContext(TypeOptionsContext.class,0);
		}
		public BaseFunctionDeclarationContext baseFunctionDeclaration() {
			return getRuleContext(BaseFunctionDeclarationContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(AngularParser.FUNCTION, 0); }
		public FunctionDeclarationWithinClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclarationWithinClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionDeclarationWithinClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionDeclarationWithinClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionDeclarationWithinClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationWithinClassContext functionDeclarationWithinClass() throws RecognitionException {
		FunctionDeclarationWithinClassContext _localctx = new FunctionDeclarationWithinClassContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functionDeclarationWithinClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(395);
				match(FUNCTION);
				}
			}

			setState(398);
			((FunctionDeclarationWithinClassContext)_localctx).returnType = typeOptions();
			setState(399);
			((FunctionDeclarationWithinClassContext)_localctx).func = baseFunctionDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BaseFunctionDeclarationContext extends ParserRuleContext {
		public Token name;
		public AccessModifiersContext accessModifiers;
		public List<AccessModifiersContext> params = new ArrayList<AccessModifiersContext>();
		public AllOptionsContext returnType;
		public FunctionBodyContext body;
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public List<FunctionVariableContext> functionVariable() {
			return getRuleContexts(FunctionVariableContext.class);
		}
		public FunctionVariableContext functionVariable(int i) {
			return getRuleContext(FunctionVariableContext.class,i);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public AllOptionsContext allOptions() {
			return getRuleContext(AllOptionsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public List<AccessModifiersContext> accessModifiers() {
			return getRuleContexts(AccessModifiersContext.class);
		}
		public AccessModifiersContext accessModifiers(int i) {
			return getRuleContext(AccessModifiersContext.class,i);
		}
		public BaseFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBaseFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBaseFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBaseFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseFunctionDeclarationContext baseFunctionDeclaration() throws RecognitionException {
		BaseFunctionDeclarationContext _localctx = new BaseFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_baseFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(401);
				((BaseFunctionDeclarationContext)_localctx).name = match(IDENTIFIER);
				}
			}

			setState(404);
			match(LPAREN);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 39L) != 0)) {
				{
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 7L) != 0)) {
					{
					setState(405);
					((BaseFunctionDeclarationContext)_localctx).accessModifiers = accessModifiers();
					((BaseFunctionDeclarationContext)_localctx).params.add(((BaseFunctionDeclarationContext)_localctx).accessModifiers);
					}
				}

				setState(408);
				functionVariable();
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(409);
					match(COMMA);
					setState(411);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 7L) != 0)) {
						{
						setState(410);
						((BaseFunctionDeclarationContext)_localctx).accessModifiers = accessModifiers();
						((BaseFunctionDeclarationContext)_localctx).params.add(((BaseFunctionDeclarationContext)_localctx).accessModifiers);
						}
					}

					setState(413);
					functionVariable();
					}
					}
					setState(418);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(421);
			match(RPAREN);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(422);
				match(COLON);
				setState(423);
				((BaseFunctionDeclarationContext)_localctx).returnType = allOptions();
				}
			}

			setState(426);
			((BaseFunctionDeclarationContext)_localctx).body = functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBodyContext extends ParserRuleContext {
		public StatementContext statement;
		public List<StatementContext> statements = new ArrayList<StatementContext>();
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(LBRACE);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4899934656783313086L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(429);
				((FunctionBodyContext)_localctx).statement = statement();
				((FunctionBodyContext)_localctx).statements.add(((FunctionBodyContext)_localctx).statement);
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(435);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionContext extends ParserRuleContext {
		public FunctionVariableContext functionVariable;
		public List<FunctionVariableContext> params = new ArrayList<FunctionVariableContext>();
		public AllOptionsContext returnType;
		public AllValuesContext body;
		public ExpressionContext bodyExpr;
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode GT() { return getToken(AngularParser.GT, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public AllValuesContext allValues() {
			return getRuleContext(AllValuesContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<FunctionVariableContext> functionVariable() {
			return getRuleContexts(FunctionVariableContext.class);
		}
		public FunctionVariableContext functionVariable(int i) {
			return getRuleContext(FunctionVariableContext.class,i);
		}
		public AllOptionsContext allOptions() {
			return getRuleContext(AllOptionsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ArrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionContext arrowFunction() throws RecognitionException {
		ArrowFunctionContext _localctx = new ArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arrowFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(LPAREN);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(438);
				((ArrowFunctionContext)_localctx).functionVariable = functionVariable();
				((ArrowFunctionContext)_localctx).params.add(((ArrowFunctionContext)_localctx).functionVariable);
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(439);
					match(COMMA);
					setState(440);
					((ArrowFunctionContext)_localctx).functionVariable = functionVariable();
					((ArrowFunctionContext)_localctx).params.add(((ArrowFunctionContext)_localctx).functionVariable);
					}
					}
					setState(445);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(448);
			match(RPAREN);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(449);
				match(COLON);
				setState(450);
				((ArrowFunctionContext)_localctx).returnType = allOptions();
				}
			}

			setState(453);
			match(ASSIGN);
			setState(454);
			match(GT);
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(455);
				((ArrowFunctionContext)_localctx).body = allValues();
				}
				break;
			case 2:
				{
				setState(456);
				((ArrowFunctionContext)_localctx).bodyExpr = expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueFunctionDeclarationContext extends ParserRuleContext {
		public BaseFunctionDeclarationContext func;
		public TerminalNode FUNCTION() { return getToken(AngularParser.FUNCTION, 0); }
		public BaseFunctionDeclarationContext baseFunctionDeclaration() {
			return getRuleContext(BaseFunctionDeclarationContext.class,0);
		}
		public ValueFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValueFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValueFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValueFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueFunctionDeclarationContext valueFunctionDeclaration() throws RecognitionException {
		ValueFunctionDeclarationContext _localctx = new ValueFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_valueFunctionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(FUNCTION);
			setState(460);
			((ValueFunctionDeclarationContext)_localctx).func = baseFunctionDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnDeclarationContext extends ParserRuleContext {
		public AllValuesContext value;
		public OperatorDeclarationContext op;
		public TerminalNode RETURN() { return getToken(AngularParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public AllValuesContext allValues() {
			return getRuleContext(AllValuesContext.class,0);
		}
		public OperatorDeclarationContext operatorDeclaration() {
			return getRuleContext(OperatorDeclarationContext.class,0);
		}
		public ReturnDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnDeclarationContext returnDeclaration() throws RecognitionException {
		ReturnDeclarationContext _localctx = new ReturnDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_returnDeclaration);
		try {
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				match(RETURN);
				setState(463);
				((ReturnDeclarationContext)_localctx).value = allValues();
				setState(464);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				match(RETURN);
				setState(467);
				((ReturnDeclarationContext)_localctx).op = operatorDeclaration();
				setState(468);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicOperationsContext extends ParserRuleContext {
		public LogicOperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicOperations; }
	 
		public LogicOperationsContext() { }
		public void copyFrom(LogicOperationsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessThanContext extends LogicOperationsContext {
		public TerminalNode LT() { return getToken(AngularParser.LT, 0); }
		public LessThanContext(LogicOperationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotEqualContext extends LogicOperationsContext {
		public TerminalNode NEQ() { return getToken(AngularParser.NEQ, 0); }
		public NotEqualContext(LogicOperationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNotEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNotEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNotEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterThanContext extends LogicOperationsContext {
		public TerminalNode GT() { return getToken(AngularParser.GT, 0); }
		public GreaterThanContext(LogicOperationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitGreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualContext extends LogicOperationsContext {
		public TerminalNode EQ() { return getToken(AngularParser.EQ, 0); }
		public EqualContext(LogicOperationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrictEqualContext extends LogicOperationsContext {
		public TerminalNode STRICT_EQ() { return getToken(AngularParser.STRICT_EQ, 0); }
		public StrictEqualContext(LogicOperationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStrictEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStrictEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStrictEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrictNotEqualContext extends LogicOperationsContext {
		public TerminalNode STRICT_NEQ() { return getToken(AngularParser.STRICT_NEQ, 0); }
		public StrictNotEqualContext(LogicOperationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStrictNotEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStrictNotEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStrictNotEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicOperationsContext logicOperations() throws RecognitionException {
		LogicOperationsContext _localctx = new LogicOperationsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_logicOperations);
		try {
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				_localctx = new LessThanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(LT);
				}
				break;
			case GT:
				_localctx = new GreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				match(GT);
				}
				break;
			case EQ:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				match(EQ);
				}
				break;
			case STRICT_EQ:
				_localctx = new StrictEqualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(475);
				match(STRICT_EQ);
				}
				break;
			case NEQ:
				_localctx = new NotEqualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(476);
				match(NEQ);
				}
				break;
			case STRICT_NEQ:
				_localctx = new StrictNotEqualContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(477);
				match(STRICT_NEQ);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticDeclarationContext extends ParserRuleContext {
		public ArithmeticDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticDeclaration; }
	 
		public ArithmeticDeclarationContext() { }
		public void copyFrom(ArithmeticDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditionContext extends ArithmeticDeclarationContext {
		public TerminalNode PLUS() { return getToken(AngularParser.PLUS, 0); }
		public AdditionContext(ArithmeticDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicationContext extends ArithmeticDeclarationContext {
		public TerminalNode MUL() { return getToken(AngularParser.MUL, 0); }
		public MultiplicationContext(ArithmeticDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubtractionContext extends ArithmeticDeclarationContext {
		public TerminalNode MINUS() { return getToken(AngularParser.MINUS, 0); }
		public SubtractionContext(ArithmeticDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModulusContext extends ArithmeticDeclarationContext {
		public TerminalNode MOD() { return getToken(AngularParser.MOD, 0); }
		public ModulusContext(ArithmeticDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterModulus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitModulus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitModulus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivisionContext extends ArithmeticDeclarationContext {
		public TerminalNode DIV() { return getToken(AngularParser.DIV, 0); }
		public DivisionContext(ArithmeticDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticDeclarationContext arithmeticDeclaration() throws RecognitionException {
		ArithmeticDeclarationContext _localctx = new ArithmeticDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arithmeticDeclaration);
		try {
			setState(485);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new AdditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new SubtractionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				match(MINUS);
				}
				break;
			case MUL:
				_localctx = new MultiplicationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(482);
				match(MUL);
				}
				break;
			case DIV:
				_localctx = new DivisionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(483);
				match(DIV);
				}
				break;
			case MOD:
				_localctx = new ModulusContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(484);
				match(MOD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SymbolsContext extends ParserRuleContext {
		public SymbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbols; }
	 
		public SymbolsContext() { }
		public void copyFrom(SymbolsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SemicolonContext extends SymbolsContext {
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public SemicolonContext(SymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommaContext extends SymbolsContext {
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public CommaContext(SymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComma(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RightBracketContext extends SymbolsContext {
		public TerminalNode RBRACK() { return getToken(AngularParser.RBRACK, 0); }
		public RightBracketContext(SymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRightBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRightBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRightBracket(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LeftBracketContext extends SymbolsContext {
		public TerminalNode LBRACK() { return getToken(AngularParser.LBRACK, 0); }
		public LeftBracketContext(SymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLeftBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLeftBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLeftBracket(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuestionMarkContext extends SymbolsContext {
		public TerminalNode QUESTION() { return getToken(AngularParser.QUESTION, 0); }
		public QuestionMarkContext(SymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterQuestionMark(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitQuestionMark(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitQuestionMark(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtSymbolContext extends SymbolsContext {
		public TerminalNode AT() { return getToken(AngularParser.AT, 0); }
		public AtSymbolContext(SymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAtSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAtSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAtSymbol(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotContext extends SymbolsContext {
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public DotContext(SymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LeftParenContext extends SymbolsContext {
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public LeftParenContext(SymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLeftParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLeftParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLeftParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColonContext extends SymbolsContext {
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ColonContext(SymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterColon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitColon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitColon(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RightParenContext extends SymbolsContext {
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public RightParenContext(SymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRightParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRightParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRightParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolsContext symbols() throws RecognitionException {
		SymbolsContext _localctx = new SymbolsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_symbols);
		try {
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new LeftParenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				match(LPAREN);
				}
				break;
			case RPAREN:
				_localctx = new RightParenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				match(RPAREN);
				}
				break;
			case LBRACK:
				_localctx = new LeftBracketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(489);
				match(LBRACK);
				}
				break;
			case RBRACK:
				_localctx = new RightBracketContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(490);
				match(RBRACK);
				}
				break;
			case SEMI:
				_localctx = new SemicolonContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(491);
				match(SEMI);
				}
				break;
			case COLON:
				_localctx = new ColonContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(492);
				match(COLON);
				}
				break;
			case COMMA:
				_localctx = new CommaContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(493);
				match(COMMA);
				}
				break;
			case DOT:
				_localctx = new DotContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(494);
				match(DOT);
				}
				break;
			case QUESTION:
				_localctx = new QuestionMarkContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(495);
				match(QUESTION);
				}
				break;
			case AT:
				_localctx = new AtSymbolContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(496);
				match(AT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	 
		public OperatorContext() { }
		public void copyFrom(OperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticOperatorChainContext extends OperatorContext {
		public AllValuesContext leftOp;
		public ArithmeticDeclarationContext arithmeticDeclaration;
		public List<ArithmeticDeclarationContext> ops = new ArrayList<ArithmeticDeclarationContext>();
		public AllValuesContext allValues;
		public List<AllValuesContext> values = new ArrayList<AllValuesContext>();
		public List<AllValuesContext> allValues() {
			return getRuleContexts(AllValuesContext.class);
		}
		public AllValuesContext allValues(int i) {
			return getRuleContext(AllValuesContext.class,i);
		}
		public List<ArithmeticDeclarationContext> arithmeticDeclaration() {
			return getRuleContexts(ArithmeticDeclarationContext.class);
		}
		public ArithmeticDeclarationContext arithmeticDeclaration(int i) {
			return getRuleContext(ArithmeticDeclarationContext.class,i);
		}
		public ArithmeticOperatorChainContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArithmeticOperatorChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArithmeticOperatorChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArithmeticOperatorChain(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOperatorContext extends OperatorContext {
		public AllValuesContext leftOp;
		public LogicOperationsContext op;
		public AllValuesContext rightOp;
		public List<AllValuesContext> allValues() {
			return getRuleContexts(AllValuesContext.class);
		}
		public AllValuesContext allValues(int i) {
			return getRuleContext(AllValuesContext.class,i);
		}
		public LogicOperationsContext logicOperations() {
			return getRuleContext(LogicOperationsContext.class,0);
		}
		public LogicalOperatorContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLogicalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_operator);
		int _la;
		try {
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				_localctx = new LogicalOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				((LogicalOperatorContext)_localctx).leftOp = allValues();
				setState(500);
				((LogicalOperatorContext)_localctx).op = logicOperations();
				setState(501);
				((LogicalOperatorContext)_localctx).rightOp = allValues();
				}
				break;
			case 2:
				_localctx = new ArithmeticOperatorChainContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				((ArithmeticOperatorChainContext)_localctx).leftOp = allValues();
				setState(507); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(504);
					((ArithmeticOperatorChainContext)_localctx).arithmeticDeclaration = arithmeticDeclaration();
					((ArithmeticOperatorChainContext)_localctx).ops.add(((ArithmeticOperatorChainContext)_localctx).arithmeticDeclaration);
					setState(505);
					((ArithmeticOperatorChainContext)_localctx).allValues = allValues();
					((ArithmeticOperatorChainContext)_localctx).values.add(((ArithmeticOperatorChainContext)_localctx).allValues);
					}
					}
					setState(509); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 121L) != 0) );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorDeclarationContext extends ParserRuleContext {
		public OperatorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorDeclaration; }
	 
		public OperatorDeclarationContext() { }
		public void copyFrom(OperatorDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleOperatorContext extends OperatorDeclarationContext {
		public OperatorContext op;
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public SimpleOperatorContext(OperatorDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSimpleOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSimpleOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSimpleOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedOperatorContext extends OperatorDeclarationContext {
		public OperatorContext op;
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ParenthesizedOperatorContext(OperatorDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParenthesizedOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParenthesizedOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParenthesizedOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorDeclarationContext operatorDeclaration() throws RecognitionException {
		OperatorDeclarationContext _localctx = new OperatorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_operatorDeclaration);
		try {
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new ParenthesizedOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				match(LPAREN);
				setState(514);
				((ParenthesizedOperatorContext)_localctx).op = operator();
				setState(515);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new SimpleOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				((SimpleOperatorContext)_localctx).op = operator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public Token name;
		public InterfaceObjectContext interfaceObject;
		public List<InterfaceObjectContext> members = new ArrayList<InterfaceObjectContext>();
		public TerminalNode INTERFACE() { return getToken(AngularParser.INTERFACE, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public List<InterfaceObjectContext> interfaceObject() {
			return getRuleContexts(InterfaceObjectContext.class);
		}
		public InterfaceObjectContext interfaceObject(int i) {
			return getRuleContext(InterfaceObjectContext.class,i);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(INTERFACE);
			setState(521);
			((InterfaceDeclarationContext)_localctx).name = match(IDENTIFIER);
			setState(522);
			match(LBRACE);
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(523);
				((InterfaceDeclarationContext)_localctx).interfaceObject = interfaceObject();
				((InterfaceDeclarationContext)_localctx).members.add(((InterfaceDeclarationContext)_localctx).interfaceObject);
				}
				}
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(529);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceObjectContext extends ParserRuleContext {
		public Token name;
		public TypeOptionsContext type;
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TypeOptionsContext typeOptions() {
			return getRuleContext(TypeOptionsContext.class,0);
		}
		public InterfaceObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceObjectContext interfaceObject() throws RecognitionException {
		InterfaceObjectContext _localctx = new InterfaceObjectContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_interfaceObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			((InterfaceObjectContext)_localctx).name = match(IDENTIFIER);
			setState(532);
			match(COLON);
			setState(533);
			((InterfaceObjectContext)_localctx).type = typeOptions();
			setState(534);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public Token name;
		public Token parent;
		public ClassBodyContext classBody;
		public List<ClassBodyContext> members = new ArrayList<ClassBodyContext>();
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode EXTENDS() { return getToken(AngularParser.EXTENDS, 0); }
		public List<ClassBodyContext> classBody() {
			return getRuleContexts(ClassBodyContext.class);
		}
		public ClassBodyContext classBody(int i) {
			return getRuleContext(ClassBodyContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(CLASS);
			setState(537);
			((ClassDeclarationContext)_localctx).name = match(IDENTIFIER);
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(538);
				match(EXTENDS);
				setState(539);
				((ClassDeclarationContext)_localctx).parent = match(IDENTIFIER);
				}
			}

			setState(542);
			match(LBRACE);
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION || _la==SUPER || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & 1031L) != 0)) {
				{
				{
				setState(543);
				((ClassDeclarationContext)_localctx).classBody = classBody();
				((ClassDeclarationContext)_localctx).members.add(((ClassDeclarationContext)_localctx).classBody);
				}
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(549);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
	 
		public ClassBodyContext() { }
		public void copyFrom(ClassBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassFunctionCallContext extends ClassBodyContext {
		public FunctionCallContext call;
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ClassFunctionCallContext(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassVariableDeclarationContext extends ClassBodyContext {
		public VariableDeclarationWithinClassContext varDecl;
		public VariableDeclarationWithinClassContext variableDeclarationWithinClass() {
			return getRuleContext(VariableDeclarationWithinClassContext.class,0);
		}
		public ClassVariableDeclarationContext(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassMethodDeclarationContext extends ClassBodyContext {
		public FunctionDeclarationWithinClassContext method;
		public FunctionDeclarationWithinClassContext functionDeclarationWithinClass() {
			return getRuleContext(FunctionDeclarationWithinClassContext.class,0);
		}
		public ClassMethodDeclarationContext(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_classBody);
		try {
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				_localctx = new ClassVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				((ClassVariableDeclarationContext)_localctx).varDecl = variableDeclarationWithinClass();
				}
				break;
			case 2:
				_localctx = new ClassMethodDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
				((ClassMethodDeclarationContext)_localctx).method = functionDeclarationWithinClass();
				}
				break;
			case 3:
				_localctx = new ClassFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(553);
				((ClassFunctionCallContext)_localctx).call = functionCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext cls;
		public InterfaceDeclarationContext iface;
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ModuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterModuleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitModuleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitModuleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleDeclarationContext moduleDeclaration() throws RecognitionException {
		ModuleDeclarationContext _localctx = new ModuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_moduleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(EXPORT);
			setState(559);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				{
				setState(557);
				((ModuleDeclarationContext)_localctx).cls = classDeclaration();
				}
				break;
			case INTERFACE:
				{
				setState(558);
				((ModuleDeclarationContext)_localctx).iface = interfaceDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportModuleContext extends ParserRuleContext {
		public ImportSpecifierContext importSpecifier;
		public List<ImportSpecifierContext> imports = new ArrayList<ImportSpecifierContext>();
		public Token path;
		public TerminalNode IMPORT() { return getToken(AngularParser.IMPORT, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public List<ImportSpecifierContext> importSpecifier() {
			return getRuleContexts(ImportSpecifierContext.class);
		}
		public ImportSpecifierContext importSpecifier(int i) {
			return getRuleContext(ImportSpecifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ImportModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importModule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportModuleContext importModule() throws RecognitionException {
		ImportModuleContext _localctx = new ImportModuleContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_importModule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(IMPORT);
			setState(562);
			match(LBRACE);
			{
			setState(563);
			((ImportModuleContext)_localctx).importSpecifier = importSpecifier();
			((ImportModuleContext)_localctx).imports.add(((ImportModuleContext)_localctx).importSpecifier);
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(564);
				match(COMMA);
				setState(565);
				((ImportModuleContext)_localctx).importSpecifier = importSpecifier();
				((ImportModuleContext)_localctx).imports.add(((ImportModuleContext)_localctx).importSpecifier);
				}
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(571);
			match(RBRACE);
			setState(572);
			match(FROM);
			setState(573);
			((ImportModuleContext)_localctx).path = match(STRING);
			setState(574);
			match(SEMI);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportSpecifierContext extends ParserRuleContext {
		public Token name;
		public Token alias;
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode AS() { return getToken(AngularParser.AS, 0); }
		public ImportSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSpecifierContext importSpecifier() throws RecognitionException {
		ImportSpecifierContext _localctx = new ImportSpecifierContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_importSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			((ImportSpecifierContext)_localctx).name = match(IDENTIFIER);
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(577);
				match(AS);
				setState(578);
				((ImportSpecifierContext)_localctx).alias = match(IDENTIFIER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportsDefContext extends ParserRuleContext {
		public ImportArrayContext modules;
		public TerminalNode IMPORTS() { return getToken(AngularParser.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ImportArrayContext importArray() {
			return getRuleContext(ImportArrayContext.class,0);
		}
		public ImportsDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importsDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportsDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportsDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportsDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsDefContext importsDef() throws RecognitionException {
		ImportsDefContext _localctx = new ImportsDefContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_importsDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(IMPORTS);
			setState(582);
			match(COLON);
			setState(583);
			((ImportsDefContext)_localctx).modules = importArray();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportArrayContext extends ParserRuleContext {
		public ImportItemContext importItem;
		public List<ImportItemContext> importItems = new ArrayList<ImportItemContext>();
		public TerminalNode LBRACK() { return getToken(AngularParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(AngularParser.RBRACK, 0); }
		public List<ImportItemContext> importItem() {
			return getRuleContexts(ImportItemContext.class);
		}
		public ImportItemContext importItem(int i) {
			return getRuleContext(ImportItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ImportArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportArrayContext importArray() throws RecognitionException {
		ImportArrayContext _localctx = new ImportArrayContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_importArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(LBRACK);
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(586);
				((ImportArrayContext)_localctx).importItem = importItem();
				((ImportArrayContext)_localctx).importItems.add(((ImportArrayContext)_localctx).importItem);
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(587);
					match(COMMA);
					setState(588);
					((ImportArrayContext)_localctx).importItem = importItem();
					((ImportArrayContext)_localctx).importItems.add(((ImportArrayContext)_localctx).importItem);
					}
					}
					setState(593);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(596);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportItemContext extends ParserRuleContext {
		public Token module;
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ImportItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportItemContext importItem() throws RecognitionException {
		ImportItemContext _localctx = new ImportItemContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_importItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			((ImportItemContext)_localctx).module = match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayOptionsContext extends ParserRuleContext {
		public ArrayOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayOptions; }
	 
		public ArrayOptionsContext() { }
		public void copyFrom(ArrayOptionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BracketArrayTypeContext extends ArrayOptionsContext {
		public TypeOptionsContext type;
		public TerminalNode LBRACK() { return getToken(AngularParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(AngularParser.RBRACK, 0); }
		public TypeOptionsContext typeOptions() {
			return getRuleContext(TypeOptionsContext.class,0);
		}
		public BracketArrayTypeContext(ArrayOptionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBracketArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBracketArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBracketArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GenericArrayTypeContext extends ArrayOptionsContext {
		public TypeOptionsContext type;
		public TerminalNode ARRAY() { return getToken(AngularParser.ARRAY, 0); }
		public TerminalNode LT() { return getToken(AngularParser.LT, 0); }
		public TerminalNode GT() { return getToken(AngularParser.GT, 0); }
		public TypeOptionsContext typeOptions() {
			return getRuleContext(TypeOptionsContext.class,0);
		}
		public GenericArrayTypeContext(ArrayOptionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterGenericArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitGenericArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitGenericArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayOptionsContext arrayOptions() throws RecognitionException {
		ArrayOptionsContext _localctx = new ArrayOptionsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_arrayOptions);
		try {
			setState(609);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN_DT:
			case STRING_DT:
			case NUMBER_DT:
			case IDENTIFIER:
				_localctx = new BracketArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				((BracketArrayTypeContext)_localctx).type = typeOptions();
				setState(601);
				match(LBRACK);
				setState(602);
				match(RBRACK);
				}
				break;
			case ARRAY:
				_localctx = new GenericArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				match(ARRAY);
				setState(605);
				match(LT);
				setState(606);
				((GenericArrayTypeContext)_localctx).type = typeOptions();
				setState(607);
				match(GT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TupleOptionsContext extends ParserRuleContext {
		public TypeOptionsContext typeOptions;
		public List<TypeOptionsContext> types = new ArrayList<TypeOptionsContext>();
		public TerminalNode LBRACK() { return getToken(AngularParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(AngularParser.RBRACK, 0); }
		public List<TypeOptionsContext> typeOptions() {
			return getRuleContexts(TypeOptionsContext.class);
		}
		public TypeOptionsContext typeOptions(int i) {
			return getRuleContext(TypeOptionsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public TupleOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTupleOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTupleOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTupleOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleOptionsContext tupleOptions() throws RecognitionException {
		TupleOptionsContext _localctx = new TupleOptionsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_tupleOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(LBRACK);
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & 1031L) != 0)) {
				{
				setState(612);
				((TupleOptionsContext)_localctx).typeOptions = typeOptions();
				((TupleOptionsContext)_localctx).types.add(((TupleOptionsContext)_localctx).typeOptions);
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(613);
					match(COMMA);
					setState(614);
					((TupleOptionsContext)_localctx).typeOptions = typeOptions();
					((TupleOptionsContext)_localctx).types.add(((TupleOptionsContext)_localctx).typeOptions);
					}
					}
					setState(619);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(622);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeOptionsContext extends ParserRuleContext {
		public TypeOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOptions; }
	 
		public TypeOptionsContext() { }
		public void copyFrom(TypeOptionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CustomTypeContext extends TypeOptionsContext {
		public Token name;
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public CustomTypeContext(TypeOptionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCustomType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCustomType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCustomType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberTypeContext extends TypeOptionsContext {
		public TerminalNode NUMBER_DT() { return getToken(AngularParser.NUMBER_DT, 0); }
		public NumberTypeContext(TypeOptionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNumberType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNumberType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNumberType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringTypeContext extends TypeOptionsContext {
		public TerminalNode STRING_DT() { return getToken(AngularParser.STRING_DT, 0); }
		public StringTypeContext(TypeOptionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStringType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStringType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStringType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanTypeContext extends TypeOptionsContext {
		public TerminalNode BOOLEAN_DT() { return getToken(AngularParser.BOOLEAN_DT, 0); }
		public BooleanTypeContext(TypeOptionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBooleanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeOptionsContext typeOptions() throws RecognitionException {
		TypeOptionsContext _localctx = new TypeOptionsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_typeOptions);
		try {
			setState(628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER_DT:
				_localctx = new NumberTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				match(NUMBER_DT);
				}
				break;
			case STRING_DT:
				_localctx = new StringTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				match(STRING_DT);
				}
				break;
			case BOOLEAN_DT:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(626);
				match(BOOLEAN_DT);
				}
				break;
			case IDENTIFIER:
				_localctx = new CustomTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(627);
				((CustomTypeContext)_localctx).name = match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AllOptionsContext extends ParserRuleContext {
		public AllOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allOptions; }
	 
		public AllOptionsContext() { }
		public void copyFrom(AllOptionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleTypeOptionContext extends AllOptionsContext {
		public TypeOptionsContext simpleType;
		public TypeOptionsContext typeOptions() {
			return getRuleContext(TypeOptionsContext.class,0);
		}
		public SimpleTypeOptionContext(AllOptionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSimpleTypeOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSimpleTypeOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSimpleTypeOption(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TupleTypeOptionContext extends AllOptionsContext {
		public TupleOptionsContext tuple;
		public TupleOptionsContext tupleOptions() {
			return getRuleContext(TupleOptionsContext.class,0);
		}
		public TupleTypeOptionContext(AllOptionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTupleTypeOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTupleTypeOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTupleTypeOption(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeOptionContext extends AllOptionsContext {
		public ArrayOptionsContext array;
		public ArrayOptionsContext arrayOptions() {
			return getRuleContext(ArrayOptionsContext.class,0);
		}
		public ArrayTypeOptionContext(AllOptionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayTypeOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayTypeOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayTypeOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllOptionsContext allOptions() throws RecognitionException {
		AllOptionsContext _localctx = new AllOptionsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_allOptions);
		try {
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				_localctx = new SimpleTypeOptionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				((SimpleTypeOptionContext)_localctx).simpleType = typeOptions();
				}
				break;
			case 2:
				_localctx = new TupleTypeOptionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				((TupleTypeOptionContext)_localctx).tuple = tupleOptions();
				}
				break;
			case 3:
				_localctx = new ArrayTypeOptionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(632);
				((ArrayTypeOptionContext)_localctx).array = arrayOptions();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayValuesContext extends ParserRuleContext {
		public AllValuesContext allValues;
		public List<AllValuesContext> values = new ArrayList<AllValuesContext>();
		public TerminalNode LBRACK() { return getToken(AngularParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(AngularParser.RBRACK, 0); }
		public List<AllValuesContext> allValues() {
			return getRuleContexts(AllValuesContext.class);
		}
		public AllValuesContext allValues(int i) {
			return getRuleContext(AllValuesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ArrayValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayValuesContext arrayValues() throws RecognitionException {
		ArrayValuesContext _localctx = new ArrayValuesContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_arrayValues);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(LBRACK);
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6124895493227020288L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 62397284880387L) != 0)) {
				{
				setState(636);
				((ArrayValuesContext)_localctx).allValues = allValues();
				((ArrayValuesContext)_localctx).values.add(((ArrayValuesContext)_localctx).allValues);
				setState(641);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(637);
						match(COMMA);
						setState(638);
						((ArrayValuesContext)_localctx).allValues = allValues();
						((ArrayValuesContext)_localctx).values.add(((ArrayValuesContext)_localctx).allValues);
						}
						} 
					}
					setState(643);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(644);
					match(COMMA);
					}
				}

				}
			}

			setState(649);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueOptionsContext extends ParserRuleContext {
		public ValueOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueOptions; }
	 
		public ValueOptionsContext() { }
		public void copyFrom(ValueOptionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberValueContext extends ValueOptionsContext {
		public Token num;
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public NumberValueContext(ValueOptionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNumberValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNumberValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNumberValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanValueContext extends ValueOptionsContext {
		public Token bool;
		public TerminalNode BOOLEAN() { return getToken(AngularParser.BOOLEAN, 0); }
		public BooleanValueContext(ValueOptionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierValueContext extends ValueOptionsContext {
		public Token id;
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public IdentifierValueContext(ValueOptionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifierValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifierValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifierValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringValueContext extends ValueOptionsContext {
		public Token str;
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public StringValueContext(ValueOptionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStringValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueOptionsContext valueOptions() throws RecognitionException {
		ValueOptionsContext _localctx = new ValueOptionsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_valueOptions);
		try {
			setState(655);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new StringValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
				((StringValueContext)_localctx).str = match(STRING);
				}
				break;
			case NUMBER:
				_localctx = new NumberValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(652);
				((NumberValueContext)_localctx).num = match(NUMBER);
				}
				break;
			case BOOLEAN:
				_localctx = new BooleanValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(653);
				((BooleanValueContext)_localctx).bool = match(BOOLEAN);
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentifierValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(654);
				((IdentifierValueContext)_localctx).id = match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ParserRuleContext {
		public Token id;
		public AssertionValueContext assertion;
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(AngularParser.SUPER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public AssertionValueContext assertionValue() {
			return getRuleContext(AssertionValueContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
			case THIS:
			case LT:
			case IDENTIFIER:
				{
				setState(661);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(657);
					((ObjectContext)_localctx).id = match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(658);
					((ObjectContext)_localctx).assertion = assertionValue();
					}
					break;
				case 3:
					{
					setState(659);
					match(THIS);
					}
					break;
				case 4:
					{
					setState(660);
					match(SUPER);
					}
					break;
				}
				}
				break;
			case LPAREN:
				{
				setState(663);
				match(LPAREN);
				setState(668);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(664);
					((ObjectContext)_localctx).id = match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(665);
					((ObjectContext)_localctx).assertion = assertionValue();
					}
					break;
				case 3:
					{
					setState(666);
					match(THIS);
					}
					break;
				case 4:
					{
					setState(667);
					match(SUPER);
					}
					break;
				}
				setState(670);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectValueContext extends ParserRuleContext {
		public ObjectContext obj;
		public Token prop;
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(AngularParser.SUPER, 0); }
		public ObjectValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectValueContext objectValue() throws RecognitionException {
		ObjectValueContext _localctx = new ObjectValueContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_objectValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(673);
				_la = _input.LA(1);
				if ( !(_la==SUPER || _la==THIS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(674);
				match(DOT);
				}
				break;
			}
			setState(677);
			((ObjectValueContext)_localctx).obj = object();
			setState(678);
			match(DOT);
			setState(679);
			((ObjectValueContext)_localctx).prop = match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectFunctionContext extends ParserRuleContext {
		public ObjectContext obj;
		public Token method;
		public AllValuesContext allValues;
		public List<AllValuesContext> args = new ArrayList<AllValuesContext>();
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(AngularParser.SUPER, 0); }
		public List<AllValuesContext> allValues() {
			return getRuleContexts(AllValuesContext.class);
		}
		public AllValuesContext allValues(int i) {
			return getRuleContext(AllValuesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ObjectFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectFunctionContext objectFunction() throws RecognitionException {
		ObjectFunctionContext _localctx = new ObjectFunctionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_objectFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(681);
				_la = _input.LA(1);
				if ( !(_la==SUPER || _la==THIS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(682);
				match(DOT);
				}
				break;
			}
			setState(685);
			((ObjectFunctionContext)_localctx).obj = object();
			setState(686);
			match(DOT);
			setState(687);
			((ObjectFunctionContext)_localctx).method = match(IDENTIFIER);
			setState(688);
			match(LPAREN);
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6124895493227020288L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 62397284880387L) != 0)) {
				{
				setState(689);
				((ObjectFunctionContext)_localctx).allValues = allValues();
				((ObjectFunctionContext)_localctx).args.add(((ObjectFunctionContext)_localctx).allValues);
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(690);
					match(COMMA);
					setState(691);
					((ObjectFunctionContext)_localctx).allValues = allValues();
					((ObjectFunctionContext)_localctx).args.add(((ObjectFunctionContext)_localctx).allValues);
					}
					}
					setState(696);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(699);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssertionValueContext extends ParserRuleContext {
		public AssertionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertionValue; }
	 
		public AssertionValueContext() { }
		public void copyFrom(AssertionValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GenericAssertionContext extends AssertionValueContext {
		public TypeOptionsContext type;
		public Token value;
		public TerminalNode LT() { return getToken(AngularParser.LT, 0); }
		public TerminalNode GT() { return getToken(AngularParser.GT, 0); }
		public TypeOptionsContext typeOptions() {
			return getRuleContext(TypeOptionsContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public GenericAssertionContext(AssertionValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterGenericAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitGenericAssertion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitGenericAssertion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsAssertionContext extends AssertionValueContext {
		public Token value;
		public TypeOptionsContext type;
		public TerminalNode AS() { return getToken(AngularParser.AS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TypeOptionsContext typeOptions() {
			return getRuleContext(TypeOptionsContext.class,0);
		}
		public AsAssertionContext(AssertionValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAsAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAsAssertion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAsAssertion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertionValueContext assertionValue() throws RecognitionException {
		AssertionValueContext _localctx = new AssertionValueContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_assertionValue);
		try {
			setState(709);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new AsAssertionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(701);
				((AsAssertionContext)_localctx).value = match(IDENTIFIER);
				setState(702);
				match(AS);
				setState(703);
				((AsAssertionContext)_localctx).type = typeOptions();
				}
				break;
			case LT:
				_localctx = new GenericAssertionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				match(LT);
				setState(705);
				((GenericAssertionContext)_localctx).type = typeOptions();
				setState(706);
				match(GT);
				setState(707);
				((GenericAssertionContext)_localctx).value = match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AllValuesContext extends ParserRuleContext {
		public AllValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allValues; }
	 
		public AllValuesContext() { }
		public void copyFrom(AllValuesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectFunctionValueContext extends AllValuesContext {
		public ObjectFunctionContext funcCall;
		public ObjectFunctionContext objectFunction() {
			return getRuleContext(ObjectFunctionContext.class,0);
		}
		public ObjectFunctionValueContext(AllValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectFunctionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectFunctionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectFunctionValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceValuesValueContext extends AllValuesContext {
		public InterfaceValuesContext ifaceValue;
		public InterfaceValuesContext interfaceValues() {
			return getRuleContext(InterfaceValuesContext.class,0);
		}
		public InterfaceValuesValueContext(AllValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceValuesValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceValuesValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceValuesValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullValueContext extends AllValuesContext {
		public TerminalNode NULL() { return getToken(AngularParser.NULL, 0); }
		public NullValueContext(AllValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNullValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNullValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNullValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionValueContext extends AllValuesContext {
		public ExpressionContext expr;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionValueContext(AllValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpressionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpressionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpressionValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsonValueContext extends AllValuesContext {
		public JsonDefContext jsonValue;
		public JsonDefContext jsonDef() {
			return getRuleContext(JsonDefContext.class,0);
		}
		public JsonValueContext(AllValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJsonValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJsonValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJsonValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssertionValueValueContext extends AllValuesContext {
		public AssertionValueContext assertion;
		public AssertionValueContext assertionValue() {
			return getRuleContext(AssertionValueContext.class,0);
		}
		public AssertionValueValueContext(AllValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssertionValueValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssertionValueValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssertionValueValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectValueValueContext extends AllValuesContext {
		public ObjectValueContext objVal;
		public ObjectValueContext objectValue() {
			return getRuleContext(ObjectValueContext.class,0);
		}
		public ObjectValueValueContext(AllValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectValueValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectValueValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectValueValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayValueContext extends AllValuesContext {
		public ArrayValuesContext array;
		public ArrayValuesContext arrayValues() {
			return getRuleContext(ArrayValuesContext.class,0);
		}
		public ArrayValueContext(AllValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleValueContext extends AllValuesContext {
		public ValueOptionsContext simple;
		public ValueOptionsContext valueOptions() {
			return getRuleContext(ValueOptionsContext.class,0);
		}
		public SimpleValueContext(AllValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSimpleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSimpleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSimpleValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionValueContext extends AllValuesContext {
		public ArrowFunctionContext arrowFunc;
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public ArrowFunctionValueContext(AllValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowFunctionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowFunctionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowFunctionValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllValuesContext allValues() throws RecognitionException {
		AllValuesContext _localctx = new AllValuesContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_allValues);
		try {
			setState(721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				_localctx = new JsonValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(711);
				((JsonValueContext)_localctx).jsonValue = jsonDef();
				}
				break;
			case 2:
				_localctx = new SimpleValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(712);
				((SimpleValueContext)_localctx).simple = valueOptions();
				}
				break;
			case 3:
				_localctx = new ObjectValueValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(713);
				((ObjectValueValueContext)_localctx).objVal = objectValue();
				}
				break;
			case 4:
				_localctx = new ObjectFunctionValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(714);
				((ObjectFunctionValueContext)_localctx).funcCall = objectFunction();
				}
				break;
			case 5:
				_localctx = new ArrayValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(715);
				((ArrayValueContext)_localctx).array = arrayValues();
				}
				break;
			case 6:
				_localctx = new AssertionValueValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(716);
				((AssertionValueValueContext)_localctx).assertion = assertionValue();
				}
				break;
			case 7:
				_localctx = new ArrowFunctionValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(717);
				((ArrowFunctionValueContext)_localctx).arrowFunc = arrowFunction();
				}
				break;
			case 8:
				_localctx = new InterfaceValuesValueContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(718);
				((InterfaceValuesValueContext)_localctx).ifaceValue = interfaceValues();
				}
				break;
			case 9:
				_localctx = new ExpressionValueContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(719);
				((ExpressionValueContext)_localctx).expr = expression();
				}
				break;
			case 10:
				_localctx = new NullValueContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(720);
				match(NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignValueContext extends ParserRuleContext {
		public Token target;
		public ObjectValueContext objTarget;
		public AllValuesContext value;
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public AllValuesContext allValues() {
			return getRuleContext(AllValuesContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ObjectValueContext objectValue() {
			return getRuleContext(ObjectValueContext.class,0);
		}
		public AssignValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssignValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssignValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssignValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignValueContext assignValue() throws RecognitionException {
		AssignValueContext _localctx = new AssignValueContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_assignValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(723);
				((AssignValueContext)_localctx).target = match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(724);
				((AssignValueContext)_localctx).objTarget = objectValue();
				}
				break;
			}
			setState(727);
			match(ASSIGN);
			setState(728);
			((AssignValueContext)_localctx).value = allValues();
			setState(729);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceValuesContext extends ParserRuleContext {
		public InterfaceValueContext interfaceValue;
		public List<InterfaceValueContext> members = new ArrayList<InterfaceValueContext>();
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<InterfaceValueContext> interfaceValue() {
			return getRuleContexts(InterfaceValueContext.class);
		}
		public InterfaceValueContext interfaceValue(int i) {
			return getRuleContext(InterfaceValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public InterfaceValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceValuesContext interfaceValues() throws RecognitionException {
		InterfaceValuesContext _localctx = new InterfaceValuesContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_interfaceValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(LBRACE);
			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4899916394582245376L) != 0) || _la==IDENTIFIER) {
				{
				setState(732);
				((InterfaceValuesContext)_localctx).interfaceValue = interfaceValue();
				((InterfaceValuesContext)_localctx).members.add(((InterfaceValuesContext)_localctx).interfaceValue);
				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(733);
					match(COMMA);
					setState(734);
					((InterfaceValuesContext)_localctx).interfaceValue = interfaceValue();
					((InterfaceValuesContext)_localctx).members.add(((InterfaceValuesContext)_localctx).interfaceValue);
					}
					}
					setState(739);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(742);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceValueContext extends ParserRuleContext {
		public InterfaceValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceValue; }
	 
		public InterfaceValueContext() { }
		public void copyFrom(InterfaceValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMethodContext extends InterfaceValueContext {
		public ObjectFunctionContext method;
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ObjectFunctionContext objectFunction() {
			return getRuleContext(ObjectFunctionContext.class,0);
		}
		public InterfaceMethodContext(InterfaceValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfacePropertyContext extends InterfaceValueContext {
		public Token name;
		public AllValuesContext value;
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public AllValuesContext allValues() {
			return getRuleContext(AllValuesContext.class,0);
		}
		public InterfacePropertyContext(InterfaceValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceValueContext interfaceValue() throws RecognitionException {
		InterfaceValueContext _localctx = new InterfaceValueContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_interfaceValue);
		try {
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				_localctx = new InterfacePropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(744);
				((InterfacePropertyContext)_localctx).name = match(IDENTIFIER);
				setState(745);
				match(COLON);
				setState(746);
				((InterfacePropertyContext)_localctx).value = allValues();
				}
				break;
			case 2:
				_localctx = new InterfaceMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(747);
				((InterfaceMethodContext)_localctx).method = objectFunction();
				setState(748);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassValueContext extends ParserRuleContext {
		public Token className;
		public AllValuesContext allValues;
		public List<AllValuesContext> args = new ArrayList<AllValuesContext>();
		public TerminalNode NEW() { return getToken(AngularParser.NEW, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public List<AllValuesContext> allValues() {
			return getRuleContexts(AllValuesContext.class);
		}
		public AllValuesContext allValues(int i) {
			return getRuleContext(AllValuesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ClassValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassValueContext classValue() throws RecognitionException {
		ClassValueContext _localctx = new ClassValueContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_classValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(NEW);
			setState(753);
			((ClassValueContext)_localctx).className = match(IDENTIFIER);
			setState(754);
			match(LPAREN);
			{
			setState(755);
			((ClassValueContext)_localctx).allValues = allValues();
			((ClassValueContext)_localctx).args.add(((ClassValueContext)_localctx).allValues);
			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(756);
				match(COMMA);
				setState(757);
				((ClassValueContext)_localctx).allValues = allValues();
				((ClassValueContext)_localctx).args.add(((ClassValueContext)_localctx).allValues);
				}
				}
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(763);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public Token name;
		public AllValuesContext allValues;
		public List<AllValuesContext> args = new ArrayList<AllValuesContext>();
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public TerminalNode SUPER() { return getToken(AngularParser.SUPER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public List<AllValuesContext> allValues() {
			return getRuleContexts(AllValuesContext.class);
		}
		public AllValuesContext allValues(int i) {
			return getRuleContext(AllValuesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(765);
				((FunctionCallContext)_localctx).name = match(IDENTIFIER);
				}
				break;
			case SUPER:
				{
				setState(766);
				match(SUPER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(769);
			match(LPAREN);
			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6124895493227020288L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 62397284880387L) != 0)) {
				{
				setState(770);
				((FunctionCallContext)_localctx).allValues = allValues();
				((FunctionCallContext)_localctx).args.add(((FunctionCallContext)_localctx).allValues);
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(771);
					match(COMMA);
					setState(772);
					((FunctionCallContext)_localctx).allValues = allValues();
					((FunctionCallContext)_localctx).args.add(((FunctionCallContext)_localctx).allValues);
					}
					}
					setState(777);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(780);
			match(RPAREN);
			setState(781);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsonDefContext extends ParserRuleContext {
		public JsonBodyContext jsonBody;
		public List<JsonBodyContext> props = new ArrayList<JsonBodyContext>();
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public List<JsonBodyContext> jsonBody() {
			return getRuleContexts(JsonBodyContext.class);
		}
		public JsonBodyContext jsonBody(int i) {
			return getRuleContext(JsonBodyContext.class,i);
		}
		public JsonDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJsonDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJsonDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJsonDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonDefContext jsonDef() throws RecognitionException {
		JsonDefContext _localctx = new JsonDefContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_jsonDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(LBRACE);
			setState(792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(784);
				((JsonDefContext)_localctx).jsonBody = jsonBody();
				((JsonDefContext)_localctx).props.add(((JsonDefContext)_localctx).jsonBody);
				setState(789);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(785);
						match(COMMA);
						setState(786);
						((JsonDefContext)_localctx).jsonBody = jsonBody();
						((JsonDefContext)_localctx).props.add(((JsonDefContext)_localctx).jsonBody);
						}
						} 
					}
					setState(791);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				}
			}

			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(794);
				match(COMMA);
				}
			}

			setState(797);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsonBodyContext extends ParserRuleContext {
		public Token key;
		public AllValuesContext value;
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public AllValuesContext allValues() {
			return getRuleContext(AllValuesContext.class,0);
		}
		public JsonBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJsonBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJsonBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJsonBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonBodyContext jsonBody() throws RecognitionException {
		JsonBodyContext _localctx = new JsonBodyContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_jsonBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			((JsonBodyContext)_localctx).key = match(IDENTIFIER);
			setState(800);
			match(COLON);
			setState(801);
			((JsonBodyContext)_localctx).value = allValues();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExpressionContext extends ExpressionContext {
		public ExpressionContext expr;
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectValueExpressionContext extends ExpressionContext {
		public ObjectValueContext objVal;
		public ObjectValueContext objectValue() {
			return getRuleContext(ObjectValueContext.class,0);
		}
		public ObjectValueExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditionExpressionExpressionContext extends ExpressionContext {
		public AdditionExpressionContext addExpr;
		public AdditionExpressionContext additionExpression() {
			return getRuleContext(AdditionExpressionContext.class,0);
		}
		public AdditionExpressionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAdditionExpressionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAdditionExpressionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAdditionExpressionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralExpressionContext extends ExpressionContext {
		public StringLiteralContext strLit;
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public StringLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStringLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStringLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStringLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExpressionContext extends ExpressionContext {
		public Token str;
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionExpressionContext extends ExpressionContext {
		public ComparisonExpressionContext cmpExpr;
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public ComparisonExpressionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComparisonExpressionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComparisonExpressionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComparisonExpressionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayValueExpressionContext extends ExpressionContext {
		public ArrayValuesContext arrVal;
		public ArrayValuesContext arrayValues() {
			return getRuleContext(ArrayValuesContext.class,0);
		}
		public ArrayValueExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticExpressionContext extends ExpressionContext {
		public ArithmeticOperationContext arithOp;
		public ArithmeticOperationContext arithmeticOperation() {
			return getRuleContext(ArithmeticOperationContext.class,0);
		}
		public ArithmeticExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArithmeticExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArithmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExpressionContext extends ExpressionContext {
		public Token id;
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_expression);
		try {
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				_localctx = new StringLiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(803);
				((StringLiteralExpressionContext)_localctx).strLit = stringLiteral();
				}
				break;
			case 2:
				_localctx = new StringExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(804);
				((StringExpressionContext)_localctx).str = match(STRING);
				}
				break;
			case 3:
				_localctx = new IdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(805);
				((IdentifierExpressionContext)_localctx).id = match(IDENTIFIER);
				}
				break;
			case 4:
				_localctx = new AdditionExpressionExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(806);
				((AdditionExpressionExpressionContext)_localctx).addExpr = additionExpression(0);
				}
				break;
			case 5:
				_localctx = new ParenthesizedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(807);
				match(LPAREN);
				setState(808);
				((ParenthesizedExpressionContext)_localctx).expr = expression();
				setState(809);
				match(RPAREN);
				}
				break;
			case 6:
				_localctx = new ComparisonExpressionExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(811);
				((ComparisonExpressionExpressionContext)_localctx).cmpExpr = comparisonExpression();
				}
				break;
			case 7:
				_localctx = new ArithmeticExpressionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(812);
				((ArithmeticExpressionContext)_localctx).arithOp = arithmeticOperation();
				}
				break;
			case 8:
				_localctx = new ObjectValueExpressionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(813);
				((ObjectValueExpressionContext)_localctx).objVal = objectValue();
				}
				break;
			case 9:
				_localctx = new ArrayValueExpressionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(814);
				((ArrayValueExpressionContext)_localctx).arrVal = arrayValues();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext leftExpr;
		public Token op;
		public AdditiveExpressionContext rightExpr;
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(AngularParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(AngularParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(AngularParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(AngularParser.GT, i);
		}
		public List<TerminalNode> LTE() { return getTokens(AngularParser.LTE); }
		public TerminalNode LTE(int i) {
			return getToken(AngularParser.LTE, i);
		}
		public List<TerminalNode> GTE() { return getTokens(AngularParser.GTE); }
		public TerminalNode GTE(int i) {
			return getToken(AngularParser.GTE, i);
		}
		public List<TerminalNode> EQ() { return getTokens(AngularParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(AngularParser.EQ, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(AngularParser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(AngularParser.NEQ, i);
		}
		public List<TerminalNode> STRICT_EQ() { return getTokens(AngularParser.STRICT_EQ); }
		public TerminalNode STRICT_EQ(int i) {
			return getToken(AngularParser.STRICT_EQ, i);
		}
		public List<TerminalNode> STRICT_NEQ() { return getTokens(AngularParser.STRICT_NEQ); }
		public TerminalNode STRICT_NEQ(int i) {
			return getToken(AngularParser.STRICT_NEQ, i);
		}
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_comparisonExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			((ComparisonExpressionContext)_localctx).leftExpr = additiveExpression();
			setState(822);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(818);
					((ComparisonExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 2215771016666284035L) != 0)) ) {
						((ComparisonExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					setState(819);
					((ComparisonExpressionContext)_localctx).rightExpr = additiveExpression();
					}
					} 
				}
				setState(824);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext leftExpr;
		public Token op;
		public MultiplicativeExpressionContext rightExpr;
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(AngularParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(AngularParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(AngularParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(AngularParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_additiveExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			((AdditiveExpressionContext)_localctx).leftExpr = multiplicativeExpression();
			setState(830);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(826);
					((AdditiveExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						((AdditiveExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					setState(827);
					((AdditiveExpressionContext)_localctx).rightExpr = multiplicativeExpression();
					}
					} 
				}
				setState(832);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext leftExpr;
		public Token op;
		public PrimaryExpressionContext rightExpr;
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(AngularParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(AngularParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(AngularParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(AngularParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(AngularParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(AngularParser.MOD, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_multiplicativeExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			((MultiplicativeExpressionContext)_localctx).leftExpr = primaryExpression();
			setState(838);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(834);
					((MultiplicativeExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 7L) != 0)) ) {
						((MultiplicativeExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					setState(835);
					((MultiplicativeExpressionContext)_localctx).rightExpr = primaryExpression();
					}
					} 
				}
				setState(840);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryIdentifierContext extends PrimaryExpressionContext {
		public Token id;
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public PrimaryIdentifierContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPrimaryIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPrimaryIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPrimaryIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryStringContext extends PrimaryExpressionContext {
		public Token str;
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public PrimaryStringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPrimaryString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPrimaryString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPrimaryString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryNumberContext extends PrimaryExpressionContext {
		public Token num;
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public PrimaryNumberContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPrimaryNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPrimaryNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPrimaryNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryObjectContext extends PrimaryExpressionContext {
		public ObjectValueContext obj;
		public ObjectValueContext objectValue() {
			return getRuleContext(ObjectValueContext.class,0);
		}
		public PrimaryObjectContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPrimaryObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPrimaryObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPrimaryObject(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryArithmeticContext extends PrimaryExpressionContext {
		public ArithmeticOperationContext arith;
		public ArithmeticOperationContext arithmeticOperation() {
			return getRuleContext(ArithmeticOperationContext.class,0);
		}
		public PrimaryArithmeticContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPrimaryArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPrimaryArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPrimaryArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryArrayContext extends PrimaryExpressionContext {
		public ArrayValuesContext arr;
		public ArrayValuesContext arrayValues() {
			return getRuleContext(ArrayValuesContext.class,0);
		}
		public PrimaryArrayContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPrimaryArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPrimaryArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPrimaryArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryParenthesizedContext extends PrimaryExpressionContext {
		public ExpressionContext expr;
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryParenthesizedContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPrimaryParenthesized(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPrimaryParenthesized(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPrimaryParenthesized(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_primaryExpression);
		try {
			setState(851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				_localctx = new PrimaryIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(841);
				((PrimaryIdentifierContext)_localctx).id = match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new PrimaryNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(842);
				((PrimaryNumberContext)_localctx).num = match(NUMBER);
				}
				break;
			case 3:
				_localctx = new PrimaryStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(843);
				((PrimaryStringContext)_localctx).str = match(STRING);
				}
				break;
			case 4:
				_localctx = new PrimaryParenthesizedContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(844);
				match(LPAREN);
				setState(845);
				((PrimaryParenthesizedContext)_localctx).expr = expression();
				setState(846);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new PrimaryObjectContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(848);
				((PrimaryObjectContext)_localctx).obj = objectValue();
				}
				break;
			case 6:
				_localctx = new PrimaryArrayContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(849);
				((PrimaryArrayContext)_localctx).arr = arrayValues();
				}
				break;
			case 7:
				_localctx = new PrimaryArithmeticContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(850);
				((PrimaryArithmeticContext)_localctx).arith = arithmeticOperation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditionExpressionContext extends ParserRuleContext {
		public AdditionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionExpression; }
	 
		public AdditionExpressionContext() { }
		public void copyFrom(AdditionExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestedAdditionContext extends AdditionExpressionContext {
		public AdditionExpressionContext leftAdd;
		public ExpressionContext rightExpr;
		public TerminalNode PLUS() { return getToken(AngularParser.PLUS, 0); }
		public AdditionExpressionContext additionExpression() {
			return getRuleContext(AdditionExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NestedAdditionContext(AdditionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNestedAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNestedAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNestedAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringConcatenationContext extends AdditionExpressionContext {
		public Token leftStr;
		public ExpressionContext rightExpr;
		public TerminalNode PLUS() { return getToken(AngularParser.PLUS, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StringConcatenationContext(AdditionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStringConcatenation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStringConcatenation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStringConcatenation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierConcatenationContext extends AdditionExpressionContext {
		public Token leftId;
		public ExpressionContext rightExpr;
		public TerminalNode PLUS() { return getToken(AngularParser.PLUS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierConcatenationContext(AdditionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifierConcatenation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifierConcatenation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifierConcatenation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionExpressionContext additionExpression() throws RecognitionException {
		return additionExpression(0);
	}

	private AdditionExpressionContext additionExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditionExpressionContext _localctx = new AdditionExpressionContext(_ctx, _parentState);
		AdditionExpressionContext _prevctx = _localctx;
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_additionExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				_localctx = new StringConcatenationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(854);
				((StringConcatenationContext)_localctx).leftStr = match(STRING);
				setState(855);
				match(PLUS);
				setState(856);
				((StringConcatenationContext)_localctx).rightExpr = expression();
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdentifierConcatenationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(857);
				((IdentifierConcatenationContext)_localctx).leftId = match(IDENTIFIER);
				setState(858);
				match(PLUS);
				setState(859);
				((IdentifierConcatenationContext)_localctx).rightExpr = expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(867);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NestedAdditionContext(new AdditionExpressionContext(_parentctx, _parentState));
					((NestedAdditionContext)_localctx).leftAdd = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_additionExpression);
					setState(862);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(863);
					match(PLUS);
					setState(864);
					((NestedAdditionContext)_localctx).rightExpr = expression();
					}
					} 
				}
				setState(869);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> LITERAL() { return getTokens(AngularParser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(AngularParser.LITERAL, i);
		}
		public List<LiteralContentContext> literalContent() {
			return getRuleContexts(LiteralContentContext.class);
		}
		public LiteralContentContext literalContent(int i) {
			return getRuleContext(LiteralContentContext.class,i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			match(LITERAL);
			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 216172782164103103L) != 0)) {
				{
				{
				setState(871);
				literalContent();
				}
				}
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(877);
			match(LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContentContext extends ParserRuleContext {
		public LiteralContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalContent; }
	 
		public LiteralContentContext() { }
		public void copyFrom(LiteralContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateSubstitutionContentContext extends LiteralContentContext {
		public TemplateSubstitutionContext templateSubstitution() {
			return getRuleContext(TemplateSubstitutionContext.class,0);
		}
		public TemplateSubstitutionContentContext(LiteralContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateSubstitutionContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateSubstitutionContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateSubstitutionContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContentContext extends LiteralContentContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public IdentifierContentContext(LiteralContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifierContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifierContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifierContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SymbolContentContext extends LiteralContentContext {
		public SymbolsContext symbols() {
			return getRuleContext(SymbolsContext.class,0);
		}
		public SymbolContentContext(LiteralContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSymbolContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSymbolContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSymbolContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticOperatorContentContext extends LiteralContentContext {
		public ArithmeticDeclarationContext arithmeticDeclaration() {
			return getRuleContext(ArithmeticDeclarationContext.class,0);
		}
		public ArithmeticOperatorContentContext(LiteralContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArithmeticOperatorContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArithmeticOperatorContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArithmeticOperatorContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOperatorContentContext extends LiteralContentContext {
		public LogicOperationsContext logicOperations() {
			return getRuleContext(LogicOperationsContext.class,0);
		}
		public LogicalOperatorContentContext(LiteralContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLogicalOperatorContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLogicalOperatorContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLogicalOperatorContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberContentContext extends LiteralContentContext {
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public NumberContentContext(LiteralContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNumberContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNumberContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNumberContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContentContext literalContent() throws RecognitionException {
		LiteralContentContext _localctx = new LiteralContentContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_literalContent);
		try {
			setState(885);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SDOLLAR:
				_localctx = new TemplateSubstitutionContentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(879);
				templateSubstitution();
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentifierContentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(880);
				match(IDENTIFIER);
				}
				break;
			case PLUS:
			case MINUS:
			case MUL:
			case DIV:
			case MOD:
				_localctx = new ArithmeticOperatorContentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(881);
				arithmeticDeclaration();
				}
				break;
			case LT:
			case GT:
			case EQ:
			case STRICT_EQ:
			case NEQ:
			case STRICT_NEQ:
				_localctx = new LogicalOperatorContentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(882);
				logicOperations();
				}
				break;
			case LPAREN:
			case RPAREN:
			case LBRACK:
			case RBRACK:
			case SEMI:
			case COLON:
			case COMMA:
			case DOT:
			case QUESTION:
			case AT:
				_localctx = new SymbolContentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(883);
				symbols();
				}
				break;
			case NUMBER:
				_localctx = new NumberContentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(884);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateSubstitutionContext extends ParserRuleContext {
		public ExpressionContext expr;
		public TerminalNode SDOLLAR() { return getToken(AngularParser.SDOLLAR, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TemplateSubstitutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateSubstitution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateSubstitution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateSubstitution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateSubstitution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateSubstitutionContext templateSubstitution() throws RecognitionException {
		TemplateSubstitutionContext _localctx = new TemplateSubstitutionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_templateSubstitution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			match(SDOLLAR);
			setState(888);
			match(LBRACE);
			setState(889);
			((TemplateSubstitutionContext)_localctx).expr = expression();
			setState(890);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccessModifiersContext extends ParserRuleContext {
		public AccessModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifiers; }
	 
		public AccessModifiersContext() { }
		public void copyFrom(AccessModifiersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrivateModifierContext extends AccessModifiersContext {
		public TerminalNode PRIVATE() { return getToken(AngularParser.PRIVATE, 0); }
		public PrivateModifierContext(AccessModifiersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPrivateModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPrivateModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPrivateModifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProtectedModifierContext extends AccessModifiersContext {
		public TerminalNode PROTECTED() { return getToken(AngularParser.PROTECTED, 0); }
		public ProtectedModifierContext(AccessModifiersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProtectedModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProtectedModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProtectedModifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PublicModifierContext extends AccessModifiersContext {
		public TerminalNode PUBLIC() { return getToken(AngularParser.PUBLIC, 0); }
		public PublicModifierContext(AccessModifiersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPublicModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPublicModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPublicModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifiersContext accessModifiers() throws RecognitionException {
		AccessModifiersContext _localctx = new AccessModifiersContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_accessModifiers);
		try {
			setState(895);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				_localctx = new PublicModifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(892);
				match(PUBLIC);
				}
				break;
			case PRIVATE:
				_localctx = new PrivateModifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(893);
				match(PRIVATE);
				}
				break;
			case PROTECTED:
				_localctx = new ProtectedModifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(894);
				match(PROTECTED);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDefContext extends ParserRuleContext {
		public ComponentPropertyDefContext componentPropertyDef;
		public List<ComponentPropertyDefContext> props = new ArrayList<ComponentPropertyDefContext>();
		public TerminalNode COMPONENT() { return getToken(AngularParser.COMPONENT, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public List<ComponentPropertyDefContext> componentPropertyDef() {
			return getRuleContexts(ComponentPropertyDefContext.class);
		}
		public ComponentPropertyDefContext componentPropertyDef(int i) {
			return getRuleContext(ComponentPropertyDefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ComponentDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDefContext componentDef() throws RecognitionException {
		ComponentDefContext _localctx = new ComponentDefContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_componentDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			match(COMPONENT);
			setState(898);
			match(LPAREN);
			setState(899);
			match(LBRACE);
			setState(900);
			((ComponentDefContext)_localctx).componentPropertyDef = componentPropertyDef();
			((ComponentDefContext)_localctx).props.add(((ComponentDefContext)_localctx).componentPropertyDef);
			setState(905);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(901);
				match(COMMA);
				setState(902);
				((ComponentDefContext)_localctx).componentPropertyDef = componentPropertyDef();
				((ComponentDefContext)_localctx).props.add(((ComponentDefContext)_localctx).componentPropertyDef);
				}
				}
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(908);
			match(RBRACE);
			setState(909);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentPropertyDefContext extends ParserRuleContext {
		public ComponentPropertyDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentPropertyDef; }
	 
		public ComponentPropertyDefContext() { }
		public void copyFrom(ComponentPropertyDefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StandalonePropertyContext extends ComponentPropertyDefContext {
		public StandaloneDefContext standaloneDef() {
			return getRuleContext(StandaloneDefContext.class,0);
		}
		public StandalonePropertyContext(ComponentPropertyDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStandaloneProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStandaloneProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStandaloneProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentCustomPropertyContext extends ComponentPropertyDefContext {
		public ComponentPropertyContext prop;
		public ComponentPropertyContext componentProperty() {
			return getRuleContext(ComponentPropertyContext.class,0);
		}
		public ComponentCustomPropertyContext(ComponentPropertyDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentCustomProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentCustomProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentCustomProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleUrlsPropertyContext extends ComponentPropertyDefContext {
		public StyleUrlsDefContext styleUrlsDef() {
			return getRuleContext(StyleUrlsDefContext.class,0);
		}
		public StyleUrlsPropertyContext(ComponentPropertyDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleUrlsProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleUrlsProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleUrlsProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplatePropertyContext extends ComponentPropertyDefContext {
		public TemplateDefContext templateDef() {
			return getRuleContext(TemplateDefContext.class,0);
		}
		public TemplatePropertyContext(ComponentPropertyDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectorPropertyContext extends ComponentPropertyDefContext {
		public SelectorDefContext selectorDef() {
			return getRuleContext(SelectorDefContext.class,0);
		}
		public SelectorPropertyContext(ComponentPropertyDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelectorProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelectorProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelectorProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportsPropertyContext extends ComponentPropertyDefContext {
		public ImportsDefContext importsDef() {
			return getRuleContext(ImportsDefContext.class,0);
		}
		public ImportsPropertyContext(ComponentPropertyDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportsProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportsProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportsProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StylesPropertyContext extends ComponentPropertyDefContext {
		public StylesDefContext stylesDef() {
			return getRuleContext(StylesDefContext.class,0);
		}
		public StylesPropertyContext(ComponentPropertyDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStylesProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStylesProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStylesProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateUrlPropertyContext extends ComponentPropertyDefContext {
		public TemplateUrlDefContext templateUrlDef() {
			return getRuleContext(TemplateUrlDefContext.class,0);
		}
		public TemplateUrlPropertyContext(ComponentPropertyDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateUrlProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateUrlProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateUrlProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentPropertyDefContext componentPropertyDef() throws RecognitionException {
		ComponentPropertyDefContext _localctx = new ComponentPropertyDefContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_componentPropertyDef);
		try {
			setState(919);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new SelectorPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(911);
				selectorDef();
				}
				break;
			case STAND_ALONE:
				_localctx = new StandalonePropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(912);
				standaloneDef();
				}
				break;
			case IMPORTS:
				_localctx = new ImportsPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(913);
				importsDef();
				}
				break;
			case TEMPLATE:
				_localctx = new TemplatePropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(914);
				templateDef();
				}
				break;
			case TEMPLATEURL:
				_localctx = new TemplateUrlPropertyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(915);
				templateUrlDef();
				}
				break;
			case STYLES:
				_localctx = new StylesPropertyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(916);
				stylesDef();
				}
				break;
			case STYLEURLS:
				_localctx = new StyleUrlsPropertyContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(917);
				styleUrlsDef();
				}
				break;
			case IDENTIFIER:
				_localctx = new ComponentCustomPropertyContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(918);
				((ComponentCustomPropertyContext)_localctx).prop = componentProperty();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StandaloneDefContext extends ParserRuleContext {
		public Token value;
		public TerminalNode STAND_ALONE() { return getToken(AngularParser.STAND_ALONE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode BOOLEAN() { return getToken(AngularParser.BOOLEAN, 0); }
		public StandaloneDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStandaloneDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStandaloneDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStandaloneDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneDefContext standaloneDef() throws RecognitionException {
		StandaloneDefContext _localctx = new StandaloneDefContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_standaloneDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			match(STAND_ALONE);
			setState(922);
			match(COLON);
			setState(923);
			((StandaloneDefContext)_localctx).value = match(BOOLEAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorDefContext extends ParserRuleContext {
		public Token selector;
		public TerminalNode SELECTOR() { return getToken(AngularParser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public SelectorDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelectorDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelectorDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelectorDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorDefContext selectorDef() throws RecognitionException {
		SelectorDefContext _localctx = new SelectorDefContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_selectorDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			match(SELECTOR);
			setState(926);
			match(COLON);
			setState(927);
			((SelectorDefContext)_localctx).selector = match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateDefContext extends ParserRuleContext {
		public Token start;
		public HtmlContext content;
		public Token end;
		public TerminalNode TEMPLATE() { return getToken(AngularParser.TEMPLATE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public List<TerminalNode> LITERAL() { return getTokens(AngularParser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(AngularParser.LITERAL, i);
		}
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public TemplateDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateDefContext templateDef() throws RecognitionException {
		TemplateDefContext _localctx = new TemplateDefContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_templateDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			match(TEMPLATE);
			setState(930);
			match(COLON);
			setState(931);
			((TemplateDefContext)_localctx).start = match(LITERAL);
			setState(932);
			((TemplateDefContext)_localctx).content = html();
			setState(933);
			((TemplateDefContext)_localctx).end = match(LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateUrlDefContext extends ParserRuleContext {
		public Token path;
		public TerminalNode TEMPLATEURL() { return getToken(AngularParser.TEMPLATEURL, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TemplateUrlDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateUrlDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateUrlDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateUrlDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateUrlDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateUrlDefContext templateUrlDef() throws RecognitionException {
		TemplateUrlDefContext _localctx = new TemplateUrlDefContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_templateUrlDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			match(TEMPLATEURL);
			setState(936);
			match(COLON);
			setState(937);
			((TemplateUrlDefContext)_localctx).path = match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleDefContext extends ParserRuleContext {
		public List<TerminalNode> LITERAL() { return getTokens(AngularParser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(AngularParser.LITERAL, i);
		}
		public List<CssRuleContext> cssRule() {
			return getRuleContexts(CssRuleContext.class);
		}
		public CssRuleContext cssRule(int i) {
			return getRuleContext(CssRuleContext.class,i);
		}
		public StyleDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleDefContext styleDef() throws RecognitionException {
		StyleDefContext _localctx = new StyleDefContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_styleDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			match(LITERAL);
			setState(943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 68719476801L) != 0)) {
				{
				{
				setState(940);
				cssRule();
				}
				}
				setState(945);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(946);
			match(LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StylesDefContext extends ParserRuleContext {
		public Token styleList;
		public StyleDefContext styleDef;
		public List<StyleDefContext> styleDefs = new ArrayList<StyleDefContext>();
		public TerminalNode STYLES() { return getToken(AngularParser.STYLES, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode RBRACK() { return getToken(AngularParser.RBRACK, 0); }
		public TerminalNode LBRACK() { return getToken(AngularParser.LBRACK, 0); }
		public List<StyleDefContext> styleDef() {
			return getRuleContexts(StyleDefContext.class);
		}
		public StyleDefContext styleDef(int i) {
			return getRuleContext(StyleDefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public StylesDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStylesDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStylesDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStylesDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesDefContext stylesDef() throws RecognitionException {
		StylesDefContext _localctx = new StylesDefContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_stylesDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			match(STYLES);
			setState(949);
			match(COLON);
			setState(950);
			((StylesDefContext)_localctx).styleList = match(LBRACK);
			setState(959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LITERAL) {
				{
				setState(951);
				((StylesDefContext)_localctx).styleDef = styleDef();
				((StylesDefContext)_localctx).styleDefs.add(((StylesDefContext)_localctx).styleDef);
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(952);
					match(COMMA);
					setState(953);
					((StylesDefContext)_localctx).styleDef = styleDef();
					((StylesDefContext)_localctx).styleDefs.add(((StylesDefContext)_localctx).styleDef);
					}
					}
					setState(958);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(961);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleUrlsDefContext extends ParserRuleContext {
		public Token paths;
		public Token STRING;
		public List<Token> urls = new ArrayList<Token>();
		public TerminalNode STYLEURLS() { return getToken(AngularParser.STYLEURLS, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode RBRACK() { return getToken(AngularParser.RBRACK, 0); }
		public TerminalNode LBRACK() { return getToken(AngularParser.LBRACK, 0); }
		public List<TerminalNode> STRING() { return getTokens(AngularParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(AngularParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public StyleUrlsDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleUrlsDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleUrlsDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleUrlsDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleUrlsDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleUrlsDefContext styleUrlsDef() throws RecognitionException {
		StyleUrlsDefContext _localctx = new StyleUrlsDefContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_styleUrlsDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			match(STYLEURLS);
			setState(964);
			match(COLON);
			setState(965);
			((StyleUrlsDefContext)_localctx).paths = match(LBRACK);
			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(966);
				((StyleUrlsDefContext)_localctx).STRING = match(STRING);
				((StyleUrlsDefContext)_localctx).urls.add(((StyleUrlsDefContext)_localctx).STRING);
				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(967);
					match(COMMA);
					setState(968);
					((StyleUrlsDefContext)_localctx).STRING = match(STRING);
					((StyleUrlsDefContext)_localctx).urls.add(((StyleUrlsDefContext)_localctx).STRING);
					}
					}
					setState(973);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(976);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentPropertyContext extends ParserRuleContext {
		public Token name;
		public ComponentPropertyValueContext value;
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ComponentPropertyValueContext componentPropertyValue() {
			return getRuleContext(ComponentPropertyValueContext.class,0);
		}
		public ComponentPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentPropertyContext componentProperty() throws RecognitionException {
		ComponentPropertyContext _localctx = new ComponentPropertyContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_componentProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			((ComponentPropertyContext)_localctx).name = match(IDENTIFIER);
			setState(979);
			match(COLON);
			setState(980);
			((ComponentPropertyContext)_localctx).value = componentPropertyValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentPropertyValueContext extends ParserRuleContext {
		public ComponentPropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentPropertyValue; }
	 
		public ComponentPropertyValueContext() { }
		public void copyFrom(ComponentPropertyValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentNumberValueContext extends ComponentPropertyValueContext {
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public ComponentNumberValueContext(ComponentPropertyValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentNumberValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentNumberValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentNumberValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentBooleanValueContext extends ComponentPropertyValueContext {
		public TerminalNode BOOLEAN() { return getToken(AngularParser.BOOLEAN, 0); }
		public ComponentBooleanValueContext(ComponentPropertyValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentStringValueContext extends ComponentPropertyValueContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public ComponentStringValueContext(ComponentPropertyValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentStringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentStringValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentObjectValueContext extends ComponentPropertyValueContext {
		public ObjectValueContext objectValue() {
			return getRuleContext(ObjectValueContext.class,0);
		}
		public ComponentObjectValueContext(ComponentPropertyValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentObjectValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentObjectValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentObjectValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentArrayValueContext extends ComponentPropertyValueContext {
		public ArrayValuesContext arrayValues() {
			return getRuleContext(ArrayValuesContext.class,0);
		}
		public ComponentArrayValueContext(ComponentPropertyValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentArrayValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentArrayValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentArrayValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentPropertyValueContext componentPropertyValue() throws RecognitionException {
		ComponentPropertyValueContext _localctx = new ComponentPropertyValueContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_componentPropertyValue);
		try {
			setState(987);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new ComponentStringValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(982);
				match(STRING);
				}
				break;
			case BOOLEAN:
				_localctx = new ComponentBooleanValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(983);
				match(BOOLEAN);
				}
				break;
			case NUMBER:
				_localctx = new ComponentNumberValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(984);
				match(NUMBER);
				}
				break;
			case SUPER:
			case THIS:
			case LPAREN:
			case LT:
			case IDENTIFIER:
				_localctx = new ComponentObjectValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(985);
				objectValue();
				}
				break;
			case LBRACK:
				_localctx = new ComponentArrayValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(986);
				arrayValues();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ServiceDefContext extends ParserRuleContext {
		public ServicePropertyContext serviceProperty;
		public List<ServicePropertyContext> props = new ArrayList<ServicePropertyContext>();
		public TerminalNode INJECTABLE() { return getToken(AngularParser.INJECTABLE, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public List<ServicePropertyContext> serviceProperty() {
			return getRuleContexts(ServicePropertyContext.class);
		}
		public ServicePropertyContext serviceProperty(int i) {
			return getRuleContext(ServicePropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ServiceDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterServiceDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitServiceDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitServiceDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServiceDefContext serviceDef() throws RecognitionException {
		ServiceDefContext _localctx = new ServiceDefContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_serviceDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			match(INJECTABLE);
			setState(990);
			match(LPAREN);
			setState(991);
			match(LBRACE);
			setState(1000);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(992);
				((ServiceDefContext)_localctx).serviceProperty = serviceProperty();
				((ServiceDefContext)_localctx).props.add(((ServiceDefContext)_localctx).serviceProperty);
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(993);
					match(COMMA);
					setState(994);
					((ServiceDefContext)_localctx).serviceProperty = serviceProperty();
					((ServiceDefContext)_localctx).props.add(((ServiceDefContext)_localctx).serviceProperty);
					}
					}
					setState(999);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1002);
			match(RBRACE);
			setState(1003);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ServicePropertyContext extends ParserRuleContext {
		public Token name;
		public ServicePropertyValueContext value;
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ServicePropertyValueContext servicePropertyValue() {
			return getRuleContext(ServicePropertyValueContext.class,0);
		}
		public ServicePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterServiceProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitServiceProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitServiceProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServicePropertyContext serviceProperty() throws RecognitionException {
		ServicePropertyContext _localctx = new ServicePropertyContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_serviceProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			((ServicePropertyContext)_localctx).name = match(IDENTIFIER);
			setState(1006);
			match(COLON);
			setState(1007);
			((ServicePropertyContext)_localctx).value = servicePropertyValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ServicePropertyValueContext extends ParserRuleContext {
		public ServicePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_servicePropertyValue; }
	 
		public ServicePropertyValueContext() { }
		public void copyFrom(ServicePropertyValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ServiceStringValueContext extends ServicePropertyValueContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public ServiceStringValueContext(ServicePropertyValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterServiceStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitServiceStringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitServiceStringValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ServiceIdentifierValueContext extends ServicePropertyValueContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ServiceIdentifierValueContext(ServicePropertyValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterServiceIdentifierValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitServiceIdentifierValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitServiceIdentifierValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ServiceNumberValueContext extends ServicePropertyValueContext {
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public ServiceNumberValueContext(ServicePropertyValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterServiceNumberValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitServiceNumberValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitServiceNumberValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ServiceBooleanValueContext extends ServicePropertyValueContext {
		public TerminalNode BOOLEAN() { return getToken(AngularParser.BOOLEAN, 0); }
		public ServiceBooleanValueContext(ServicePropertyValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterServiceBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitServiceBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitServiceBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServicePropertyValueContext servicePropertyValue() throws RecognitionException {
		ServicePropertyValueContext _localctx = new ServicePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_servicePropertyValue);
		try {
			setState(1013);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new ServiceStringValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1009);
				match(STRING);
				}
				break;
			case BOOLEAN:
				_localctx = new ServiceBooleanValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1010);
				match(BOOLEAN);
				}
				break;
			case NUMBER:
				_localctx = new ServiceNumberValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1011);
				match(NUMBER);
				}
				break;
			case IDENTIFIER:
				_localctx = new ServiceIdentifierValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1012);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContext extends ParserRuleContext {
		public HtmlElementContext htmlElement;
		public List<HtmlElementContext> elements = new ArrayList<HtmlElementContext>();
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public HtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_html);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LT) {
				{
				{
				setState(1015);
				((HtmlContext)_localctx).htmlElement = htmlElement();
				((HtmlContext)_localctx).elements.add(((HtmlContext)_localctx).htmlElement);
				}
				}
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	 
		public HtmlElementContext() { }
		public void copyFrom(HtmlElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StandardHtmlElementContext extends HtmlElementContext {
		public HtmlTagContext tag;
		public HtmlElementContext htmlElement;
		public List<HtmlElementContext> children = new ArrayList<HtmlElementContext>();
		public HtmlExpressionContext htmlExpression;
		public List<HtmlExpressionContext> expressions = new ArrayList<HtmlExpressionContext>();
		public ClosingHtmlTagContext closing;
		public HtmlTagContext htmlTag() {
			return getRuleContext(HtmlTagContext.class,0);
		}
		public ClosingHtmlTagContext closingHtmlTag() {
			return getRuleContext(ClosingHtmlTagContext.class,0);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<HtmlExpressionContext> htmlExpression() {
			return getRuleContexts(HtmlExpressionContext.class);
		}
		public HtmlExpressionContext htmlExpression(int i) {
			return getRuleContext(HtmlExpressionContext.class,i);
		}
		public StandardHtmlElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStandardHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStandardHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStandardHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingHtmlElementContext extends HtmlElementContext {
		public SelfClosingTagContext selfClosing;
		public SelfClosingTagContext selfClosingTag() {
			return getRuleContext(SelfClosingTagContext.class,0);
		}
		public SelfClosingHtmlElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelfClosingHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelfClosingHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelfClosingHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_htmlElement);
		try {
			int _alt;
			setState(1032);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				_localctx = new StandardHtmlElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1021);
				((StandardHtmlElementContext)_localctx).tag = htmlTag();
				setState(1026);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(1024);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LT:
							{
							setState(1022);
							((StandardHtmlElementContext)_localctx).htmlElement = htmlElement();
							((StandardHtmlElementContext)_localctx).children.add(((StandardHtmlElementContext)_localctx).htmlElement);
							}
							break;
						case LPAREN:
						case DATA_BINDING_START:
						case NUMBER:
						case IDENTIFIER:
						case ARABIC:
							{
							setState(1023);
							((StandardHtmlElementContext)_localctx).htmlExpression = htmlExpression(0);
							((StandardHtmlElementContext)_localctx).expressions.add(((StandardHtmlElementContext)_localctx).htmlExpression);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(1028);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				}
				setState(1029);
				((StandardHtmlElementContext)_localctx).closing = closingHtmlTag();
				}
				break;
			case 2:
				_localctx = new SelfClosingHtmlElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1031);
				((SelfClosingHtmlElementContext)_localctx).selfClosing = selfClosingTag();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTagContext extends ParserRuleContext {
		public Token tagName;
		public HtmlTemplateTypeContext htmlTemplateType;
		public List<HtmlTemplateTypeContext> directives = new ArrayList<HtmlTemplateTypeContext>();
		public HtmlTagDataContext htmlTagData;
		public List<HtmlTagDataContext> attrs = new ArrayList<HtmlTagDataContext>();
		public TerminalNode LT() { return getToken(AngularParser.LT, 0); }
		public TerminalNode GT() { return getToken(AngularParser.GT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public List<HtmlTemplateTypeContext> htmlTemplateType() {
			return getRuleContexts(HtmlTemplateTypeContext.class);
		}
		public HtmlTemplateTypeContext htmlTemplateType(int i) {
			return getRuleContext(HtmlTemplateTypeContext.class,i);
		}
		public List<HtmlTagDataContext> htmlTagData() {
			return getRuleContexts(HtmlTagDataContext.class);
		}
		public HtmlTagDataContext htmlTagData(int i) {
			return getRuleContext(HtmlTagDataContext.class,i);
		}
		public HtmlTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagContext htmlTag() throws RecognitionException {
		HtmlTagContext _localctx = new HtmlTagContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_htmlTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
			match(LT);
			setState(1035);
			((HtmlTagContext)_localctx).tagName = match(IDENTIFIER);
			setState(1040);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS || _la==LPAREN || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 33554445L) != 0)) {
				{
				setState(1038);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAREN:
				case NG_IF:
				case NG_FOR:
					{
					setState(1036);
					((HtmlTagContext)_localctx).htmlTemplateType = htmlTemplateType();
					((HtmlTagContext)_localctx).directives.add(((HtmlTagContext)_localctx).htmlTemplateType);
					}
					break;
				case CLASS:
				case PROPERTY_BINDING:
				case IDENTIFIER:
					{
					setState(1037);
					((HtmlTagContext)_localctx).htmlTagData = htmlTagData();
					((HtmlTagContext)_localctx).attrs.add(((HtmlTagContext)_localctx).htmlTagData);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1042);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1043);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClosingHtmlTagContext extends ParserRuleContext {
		public Token tagName;
		public TerminalNode LT() { return getToken(AngularParser.LT, 0); }
		public TerminalNode DIV() { return getToken(AngularParser.DIV, 0); }
		public TerminalNode GT() { return getToken(AngularParser.GT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ClosingHtmlTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closingHtmlTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClosingHtmlTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClosingHtmlTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClosingHtmlTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosingHtmlTagContext closingHtmlTag() throws RecognitionException {
		ClosingHtmlTagContext _localctx = new ClosingHtmlTagContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_closingHtmlTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			match(LT);
			setState(1046);
			match(DIV);
			setState(1047);
			((ClosingHtmlTagContext)_localctx).tagName = match(IDENTIFIER);
			setState(1048);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingTagContext extends ParserRuleContext {
		public Token tagName;
		public HtmlTemplateTypeContext htmlTemplateType;
		public List<HtmlTemplateTypeContext> directives = new ArrayList<HtmlTemplateTypeContext>();
		public HtmlTagDataContext htmlTagData;
		public List<HtmlTagDataContext> attrs = new ArrayList<HtmlTagDataContext>();
		public TerminalNode LT() { return getToken(AngularParser.LT, 0); }
		public TerminalNode GT() { return getToken(AngularParser.GT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode DIV() { return getToken(AngularParser.DIV, 0); }
		public List<HtmlTemplateTypeContext> htmlTemplateType() {
			return getRuleContexts(HtmlTemplateTypeContext.class);
		}
		public HtmlTemplateTypeContext htmlTemplateType(int i) {
			return getRuleContext(HtmlTemplateTypeContext.class,i);
		}
		public List<HtmlTagDataContext> htmlTagData() {
			return getRuleContexts(HtmlTagDataContext.class);
		}
		public HtmlTagDataContext htmlTagData(int i) {
			return getRuleContext(HtmlTagDataContext.class,i);
		}
		public SelfClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelfClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelfClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelfClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingTagContext selfClosingTag() throws RecognitionException {
		SelfClosingTagContext _localctx = new SelfClosingTagContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			match(LT);
			setState(1051);
			((SelfClosingTagContext)_localctx).tagName = match(IDENTIFIER);
			setState(1056);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS || _la==LPAREN || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 33554445L) != 0)) {
				{
				setState(1054);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAREN:
				case NG_IF:
				case NG_FOR:
					{
					setState(1052);
					((SelfClosingTagContext)_localctx).htmlTemplateType = htmlTemplateType();
					((SelfClosingTagContext)_localctx).directives.add(((SelfClosingTagContext)_localctx).htmlTemplateType);
					}
					break;
				case CLASS:
				case PROPERTY_BINDING:
				case IDENTIFIER:
					{
					setState(1053);
					((SelfClosingTagContext)_localctx).htmlTagData = htmlTagData();
					((SelfClosingTagContext)_localctx).attrs.add(((SelfClosingTagContext)_localctx).htmlTagData);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIV) {
				{
				setState(1059);
				match(DIV);
				}
			}

			setState(1062);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTemplateTypeContext extends ParserRuleContext {
		public HtmlTemplateTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTemplateType; }
	 
		public HtmlTemplateTypeContext() { }
		public void copyFrom(HtmlTemplateTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EventBindingTemplateContext extends HtmlTemplateTypeContext {
		public ExpressionContext event;
		public ExpressionContext handler;
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EventBindingTemplateContext(HtmlTemplateTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEventBindingTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEventBindingTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEventBindingTemplate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgIfTemplateContext extends HtmlTemplateTypeContext {
		public ExpressionContext condition;
		public TerminalNode NG_IF() { return getToken(AngularParser.NG_IF, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NgIfTemplateContext(HtmlTemplateTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgIfTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgIfTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgIfTemplate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgForTemplateContext extends HtmlTemplateTypeContext {
		public ExpressionContext loop;
		public TerminalNode NG_FOR() { return getToken(AngularParser.NG_FOR, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NgForTemplateContext(HtmlTemplateTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgForTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgForTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgForTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTemplateTypeContext htmlTemplateType() throws RecognitionException {
		HtmlTemplateTypeContext _localctx = new HtmlTemplateTypeContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_htmlTemplateType);
		try {
			setState(1076);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NG_IF:
				_localctx = new NgIfTemplateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1064);
				match(NG_IF);
				setState(1065);
				match(ASSIGN);
				setState(1066);
				((NgIfTemplateContext)_localctx).condition = expression();
				}
				break;
			case NG_FOR:
				_localctx = new NgForTemplateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1067);
				match(NG_FOR);
				setState(1068);
				match(ASSIGN);
				setState(1069);
				((NgForTemplateContext)_localctx).loop = expression();
				}
				break;
			case LPAREN:
				_localctx = new EventBindingTemplateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1070);
				match(LPAREN);
				setState(1071);
				((EventBindingTemplateContext)_localctx).event = expression();
				setState(1072);
				match(RPAREN);
				setState(1073);
				match(ASSIGN);
				setState(1074);
				((EventBindingTemplateContext)_localctx).handler = expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlDataBindingContext extends ParserRuleContext {
		public TerminalNode DATA_BINDING_START() { return getToken(AngularParser.DATA_BINDING_START, 0); }
		public TerminalNode DATA_BINDING_END() { return getToken(AngularParser.DATA_BINDING_END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public HtmlDataBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDataBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlDataBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlDataBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlDataBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDataBindingContext htmlDataBinding() throws RecognitionException {
		HtmlDataBindingContext _localctx = new HtmlDataBindingContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_htmlDataBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			match(DATA_BINDING_START);
			setState(1082);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6052837899189092352L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 61572651159555L) != 0)) {
				{
				{
				setState(1079);
				expression();
				}
				}
				setState(1084);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1085);
			match(DATA_BINDING_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTagDataContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode PROPERTY_BINDING() { return getToken(AngularParser.PROPERTY_BINDING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public HtmlTagDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTagData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlTagData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlTagData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlTagData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagDataContext htmlTagData() throws RecognitionException {
		HtmlTagDataContext _localctx = new HtmlTagDataContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_htmlTagData);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087);
			_la = _input.LA(1);
			if ( !(_la==CLASS || _la==PROPERTY_BINDING || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1088);
			match(ASSIGN);
			setState(1089);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlExpressionContext extends ParserRuleContext {
		public HtmlExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlExpression; }
	 
		public HtmlExpressionContext() { }
		public void copyFrom(HtmlExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArabicHtmlExpressionContext extends HtmlExpressionContext {
		public TerminalNode ARABIC() { return getToken(AngularParser.ARABIC, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArabicHtmlExpressionContext(HtmlExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArabicHtmlExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArabicHtmlExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArabicHtmlExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierHtmlExpressionContext extends HtmlExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public IdentifierHtmlExpressionContext(HtmlExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifierHtmlExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifierHtmlExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifierHtmlExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditionHtmlExpressionContext extends HtmlExpressionContext {
		public HtmlExpressionContext left;
		public HtmlExpressionContext right;
		public TerminalNode PLUS() { return getToken(AngularParser.PLUS, 0); }
		public List<HtmlExpressionContext> htmlExpression() {
			return getRuleContexts(HtmlExpressionContext.class);
		}
		public HtmlExpressionContext htmlExpression(int i) {
			return getRuleContext(HtmlExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public AdditionHtmlExpressionContext(HtmlExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAdditionHtmlExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAdditionHtmlExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAdditionHtmlExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedHtmlExpressionContext extends HtmlExpressionContext {
		public HtmlExpressionContext expr;
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public HtmlExpressionContext htmlExpression() {
			return getRuleContext(HtmlExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ParenthesizedHtmlExpressionContext(HtmlExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParenthesizedHtmlExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParenthesizedHtmlExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParenthesizedHtmlExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberHtmlExpressionContext extends HtmlExpressionContext {
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public NumberHtmlExpressionContext(HtmlExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNumberHtmlExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNumberHtmlExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNumberHtmlExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DataBindingHtmlExpressionContext extends HtmlExpressionContext {
		public HtmlDataBindingContext htmlDataBinding() {
			return getRuleContext(HtmlDataBindingContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public DataBindingHtmlExpressionContext(HtmlExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDataBindingHtmlExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDataBindingHtmlExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDataBindingHtmlExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlExpressionContext htmlExpression() throws RecognitionException {
		return htmlExpression(0);
	}

	private HtmlExpressionContext htmlExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		HtmlExpressionContext _localctx = new HtmlExpressionContext(_ctx, _parentState);
		HtmlExpressionContext _prevctx = _localctx;
		int _startState = 178;
		enterRecursionRule(_localctx, 178, RULE_htmlExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARABIC:
				{
				_localctx = new ArabicHtmlExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1092);
				match(ARABIC);
				setState(1094);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1093);
					match(COLON);
					}
					break;
				}
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdentifierHtmlExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1096);
				match(IDENTIFIER);
				setState(1098);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1097);
					match(COLON);
					}
					break;
				}
				}
				break;
			case NUMBER:
				{
				_localctx = new NumberHtmlExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1100);
				match(NUMBER);
				setState(1102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1101);
					match(COLON);
					}
					break;
				}
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenthesizedHtmlExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1104);
				match(LPAREN);
				setState(1105);
				((ParenthesizedHtmlExpressionContext)_localctx).expr = htmlExpression(0);
				setState(1106);
				match(RPAREN);
				setState(1108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(1107);
					match(COLON);
					}
					break;
				}
				}
				break;
			case DATA_BINDING_START:
				{
				_localctx = new DataBindingHtmlExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1110);
				htmlDataBinding();
				setState(1112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1111);
					match(COLON);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditionHtmlExpressionContext(new HtmlExpressionContext(_parentctx, _parentState));
					((AdditionHtmlExpressionContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_htmlExpression);
					setState(1116);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1117);
					match(PLUS);
					setState(1118);
					((AdditionHtmlExpressionContext)_localctx).right = htmlExpression(0);
					setState(1120);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
					case 1:
						{
						setState(1119);
						match(COLON);
						}
						break;
					}
					}
					} 
				}
				setState(1126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssRuleContext extends ParserRuleContext {
		public CssSelectorContext cssSelector() {
			return getRuleContext(CssSelectorContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public List<CssKeyValueContext> cssKeyValue() {
			return getRuleContexts(CssKeyValueContext.class);
		}
		public CssKeyValueContext cssKeyValue(int i) {
			return getRuleContext(CssKeyValueContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(AngularParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AngularParser.SEMI, i);
		}
		public CssRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRuleContext cssRule() throws RecognitionException {
		CssRuleContext _localctx = new CssRuleContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_cssRule);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1127);
			cssSelector();
			setState(1128);
			match(LBRACE);
			setState(1129);
			cssKeyValue();
			setState(1134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1130);
					match(SEMI);
					setState(1131);
					cssKeyValue();
					}
					} 
				}
				setState(1136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			}
			setState(1138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1137);
				match(SEMI);
				}
			}

			setState(1140);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssKeyContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(AngularParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(AngularParser.MINUS, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(AngularParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(AngularParser.NUMBER, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(AngularParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(AngularParser.TYPE, i);
		}
		public CssKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssKeyContext cssKey() throws RecognitionException {
		CssKeyContext _localctx = new CssKeyContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_cssKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
			match(IDENTIFIER);
			setState(1146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 13194139533313L) != 0)) {
				{
				{
				setState(1143);
				_la = _input.LA(1);
				if ( !(_la==TYPE || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 13194139533313L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssValueContext extends ParserRuleContext {
		public CssValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValue; }
	 
		public CssValueContext() { }
		public void copyFrom(CssValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColorCssValueContext extends CssValueContext {
		public TerminalNode HASHTAG() { return getToken(AngularParser.HASHTAG, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public ColorCssValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterColorCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitColorCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitColorCssValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierCssValueContext extends CssValueContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public IdentifierCssValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifierCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifierCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifierCssValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericCssValueContext extends CssValueContext {
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode MOD() { return getToken(AngularParser.MOD, 0); }
		public NumericCssValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNumericCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNumericCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNumericCssValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueContext cssValue() throws RecognitionException {
		CssValueContext _localctx = new CssValueContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_cssValue);
		int _la;
		try {
			setState(1156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumericCssValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1149);
				match(NUMBER);
				setState(1151);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1150);
					_la = _input.LA(1);
					if ( !(_la==MOD || _la==IDENTIFIER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentifierCssValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1153);
				match(IDENTIFIER);
				}
				break;
			case HASHTAG:
				_localctx = new ColorCssValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1154);
				match(HASHTAG);
				setState(1155);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorContext extends ParserRuleContext {
		public List<CssKeyContext> cssKey() {
			return getRuleContexts(CssKeyContext.class);
		}
		public CssKeyContext cssKey(int i) {
			return getRuleContext(CssKeyContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(AngularParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngularParser.COLON, i);
		}
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode HASHTAG() { return getToken(AngularParser.HASHTAG, 0); }
		public CssSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelectorContext cssSelector() throws RecognitionException {
		CssSelectorContext _localctx = new CssSelectorContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_cssSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT || _la==HASHTAG) {
				{
				setState(1158);
				_la = _input.LA(1);
				if ( !(_la==DOT || _la==HASHTAG) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1161);
			cssKey();
			setState(1166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(1162);
				match(COLON);
				setState(1163);
				cssKey();
				}
				}
				setState(1168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssKeyValueContext extends ParserRuleContext {
		public CssKeyContext cssKey() {
			return getRuleContext(CssKeyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public List<CssValueContext> cssValue() {
			return getRuleContexts(CssValueContext.class);
		}
		public CssValueContext cssValue(int i) {
			return getRuleContext(CssValueContext.class,i);
		}
		public CssKeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssKeyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssKeyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssKeyValueContext cssKeyValue() throws RecognitionException {
		CssKeyValueContext _localctx = new CssKeyValueContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_cssKeyValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169);
			cssKey();
			setState(1170);
			match(COLON);
			setState(1174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 1610612737L) != 0)) {
				{
				{
				setState(1171);
				cssValue();
				}
				}
				setState(1176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 62:
			return additionExpression_sempred((AdditionExpressionContext)_localctx, predIndex);
		case 89:
			return htmlExpression_sempred((HtmlExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean additionExpression_sempred(AdditionExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean htmlExpression_sempred(HtmlExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001w\u049a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0001"+
		"\u0000\u0005\u0000\u00c0\b\u0000\n\u0000\f\u0000\u00c3\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u00de\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u00e4\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00ee\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u00f2\b\u0003\u0001\u0003\u0003\u0003"+
		"\u00f5\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u00fc\b\u0004\u0001\u0004\u0003\u0004\u00ff\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0104\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u0115\b\u0005\n\u0005\f\u0005\u0118\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u011c\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0005\t\u0137\b\t\n\t\f\t\u013a\t\t\u0001\t\u0001\t"+
		"\u0003\t\u013e\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0148\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u014e\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u015e\b\r\u0003\r\u0160\b\r\u0001\r\u0001\r\u0003\r"+
		"\u0164\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u016e\b\u000e\n\u000e\f\u000e\u0171"+
		"\t\u000e\u0001\u000e\u0003\u000e\u0174\b\u000e\u0003\u000e\u0176\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u017d\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0182\b"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0186\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0003\u0012\u018d\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0003\u0013\u0193\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0197\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u019c\b\u0013\u0001\u0013\u0005\u0013\u019f\b\u0013"+
		"\n\u0013\f\u0013\u01a2\t\u0013\u0003\u0013\u01a4\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u01a9\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u01af\b\u0014\n\u0014\f\u0014\u01b2\t\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u01ba\b\u0015\n\u0015\f\u0015\u01bd\t\u0015\u0003\u0015\u01bf"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01c4\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01ca\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u01d7\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u01df\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u01e6\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u01f2\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0004\u001b\u01fc\b\u001b\u000b\u001b\f\u001b\u01fd\u0003\u001b\u0200"+
		"\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u0207\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005"+
		"\u001d\u020d\b\u001d\n\u001d\f\u001d\u0210\t\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u021d\b\u001f\u0001\u001f"+
		"\u0001\u001f\u0005\u001f\u0221\b\u001f\n\u001f\f\u001f\u0224\t\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0003 \u022b\b \u0001!\u0001!"+
		"\u0001!\u0003!\u0230\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005"+
		"\"\u0237\b\"\n\"\f\"\u023a\t\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001#\u0001#\u0001#\u0003#\u0244\b#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"%\u0001%\u0001%\u0001%\u0005%\u024e\b%\n%\f%\u0251\t%\u0003%\u0253\b%"+
		"\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0003\'\u0262\b\'\u0001(\u0001(\u0001(\u0001"+
		"(\u0005(\u0268\b(\n(\f(\u026b\t(\u0003(\u026d\b(\u0001(\u0001(\u0001)"+
		"\u0001)\u0001)\u0001)\u0003)\u0275\b)\u0001*\u0001*\u0001*\u0003*\u027a"+
		"\b*\u0001+\u0001+\u0001+\u0001+\u0005+\u0280\b+\n+\f+\u0283\t+\u0001+"+
		"\u0003+\u0286\b+\u0003+\u0288\b+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001"+
		",\u0003,\u0290\b,\u0001-\u0001-\u0001-\u0001-\u0003-\u0296\b-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0003-\u029d\b-\u0001-\u0003-\u02a0\b-\u0001.\u0001"+
		".\u0003.\u02a4\b.\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0003/\u02ac"+
		"\b/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0005/\u02b5\b/\n"+
		"/\f/\u02b8\t/\u0003/\u02ba\b/\u0001/\u0001/\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00030\u02c6\b0\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00031\u02d2\b1\u00012\u0001"+
		"2\u00032\u02d6\b2\u00012\u00012\u00012\u00012\u00013\u00013\u00013\u0001"+
		"3\u00053\u02e0\b3\n3\f3\u02e3\t3\u00033\u02e5\b3\u00013\u00013\u00014"+
		"\u00014\u00014\u00014\u00014\u00014\u00034\u02ef\b4\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00055\u02f7\b5\n5\f5\u02fa\t5\u00015\u00015\u0001"+
		"6\u00016\u00036\u0300\b6\u00016\u00016\u00016\u00016\u00056\u0306\b6\n"+
		"6\f6\u0309\t6\u00036\u030b\b6\u00016\u00016\u00016\u00017\u00017\u0001"+
		"7\u00017\u00057\u0314\b7\n7\f7\u0317\t7\u00037\u0319\b7\u00017\u00037"+
		"\u031c\b7\u00017\u00017\u00018\u00018\u00018\u00018\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0003"+
		"9\u0330\b9\u0001:\u0001:\u0001:\u0005:\u0335\b:\n:\f:\u0338\t:\u0001;"+
		"\u0001;\u0001;\u0005;\u033d\b;\n;\f;\u0340\t;\u0001<\u0001<\u0001<\u0005"+
		"<\u0345\b<\n<\f<\u0348\t<\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0003=\u0354\b=\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0003>\u035d\b>\u0001>\u0001>\u0001>\u0005>\u0362\b>\n"+
		">\f>\u0365\t>\u0001?\u0001?\u0005?\u0369\b?\n?\f?\u036c\t?\u0001?\u0001"+
		"?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0003@\u0376\b@\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001B\u0003B\u0380\bB\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0001C\u0005C\u0388\bC\nC\fC\u038b\tC\u0001C\u0001"+
		"C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003"+
		"D\u0398\bD\u0001E\u0001E\u0001E\u0001E\u0001F\u0001F\u0001F\u0001F\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001"+
		"I\u0001I\u0005I\u03ae\bI\nI\fI\u03b1\tI\u0001I\u0001I\u0001J\u0001J\u0001"+
		"J\u0001J\u0001J\u0001J\u0005J\u03bb\bJ\nJ\fJ\u03be\tJ\u0003J\u03c0\bJ"+
		"\u0001J\u0001J\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0005K\u03ca"+
		"\bK\nK\fK\u03cd\tK\u0003K\u03cf\bK\u0001K\u0001K\u0001L\u0001L\u0001L"+
		"\u0001L\u0001M\u0001M\u0001M\u0001M\u0001M\u0003M\u03dc\bM\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0005N\u03e4\bN\nN\fN\u03e7\tN\u0003N\u03e9"+
		"\bN\u0001N\u0001N\u0001N\u0001O\u0001O\u0001O\u0001O\u0001P\u0001P\u0001"+
		"P\u0001P\u0003P\u03f6\bP\u0001Q\u0005Q\u03f9\bQ\nQ\fQ\u03fc\tQ\u0001R"+
		"\u0001R\u0001R\u0005R\u0401\bR\nR\fR\u0404\tR\u0001R\u0001R\u0001R\u0003"+
		"R\u0409\bR\u0001S\u0001S\u0001S\u0001S\u0005S\u040f\bS\nS\fS\u0412\tS"+
		"\u0001S\u0001S\u0001T\u0001T\u0001T\u0001T\u0001T\u0001U\u0001U\u0001"+
		"U\u0001U\u0005U\u041f\bU\nU\fU\u0422\tU\u0001U\u0003U\u0425\bU\u0001U"+
		"\u0001U\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001"+
		"V\u0001V\u0001V\u0001V\u0003V\u0435\bV\u0001W\u0001W\u0005W\u0439\bW\n"+
		"W\fW\u043c\tW\u0001W\u0001W\u0001X\u0001X\u0001X\u0001X\u0001Y\u0001Y"+
		"\u0001Y\u0003Y\u0447\bY\u0001Y\u0001Y\u0003Y\u044b\bY\u0001Y\u0001Y\u0003"+
		"Y\u044f\bY\u0001Y\u0001Y\u0001Y\u0001Y\u0003Y\u0455\bY\u0001Y\u0001Y\u0003"+
		"Y\u0459\bY\u0003Y\u045b\bY\u0001Y\u0001Y\u0001Y\u0001Y\u0003Y\u0461\b"+
		"Y\u0005Y\u0463\bY\nY\fY\u0466\tY\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0005"+
		"Z\u046d\bZ\nZ\fZ\u0470\tZ\u0001Z\u0003Z\u0473\bZ\u0001Z\u0001Z\u0001["+
		"\u0001[\u0005[\u0479\b[\n[\f[\u047c\t[\u0001\\\u0001\\\u0003\\\u0480\b"+
		"\\\u0001\\\u0001\\\u0001\\\u0003\\\u0485\b\\\u0001]\u0003]\u0488\b]\u0001"+
		"]\u0001]\u0001]\u0005]\u048d\b]\n]\f]\u0490\t]\u0001^\u0001^\u0001^\u0005"+
		"^\u0495\b^\n^\f^\u0498\t^\u0001^\u0000\u0002|\u00b2_\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u0000\u000e\u0002\u0000\"\"$$\u0001\u0000\"$\u0001"+
		"\u0000FG\u0002\u0000EEHJ\u0001\u0000qs\u0001\u0000\u0014\u0015\u0003\u0000"+
		"\b\t>?AD\u0002\u0000EEHH\u0001\u0000IK\u0003\u0000\u0001\u0001ZZss\u0003"+
		"\u0000\u0011\u0011HHrs\u0002\u0000KKss\u0001\u0000rs\u0002\u0000OOUU\u0513"+
		"\u0000\u00c1\u0001\u0000\u0000\u0000\u0002\u00dd\u0001\u0000\u0000\u0000"+
		"\u0004\u00df\u0001\u0000\u0000\u0000\u0006\u00e9\u0001\u0000\u0000\u0000"+
		"\b\u00f6\u0001\u0000\u0000\u0000\n\u0108\u0001\u0000\u0000\u0000\f\u011d"+
		"\u0001\u0000\u0000\u0000\u000e\u0123\u0001\u0000\u0000\u0000\u0010\u012b"+
		"\u0001\u0000\u0000\u0000\u0012\u013d\u0001\u0000\u0000\u0000\u0014\u0147"+
		"\u0001\u0000\u0000\u0000\u0016\u0149\u0001\u0000\u0000\u0000\u0018\u0152"+
		"\u0001\u0000\u0000\u0000\u001a\u0158\u0001\u0000\u0000\u0000\u001c\u0167"+
		"\u0001\u0000\u0000\u0000\u001e\u0179\u0001\u0000\u0000\u0000 \u017e\u0001"+
		"\u0000\u0000\u0000\"\u0187\u0001\u0000\u0000\u0000$\u018c\u0001\u0000"+
		"\u0000\u0000&\u0192\u0001\u0000\u0000\u0000(\u01ac\u0001\u0000\u0000\u0000"+
		"*\u01b5\u0001\u0000\u0000\u0000,\u01cb\u0001\u0000\u0000\u0000.\u01d6"+
		"\u0001\u0000\u0000\u00000\u01de\u0001\u0000\u0000\u00002\u01e5\u0001\u0000"+
		"\u0000\u00004\u01f1\u0001\u0000\u0000\u00006\u01ff\u0001\u0000\u0000\u0000"+
		"8\u0206\u0001\u0000\u0000\u0000:\u0208\u0001\u0000\u0000\u0000<\u0213"+
		"\u0001\u0000\u0000\u0000>\u0218\u0001\u0000\u0000\u0000@\u022a\u0001\u0000"+
		"\u0000\u0000B\u022c\u0001\u0000\u0000\u0000D\u0231\u0001\u0000\u0000\u0000"+
		"F\u0240\u0001\u0000\u0000\u0000H\u0245\u0001\u0000\u0000\u0000J\u0249"+
		"\u0001\u0000\u0000\u0000L\u0256\u0001\u0000\u0000\u0000N\u0261\u0001\u0000"+
		"\u0000\u0000P\u0263\u0001\u0000\u0000\u0000R\u0274\u0001\u0000\u0000\u0000"+
		"T\u0279\u0001\u0000\u0000\u0000V\u027b\u0001\u0000\u0000\u0000X\u028f"+
		"\u0001\u0000\u0000\u0000Z\u029f\u0001\u0000\u0000\u0000\\\u02a3\u0001"+
		"\u0000\u0000\u0000^\u02ab\u0001\u0000\u0000\u0000`\u02c5\u0001\u0000\u0000"+
		"\u0000b\u02d1\u0001\u0000\u0000\u0000d\u02d5\u0001\u0000\u0000\u0000f"+
		"\u02db\u0001\u0000\u0000\u0000h\u02ee\u0001\u0000\u0000\u0000j\u02f0\u0001"+
		"\u0000\u0000\u0000l\u02ff\u0001\u0000\u0000\u0000n\u030f\u0001\u0000\u0000"+
		"\u0000p\u031f\u0001\u0000\u0000\u0000r\u032f\u0001\u0000\u0000\u0000t"+
		"\u0331\u0001\u0000\u0000\u0000v\u0339\u0001\u0000\u0000\u0000x\u0341\u0001"+
		"\u0000\u0000\u0000z\u0353\u0001\u0000\u0000\u0000|\u035c\u0001\u0000\u0000"+
		"\u0000~\u0366\u0001\u0000\u0000\u0000\u0080\u0375\u0001\u0000\u0000\u0000"+
		"\u0082\u0377\u0001\u0000\u0000\u0000\u0084\u037f\u0001\u0000\u0000\u0000"+
		"\u0086\u0381\u0001\u0000\u0000\u0000\u0088\u0397\u0001\u0000\u0000\u0000"+
		"\u008a\u0399\u0001\u0000\u0000\u0000\u008c\u039d\u0001\u0000\u0000\u0000"+
		"\u008e\u03a1\u0001\u0000\u0000\u0000\u0090\u03a7\u0001\u0000\u0000\u0000"+
		"\u0092\u03ab\u0001\u0000\u0000\u0000\u0094\u03b4\u0001\u0000\u0000\u0000"+
		"\u0096\u03c3\u0001\u0000\u0000\u0000\u0098\u03d2\u0001\u0000\u0000\u0000"+
		"\u009a\u03db\u0001\u0000\u0000\u0000\u009c\u03dd\u0001\u0000\u0000\u0000"+
		"\u009e\u03ed\u0001\u0000\u0000\u0000\u00a0\u03f5\u0001\u0000\u0000\u0000"+
		"\u00a2\u03fa\u0001\u0000\u0000\u0000\u00a4\u0408\u0001\u0000\u0000\u0000"+
		"\u00a6\u040a\u0001\u0000\u0000\u0000\u00a8\u0415\u0001\u0000\u0000\u0000"+
		"\u00aa\u041a\u0001\u0000\u0000\u0000\u00ac\u0434\u0001\u0000\u0000\u0000"+
		"\u00ae\u0436\u0001\u0000\u0000\u0000\u00b0\u043f\u0001\u0000\u0000\u0000"+
		"\u00b2\u045a\u0001\u0000\u0000\u0000\u00b4\u0467\u0001\u0000\u0000\u0000"+
		"\u00b6\u0476\u0001\u0000\u0000\u0000\u00b8\u0484\u0001\u0000\u0000\u0000"+
		"\u00ba\u0487\u0001\u0000\u0000\u0000\u00bc\u0491\u0001\u0000\u0000\u0000"+
		"\u00be\u00c0\u0003\u0002\u0001\u0000\u00bf\u00be\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u0000\u0000\u0001"+
		"\u00c5\u0001\u0001\u0000\u0000\u0000\u00c6\u00de\u0003\u0004\u0002\u0000"+
		"\u00c7\u00de\u0003\u0006\u0003\u0000\u00c8\u00de\u0003\u001c\u000e\u0000"+
		"\u00c9\u00de\u0003\"\u0011\u0000\u00ca\u00de\u0003d2\u0000\u00cb\u00de"+
		"\u0003\u0016\u000b\u0000\u00cc\u00de\u0003.\u0017\u0000\u00cd\u00ce\u0003"+
		"^/\u0000\u00ce\u00cf\u0005L\u0000\u0000\u00cf\u00de\u0001\u0000\u0000"+
		"\u0000\u00d0\u00de\u0003:\u001d\u0000\u00d1\u00de\u0003>\u001f\u0000\u00d2"+
		"\u00de\u0003\u0018\f\u0000\u00d3\u00de\u0003l6\u0000\u00d4\u00de\u0003"+
		"B!\u0000\u00d5\u00de\u0003D\"\u0000\u00d6\u00de\u0003\u0086C\u0000\u00d7"+
		"\u00de\u0003\u009cN\u0000\u00d8\u00de\u0003\b\u0004\u0000\u00d9\u00de"+
		"\u0003\u0010\b\u0000\u00da\u00de\u0003\n\u0005\u0000\u00db\u00de\u0003"+
		"\u000e\u0007\u0000\u00dc\u00de\u0003\f\u0006\u0000\u00dd\u00c6\u0001\u0000"+
		"\u0000\u0000\u00dd\u00c7\u0001\u0000\u0000\u0000\u00dd\u00c8\u0001\u0000"+
		"\u0000\u0000\u00dd\u00c9\u0001\u0000\u0000\u0000\u00dd\u00ca\u0001\u0000"+
		"\u0000\u0000\u00dd\u00cb\u0001\u0000\u0000\u0000\u00dd\u00cc\u0001\u0000"+
		"\u0000\u0000\u00dd\u00cd\u0001\u0000\u0000\u0000\u00dd\u00d0\u0001\u0000"+
		"\u0000\u0000\u00dd\u00d1\u0001\u0000\u0000\u0000\u00dd\u00d2\u0001\u0000"+
		"\u0000\u0000\u00dd\u00d3\u0001\u0000\u0000\u0000\u00dd\u00d4\u0001\u0000"+
		"\u0000\u0000\u00dd\u00d5\u0001\u0000\u0000\u0000\u00dd\u00d6\u0001\u0000"+
		"\u0000\u0000\u00dd\u00d7\u0001\u0000\u0000\u0000\u00dd\u00d8\u0001\u0000"+
		"\u0000\u0000\u00dd\u00d9\u0001\u0000\u0000\u0000\u00dd\u00da\u0001\u0000"+
		"\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00dc\u0001\u0000"+
		"\u0000\u0000\u00de\u0003\u0001\u0000\u0000\u0000\u00df\u00e0\u0005#\u0000"+
		"\u0000\u00e0\u00e3\u0005s\u0000\u0000\u00e1\u00e2\u0005M\u0000\u0000\u00e2"+
		"\u00e4\u0003T*\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005"+
		"@\u0000\u0000\u00e6\u00e7\u0003b1\u0000\u00e7\u00e8\u0005L\u0000\u0000"+
		"\u00e8\u0005\u0001\u0000\u0000\u0000\u00e9\u00ea\u0007\u0000\u0000\u0000"+
		"\u00ea\u00ed\u0005s\u0000\u0000\u00eb\u00ec\u0005M\u0000\u0000\u00ec\u00ee"+
		"\u0003T*\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005@\u0000"+
		"\u0000\u00f0\u00f2\u0003b1\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f5\u0005L\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f4\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f5\u0007\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u0005\u0007\u0000\u0000\u00f7\u00fb\u0005:\u0000\u0000\u00f8\u00fc\u0003"+
		"\u0006\u0003\u0000\u00f9\u00fc\u0003d2\u0000\u00fa\u00fc\u0005L\u0000"+
		"\u0000\u00fb\u00f8\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fd\u00ff\u0003r9\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100"+
		"\u0103\u0005L\u0000\u0000\u0101\u0104\u0003d2\u0000\u0102\u0104\u0003"+
		"\u0014\n\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0102\u0001\u0000"+
		"\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0005;\u0000\u0000\u0106\u0107\u0003\u0012\t"+
		"\u0000\u0107\t\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u0003\u0000\u0000"+
		"\u0109\u010a\u0005:\u0000\u0000\u010a\u010b\u0003r9\u0000\u010b\u010c"+
		"\u0005;\u0000\u0000\u010c\u0116\u0003\u0012\t\u0000\u010d\u010e\u0005"+
		"\u0006\u0000\u0000\u010e\u010f\u0005\u0003\u0000\u0000\u010f\u0110\u0005"+
		":\u0000\u0000\u0110\u0111\u0003r9\u0000\u0111\u0112\u0005;\u0000\u0000"+
		"\u0112\u0113\u0003\u0012\t\u0000\u0113\u0115\u0001\u0000\u0000\u0000\u0114"+
		"\u010d\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116"+
		"\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117"+
		"\u011b\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119"+
		"\u011a\u0005\u0006\u0000\u0000\u011a\u011c\u0003\u0012\t\u0000\u011b\u0119"+
		"\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u000b"+
		"\u0001\u0000\u0000\u0000\u011d\u011e\u0005\u0005\u0000\u0000\u011e\u011f"+
		"\u0005:\u0000\u0000\u011f\u0120\u0003r9\u0000\u0120\u0121\u0005;\u0000"+
		"\u0000\u0121\u0122\u0003\u0012\t\u0000\u0122\r\u0001\u0000\u0000\u0000"+
		"\u0123\u0124\u0005\u0004\u0000\u0000\u0124\u0125\u0003\u0012\t\u0000\u0125"+
		"\u0126\u0005\u0005\u0000\u0000\u0126\u0127\u0005:\u0000\u0000\u0127\u0128"+
		"\u0003r9\u0000\u0128\u0129\u0005;\u0000\u0000\u0129\u012a\u0005L\u0000"+
		"\u0000\u012a\u000f\u0001\u0000\u0000\u0000\u012b\u012c\u0005\u0007\u0000"+
		"\u0000\u012c\u012d\u0005:\u0000\u0000\u012d\u012e\u0007\u0001\u0000\u0000"+
		"\u012e\u012f\u0005s\u0000\u0000\u012f\u0130\u0005!\u0000\u0000\u0130\u0131"+
		"\u0003r9\u0000\u0131\u0132\u0005;\u0000\u0000\u0132\u0133\u0003\u0012"+
		"\t\u0000\u0133\u0011\u0001\u0000\u0000\u0000\u0134\u0138\u00058\u0000"+
		"\u0000\u0135\u0137\u0003\u0002\u0001\u0000\u0136\u0135\u0001\u0000\u0000"+
		"\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013b\u0001\u0000\u0000"+
		"\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b\u013e\u00059\u0000\u0000"+
		"\u013c\u013e\u0003\u0002\u0001\u0000\u013d\u0134\u0001\u0000\u0000\u0000"+
		"\u013d\u013c\u0001\u0000\u0000\u0000\u013e\u0013\u0001\u0000\u0000\u0000"+
		"\u013f\u0140\u0005s\u0000\u0000\u0140\u0148\u0007\u0002\u0000\u0000\u0141"+
		"\u0142\u0007\u0002\u0000\u0000\u0142\u0148\u0005s\u0000\u0000\u0143\u0144"+
		"\u0005s\u0000\u0000\u0144\u0145\u0007\u0003\u0000\u0000\u0145\u0146\u0005"+
		"@\u0000\u0000\u0146\u0148\u0003r9\u0000\u0147\u013f\u0001\u0000\u0000"+
		"\u0000\u0147\u0141\u0001\u0000\u0000\u0000\u0147\u0143\u0001\u0000\u0000"+
		"\u0000\u0148\u0015\u0001\u0000\u0000\u0000\u0149\u014a\u0007\u0001\u0000"+
		"\u0000\u014a\u014d\u0005s\u0000\u0000\u014b\u014c\u0005M\u0000\u0000\u014c"+
		"\u014e\u0003T*\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001"+
		"\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0150\u0005"+
		"@\u0000\u0000\u0150\u0151\u0003,\u0016\u0000\u0151\u0017\u0001\u0000\u0000"+
		"\u0000\u0152\u0153\u0007\u0001\u0000\u0000\u0153\u0154\u0005s\u0000\u0000"+
		"\u0154\u0155\u0005@\u0000\u0000\u0155\u0156\u0003j5\u0000\u0156\u0157"+
		"\u0005L\u0000\u0000\u0157\u0019\u0001\u0000\u0000\u0000\u0158\u015f\u0005"+
		"s\u0000\u0000\u0159\u015a\u0005M\u0000\u0000\u015a\u015d\u0003T*\u0000"+
		"\u015b\u015c\u0005T\u0000\u0000\u015c\u015e\u0005m\u0000\u0000\u015d\u015b"+
		"\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u0160"+
		"\u0001\u0000\u0000\u0000\u015f\u0159\u0001\u0000\u0000\u0000\u015f\u0160"+
		"\u0001\u0000\u0000\u0000\u0160\u0163\u0001\u0000\u0000\u0000\u0161\u0162"+
		"\u0005@\u0000\u0000\u0162\u0164\u0003b1\u0000\u0163\u0161\u0001\u0000"+
		"\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000"+
		"\u0000\u0000\u0165\u0166\u0005L\u0000\u0000\u0166\u001b\u0001\u0000\u0000"+
		"\u0000\u0167\u0168\u0005\u0010\u0000\u0000\u0168\u0169\u0005s\u0000\u0000"+
		"\u0169\u0175\u00058\u0000\u0000\u016a\u016f\u0003\u001e\u000f\u0000\u016b"+
		"\u016c\u0005N\u0000\u0000\u016c\u016e\u0003\u001e\u000f\u0000\u016d\u016b"+
		"\u0001\u0000\u0000\u0000\u016e\u0171\u0001\u0000\u0000\u0000\u016f\u016d"+
		"\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0173"+
		"\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172\u0174"+
		"\u0005N\u0000\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0173\u0174\u0001"+
		"\u0000\u0000\u0000\u0174\u0176\u0001\u0000\u0000\u0000\u0175\u016a\u0001"+
		"\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0177\u0001"+
		"\u0000\u0000\u0000\u0177\u0178\u00059\u0000\u0000\u0178\u001d\u0001\u0000"+
		"\u0000\u0000\u0179\u017c\u0003R)\u0000\u017a\u017b\u0005@\u0000\u0000"+
		"\u017b\u017d\u0007\u0004\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000"+
		"\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u001f\u0001\u0000\u0000\u0000"+
		"\u017e\u0181\u0005s\u0000\u0000\u017f\u0180\u0005M\u0000\u0000\u0180\u0182"+
		"\u0003T*\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000"+
		"\u0000\u0000\u0182\u0185\u0001\u0000\u0000\u0000\u0183\u0184\u0005@\u0000"+
		"\u0000\u0184\u0186\u0003b1\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0185"+
		"\u0186\u0001\u0000\u0000\u0000\u0186!\u0001\u0000\u0000\u0000\u0187\u0188"+
		"\u0005\u0002\u0000\u0000\u0188\u0189\u0003R)\u0000\u0189\u018a\u0003&"+
		"\u0013\u0000\u018a#\u0001\u0000\u0000\u0000\u018b\u018d\u0005\u0002\u0000"+
		"\u0000\u018c\u018b\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000"+
		"\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u018f\u0003R)\u0000\u018f"+
		"\u0190\u0003&\u0013\u0000\u0190%\u0001\u0000\u0000\u0000\u0191\u0193\u0005"+
		"s\u0000\u0000\u0192\u0191\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000"+
		"\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u01a3\u0005:\u0000"+
		"\u0000\u0195\u0197\u0003\u0084B\u0000\u0196\u0195\u0001\u0000\u0000\u0000"+
		"\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000"+
		"\u0198\u01a0\u0003 \u0010\u0000\u0199\u019b\u0005N\u0000\u0000\u019a\u019c"+
		"\u0003\u0084B\u0000\u019b\u019a\u0001\u0000\u0000\u0000\u019b\u019c\u0001"+
		"\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u019f\u0003"+
		" \u0010\u0000\u019e\u0199\u0001\u0000\u0000\u0000\u019f\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a1\u01a4\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a3\u0196\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a8\u0005;\u0000"+
		"\u0000\u01a6\u01a7\u0005M\u0000\u0000\u01a7\u01a9\u0003T*\u0000\u01a8"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9"+
		"\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ab\u0003(\u0014\u0000\u01ab\'"+
		"\u0001\u0000\u0000\u0000\u01ac\u01b0\u00058\u0000\u0000\u01ad\u01af\u0003"+
		"\u0002\u0001\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01af\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b3\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001"+
		"\u0000\u0000\u0000\u01b3\u01b4\u00059\u0000\u0000\u01b4)\u0001\u0000\u0000"+
		"\u0000\u01b5\u01be\u0005:\u0000\u0000\u01b6\u01bb\u0003 \u0010\u0000\u01b7"+
		"\u01b8\u0005N\u0000\u0000\u01b8\u01ba\u0003 \u0010\u0000\u01b9\u01b7\u0001"+
		"\u0000\u0000\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001"+
		"\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01bf\u0001"+
		"\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be\u01b6\u0001"+
		"\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c3\u0005;\u0000\u0000\u01c1\u01c2\u0005M\u0000"+
		"\u0000\u01c2\u01c4\u0003T*\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c6\u0005@\u0000\u0000\u01c6\u01c9\u0005?\u0000\u0000\u01c7\u01ca\u0003"+
		"b1\u0000\u01c8\u01ca\u0003r9\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000"+
		"\u01c9\u01c8\u0001\u0000\u0000\u0000\u01ca+\u0001\u0000\u0000\u0000\u01cb"+
		"\u01cc\u0005\u0002\u0000\u0000\u01cc\u01cd\u0003&\u0013\u0000\u01cd-\u0001"+
		"\u0000\u0000\u0000\u01ce\u01cf\u0005\u000b\u0000\u0000\u01cf\u01d0\u0003"+
		"b1\u0000\u01d0\u01d1\u0005L\u0000\u0000\u01d1\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d3\u0005\u000b\u0000\u0000\u01d3\u01d4\u00038\u001c\u0000"+
		"\u01d4\u01d5\u0005L\u0000\u0000\u01d5\u01d7\u0001\u0000\u0000\u0000\u01d6"+
		"\u01ce\u0001\u0000\u0000\u0000\u01d6\u01d2\u0001\u0000\u0000\u0000\u01d7"+
		"/\u0001\u0000\u0000\u0000\u01d8\u01df\u0005>\u0000\u0000\u01d9\u01df\u0005"+
		"?\u0000\u0000\u01da\u01df\u0005A\u0000\u0000\u01db\u01df\u0005B\u0000"+
		"\u0000\u01dc\u01df\u0005C\u0000\u0000\u01dd\u01df\u0005D\u0000\u0000\u01de"+
		"\u01d8\u0001\u0000\u0000\u0000\u01de\u01d9\u0001\u0000\u0000\u0000\u01de"+
		"\u01da\u0001\u0000\u0000\u0000\u01de\u01db\u0001\u0000\u0000\u0000\u01de"+
		"\u01dc\u0001\u0000\u0000\u0000\u01de\u01dd\u0001\u0000\u0000\u0000\u01df"+
		"1\u0001\u0000\u0000\u0000\u01e0\u01e6\u0005E\u0000\u0000\u01e1\u01e6\u0005"+
		"H\u0000\u0000\u01e2\u01e6\u0005I\u0000\u0000\u01e3\u01e6\u0005J\u0000"+
		"\u0000\u01e4\u01e6\u0005K\u0000\u0000\u01e5\u01e0\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e1\u0001\u0000\u0000\u0000\u01e5\u01e2\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e3\u0001\u0000\u0000\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000"+
		"\u01e63\u0001\u0000\u0000\u0000\u01e7\u01f2\u0005:\u0000\u0000\u01e8\u01f2"+
		"\u0005;\u0000\u0000\u01e9\u01f2\u0005<\u0000\u0000\u01ea\u01f2\u0005="+
		"\u0000\u0000\u01eb\u01f2\u0005L\u0000\u0000\u01ec\u01f2\u0005M\u0000\u0000"+
		"\u01ed\u01f2\u0005N\u0000\u0000\u01ee\u01f2\u0005O\u0000\u0000\u01ef\u01f2"+
		"\u0005P\u0000\u0000\u01f0\u01f2\u0005Q\u0000\u0000\u01f1\u01e7\u0001\u0000"+
		"\u0000\u0000\u01f1\u01e8\u0001\u0000\u0000\u0000\u01f1\u01e9\u0001\u0000"+
		"\u0000\u0000\u01f1\u01ea\u0001\u0000\u0000\u0000\u01f1\u01eb\u0001\u0000"+
		"\u0000\u0000\u01f1\u01ec\u0001\u0000\u0000\u0000\u01f1\u01ed\u0001\u0000"+
		"\u0000\u0000\u01f1\u01ee\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000"+
		"\u0000\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f25\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f4\u0003b1\u0000\u01f4\u01f5\u00030\u0018\u0000\u01f5"+
		"\u01f6\u0003b1\u0000\u01f6\u0200\u0001\u0000\u0000\u0000\u01f7\u01fb\u0003"+
		"b1\u0000\u01f8\u01f9\u00032\u0019\u0000\u01f9\u01fa\u0003b1\u0000\u01fa"+
		"\u01fc\u0001\u0000\u0000\u0000\u01fb\u01f8\u0001\u0000\u0000\u0000\u01fc"+
		"\u01fd\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd"+
		"\u01fe\u0001\u0000\u0000\u0000\u01fe\u0200\u0001\u0000\u0000\u0000\u01ff"+
		"\u01f3\u0001\u0000\u0000\u0000\u01ff\u01f7\u0001\u0000\u0000\u0000\u0200"+
		"7\u0001\u0000\u0000\u0000\u0201\u0202\u0005:\u0000\u0000\u0202\u0203\u0003"+
		"6\u001b\u0000\u0203\u0204\u0005;\u0000\u0000\u0204\u0207\u0001\u0000\u0000"+
		"\u0000\u0205\u0207\u00036\u001b\u0000\u0206\u0201\u0001\u0000\u0000\u0000"+
		"\u0206\u0205\u0001\u0000\u0000\u0000\u02079\u0001\u0000\u0000\u0000\u0208"+
		"\u0209\u0005\u000f\u0000\u0000\u0209\u020a\u0005s\u0000\u0000\u020a\u020e"+
		"\u00058\u0000\u0000\u020b\u020d\u0003<\u001e\u0000\u020c\u020b\u0001\u0000"+
		"\u0000\u0000\u020d\u0210\u0001\u0000\u0000\u0000\u020e\u020c\u0001\u0000"+
		"\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u0211\u0001\u0000"+
		"\u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0211\u0212\u00059\u0000"+
		"\u0000\u0212;\u0001\u0000\u0000\u0000\u0213\u0214\u0005s\u0000\u0000\u0214"+
		"\u0215\u0005M\u0000\u0000\u0215\u0216\u0003R)\u0000\u0216\u0217\u0005"+
		"L\u0000\u0000\u0217=\u0001\u0000\u0000\u0000\u0218\u0219\u0005\u0001\u0000"+
		"\u0000\u0219\u021c\u0005s\u0000\u0000\u021a\u021b\u0005\u0013\u0000\u0000"+
		"\u021b\u021d\u0005s\u0000\u0000\u021c\u021a\u0001\u0000\u0000\u0000\u021c"+
		"\u021d\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e"+
		"\u0222\u00058\u0000\u0000\u021f\u0221\u0003@ \u0000\u0220\u021f\u0001"+
		"\u0000\u0000\u0000\u0221\u0224\u0001\u0000\u0000\u0000\u0222\u0220\u0001"+
		"\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000\u0000\u0223\u0225\u0001"+
		"\u0000\u0000\u0000\u0224\u0222\u0001\u0000\u0000\u0000\u0225\u0226\u0005"+
		"9\u0000\u0000\u0226?\u0001\u0000\u0000\u0000\u0227\u022b\u0003\u001a\r"+
		"\u0000\u0228\u022b\u0003$\u0012\u0000\u0229\u022b\u0003l6\u0000\u022a"+
		"\u0227\u0001\u0000\u0000\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022a"+
		"\u0229\u0001\u0000\u0000\u0000\u022bA\u0001\u0000\u0000\u0000\u022c\u022f"+
		"\u0005\u000e\u0000\u0000\u022d\u0230\u0003>\u001f\u0000\u022e\u0230\u0003"+
		":\u001d\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u022f\u022e\u0001\u0000"+
		"\u0000\u0000\u0230C\u0001\u0000\u0000\u0000\u0231\u0232\u0005\r\u0000"+
		"\u0000\u0232\u0233\u00058\u0000\u0000\u0233\u0238\u0003F#\u0000\u0234"+
		"\u0235\u0005N\u0000\u0000\u0235\u0237\u0003F#\u0000\u0236\u0234\u0001"+
		"\u0000\u0000\u0000\u0237\u023a\u0001\u0000\u0000\u0000\u0238\u0236\u0001"+
		"\u0000\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u023b\u0001"+
		"\u0000\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023b\u023c\u0005"+
		"9\u0000\u0000\u023c\u023d\u0005&\u0000\u0000\u023d\u023e\u0005q\u0000"+
		"\u0000\u023e\u023f\u0005L\u0000\u0000\u023fE\u0001\u0000\u0000\u0000\u0240"+
		"\u0243\u0005s\u0000\u0000\u0241\u0242\u0005%\u0000\u0000\u0242\u0244\u0005"+
		"s\u0000\u0000\u0243\u0241\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000"+
		"\u0000\u0000\u0244G\u0001\u0000\u0000\u0000\u0245\u0246\u0005\f\u0000"+
		"\u0000\u0246\u0247\u0005M\u0000\u0000\u0247\u0248\u0003J%\u0000\u0248"+
		"I\u0001\u0000\u0000\u0000\u0249\u0252\u0005<\u0000\u0000\u024a\u024f\u0003"+
		"L&\u0000\u024b\u024c\u0005N\u0000\u0000\u024c\u024e\u0003L&\u0000\u024d"+
		"\u024b\u0001\u0000\u0000\u0000\u024e\u0251\u0001\u0000\u0000\u0000\u024f"+
		"\u024d\u0001\u0000\u0000\u0000\u024f\u0250\u0001\u0000\u0000\u0000\u0250"+
		"\u0253\u0001\u0000\u0000\u0000\u0251\u024f\u0001\u0000\u0000\u0000\u0252"+
		"\u024a\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253"+
		"\u0254\u0001\u0000\u0000\u0000\u0254\u0255\u0005=\u0000\u0000\u0255K\u0001"+
		"\u0000\u0000\u0000\u0256\u0257\u0005s\u0000\u0000\u0257M\u0001\u0000\u0000"+
		"\u0000\u0258\u0259\u0003R)\u0000\u0259\u025a\u0005<\u0000\u0000\u025a"+
		"\u025b\u0005=\u0000\u0000\u025b\u0262\u0001\u0000\u0000\u0000\u025c\u025d"+
		"\u0005[\u0000\u0000\u025d\u025e\u0005>\u0000\u0000\u025e\u025f\u0003R"+
		")\u0000\u025f\u0260\u0005?\u0000\u0000\u0260\u0262\u0001\u0000\u0000\u0000"+
		"\u0261\u0258\u0001\u0000\u0000\u0000\u0261\u025c\u0001\u0000\u0000\u0000"+
		"\u0262O\u0001\u0000\u0000\u0000\u0263\u026c\u0005<\u0000\u0000\u0264\u0269"+
		"\u0003R)\u0000\u0265\u0266\u0005N\u0000\u0000\u0266\u0268\u0003R)\u0000"+
		"\u0267\u0265\u0001\u0000\u0000\u0000\u0268\u026b\u0001\u0000\u0000\u0000"+
		"\u0269\u0267\u0001\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000\u0000"+
		"\u026a\u026d\u0001\u0000\u0000\u0000\u026b\u0269\u0001\u0000\u0000\u0000"+
		"\u026c\u0264\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000"+
		"\u026d\u026e\u0001\u0000\u0000\u0000\u026e\u026f\u0005=\u0000\u0000\u026f"+
		"Q\u0001\u0000\u0000\u0000\u0270\u0275\u0005k\u0000\u0000\u0271\u0275\u0005"+
		"j\u0000\u0000\u0272\u0275\u0005i\u0000\u0000\u0273\u0275\u0005s\u0000"+
		"\u0000\u0274\u0270\u0001\u0000\u0000\u0000\u0274\u0271\u0001\u0000\u0000"+
		"\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0274\u0273\u0001\u0000\u0000"+
		"\u0000\u0275S\u0001\u0000\u0000\u0000\u0276\u027a\u0003R)\u0000\u0277"+
		"\u027a\u0003P(\u0000\u0278\u027a\u0003N\'\u0000\u0279\u0276\u0001\u0000"+
		"\u0000\u0000\u0279\u0277\u0001\u0000\u0000\u0000\u0279\u0278\u0001\u0000"+
		"\u0000\u0000\u027aU\u0001\u0000\u0000\u0000\u027b\u0287\u0005<\u0000\u0000"+
		"\u027c\u0281\u0003b1\u0000\u027d\u027e\u0005N\u0000\u0000\u027e\u0280"+
		"\u0003b1\u0000\u027f\u027d\u0001\u0000\u0000\u0000\u0280\u0283\u0001\u0000"+
		"\u0000\u0000\u0281\u027f\u0001\u0000\u0000\u0000\u0281\u0282\u0001\u0000"+
		"\u0000\u0000\u0282\u0285\u0001\u0000\u0000\u0000\u0283\u0281\u0001\u0000"+
		"\u0000\u0000\u0284\u0286\u0005N\u0000\u0000\u0285\u0284\u0001\u0000\u0000"+
		"\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286\u0288\u0001\u0000\u0000"+
		"\u0000\u0287\u027c\u0001\u0000\u0000\u0000\u0287\u0288\u0001\u0000\u0000"+
		"\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289\u028a\u0005=\u0000\u0000"+
		"\u028aW\u0001\u0000\u0000\u0000\u028b\u0290\u0005q\u0000\u0000\u028c\u0290"+
		"\u0005r\u0000\u0000\u028d\u0290\u0005l\u0000\u0000\u028e\u0290\u0005s"+
		"\u0000\u0000\u028f\u028b\u0001\u0000\u0000\u0000\u028f\u028c\u0001\u0000"+
		"\u0000\u0000\u028f\u028d\u0001\u0000\u0000\u0000\u028f\u028e\u0001\u0000"+
		"\u0000\u0000\u0290Y\u0001\u0000\u0000\u0000\u0291\u0296\u0005s\u0000\u0000"+
		"\u0292\u0296\u0003`0\u0000\u0293\u0296\u0005\u0015\u0000\u0000\u0294\u0296"+
		"\u0005\u0014\u0000\u0000\u0295\u0291\u0001\u0000\u0000\u0000\u0295\u0292"+
		"\u0001\u0000\u0000\u0000\u0295\u0293\u0001\u0000\u0000\u0000\u0295\u0294"+
		"\u0001\u0000\u0000\u0000\u0296\u02a0\u0001\u0000\u0000\u0000\u0297\u029c"+
		"\u0005:\u0000\u0000\u0298\u029d\u0005s\u0000\u0000\u0299\u029d\u0003`"+
		"0\u0000\u029a\u029d\u0005\u0015\u0000\u0000\u029b\u029d\u0005\u0014\u0000"+
		"\u0000\u029c\u0298\u0001\u0000\u0000\u0000\u029c\u0299\u0001\u0000\u0000"+
		"\u0000\u029c\u029a\u0001\u0000\u0000\u0000\u029c\u029b\u0001\u0000\u0000"+
		"\u0000\u029d\u029e\u0001\u0000\u0000\u0000\u029e\u02a0\u0005;\u0000\u0000"+
		"\u029f\u0295\u0001\u0000\u0000\u0000\u029f\u0297\u0001\u0000\u0000\u0000"+
		"\u02a0[\u0001\u0000\u0000\u0000\u02a1\u02a2\u0007\u0005\u0000\u0000\u02a2"+
		"\u02a4\u0005O\u0000\u0000\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a3\u02a4"+
		"\u0001\u0000\u0000\u0000\u02a4\u02a5\u0001\u0000\u0000\u0000\u02a5\u02a6"+
		"\u0003Z-\u0000\u02a6\u02a7\u0005O\u0000\u0000\u02a7\u02a8\u0005s\u0000"+
		"\u0000\u02a8]\u0001\u0000\u0000\u0000\u02a9\u02aa\u0007\u0005\u0000\u0000"+
		"\u02aa\u02ac\u0005O\u0000\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ab"+
		"\u02ac\u0001\u0000\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000\u02ad"+
		"\u02ae\u0003Z-\u0000\u02ae\u02af\u0005O\u0000\u0000\u02af\u02b0\u0005"+
		"s\u0000\u0000\u02b0\u02b9\u0005:\u0000\u0000\u02b1\u02b6\u0003b1\u0000"+
		"\u02b2\u02b3\u0005N\u0000\u0000\u02b3\u02b5\u0003b1\u0000\u02b4\u02b2"+
		"\u0001\u0000\u0000\u0000\u02b5\u02b8\u0001\u0000\u0000\u0000\u02b6\u02b4"+
		"\u0001\u0000\u0000\u0000\u02b6\u02b7\u0001\u0000\u0000\u0000\u02b7\u02ba"+
		"\u0001\u0000\u0000\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000\u02b9\u02b1"+
		"\u0001\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000\u02ba\u02bb"+
		"\u0001\u0000\u0000\u0000\u02bb\u02bc\u0005;\u0000\u0000\u02bc_\u0001\u0000"+
		"\u0000\u0000\u02bd\u02be\u0005s\u0000\u0000\u02be\u02bf\u0005%\u0000\u0000"+
		"\u02bf\u02c6\u0003R)\u0000\u02c0\u02c1\u0005>\u0000\u0000\u02c1\u02c2"+
		"\u0003R)\u0000\u02c2\u02c3\u0005?\u0000\u0000\u02c3\u02c4\u0005s\u0000"+
		"\u0000\u02c4\u02c6\u0001\u0000\u0000\u0000\u02c5\u02bd\u0001\u0000\u0000"+
		"\u0000\u02c5\u02c0\u0001\u0000\u0000\u0000\u02c6a\u0001\u0000\u0000\u0000"+
		"\u02c7\u02d2\u0003n7\u0000\u02c8\u02d2\u0003X,\u0000\u02c9\u02d2\u0003"+
		"\\.\u0000\u02ca\u02d2\u0003^/\u0000\u02cb\u02d2\u0003V+\u0000\u02cc\u02d2"+
		"\u0003`0\u0000\u02cd\u02d2\u0003*\u0015\u0000\u02ce\u02d2\u0003f3\u0000"+
		"\u02cf\u02d2\u0003r9\u0000\u02d0\u02d2\u0005m\u0000\u0000\u02d1\u02c7"+
		"\u0001\u0000\u0000\u0000\u02d1\u02c8\u0001\u0000\u0000\u0000\u02d1\u02c9"+
		"\u0001\u0000\u0000\u0000\u02d1\u02ca\u0001\u0000\u0000\u0000\u02d1\u02cb"+
		"\u0001\u0000\u0000\u0000\u02d1\u02cc\u0001\u0000\u0000\u0000\u02d1\u02cd"+
		"\u0001\u0000\u0000\u0000\u02d1\u02ce\u0001\u0000\u0000\u0000\u02d1\u02cf"+
		"\u0001\u0000\u0000\u0000\u02d1\u02d0\u0001\u0000\u0000\u0000\u02d2c\u0001"+
		"\u0000\u0000\u0000\u02d3\u02d6\u0005s\u0000\u0000\u02d4\u02d6\u0003\\"+
		".\u0000\u02d5\u02d3\u0001\u0000\u0000\u0000\u02d5\u02d4\u0001\u0000\u0000"+
		"\u0000\u02d6\u02d7\u0001\u0000\u0000\u0000\u02d7\u02d8\u0005@\u0000\u0000"+
		"\u02d8\u02d9\u0003b1\u0000\u02d9\u02da\u0005L\u0000\u0000\u02dae\u0001"+
		"\u0000\u0000\u0000\u02db\u02e4\u00058\u0000\u0000\u02dc\u02e1\u0003h4"+
		"\u0000\u02dd\u02de\u0005N\u0000\u0000\u02de\u02e0\u0003h4\u0000\u02df"+
		"\u02dd\u0001\u0000\u0000\u0000\u02e0\u02e3\u0001\u0000\u0000\u0000\u02e1"+
		"\u02df\u0001\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2"+
		"\u02e5\u0001\u0000\u0000\u0000\u02e3\u02e1\u0001\u0000\u0000\u0000\u02e4"+
		"\u02dc\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000\u0000\u02e5"+
		"\u02e6\u0001\u0000\u0000\u0000\u02e6\u02e7\u00059\u0000\u0000\u02e7g\u0001"+
		"\u0000\u0000\u0000\u02e8\u02e9\u0005s\u0000\u0000\u02e9\u02ea\u0005M\u0000"+
		"\u0000\u02ea\u02ef\u0003b1\u0000\u02eb\u02ec\u0003^/\u0000\u02ec\u02ed"+
		"\u0005L\u0000\u0000\u02ed\u02ef\u0001\u0000\u0000\u0000\u02ee\u02e8\u0001"+
		"\u0000\u0000\u0000\u02ee\u02eb\u0001\u0000\u0000\u0000\u02efi\u0001\u0000"+
		"\u0000\u0000\u02f0\u02f1\u0005\u001a\u0000\u0000\u02f1\u02f2\u0005s\u0000"+
		"\u0000\u02f2\u02f3\u0005:\u0000\u0000\u02f3\u02f8\u0003b1\u0000\u02f4"+
		"\u02f5\u0005N\u0000\u0000\u02f5\u02f7\u0003b1\u0000\u02f6\u02f4\u0001"+
		"\u0000\u0000\u0000\u02f7\u02fa\u0001\u0000\u0000\u0000\u02f8\u02f6\u0001"+
		"\u0000\u0000\u0000\u02f8\u02f9\u0001\u0000\u0000\u0000\u02f9\u02fb\u0001"+
		"\u0000\u0000\u0000\u02fa\u02f8\u0001\u0000\u0000\u0000\u02fb\u02fc\u0005"+
		";\u0000\u0000\u02fck\u0001\u0000\u0000\u0000\u02fd\u0300\u0005s\u0000"+
		"\u0000\u02fe\u0300\u0005\u0014\u0000\u0000\u02ff\u02fd\u0001\u0000\u0000"+
		"\u0000\u02ff\u02fe\u0001\u0000\u0000\u0000\u0300\u0301\u0001\u0000\u0000"+
		"\u0000\u0301\u030a\u0005:\u0000\u0000\u0302\u0307\u0003b1\u0000\u0303"+
		"\u0304\u0005N\u0000\u0000\u0304\u0306\u0003b1\u0000\u0305\u0303\u0001"+
		"\u0000\u0000\u0000\u0306\u0309\u0001\u0000\u0000\u0000\u0307\u0305\u0001"+
		"\u0000\u0000\u0000\u0307\u0308\u0001\u0000\u0000\u0000\u0308\u030b\u0001"+
		"\u0000\u0000\u0000\u0309\u0307\u0001\u0000\u0000\u0000\u030a\u0302\u0001"+
		"\u0000\u0000\u0000\u030a\u030b\u0001\u0000\u0000\u0000\u030b\u030c\u0001"+
		"\u0000\u0000\u0000\u030c\u030d\u0005;\u0000\u0000\u030d\u030e\u0005L\u0000"+
		"\u0000\u030em\u0001\u0000\u0000\u0000\u030f\u0318\u00058\u0000\u0000\u0310"+
		"\u0315\u0003p8\u0000\u0311\u0312\u0005N\u0000\u0000\u0312\u0314\u0003"+
		"p8\u0000\u0313\u0311\u0001\u0000\u0000\u0000\u0314\u0317\u0001\u0000\u0000"+
		"\u0000\u0315\u0313\u0001\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000"+
		"\u0000\u0316\u0319\u0001\u0000\u0000\u0000\u0317\u0315\u0001\u0000\u0000"+
		"\u0000\u0318\u0310\u0001\u0000\u0000\u0000\u0318\u0319\u0001\u0000\u0000"+
		"\u0000\u0319\u031b\u0001\u0000\u0000\u0000\u031a\u031c\u0005N\u0000\u0000"+
		"\u031b\u031a\u0001\u0000\u0000\u0000\u031b\u031c\u0001\u0000\u0000\u0000"+
		"\u031c\u031d\u0001\u0000\u0000\u0000\u031d\u031e\u00059\u0000\u0000\u031e"+
		"o\u0001\u0000\u0000\u0000\u031f\u0320\u0005s\u0000\u0000\u0320\u0321\u0005"+
		"M\u0000\u0000\u0321\u0322\u0003b1\u0000\u0322q\u0001\u0000\u0000\u0000"+
		"\u0323\u0330\u0003~?\u0000\u0324\u0330\u0005q\u0000\u0000\u0325\u0330"+
		"\u0005s\u0000\u0000\u0326\u0330\u0003|>\u0000\u0327\u0328\u0005:\u0000"+
		"\u0000\u0328\u0329\u0003r9\u0000\u0329\u032a\u0005;\u0000\u0000\u032a"+
		"\u0330\u0001\u0000\u0000\u0000\u032b\u0330\u0003t:\u0000\u032c\u0330\u0003"+
		"\u0014\n\u0000\u032d\u0330\u0003\\.\u0000\u032e\u0330\u0003V+\u0000\u032f"+
		"\u0323\u0001\u0000\u0000\u0000\u032f\u0324\u0001\u0000\u0000\u0000\u032f"+
		"\u0325\u0001\u0000\u0000\u0000\u032f\u0326\u0001\u0000\u0000\u0000\u032f"+
		"\u0327\u0001\u0000\u0000\u0000\u032f\u032b\u0001\u0000\u0000\u0000\u032f"+
		"\u032c\u0001\u0000\u0000\u0000\u032f\u032d\u0001\u0000\u0000\u0000\u032f"+
		"\u032e\u0001\u0000\u0000\u0000\u0330s\u0001\u0000\u0000\u0000\u0331\u0336"+
		"\u0003v;\u0000\u0332\u0333\u0007\u0006\u0000\u0000\u0333\u0335\u0003v"+
		";\u0000\u0334\u0332\u0001\u0000\u0000\u0000\u0335\u0338\u0001\u0000\u0000"+
		"\u0000\u0336\u0334\u0001\u0000\u0000\u0000\u0336\u0337\u0001\u0000\u0000"+
		"\u0000\u0337u\u0001\u0000\u0000\u0000\u0338\u0336\u0001\u0000\u0000\u0000"+
		"\u0339\u033e\u0003x<\u0000\u033a\u033b\u0007\u0007\u0000\u0000\u033b\u033d"+
		"\u0003x<\u0000\u033c\u033a\u0001\u0000\u0000\u0000\u033d\u0340\u0001\u0000"+
		"\u0000\u0000\u033e\u033c\u0001\u0000\u0000\u0000\u033e\u033f\u0001\u0000"+
		"\u0000\u0000\u033fw\u0001\u0000\u0000\u0000\u0340\u033e\u0001\u0000\u0000"+
		"\u0000\u0341\u0346\u0003z=\u0000\u0342\u0343\u0007\b\u0000\u0000\u0343"+
		"\u0345\u0003z=\u0000\u0344\u0342\u0001\u0000\u0000\u0000\u0345\u0348\u0001"+
		"\u0000\u0000\u0000\u0346\u0344\u0001\u0000\u0000\u0000\u0346\u0347\u0001"+
		"\u0000\u0000\u0000\u0347y\u0001\u0000\u0000\u0000\u0348\u0346\u0001\u0000"+
		"\u0000\u0000\u0349\u0354\u0005s\u0000\u0000\u034a\u0354\u0005r\u0000\u0000"+
		"\u034b\u0354\u0005q\u0000\u0000\u034c\u034d\u0005:\u0000\u0000\u034d\u034e"+
		"\u0003r9\u0000\u034e\u034f\u0005;\u0000\u0000\u034f\u0354\u0001\u0000"+
		"\u0000\u0000\u0350\u0354\u0003\\.\u0000\u0351\u0354\u0003V+\u0000\u0352"+
		"\u0354\u0003\u0014\n\u0000\u0353\u0349\u0001\u0000\u0000\u0000\u0353\u034a"+
		"\u0001\u0000\u0000\u0000\u0353\u034b\u0001\u0000\u0000\u0000\u0353\u034c"+
		"\u0001\u0000\u0000\u0000\u0353\u0350\u0001\u0000\u0000\u0000\u0353\u0351"+
		"\u0001\u0000\u0000\u0000\u0353\u0352\u0001\u0000\u0000\u0000\u0354{\u0001"+
		"\u0000\u0000\u0000\u0355\u0356\u0006>\uffff\uffff\u0000\u0356\u0357\u0005"+
		"q\u0000\u0000\u0357\u0358\u0005E\u0000\u0000\u0358\u035d\u0003r9\u0000"+
		"\u0359\u035a\u0005s\u0000\u0000\u035a\u035b\u0005E\u0000\u0000\u035b\u035d"+
		"\u0003r9\u0000\u035c\u0355\u0001\u0000\u0000\u0000\u035c\u0359\u0001\u0000"+
		"\u0000\u0000\u035d\u0363\u0001\u0000\u0000\u0000\u035e\u035f\n\u0001\u0000"+
		"\u0000\u035f\u0360\u0005E\u0000\u0000\u0360\u0362\u0003r9\u0000\u0361"+
		"\u035e\u0001\u0000\u0000\u0000\u0362\u0365\u0001\u0000\u0000\u0000\u0363"+
		"\u0361\u0001\u0000\u0000\u0000\u0363\u0364\u0001\u0000\u0000\u0000\u0364"+
		"}\u0001\u0000\u0000\u0000\u0365\u0363\u0001\u0000\u0000\u0000\u0366\u036a"+
		"\u0005R\u0000\u0000\u0367\u0369\u0003\u0080@\u0000\u0368\u0367\u0001\u0000"+
		"\u0000\u0000\u0369\u036c\u0001\u0000\u0000\u0000\u036a\u0368\u0001\u0000"+
		"\u0000\u0000\u036a\u036b\u0001\u0000\u0000\u0000\u036b\u036d\u0001\u0000"+
		"\u0000\u0000\u036c\u036a\u0001\u0000\u0000\u0000\u036d\u036e\u0005R\u0000"+
		"\u0000\u036e\u007f\u0001\u0000\u0000\u0000\u036f\u0376\u0003\u0082A\u0000"+
		"\u0370\u0376\u0005s\u0000\u0000\u0371\u0376\u00032\u0019\u0000\u0372\u0376"+
		"\u00030\u0018\u0000\u0373\u0376\u00034\u001a\u0000\u0374\u0376\u0005r"+
		"\u0000\u0000\u0375\u036f\u0001\u0000\u0000\u0000\u0375\u0370\u0001\u0000"+
		"\u0000\u0000\u0375\u0371\u0001\u0000\u0000\u0000\u0375\u0372\u0001\u0000"+
		"\u0000\u0000\u0375\u0373\u0001\u0000\u0000\u0000\u0375\u0374\u0001\u0000"+
		"\u0000\u0000\u0376\u0081\u0001\u0000\u0000\u0000\u0377\u0378\u0005S\u0000"+
		"\u0000\u0378\u0379\u00058\u0000\u0000\u0379\u037a\u0003r9\u0000\u037a"+
		"\u037b\u00059\u0000\u0000\u037b\u0083\u0001\u0000\u0000\u0000\u037c\u0380"+
		"\u0005n\u0000\u0000\u037d\u0380\u0005o\u0000\u0000\u037e\u0380\u0005p"+
		"\u0000\u0000\u037f\u037c\u0001\u0000\u0000\u0000\u037f\u037d\u0001\u0000"+
		"\u0000\u0000\u037f\u037e\u0001\u0000\u0000\u0000\u0380\u0085\u0001\u0000"+
		"\u0000\u0000\u0381\u0382\u0005\'\u0000\u0000\u0382\u0383\u0005:\u0000"+
		"\u0000\u0383\u0384\u00058\u0000\u0000\u0384\u0389\u0003\u0088D\u0000\u0385"+
		"\u0386\u0005N\u0000\u0000\u0386\u0388\u0003\u0088D\u0000\u0387\u0385\u0001"+
		"\u0000\u0000\u0000\u0388\u038b\u0001\u0000\u0000\u0000\u0389\u0387\u0001"+
		"\u0000\u0000\u0000\u0389\u038a\u0001\u0000\u0000\u0000\u038a\u038c\u0001"+
		"\u0000\u0000\u0000\u038b\u0389\u0001\u0000\u0000\u0000\u038c\u038d\u0005"+
		"9\u0000\u0000\u038d\u038e\u0005;\u0000\u0000\u038e\u0087\u0001\u0000\u0000"+
		"\u0000\u038f\u0398\u0003\u008cF\u0000\u0390\u0398\u0003\u008aE\u0000\u0391"+
		"\u0398\u0003H$\u0000\u0392\u0398\u0003\u008eG\u0000\u0393\u0398\u0003"+
		"\u0090H\u0000\u0394\u0398\u0003\u0094J\u0000\u0395\u0398\u0003\u0096K"+
		"\u0000\u0396\u0398\u0003\u0098L\u0000\u0397\u038f\u0001\u0000\u0000\u0000"+
		"\u0397\u0390\u0001\u0000\u0000\u0000\u0397\u0391\u0001\u0000\u0000\u0000"+
		"\u0397\u0392\u0001\u0000\u0000\u0000\u0397\u0393\u0001\u0000\u0000\u0000"+
		"\u0397\u0394\u0001\u0000\u0000\u0000\u0397\u0395\u0001\u0000\u0000\u0000"+
		"\u0397\u0396\u0001\u0000\u0000\u0000\u0398\u0089\u0001\u0000\u0000\u0000"+
		"\u0399\u039a\u0005\n\u0000\u0000\u039a\u039b\u0005M\u0000\u0000\u039b"+
		"\u039c\u0005l\u0000\u0000\u039c\u008b\u0001\u0000\u0000\u0000\u039d\u039e"+
		"\u00057\u0000\u0000\u039e\u039f\u0005M\u0000\u0000\u039f\u03a0\u0005q"+
		"\u0000\u0000\u03a0\u008d\u0001\u0000\u0000\u0000\u03a1\u03a2\u00053\u0000"+
		"\u0000\u03a2\u03a3\u0005M\u0000\u0000\u03a3\u03a4\u0005R\u0000\u0000\u03a4"+
		"\u03a5\u0003\u00a2Q\u0000\u03a5\u03a6\u0005R\u0000\u0000\u03a6\u008f\u0001"+
		"\u0000\u0000\u0000\u03a7\u03a8\u00055\u0000\u0000\u03a8\u03a9\u0005M\u0000"+
		"\u0000\u03a9\u03aa\u0005q\u0000\u0000\u03aa\u0091\u0001\u0000\u0000\u0000"+
		"\u03ab\u03af\u0005R\u0000\u0000\u03ac\u03ae\u0003\u00b4Z\u0000\u03ad\u03ac"+
		"\u0001\u0000\u0000\u0000\u03ae\u03b1\u0001\u0000\u0000\u0000\u03af\u03ad"+
		"\u0001\u0000\u0000\u0000\u03af\u03b0\u0001\u0000\u0000\u0000\u03b0\u03b2"+
		"\u0001\u0000\u0000\u0000\u03b1\u03af\u0001\u0000\u0000\u0000\u03b2\u03b3"+
		"\u0005R\u0000\u0000\u03b3\u0093\u0001\u0000\u0000\u0000\u03b4\u03b5\u0005"+
		"4\u0000\u0000\u03b5\u03b6\u0005M\u0000\u0000\u03b6\u03bf\u0005<\u0000"+
		"\u0000\u03b7\u03bc\u0003\u0092I\u0000\u03b8\u03b9\u0005N\u0000\u0000\u03b9"+
		"\u03bb\u0003\u0092I\u0000\u03ba\u03b8\u0001\u0000\u0000\u0000\u03bb\u03be"+
		"\u0001\u0000\u0000\u0000\u03bc\u03ba\u0001\u0000\u0000\u0000\u03bc\u03bd"+
		"\u0001\u0000\u0000\u0000\u03bd\u03c0\u0001\u0000\u0000\u0000\u03be\u03bc"+
		"\u0001\u0000\u0000\u0000\u03bf\u03b7\u0001\u0000\u0000\u0000\u03bf\u03c0"+
		"\u0001\u0000\u0000\u0000\u03c0\u03c1\u0001\u0000\u0000\u0000\u03c1\u03c2"+
		"\u0005=\u0000\u0000\u03c2\u0095\u0001\u0000\u0000\u0000\u03c3\u03c4\u0005"+
		"6\u0000\u0000\u03c4\u03c5\u0005M\u0000\u0000\u03c5\u03ce\u0005<\u0000"+
		"\u0000\u03c6\u03cb\u0005q\u0000\u0000\u03c7\u03c8\u0005N\u0000\u0000\u03c8"+
		"\u03ca\u0005q\u0000\u0000\u03c9\u03c7\u0001\u0000\u0000\u0000\u03ca\u03cd"+
		"\u0001\u0000\u0000\u0000\u03cb\u03c9\u0001\u0000\u0000\u0000\u03cb\u03cc"+
		"\u0001\u0000\u0000\u0000\u03cc\u03cf\u0001\u0000\u0000\u0000\u03cd\u03cb"+
		"\u0001\u0000\u0000\u0000\u03ce\u03c6\u0001\u0000\u0000\u0000\u03ce\u03cf"+
		"\u0001\u0000\u0000\u0000\u03cf\u03d0\u0001\u0000\u0000\u0000\u03d0\u03d1"+
		"\u0005=\u0000\u0000\u03d1\u0097\u0001\u0000\u0000\u0000\u03d2\u03d3\u0005"+
		"s\u0000\u0000\u03d3\u03d4\u0005M\u0000\u0000\u03d4\u03d5\u0003\u009aM"+
		"\u0000\u03d5\u0099\u0001\u0000\u0000\u0000\u03d6\u03dc\u0005q\u0000\u0000"+
		"\u03d7\u03dc\u0005l\u0000\u0000\u03d8\u03dc\u0005r\u0000\u0000\u03d9\u03dc"+
		"\u0003\\.\u0000\u03da\u03dc\u0003V+\u0000\u03db\u03d6\u0001\u0000\u0000"+
		"\u0000\u03db\u03d7\u0001\u0000\u0000\u0000\u03db\u03d8\u0001\u0000\u0000"+
		"\u0000\u03db\u03d9\u0001\u0000\u0000\u0000\u03db\u03da\u0001\u0000\u0000"+
		"\u0000\u03dc\u009b\u0001\u0000\u0000\u0000\u03dd\u03de\u0005,\u0000\u0000"+
		"\u03de\u03df\u0005:\u0000\u0000\u03df\u03e8\u00058\u0000\u0000\u03e0\u03e5"+
		"\u0003\u009eO\u0000\u03e1\u03e2\u0005N\u0000\u0000\u03e2\u03e4\u0003\u009e"+
		"O\u0000\u03e3\u03e1\u0001\u0000\u0000\u0000\u03e4\u03e7\u0001\u0000\u0000"+
		"\u0000\u03e5\u03e3\u0001\u0000\u0000\u0000\u03e5\u03e6\u0001\u0000\u0000"+
		"\u0000\u03e6\u03e9\u0001\u0000\u0000\u0000\u03e7\u03e5\u0001\u0000\u0000"+
		"\u0000\u03e8\u03e0\u0001\u0000\u0000\u0000\u03e8\u03e9\u0001\u0000\u0000"+
		"\u0000\u03e9\u03ea\u0001\u0000\u0000\u0000\u03ea\u03eb\u00059\u0000\u0000"+
		"\u03eb\u03ec\u0005;\u0000\u0000\u03ec\u009d\u0001\u0000\u0000\u0000\u03ed"+
		"\u03ee\u0005s\u0000\u0000\u03ee\u03ef\u0005M\u0000\u0000\u03ef\u03f0\u0003"+
		"\u00a0P\u0000\u03f0\u009f\u0001\u0000\u0000\u0000\u03f1\u03f6\u0005q\u0000"+
		"\u0000\u03f2\u03f6\u0005l\u0000\u0000\u03f3\u03f6\u0005r\u0000\u0000\u03f4"+
		"\u03f6\u0005s\u0000\u0000\u03f5\u03f1\u0001\u0000\u0000\u0000\u03f5\u03f2"+
		"\u0001\u0000\u0000\u0000\u03f5\u03f3\u0001\u0000\u0000\u0000\u03f5\u03f4"+
		"\u0001\u0000\u0000\u0000\u03f6\u00a1\u0001\u0000\u0000\u0000\u03f7\u03f9"+
		"\u0003\u00a4R\u0000\u03f8\u03f7\u0001\u0000\u0000\u0000\u03f9\u03fc\u0001"+
		"\u0000\u0000\u0000\u03fa\u03f8\u0001\u0000\u0000\u0000\u03fa\u03fb\u0001"+
		"\u0000\u0000\u0000\u03fb\u00a3\u0001\u0000\u0000\u0000\u03fc\u03fa\u0001"+
		"\u0000\u0000\u0000\u03fd\u0402\u0003\u00a6S\u0000\u03fe\u0401\u0003\u00a4"+
		"R\u0000\u03ff\u0401\u0003\u00b2Y\u0000\u0400\u03fe\u0001\u0000\u0000\u0000"+
		"\u0400\u03ff\u0001\u0000\u0000\u0000\u0401\u0404\u0001\u0000\u0000\u0000"+
		"\u0402\u0400\u0001\u0000\u0000\u0000\u0402\u0403\u0001\u0000\u0000\u0000"+
		"\u0403\u0405\u0001\u0000\u0000\u0000\u0404\u0402\u0001\u0000\u0000\u0000"+
		"\u0405\u0406\u0003\u00a8T\u0000\u0406\u0409\u0001\u0000\u0000\u0000\u0407"+
		"\u0409\u0003\u00aaU\u0000\u0408\u03fd\u0001\u0000\u0000\u0000\u0408\u0407"+
		"\u0001\u0000\u0000\u0000\u0409\u00a5\u0001\u0000\u0000\u0000\u040a\u040b"+
		"\u0005>\u0000\u0000\u040b\u0410\u0005s\u0000\u0000\u040c\u040f\u0003\u00ac"+
		"V\u0000\u040d\u040f\u0003\u00b0X\u0000\u040e\u040c\u0001\u0000\u0000\u0000"+
		"\u040e\u040d\u0001\u0000\u0000\u0000\u040f\u0412\u0001\u0000\u0000\u0000"+
		"\u0410\u040e\u0001\u0000\u0000\u0000\u0410\u0411\u0001\u0000\u0000\u0000"+
		"\u0411\u0413\u0001\u0000\u0000\u0000\u0412\u0410\u0001\u0000\u0000\u0000"+
		"\u0413\u0414\u0005?\u0000\u0000\u0414\u00a7\u0001\u0000\u0000\u0000\u0415"+
		"\u0416\u0005>\u0000\u0000\u0416\u0417\u0005J\u0000\u0000\u0417\u0418\u0005"+
		"s\u0000\u0000\u0418\u0419\u0005?\u0000\u0000\u0419\u00a9\u0001\u0000\u0000"+
		"\u0000\u041a\u041b\u0005>\u0000\u0000\u041b\u0420\u0005s\u0000\u0000\u041c"+
		"\u041f\u0003\u00acV\u0000\u041d\u041f\u0003\u00b0X\u0000\u041e\u041c\u0001"+
		"\u0000\u0000\u0000\u041e\u041d\u0001\u0000\u0000\u0000\u041f\u0422\u0001"+
		"\u0000\u0000\u0000\u0420\u041e\u0001\u0000\u0000\u0000\u0420\u0421\u0001"+
		"\u0000\u0000\u0000\u0421\u0424\u0001\u0000\u0000\u0000\u0422\u0420\u0001"+
		"\u0000\u0000\u0000\u0423\u0425\u0005J\u0000\u0000\u0424\u0423\u0001\u0000"+
		"\u0000\u0000\u0424\u0425\u0001\u0000\u0000\u0000\u0425\u0426\u0001\u0000"+
		"\u0000\u0000\u0426\u0427\u0005?\u0000\u0000\u0427\u00ab\u0001\u0000\u0000"+
		"\u0000\u0428\u0429\u0005\\\u0000\u0000\u0429\u042a\u0005@\u0000\u0000"+
		"\u042a\u0435\u0003r9\u0000\u042b\u042c\u0005]\u0000\u0000\u042c\u042d"+
		"\u0005@\u0000\u0000\u042d\u0435\u0003r9\u0000\u042e\u042f\u0005:\u0000"+
		"\u0000\u042f\u0430\u0003r9\u0000\u0430\u0431\u0005;\u0000\u0000\u0431"+
		"\u0432\u0005@\u0000\u0000\u0432\u0433\u0003r9\u0000\u0433\u0435\u0001"+
		"\u0000\u0000\u0000\u0434\u0428\u0001\u0000\u0000\u0000\u0434\u042b\u0001"+
		"\u0000\u0000\u0000\u0434\u042e\u0001\u0000\u0000\u0000\u0435\u00ad\u0001"+
		"\u0000\u0000\u0000\u0436\u043a\u0005W\u0000\u0000\u0437\u0439\u0003r9"+
		"\u0000\u0438\u0437\u0001\u0000\u0000\u0000\u0439\u043c\u0001\u0000\u0000"+
		"\u0000\u043a\u0438\u0001\u0000\u0000\u0000\u043a\u043b\u0001\u0000\u0000"+
		"\u0000\u043b\u043d\u0001\u0000\u0000\u0000\u043c\u043a\u0001\u0000\u0000"+
		"\u0000\u043d\u043e\u0005X\u0000\u0000\u043e\u00af\u0001\u0000\u0000\u0000"+
		"\u043f\u0440\u0007\t\u0000\u0000\u0440\u0441\u0005@\u0000\u0000\u0441"+
		"\u0442\u0005q\u0000\u0000\u0442\u00b1\u0001\u0000\u0000\u0000\u0443\u0444"+
		"\u0006Y\uffff\uffff\u0000\u0444\u0446\u0005t\u0000\u0000\u0445\u0447\u0005"+
		"M\u0000\u0000\u0446\u0445\u0001\u0000\u0000\u0000\u0446\u0447\u0001\u0000"+
		"\u0000\u0000\u0447\u045b\u0001\u0000\u0000\u0000\u0448\u044a\u0005s\u0000"+
		"\u0000\u0449\u044b\u0005M\u0000\u0000\u044a\u0449\u0001\u0000\u0000\u0000"+
		"\u044a\u044b\u0001\u0000\u0000\u0000\u044b\u045b\u0001\u0000\u0000\u0000"+
		"\u044c\u044e\u0005r\u0000\u0000\u044d\u044f\u0005M\u0000\u0000\u044e\u044d"+
		"\u0001\u0000\u0000\u0000\u044e\u044f\u0001\u0000\u0000\u0000\u044f\u045b"+
		"\u0001\u0000\u0000\u0000\u0450\u0451\u0005:\u0000\u0000\u0451\u0452\u0003"+
		"\u00b2Y\u0000\u0452\u0454\u0005;\u0000\u0000\u0453\u0455\u0005M\u0000"+
		"\u0000\u0454\u0453\u0001\u0000\u0000\u0000\u0454\u0455\u0001\u0000\u0000"+
		"\u0000\u0455\u045b\u0001\u0000\u0000\u0000\u0456\u0458\u0003\u00aeW\u0000"+
		"\u0457\u0459\u0005M\u0000\u0000\u0458\u0457\u0001\u0000\u0000\u0000\u0458"+
		"\u0459\u0001\u0000\u0000\u0000\u0459\u045b\u0001\u0000\u0000\u0000\u045a"+
		"\u0443\u0001\u0000\u0000\u0000\u045a\u0448\u0001\u0000\u0000\u0000\u045a"+
		"\u044c\u0001\u0000\u0000\u0000\u045a\u0450\u0001\u0000\u0000\u0000\u045a"+
		"\u0456\u0001\u0000\u0000\u0000\u045b\u0464\u0001\u0000\u0000\u0000\u045c"+
		"\u045d\n\u0002\u0000\u0000\u045d\u045e\u0005E\u0000\u0000\u045e\u0460"+
		"\u0003\u00b2Y\u0000\u045f\u0461\u0005M\u0000\u0000\u0460\u045f\u0001\u0000"+
		"\u0000\u0000\u0460\u0461\u0001\u0000\u0000\u0000\u0461\u0463\u0001\u0000"+
		"\u0000\u0000\u0462\u045c\u0001\u0000\u0000\u0000\u0463\u0466\u0001\u0000"+
		"\u0000\u0000\u0464\u0462\u0001\u0000\u0000\u0000\u0464\u0465\u0001\u0000"+
		"\u0000\u0000\u0465\u00b3\u0001\u0000\u0000\u0000\u0466\u0464\u0001\u0000"+
		"\u0000\u0000\u0467\u0468\u0003\u00ba]\u0000\u0468\u0469\u00058\u0000\u0000"+
		"\u0469\u046e\u0003\u00bc^\u0000\u046a\u046b\u0005L\u0000\u0000\u046b\u046d"+
		"\u0003\u00bc^\u0000\u046c\u046a\u0001\u0000\u0000\u0000\u046d\u0470\u0001"+
		"\u0000\u0000\u0000\u046e\u046c\u0001\u0000\u0000\u0000\u046e\u046f\u0001"+
		"\u0000\u0000\u0000\u046f\u0472\u0001\u0000\u0000\u0000\u0470\u046e\u0001"+
		"\u0000\u0000\u0000\u0471\u0473\u0005L\u0000\u0000\u0472\u0471\u0001\u0000"+
		"\u0000\u0000\u0472\u0473\u0001\u0000\u0000\u0000\u0473\u0474\u0001\u0000"+
		"\u0000\u0000\u0474\u0475\u00059\u0000\u0000\u0475\u00b5\u0001\u0000\u0000"+
		"\u0000\u0476\u047a\u0005s\u0000\u0000\u0477\u0479\u0007\n\u0000\u0000"+
		"\u0478\u0477\u0001\u0000\u0000\u0000\u0479\u047c\u0001\u0000\u0000\u0000"+
		"\u047a\u0478\u0001\u0000\u0000\u0000\u047a\u047b\u0001\u0000\u0000\u0000"+
		"\u047b\u00b7\u0001\u0000\u0000\u0000\u047c\u047a\u0001\u0000\u0000\u0000"+
		"\u047d\u047f\u0005r\u0000\u0000\u047e\u0480\u0007\u000b\u0000\u0000\u047f"+
		"\u047e\u0001\u0000\u0000\u0000\u047f\u0480\u0001\u0000\u0000\u0000\u0480"+
		"\u0485\u0001\u0000\u0000\u0000\u0481\u0485\u0005s\u0000\u0000\u0482\u0483"+
		"\u0005U\u0000\u0000\u0483\u0485\u0007\f\u0000\u0000\u0484\u047d\u0001"+
		"\u0000\u0000\u0000\u0484\u0481\u0001\u0000\u0000\u0000\u0484\u0482\u0001"+
		"\u0000\u0000\u0000\u0485\u00b9\u0001\u0000\u0000\u0000\u0486\u0488\u0007"+
		"\r\u0000\u0000\u0487\u0486\u0001\u0000\u0000\u0000\u0487\u0488\u0001\u0000"+
		"\u0000\u0000\u0488\u0489\u0001\u0000\u0000\u0000\u0489\u048e\u0003\u00b6"+
		"[\u0000\u048a\u048b\u0005M\u0000\u0000\u048b\u048d\u0003\u00b6[\u0000"+
		"\u048c\u048a\u0001\u0000\u0000\u0000\u048d\u0490\u0001\u0000\u0000\u0000"+
		"\u048e\u048c\u0001\u0000\u0000\u0000\u048e\u048f\u0001\u0000\u0000\u0000"+
		"\u048f\u00bb\u0001\u0000\u0000\u0000\u0490\u048e\u0001\u0000\u0000\u0000"+
		"\u0491\u0492\u0003\u00b6[\u0000\u0492\u0496\u0005M\u0000\u0000\u0493\u0495"+
		"\u0003\u00b8\\\u0000\u0494\u0493\u0001\u0000\u0000\u0000\u0495\u0498\u0001"+
		"\u0000\u0000\u0000\u0496\u0494\u0001\u0000\u0000\u0000\u0496\u0497\u0001"+
		"\u0000\u0000\u0000\u0497\u00bd\u0001\u0000\u0000\u0000\u0498\u0496\u0001"+
		"\u0000\u0000\u0000\u0081\u00c1\u00dd\u00e3\u00ed\u00f1\u00f4\u00fb\u00fe"+
		"\u0103\u0116\u011b\u0138\u013d\u0147\u014d\u015d\u015f\u0163\u016f\u0173"+
		"\u0175\u017c\u0181\u0185\u018c\u0192\u0196\u019b\u01a0\u01a3\u01a8\u01b0"+
		"\u01bb\u01be\u01c3\u01c9\u01d6\u01de\u01e5\u01f1\u01fd\u01ff\u0206\u020e"+
		"\u021c\u0222\u022a\u022f\u0238\u0243\u024f\u0252\u0261\u0269\u026c\u0274"+
		"\u0279\u0281\u0285\u0287\u028f\u0295\u029c\u029f\u02a3\u02ab\u02b6\u02b9"+
		"\u02c5\u02d1\u02d5\u02e1\u02e4\u02ee\u02f8\u02ff\u0307\u030a\u0315\u0318"+
		"\u031b\u032f\u0336\u033e\u0346\u0353\u035c\u0363\u036a\u0375\u037f\u0389"+
		"\u0397\u03af\u03bc\u03bf\u03cb\u03ce\u03db\u03e5\u03e8\u03f5\u03fa\u0400"+
		"\u0402\u0408\u040e\u0410\u041e\u0420\u0424\u0434\u043a\u0446\u044a\u044e"+
		"\u0454\u0458\u045a\u0460\u0464\u046e\u0472\u047a\u047f\u0484\u0487\u048e"+
		"\u0496";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}