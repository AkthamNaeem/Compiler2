package compiler.ast.components;

import compiler.ast.AstVisitor;
import java.util.List;

public class StylesProperty extends ComponentPropertyDef {
    private List<String> styles;

    public List<String> getStyles() { return styles; }
    public void setStyles(List<String> styles) { this.styles = styles; }

    @Override
    public String toString() {
        return "styles: " + styles;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitStylesProperty(this);
    }
}