package main.java.compiler.ast.declarations;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class SelectorDef extends AstNode {
    private String selector;

    public SelectorDef(String selector) {
        this.selector = selector.substring(1, selector.length() - 1);
    }

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    @Override
    public String toString() {
        return "selector: '" + selector + "'";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitSelectorDef(this);
    }
}