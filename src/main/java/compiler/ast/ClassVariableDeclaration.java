package main.java.compiler.ast;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class ClassVariableDeclaration extends AstNode {
    private AstNode variableDeclaration;  // نتيجة visit(variableDeclarationWithinClass)

    // Getter & Setter
    public AstNode getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(AstNode variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    @Override
    public String toString() {
        return variableDeclaration.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitClassVariableDeclaration(this);
    }
}