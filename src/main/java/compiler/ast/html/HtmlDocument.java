package main.java.compiler.ast.html;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;
import java.util.List;

/**
 * Represents the root HTML document containing all elements
 */
public class HtmlDocument extends AstNode {
    private List<HtmlElement> elements;

    public List<HtmlElement> getElements() {
        return elements;
    }

    public void setElements(List<HtmlElement> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (HtmlElement element : elements) {
            sb.append(element.toString());
        }
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitHtmlDocument(this);
    }
}