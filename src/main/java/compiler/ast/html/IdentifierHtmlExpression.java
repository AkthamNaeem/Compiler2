package main.java.compiler.ast.html;

/**
 * Represents an identifier in HTML expressions
 * Example: "userName" in template
 */
public class IdentifierHtmlExpression extends HtmlExpression {
    private String identifier;

    public IdentifierHtmlExpression() {}

    public IdentifierHtmlExpression(String identifier) {
        this.identifier = identifier;
    }

    // Getters & Setters
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return identifier;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitIdentifierHtmlExpression(this);
    }
}