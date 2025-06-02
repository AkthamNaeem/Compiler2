package main.java.compiler.ast.html;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;
import java.util.List;

/**
 * Represents standard HTML element with opening and closing tags
 */
public class StandardHtmlElement extends HtmlElement {
    private HtmlTag openingTag;
    private List<HtmlContent> content;
    private HtmlClosingTag closingTag;

    public HtmlTag getOpeningTag() {
        return openingTag;
    }

    public void setOpeningTag(HtmlTag openingTag) {
        this.openingTag = openingTag;
    }

    public List<HtmlContent> getContent() {
        return content;
    }

    public void setContent(List<HtmlContent> content) {
        this.content = content;
    }

    public HtmlClosingTag getClosingTag() {
        return closingTag;
    }

    public void setClosingTag(HtmlClosingTag closingTag) {
        this.closingTag = closingTag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(openingTag.toString());

        if (content != null) {
            for (HtmlContent item : content) {
                sb.append(item.toString());
            }
        }

        sb.append(closingTag.toString());
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitStandardHtmlElement(this);
    }
}