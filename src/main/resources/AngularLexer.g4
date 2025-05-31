lexer grammar AngularLexer;

//Words in TypeScript
CLASS: 'class';
FUNCTION: 'function';
IF: 'if';
DO: 'do';
WHILE: 'while';
ELSE: 'else';
FOR: 'for';
LTE: '<=';
GTE: '>=';
STAND_ALONE: 'standalone';
RETURN: 'return';
IMPORTS: 'imports';
IMPORT: 'import';
EXPORT: 'export';
INTERFACE: 'interface';
ENUM: 'enum';
TYPE: 'type';
IMPLEMENTS: 'implements';
EXTENDS: 'extends';
SUPER: 'super';
THIS: 'this';
ABSTRACT: 'abstract';
STATIC: 'static';
ASYNC: 'async';
AWAIT: 'await';
NEW: 'new';
TRY: 'try';
CATCH: 'catch';
FINALLY: 'finally';
THROW: 'throw';
INSTANCEOF: 'instanceof';
IN: 'in';
OF: 'of';
LET: 'let';
CONST: 'const';
VAR: 'var';
AS: 'as';
FROM: 'from';

// Words in Angular
COMPONENT: '@Component';
DIRECTIVE: '@Directive';
INPUT: '@Input';
OUTPUT: '@Output';
MODULE: '@NgModule';
INJECTABLE: '@Injectable';
PIPE: '@Pipe';
SERVICE: '@Service';
VIEW_CHILD: '@ViewChild';
VIEW_CHILDREN: '@ViewChildren';
CONTENT_CHILD: '@ContentChild';
CONTENT_CHILDREN: '@ContentChildren';

TEMPLATE: 'template';
STYLES: 'styles';
TEMPLATEURL: 'templateUrl';
STYLEURLS: 'styleUrls';
SELECTOR: 'selector';

// Sympols
LBRACE: '{';
RBRACE: '}';
LPAREN: '(';
RPAREN: ')';
LBRACK: '[';
RBRACK: ']';
LT: '<';
GT: '>';
ASSIGN: '=';
EQ: '==';
STRICT_EQ: '===';
NEQ: '!=';
STRICT_NEQ: '!==';
PLUS: '+';
PLUSPLUS: '++';   // Must come before PLUS
MINUSMINUS: '--';
MINUS: '-';
MUL: '*';
DIV: '/';
MOD: '%';
SEMI: ';';
COLON: ':';
COMMA: ',';
DOT: '.';
QUESTION: '?';
AT: '@';
LITERAL: '`';
SDOLLAR: '$';
VBAR: '|';
HASHTAG: '#';
UNDERSCORE: '_';


// Data Types
//BOOLEAN: 'true' | 'false';
//NULL_LITERAL: 'null';
//UNDEFINED_LITERAL: 'undefined';
//DATA_TYPE: 'string' | 'number' | 'boolean' | 'any' | 'void' | 'unknown';

// Binding Angular
DATA_BINDING_START: '{{';
DATA_BINDING_END: '}}';
TWO_WAY_BINDING: '[(' IDENTIFIER ')]';
PROPERTY_BINDING: '[' IDENTIFIER ']';
//EVENT_BINDING: '(' IDENTIFIER ')';


ARRAY: 'Array';
// Angular Directives
NG_IF: '*ngIf';
NG_FOR: '*ngFor';
NG_CLASS: 'ngClass';
NG_STYLE: 'ngStyle';
NG_SWITCH: '*ngSwitch';
NG_SWITCH_CASE: '*ngSwitchCase';
NG_SWITCH_DEFAULT: '*ngSwitchDefault';
NG_MODEL_OPTIONS: '[ngModelOptions]';
NG_TEMPLATE: 'ng-template';
NG_MODEL: '[ngModel]';

// Extended Bindings
ATTRIBUTE_BINDING: '[attr.' IDENTIFIER ']';
CLASS_BINDING: '[class.' IDENTIFIER ']';
STYLE_BINDING: '[style.' IDENTIFIER ']';

// DataTypes
BOOLEAN_DT: 'boolean';
STRING_DT: 'string';
NUMBER_DT: 'number';

// Boolean
BOOLEAN: 'true' | 'false';
NULL: 'null';

// Access modifiers
PUBLIC: 'public';
PRIVATE: 'private';
PROTECTED: 'protected';

// String
STRING
    : '"' (~["\\] | '\\' .)* '"'
    | '\'' (~['\\] | '\\' .)* '\''
    ;

// Number
NUMBER
    : '-'? [0-9]+ ('.' [0-9]+)? ([eE] [+-]? [0-9]+)?
    ;


// Identifiers
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_$]*;
ARABIC: [\u0621-\u064A];

// Comments
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

// Empty Spaces
WS: [ \t\r\n]+ -> skip;

