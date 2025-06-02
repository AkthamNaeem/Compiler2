parser grammar AngularParser;

options { tokenVocab = AngularLexer; }

instruction:
      statement* EOF
;

statement
    : constDeclaration             #ConstStatement
    | variableDeclaration          #VariableStatement
    | enumDeclaration              #EnumStatement
    | functionDeclaration          #FunctionStatement
    | assignValue                  #AssignmentStatement
    | functionAssignDeclaration    #FunctionAssignStatement
    | returnDeclaration            #ReturnStatement
    | objectFunction SEMI          #ObjectFunctionStatement
    | interfaceDeclaration         #InterfaceStatement
    | classDeclaration             #ClassStatement
    | classObjectDeclaration       #ClassObjectStatement
    | functionCall                 #FunctionCallStatement
    | moduleDeclaration            #ModuleStatement
    | importModule                 #ImportStatement
    | componentDef                 #ComponentStatement
    | serviceDef                   #ServiceStatement
    | forLoop                      #ForLoopStatement
    | forEachLoop                  #ForEachLoopStatement
    | ifStatement                  #IfStatementStatement
    | doWhileLoop                  #DoWhileStatement
    | whileLoop                    #WhileStatement
;

constDeclaration: CONST name=IDENTIFIER (COLON type=allOptions)? ASSIGN value=allValues SEMI;

variableDeclaration: (LET | VAR) name=IDENTIFIER (COLON type=allOptions)? (ASSIGN value=allValues)? SEMI?;

forLoop:
    FOR LPAREN
    (init=variableDeclaration | initAssign=assignValue | SEMI)
    condition=expression? SEMI
    (update=assignValue | updateOp=arithmeticOperation)?
    RPAREN body=block
;

ifStatement:
    IF LPAREN condition=expression RPAREN thenBlock=block
    (ELSE IF LPAREN elseIfCond=expression RPAREN elseIfBlock=block)*
    (ELSE elseBlock=block)?
;

whileLoop:
    WHILE LPAREN condition=expression RPAREN body=block
;
doWhileLoop:
    DO body=block WHILE LPAREN condition=expression RPAREN SEMI
;
forEachLoop:
    FOR LPAREN (VAR | LET | CONST) item=IDENTIFIER OF iterable=expression RPAREN body=block
;

block
    : LBRACE statements=statement* RBRACE   #BlockWithBraces
    | singleStmt=statement                  #SingleStatementBlock
;

arithmeticOperation
    : id=IDENTIFIER (PLUSPLUS | MINUSMINUS)                             #PostfixUnaryOperation
    | (PLUSPLUS | MINUSMINUS) id=IDENTIFIER                             #PrefixUnaryOperation
    | id=IDENTIFIER (PLUS | MINUS | MUL | DIV) ASSIGN expr=expression   #CompoundAssignmentOperation
;

functionAssignDeclaration: (LET | VAR | CONST) name=IDENTIFIER (COLON type=allOptions)? ASSIGN value=valueFunctionDeclaration;
classObjectDeclaration: (LET | VAR | CONST) name=IDENTIFIER ASSIGN value=classValue SEMI;
variableDeclarationWithinClass: name=IDENTIFIER (COLON type=allOptions (VBAR NULL)?)? (ASSIGN value=allValues)? SEMI;
enumDeclaration: ENUM name=IDENTIFIER LBRACE (values+=enumVariable (COMMA values+=enumVariable)* COMMA?)? RBRACE;
enumVariable: name=typeOptions (ASSIGN value=(STRING | NUMBER | IDENTIFIER))?;
functionVariable: name=IDENTIFIER (COLON type=allOptions)? (ASSIGN value=allValues)?;
functionDeclaration: FUNCTION returnType=typeOptions func=baseFunctionDeclaration;
functionDeclarationWithinClass: FUNCTION? returnType=typeOptions func=baseFunctionDeclaration;
baseFunctionDeclaration: name=IDENTIFIER? LPAREN (params+=accessModifiers? functionVariable (COMMA params+=accessModifiers? functionVariable)*)? RPAREN (COLON returnType=allOptions)? body=functionBody;
functionBody:
    LBRACE
    ( statements+=statement )*
    RBRACE
