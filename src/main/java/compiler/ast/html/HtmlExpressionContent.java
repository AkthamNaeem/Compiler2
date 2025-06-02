package main.java.compiler.ast.html;

import main.java.compiler.ast.AstNode;

/**
 * Wrapper for expressions when they appear in HTML content
 */
public class HtmlExpressionContent implements HtmlContent {
    private AstNode expression;

    public AstNode getExpression() {
        return expression;
    }

    public void setExpression(AstNode expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "{{" + expression.toString() + "}}";
    }
}