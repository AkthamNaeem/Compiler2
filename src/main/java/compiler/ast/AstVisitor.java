package main.java.compiler.ast;

import main.java.compiler.ast.arithmeticOperation.CompoundAssignmentOperation;

public interface AstVisitor<T> {
    T visitToken (Token node);
    T visitConstDeclaration (ConstDeclaration node);
    T visitStatement (Statement node);
    T visitCompoundAssignmentOperation (CompoundAssignmentOperation node);


    ///
    T visitLogicalOperator(LogicalOperator node);
    T visitArithmeticOperatorChain(ArithmeticOperatorChain node);
    T visitParenthesizedOperator(ParenthesizedOperator node);
    T visitSimpleOperator(SimpleOperator node);
    T visitInterfaceDeclaration(InterfaceDeclaration node);
    T visitClassDeclaration(ClassDeclaration node);
    T visitModuleDeclaration(ModuleDeclaration node);
    T visitImportSpecifier(ImportSpecifier node);
    T visitImportsDef(ImportsDef node);
    T visitImportArray(ImportArray node);
    T visitImportItem(ImportItem node);
    T visitTupleOptions(TupleOptions node);
    T visitNumberType(NumberType node);
    T visitStringType(StringType node);
    T visitBooleanType(BooleanType node);
    T visitCustomType(CustomType node);
    T visitArrayValues(ArrayValues node);
    T visitObjectNode(ObjectNode node);
    T visitObjectValue(ObjectValue node);
    T visitObjectFunctionCall(ObjectFunctionCall node);
    T visitAssignValue(AssignValue node);
    T visitInterfaceValues(InterfaceValues node);
    T visitInterfaceProperty(InterfaceProperty node);
    T visitInterfaceMethod(InterfaceMethod node);
    T visitClassValue(ClassValue node);
    T visitFunctionCall(FunctionCall node);
    T visitJsonDef(JsonDef node);
    T visitJsonProperty(JsonProperty node);
    T visitComparisonExpression(ComparisonExpression node);
    T visitAdditiveExpression(AdditiveExpression node);
    T visitMultiplicativeExpression(MultiplicativeExpression node);
    T visitPrimaryIdentifier(PrimaryIdentifier node);
    T visitPrimaryNumber(PrimaryNumber node);
    T visitPrimaryString(PrimaryString node);
    T visitPrimaryParenthesized(PrimaryParenthesized node);
    T visitPrimaryObject(PrimaryObject node);
    T visitPrimaryArray(PrimaryArray node);
    T visitPrimaryArithmetic(PrimaryArithmetic node);
    T visitStringConcatenation(StringConcatenation node);
    T visitIdentifierConcatenation(IdentifierConcatenation node);
    T visitNestedAddition(NestedAddition node);
    T visitStringLiteral(StringLiteral node);
    T visitTemplateSubstitutionContent(TemplateSubstitutionContent node);
    T visitIdentifierContent(IdentifierContent node);
    T visitArithmeticOperatorContent(ArithmeticOperatorContent node);
    T visitLogicalOperatorContent(LogicalOperatorContent node);
    T visitSymbolContent(SymbolContent node);
    T visitNumberContent(NumberContent node);
    T visitTemplateSubstitution(TemplateSubstitution node);
    // modifiers:
    T visitPublicModifier(PublicModifier node);
    T visitPrivateModifier(PrivateModifier node);
    T visitProtectedModifier(ProtectedModifier node);
    // components:
    T visitComponentDef(ComponentDef node);
    T visitComponentPropertyDef(ComponentPropertyDef node);
    T visitComponentDef(ComponentDef node);
    T visitSelectorProperty(SelectorProperty node);
    T visitStandaloneProperty(StandaloneProperty node);
    T visitImportsProperty(ImportsProperty node);
    T visitTemplateProperty(TemplateProperty node);
    T visitTemplateUrlProperty(TemplateUrlProperty node);
    T visitStylesProperty(StylesProperty node);
    T visitStylesUrlProperty(StylesUrlProperty node);
    T visitCustomProperty(CustomProperty node);
    T visitStandaloneDef(StandaloneDef node);
    T visitSelectorDef(SelectorDef node);
    T visitTemplateDef(TemplateDef node);
    T visitTemplateUrlDef(TemplateUrlDef node);
    T visitStyleDef(StyleDef node);
    T visitStylesDef(StylesDef node);
    T visitStyleUrlsDef(StyleUrlsDef node);
    T visitComponentProperty(ComponentProperty node);
    T visitComponentStringValue(ComponentStringValue node);
    T visitComponentBooleanValue(ComponentBooleanValue node);
    T visitComponentNumberValue(ComponentNumberValue node);
    T visitComponentObjectValue(ComponentObjectValue node);
    T visitComponentArrayValue(ComponentArrayValue node);
    // HTML Document
    T visitHtmlDocument(HtmlDocument node);

    // HTML Elements
    T visitStandardHtmlElement(StandardHtmlElement node);
    T visitSelfClosingHtmlElement(SelfClosingHtmlElement node);

    // Directives
    T visitNgIfDirective(NgIfDirective node);
    T visitNgForDirective(NgForDirective node);
    T visitNgIfTemplate(NgIfTemplate node);
    T visitNgForTemplate(NgForTemplate node);
    T visitEventBindingTemplate(EventBindingTemplate node);

    T visitHtmlDataBinding(HtmlDataBinding node);
    T visitHtmlTagData(HtmlTagData node);
    T visitArabicHtmlExpression(ArabicHtmlExpression node);
    T visitIdentifierHtmlExpression(IdentifierHtmlExpression node);
    T visitNumberHtmlExpression(NumberHtmlExpression node);
    T visitParenthesizedHtmlExpression(ParenthesizedHtmlExpression node);
    T visitAdditionHtmlExpression(AdditionHtmlExpression node);
    T visitDataBindingHtmlExpression(DataBindingHtmlExpression node);

    // css :
    T visitCssRule(CssRule node);
    T visitCssKey(CssKey node);
    T visitCssKeyValue(CssKeyValue node);
    T visitNumericCssValue(NumericCssValue node);
    T visitIdentifierCssValue(IdentifierCssValue node);
    T visitColorCssValue(ColorCssValue node);
    T visitCssSelector(CssSelector node);

}