;
arrowFunction: LPAREN (params+=functionVariable (COMMA params+=functionVariable)*)? RPAREN (COLON returnType=allOptions)? ASSIGN GT (body=allValues | bodyExpr=expression);
valueFunctionDeclaration: FUNCTION func=baseFunctionDeclaration;
//returnDeclaration: RETURN (value=allValues | op=operatorDeclaration) SEMI;

returnDeclaration
    : RETURN value=allValues SEMI
    | RETURN op=operatorDeclaration SEMI;

logicOperations
    : LT          #LessThan
    | GT          #GreaterThan
    | EQ          #Equal
    | STRICT_EQ   #StrictEqual
    | NEQ         #NotEqual
    | STRICT_NEQ  #StrictNotEqual
;

arithmeticDeclaration
    : PLUS    #Addition
    | MINUS   #Subtraction
    | MUL     #Multiplication
    | DIV     #Division
    | MOD     #Modulus
;

symbols
    : LPAREN     #LeftParen
    | RPAREN     #RightParen
    | LBRACK     #LeftBracket
    | RBRACK     #RightBracket
    | SEMI       #Semicolon
    | COLON      #Colon
    | COMMA      #Comma
    | DOT        #Dot
    | QUESTION   #QuestionMark
    | AT         #AtSymbol
;

operator
    : leftOp=allValues op=logicOperations rightOp=allValues                           #LogicalOperator
    | leftOp=allValues (ops+=arithmeticDeclaration values+=allValues)+                #ArithmeticOperatorChain
;

operatorDeclaration
    : LPAREN op=operator RPAREN   #ParenthesizedOperator
    | op=operator                 #SimpleOperator
;

interfaceDeclaration: INTERFACE name=IDENTIFIER LBRACE (members+=interfaceObject)* RBRACE;
interfaceObject: name=IDENTIFIER COLON type=typeOptions SEMI;
classDeclaration: CLASS name=IDENTIFIER (EXTENDS parent=IDENTIFIER)? LBRACE (members+=classBody)* RBRACE;
classBody
    : varDecl=variableDeclarationWithinClass   #ClassVariableDeclaration
    | method=functionDeclarationWithinClass    #ClassMethodDeclaration
    | call=functionCall                        #ClassFunctionCall
;
moduleDeclaration: EXPORT (cls=classDeclaration | iface=interfaceDeclaration);
importModule: IMPORT LBRACE (imports+=importSpecifier (COMMA imports+=importSpecifier)* RBRACE FROM path=STRING SEMI);
importSpecifier: name=IDENTIFIER (AS alias=IDENTIFIER)?;


importsDef: IMPORTS COLON modules=importArray;
importArray: LBRACK (importItems+=importItem (COMMA importItems+=importItem)*)? RBRACK;
importItem: module=IDENTIFIER;


arrayOptions
    : type=typeOptions LBRACK RBRACK           #BracketArrayType
    | ARRAY LT type=typeOptions GT             #GenericArrayType
;

tupleOptions: LBRACK (types+=typeOptions (COMMA types+=typeOptions)*)? RBRACK;

typeOptions
    : NUMBER_DT             #NumberType
    | STRING_DT             #StringType
    | BOOLEAN_DT            #BooleanType
    | name=IDENTIFIER       #CustomType
;

allOptions
    : simpleType=typeOptions       #SimpleTypeOption
    | tuple=tupleOptions           #TupleTypeOption
    | array=arrayOptions           #ArrayTypeOption
;

arrayValues: LBRACK (values+=allValues (COMMA values+=allValues)* COMMA?)? RBRACK;

valueOptions
    : str=STRING       #StringValue
    | num=NUMBER       #NumberValue
    | bool=BOOLEAN     #BooleanValue
    | id=IDENTIFIER    #IdentifierValue
;

object: ((id=IDENTIFIER | assertion=assertionValue | THIS | SUPER) | LPAREN (id=IDENTIFIER | assertion=assertionValue | THIS | SUPER) RPAREN);
objectValue: ((THIS | SUPER) DOT)? obj=object DOT prop=IDENTIFIER;
objectFunction: ((THIS | SUPER) DOT)? obj=object DOT method=IDENTIFIER LPAREN (args+=allValues (COMMA args+=allValues)*)? RPAREN;

