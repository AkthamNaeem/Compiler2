package main.java.compiler.ast.html;

public class NgForTemplate extends HtmlTemplateType {
    private AstNode loop;

    // Getters & Setters
    public AstNode getLoop() { return loop; }
    public void setLoop(AstNode loop) { this.loop = loop; }

    @Override
    public String toString() {
        return "*ngFor=\"" + loop.toString() + "\"";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitNgForTemplate(this);
    }
}