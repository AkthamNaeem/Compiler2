package main.java.compiler.ast.declarations;

public class TemplateUrlDef extends AstNode {
    private String path;

    // Getter & Setter
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "templateUrl: " + path;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitTemplateUrlDef(this);
    }
}