assertionValue
    : value=IDENTIFIER AS type=typeOptions      #AsAssertion
    | LT type=typeOptions GT value=IDENTIFIER   #GenericAssertion
;

allValues
    : jsonValue=jsonDef             #JsonValue
    | simple=valueOptions           #SimpleValue
    | objVal=objectValue            #ObjectValueValue
    | funcCall=objectFunction       #ObjectFunctionValue
    | array=arrayValues             #ArrayValue
    | assertion=assertionValue      #AssertionValueValue
    | arrowFunc=arrowFunction       #ArrowFunctionValue
    | ifaceValue=interfaceValues    #InterfaceValuesValue
    | expr=expression               #ExpressionValue
    | NULL                          #NullValue
;

assignValue: (target=IDENTIFIER | objTarget=objectValue) ASSIGN value=allValues SEMI;
interfaceValues: LBRACE (members+=interfaceValue (COMMA members+=interfaceValue)*)? RBRACE;

interfaceValue
    : name=IDENTIFIER COLON value=allValues   #InterfaceProperty
    | method=objectFunction SEMI              #InterfaceMethod
;

classValue: NEW className=IDENTIFIER LPAREN (args+=allValues (COMMA args+=allValues)*) RPAREN;
// returnStatement: RETURN expr=expression SEMI;
functionCall: (name=IDENTIFIER | SUPER) LPAREN (args+=allValues (COMMA args+=allValues)*)? RPAREN SEMI;
jsonDef: LBRACE (props+=jsonBody (COMMA props+=jsonBody)*)? COMMA? RBRACE;
jsonBody: key=IDENTIFIER COLON value=allValues;

expression
    : strLit=stringLiteral                   #StringLiteralExpression
    | str=STRING                             #StringExpression
    | id=IDENTIFIER                          #IdentifierExpression
    | addExpr=additionExpression             #AdditionExpressionExpression
    | LPAREN expr=expression RPAREN          #ParenthesizedExpression
    | cmpExpr=comparisonExpression           #ComparisonExpressionExpression
    | arithOp=arithmeticOperation            #ArithmeticExpression
    | objVal=objectValue                     #ObjectValueExpression
    | arrVal=arrayValues                     #ArrayValueExpression
;


comparisonExpression
    : leftExpr=additiveExpression ( (op=(LT | GT | LTE | GTE | EQ | NEQ | STRICT_EQ | STRICT_NEQ)) rightExpr=additiveExpression )*
    ;
additiveExpression
    : leftExpr=multiplicativeExpression ( (op=(PLUS | MINUS)) rightExpr=multiplicativeExpression )*
    ;
multiplicativeExpression
    : leftExpr=primaryExpression ( (op=(MUL | DIV | MOD)) rightExpr=primaryExpression )*
    ;

primaryExpression
    : id=IDENTIFIER                          #PrimaryIdentifier
    | num=NUMBER                             #PrimaryNumber
    | str=STRING                             #PrimaryString
    | LPAREN expr=expression RPAREN          #PrimaryParenthesized
    | obj=objectValue                        #PrimaryObject
    | arr=arrayValues                        #PrimaryArray
    | arith=arithmeticOperation              #PrimaryArithmetic
;


additionExpression
    : leftStr=STRING PLUS rightExpr=expression            #StringConcatenation
    | leftId=IDENTIFIER PLUS rightExpr=expression         #IdentifierConcatenation
    | leftAdd=additionExpression PLUS rightExpr=expression #NestedAddition
;


stringLiteral: LITERAL literalContent* LITERAL;

literalContent
    : templateSubstitution     #TemplateSubstitutionContent
    | IDENTIFIER               #IdentifierContent
    | arithmeticDeclaration    #ArithmeticOperatorContent
    | logicOperations          #LogicalOperatorContent
    | symbols                  #SymbolContent
    | NUMBER                   #NumberContent
;


templateSubstitution: SDOLLAR LBRACE expr=expression RBRACE;

accessModifiers
    : PUBLIC      #PublicModifier
    | PRIVATE     #PrivateModifier
    | PROTECTED   #ProtectedModifier
;


