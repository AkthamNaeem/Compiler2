package main.java.compiler.ast.templates;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class TemplateSubstitution extends AstNode {
    private AstNode expression; // التعبير داخل ${...}

    // Getters & Setters
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
        return visitor.visitTemplateSubstitution(this);
    }
}