package main.java.compiler.ast.html;

/**
 * Represents data binding expressions in HTML
 * Example: "{{user.name}}" in template
 */
public class DataBindingHtmlExpression extends HtmlExpression {
    private HtmlDataBinding dataBinding;

    public DataBindingHtmlExpression() {}

    public DataBindingHtmlExpression(HtmlDataBinding dataBinding) {
        this.dataBinding = dataBinding;
    }

    // Getters & Setters
    public HtmlDataBinding getDataBinding() {
        return dataBinding;
    }

    public void setDataBinding(HtmlDataBinding dataBinding) {
        this.dataBinding = dataBinding;
    }

    @Override
    public String toString() {
        return dataBinding.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitDataBindingHtmlExpression(this);
    }
}