componentDef:
    COMPONENT LPAREN LBRACE
    props+=componentPropertyDef (COMMA props+=componentPropertyDef)*
    RBRACE RPAREN;

componentPropertyDef
    : selectorDef              #SelectorProperty
    | standaloneDef            #StandaloneProperty
    | importsDef               #ImportsProperty
    | templateDef              #TemplateProperty
    | templateUrlDef           #TemplateUrlProperty
    | stylesDef                #StylesProperty
    | styleUrlsDef             #StyleUrlsProperty
    | prop=componentProperty   #ComponentCustomProperty
;

standaloneDef: STAND_ALONE COLON value=BOOLEAN;
selectorDef: SELECTOR COLON selector=STRING;
templateDef: TEMPLATE COLON start=LITERAL content=html end=LITERAL;
templateUrlDef: TEMPLATEURL COLON path=STRING;
styleDef: LITERAL cssRule* LITERAL;
stylesDef: STYLES COLON styleList=LBRACK (styleDefs+=styleDef (COMMA styleDefs+=styleDef)*)? RBRACK;
styleUrlsDef: STYLEURLS COLON paths=LBRACK (urls+=STRING (COMMA urls+=STRING)*)? RBRACK;

componentProperty:
    name=IDENTIFIER COLON value=componentPropertyValue;

componentPropertyValue
    : STRING          #ComponentStringValue
    | BOOLEAN         #ComponentBooleanValue
    | NUMBER          #ComponentNumberValue
    | objectValue     #ComponentObjectValue
    | arrayValues     #ComponentArrayValue
;

serviceDef: INJECTABLE LPAREN LBRACE (props+=serviceProperty (COMMA props+=serviceProperty)*)? RBRACE RPAREN;
serviceProperty: name=IDENTIFIER COLON value=servicePropertyValue;
servicePropertyValue
    : STRING         #ServiceStringValue
    | BOOLEAN        #ServiceBooleanValue
    | NUMBER         #ServiceNumberValue
    | IDENTIFIER     #ServiceIdentifierValue
;

html: elements+=htmlElement*;
htmlElement
    : tag=htmlTag (children+=htmlElement | expressions+=htmlExpression)* closing=closingHtmlTag   #StandardHtmlElement
    | selfClosing=selfClosingTag                                                                  #SelfClosingHtmlElement
;

htmlTag: LT tagName=IDENTIFIER (directives+=htmlTemplateType | attrs+=htmlTagData)* GT;
closingHtmlTag: LT DIV tagName=IDENTIFIER GT;
selfClosingTag: LT tagName=IDENTIFIER (directives+=htmlTemplateType | attrs+=htmlTagData)* DIV? GT;
htmlTemplateType
    : NG_IF ASSIGN condition=expression                        #NgIfTemplate
    | NG_FOR ASSIGN loop=expression                            #NgForTemplate
    | LPAREN event=expression RPAREN ASSIGN handler=expression #EventBindingTemplate
;

htmlDataBinding: DATA_BINDING_START expression* DATA_BINDING_END;
htmlTagData: (PROPERTY_BINDING | IDENTIFIER | CLASS) ASSIGN STRING;

htmlExpression
    : ARABIC COLON?                                        #ArabicHtmlExpression
    | IDENTIFIER COLON?                                    #IdentifierHtmlExpression
    | NUMBER COLON?                                        #NumberHtmlExpression
    | LPAREN expr=htmlExpression RPAREN COLON?             #ParenthesizedHtmlExpression
    | left=htmlExpression PLUS right=htmlExpression COLON? #AdditionHtmlExpression
    | htmlDataBinding COLON?                               #DataBindingHtmlExpression
;

cssRule: cssSelector LBRACE cssKeyValue (SEMI cssKeyValue)* SEMI? RBRACE;
cssKey: IDENTIFIER (MINUS | IDENTIFIER | NUMBER | TYPE)*;
cssValue
    : NUMBER (IDENTIFIER | MOD)?          #NumericCssValue
    | IDENTIFIER                          #IdentifierCssValue
    | HASHTAG (IDENTIFIER | NUMBER)       #ColorCssValue
;

cssSelector: (DOT | HASHTAG)? cssKey (COLON cssKey)*;
cssKeyValue: cssKey COLON cssValue*;



