package compiler.ast.components;

import compiler.ast.AstVisitor;
import java.util.List;

public class ImportsProperty extends ComponentPropertyDef {
    private List<String> imports;

    public List<String> getImports() { return imports; }
    public void setImports(List<String> imports) { this.imports = imports; }

    @Override
    public String toString() {
        return "imports: " + imports;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitImportsProperty(this);
    }
}