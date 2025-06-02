package main.java.compiler.ast.html;

import main.java.compiler.ast.AstNode;
import java.util.List;
import java.util.ArrayList;

public class HtmlDataBinding extends AstNode {
    private List<AstNode> expressions = new ArrayList<>();

    // Getters & Setters
    public List<AstNode> getExpressions() { return expressions; }
    public void setExpressions(List<AstNode> expressions) { this.expressions = expressions; }
    public void addExpression(AstNode expr) { this.expressions.add(expr); }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{{ ");
        for (AstNode expr : expressions) {
            sb.append(expr.toString()).append(" ");
        }
        sb.append("}}");
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitHtmlDataBinding(this);
    }
}