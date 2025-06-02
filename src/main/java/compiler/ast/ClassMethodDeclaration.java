package main.java.compiler.ast;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class ClassMethodDeclaration extends AstNode {
    private AstNode methodDeclaration;  // نتيجة visit(functionDeclarationWithinClass)

    // Getter & Setter
    public AstNode getMethodDeclaration() {
        return methodDeclaration;
    }

    public void setMethodDeclaration(AstNode methodDeclaration) {
        this.methodDeclaration = methodDeclaration;
    }

    @Override
    public String toString() {
        return methodDeclaration.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitClassMethodDeclaration(this);
    }
}