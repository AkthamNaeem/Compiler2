package main.java.compiler.ast.style;

import java.util.ArrayList;
import java.util.List;

public class StylesDef extends AstNode {
    private List<StyleDef> styleDefs = new ArrayList<>();

    public List<StyleDef> getStyleDefs() {
        return styleDefs;
    }

    public void addStyleDef(StyleDef styleDef) {
        this.styleDefs.add(styleDef);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("styles: [");
        for (int i = 0; i < styleDefs.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(styleDefs.get(i).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitStylesDef(this);
    }
}