package main.java.compiler.ast.html;

/**
 * Represents addition operation in HTML expressions
 * Example: "user.age + 5" in template
 */
public class AdditionHtmlExpression extends HtmlExpression {
    private HtmlExpression left;
    private HtmlExpression right;

    public AdditionHtmlExpression() {}

    public AdditionHtmlExpression(HtmlExpression left, HtmlExpression right) {
        this.left = left;
        this.right = right;
    }

    // Getters & Setters
    public HtmlExpression getLeft() {
        return left;
    }

    public void setLeft(HtmlExpression left) {
        this.left = left;
    }

    public HtmlExpression getRight() {
        return right;
    }

    public void setRight(HtmlExpression right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return left.toString() + " + " + right.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitAdditionHtmlExpression(this);
    }
}