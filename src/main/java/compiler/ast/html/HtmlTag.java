package main.java.compiler.ast.html;

import main.java.compiler.ast.AstNode;
import java.util.List;

/**
 * Represents HTML opening tag with attributes and directives
 */
public class HtmlTag extends AstNode {
    private String tagName;
    private List<HtmlAttribute> attributes;
    private List<HtmlDirective> directives;

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

    public List<HtmlDirective> getDirectives() {
        return directives;
    }

    public void setDirectives(List<HtmlDirective> directives) {
        this.directives = directives;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<").append(tagName);

        if (directives != null) {
            for (HtmlDirective directive : directives) {
                sb.append(" ").append(directive.toString());
            }
        }

        if (attributes != null) {
            for (HtmlAttribute attr : attributes) {
                sb.append(" ").append(attr.toString());
            }
        }

        sb.append(">");
        return sb.toString();
    }
}