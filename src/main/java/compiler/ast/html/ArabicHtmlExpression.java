package main.java.compiler.ast.html;

/**
 * Represents Arabic text in HTML expressions
 * Example: "مرحبا" in template
 */
public class ArabicHtmlExpression extends HtmlExpression {
    private String value;

    public ArabicHtmlExpression() {}

    public ArabicHtmlExpression(String value) {
        this.value = value;
    }

    // Getters & Setters
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitArabicHtmlExpression(this);
    }
}