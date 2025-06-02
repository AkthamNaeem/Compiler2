package main.java.compiler.ast.css;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;
import java.util.ArrayList;
import java.util.List;

public class CssSelector extends AstNode {
    private String prefix; // "." أو "#" أو null
    private CssKey base;
    private List<CssKey> modifiers = new ArrayList<>();

    // Getters & Setters
    public String getPrefix() { return prefix; }
    public void setPrefix(String prefix) { this.prefix = prefix; }

    public CssKey getBase() { return base; }
    public void setBase(CssKey base) { this.base = base; }

    public List<CssKey> getModifiers() { return modifiers; }
    public void addModifier(CssKey modifier) { this.modifiers.add(modifier); }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (prefix != null) sb.append(prefix);
        sb.append(base.toString());

        for (CssKey mod : modifiers) {
            sb.append(":").append(mod.toString());
        }

        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitCssSelector(this);
    }
}