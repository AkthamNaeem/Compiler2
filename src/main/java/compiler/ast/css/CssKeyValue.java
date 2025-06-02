package main.java.compiler.ast.css;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class CssKeyValue extends AstNode {
    private CssKey key;
    private AstNode value;

    // Getters & Setters
    public CssKey getKey() { return key; }
    public void setKey(CssKey key) { this.key = key; }

    public AstNode getValue() { return value; }
    public void setValue(AstNode value) { this.value = value; }

    @Override
    public String toString() {
        return key.toString() + ": " + value.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitCssKeyValue(this);
    }
}