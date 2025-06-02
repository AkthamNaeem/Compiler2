package main.java.compiler.ast.css;

public class IdentifierCssValue extends CssValue {
    private String identifier;

    // Getters & Setters
    public String getIdentifier() { return identifier; }
    public void setIdentifier(String identifier) { this.identifier = identifier; }

    @Override
    public String toString() {
        return identifier;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitIdentifierCssValue(this);
    }
}