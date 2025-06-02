package main.java.compiler.ast.html;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

/**
 * Represents self-closing HTML elements like <img/>, <input/>
 */
public class SelfClosingHtmlElement extends HtmlElement {
    private SelfClosingTag tag;

    public SelfClosingTag getTag() {
        return tag;
    }

    public void setTag(SelfClosingTag tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return tag.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitSelfClosingHtmlElement(this);
    }
}