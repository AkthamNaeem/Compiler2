package main.java.compiler.ast.html;

/**
 * Wrapper for HTML elements when they appear as content
 */
public class HtmlElementContent implements HtmlContent {
    private HtmlElement element;

    public HtmlElement getElement() {
        return element;
    }

    public void setElement(HtmlElement element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return element.toString();
    }
}