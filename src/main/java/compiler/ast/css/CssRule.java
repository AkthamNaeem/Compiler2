package main.java.compiler.ast.css;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;
import java.util.ArrayList;
import java.util.List;

public class CssRule extends AstNode {
    private AstNode selector;
    private List<CssKeyValue> properties = new ArrayList<>();

    // Getters & Setters
    public AstNode getSelector() { return selector; }
    public void setSelector(AstNode selector) { this.selector = selector; }

    public List<CssKeyValue> getProperties() { return properties; }
    public void addProperty(CssKeyValue property) { this.properties.add(property); }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(selector.toString()).append(" {\n");
        for (CssKeyValue prop : properties) {
            sb.append("  ").append(prop.toString()).append(";\n");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitCssRule(this);
    }
}