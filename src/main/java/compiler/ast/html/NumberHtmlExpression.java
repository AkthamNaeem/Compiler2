package main.java.compiler.ast.html;

/**
 * Represents numeric values in HTML expressions
 * Example: "42" in template
 */
public class NumberHtmlExpression extends HtmlExpression {
    private String number;

    public NumberHtmlExpression() {}

    public NumberHtmlExpression(String number) {
        this.number = number;
    }

    // Getters & Setters
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitNumberHtmlExpression(this);
    }
}