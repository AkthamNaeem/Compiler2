package main.java.compiler.ast.html;

import main.java.compiler.ast.AstNode;

/**
 * Represents HTML closing tag
 */
public class HtmlClosingTag extends AstNode {
    private String tagName;

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return "</" + tagName + ">";
    }
}