package main.java.compiler.ast.html;

public class NgIfTemplate extends HtmlTemplateType {
    private AstNode condition;

    // Getters & Setters
    public AstNode getCondition() { return condition; }
    public void setCondition(AstNode condition) { this.condition = condition; }

    @Override
    public String toString() {
        return "*ngIf=\"" + condition.toString() + "\"";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitNgIfTemplate(this);
    }
}