package main.java.compiler.ast;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class ClassFunctionCall extends AstNode {
    private AstNode functionCall;  // نتيجة visit(functionCall)

    // Getter & Setter
    public AstNode getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(AstNode functionCall) {
        this.functionCall = functionCall;
    }

    @Override
    public String toString() {
        return functionCall.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitClassFunctionCall(this);
    }
}