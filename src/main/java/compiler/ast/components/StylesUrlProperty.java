package compiler.ast.components;

import compiler.ast.AstVisitor;
import java.util.List;

public class StylesUrlProperty extends ComponentPropertyDef {
    private List<String> styleUrls;

    public List<String> getStyleUrls() { return styleUrls; }
    public void setStyleUrls(List<String> styleUrls) { this.styleUrls = styleUrls; }

    @Override
    public String toString() {
        return "styleUrls: " + styleUrls;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitStylesUrlProperty(this);
    }
}