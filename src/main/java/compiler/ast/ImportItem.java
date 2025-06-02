package main.java.compiler.ast;

public class ImportItem extends AstNode {
    private String module;

    // Getters & Setters
    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    @Override
    public String toString() {
        return module;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitImportItem(this);
    }
}