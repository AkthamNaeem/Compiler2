package main.java.compiler.ast.html;

import main.java.compiler.ast.AstNode;
import java.util.List;

/**
 * Represents self-closing HTML tag
 */
public class SelfClosingTag extends AstNode {
    private String tagName;
    private List<HtmlAttribute> attributes;

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List<HtmlAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<HtmlAttribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<").append(tagName);

        if (attributes != null) {
            for (HtmlAttribute attr : attributes) {
                sb.append(" ").append(attr.toString());
            }
        }

        sb.append("/>");
        return sb.toString();
    }
}