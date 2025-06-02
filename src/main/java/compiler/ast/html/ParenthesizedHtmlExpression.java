package main.java.compiler.ast.html;

/**
 * Represents parenthesized expressions in HTML
 * Example: "(user.age)" in template
 */
public class ParenthesizedHtmlExpression extends HtmlExpression {
    private HtmlExpression expression;

    public ParenthesizedHtmlExpression() {}

    public ParenthesizedHtmlExpression(HtmlExpression expression) {
        this.expression = expression;
    }

    // Getters & Setters
    public HtmlExpression getExpression() {
        return expression;
    }

    public void setExpression(HtmlExpression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "(" + expression.toString() + ")";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitParenthesizedHtmlExpression(this);
    }
}