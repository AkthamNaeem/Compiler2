package main.java.compiler.ast.literals;

import main.java.compiler.ast.AstVisitor;

public class TemplateSubstitutionContent implements LiteralContent {
    private AstNode expression; // يمكن أن يكون أي تعبير صالح (متغير، عملية حسابية، إلخ)

    public AstNode getExpression() {
        return expression;
    }

    public void setExpression(AstNode expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "${" + expression.toString() + "}";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitTemplateSubstitutionContent(this);
    }
}