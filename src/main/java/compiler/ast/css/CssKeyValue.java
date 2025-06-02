package main.java.compiler.ast.css;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;
import java.util.ArrayList;
import java.util.List;

public class CssKeyValue extends AstNode {
    private CssKey key;
    private List<CssValue> values = new ArrayList<>();

    // Getters & Setters
    public CssKey getKey() { return key; }
    public void setKey(CssKey key) { this.key = key; }

    public List<CssValue> getValues() { return values; }
    public void addValue(CssValue value) { this.values.add(value); }

    @Override
    public String toString() {
        return key.toString() + ": " + String.join(" ",
                values.stream().map(v -> v.toString()).toArray(String[]::new));
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitCssKeyValue(this);
    }
}