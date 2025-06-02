package main.java.compiler.ast;


import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class ModuleDeclaration extends AstNode {
    private AstNode exportedDeclaration;


    public AstNode getExportedDeclaration() {
        return exportedDeclaration;
    }

    public void setExportedDeclaration(AstNode exportedDeclaration) {
        this.exportedDeclaration = exportedDeclaration;
    }

    @Override
    public String toString() {
        return "export " + exportedDeclaration.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitModuleDeclaration(this);
    }
}