package main.java.compiler.ast.declarations;

public class TemplateDef extends AstNode {
    private String startLiteral;
    private AstNode content;
    private String endLiteral;

    // Getters & Setters
    public String getStartLiteral() {
        return startLiteral;
    }

    public void setStartLiteral(String startLiteral) {
        this.startLiteral = startLiteral;
    }

    public AstNode getContent() {
        return content;
    }

    public void setContent(AstNode content) {
        this.content = content;
    }

    public String getEndLiteral() {
        return endLiteral;
    }

    public void setEndLiteral(String endLiteral) {
        this.endLiteral = endLiteral;
    }

    @Override
    public String toString() {
        return "template: " + startLiteral + content.toString() + endLiteral;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitTemplateDef(this);
    }
}