package main.java.compiler.ast.java;

import main.java.compiler.ast.AstNode;

public class HtmlTagData extends AstNode {
    private String property;
    private String value;

    // Getters & Setters
    public String getProperty() { return property; }
    public void setProperty(String property) { this.property = property; }

    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }

    @Override
    public String toString() {
        return property + "=\"" + value + "\"";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitHtmlTagData(this);
    }
}