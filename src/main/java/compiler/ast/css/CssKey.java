package main.java.compiler.ast.css;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;
import java.util.ArrayList;
import java.util.List;

public class CssKey extends AstNode {
    private String base;
    private List<String> parts = new ArrayList<>();

    // Getters & Setters
    public String getBase() { return base; }
    public void setBase(String base) { this.base = base; }

    public List<String> getParts() { return parts; }
    public void addPart(String part) { this.parts.add(part); }

    public String getFullKey() {
        if (parts.isEmpty()) return base;
        return base + String.join("", parts);
    }

    @Override
    public String toString() {
        return getFullKey();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitCssKey(this);
    }
}