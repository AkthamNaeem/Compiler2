package compiler.ast.components;

import compiler.ast.AstVisitor;

public class SelectorProperty extends ComponentPropertyDef {
    private String selector;

    public String getSelector() { return selector; }
    public void setSelector(String selector) { this.selector = selector; }

    @Override
    public String toString() {
        return "selector: '" + selector + "'";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitSelectorProperty(this);
    }
}