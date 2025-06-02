package main.java.compiler.ast;

public class FunctionDeclarationWithinClass implements AstNode {
    public AstNode returnType;
    public AstNode func;

    public AstNode getReturnType() {
        return returnType;
    }

    public void setReturnType(AstNode returnType) {
        this.returnType = returnType;
    }

    public AstNode getFunc() {
        return func;
    }

    public void setFunc(AstNode func) {
        this.func = func;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (returnType != null) {
            sb.append(returnType).append(" ");
        }

        if (func != null) {
            sb.append(func);
        } else {
            sb.append("undefined base function");
        }

        return sb.toString().trim();
    }

    @Override
    public <T> T accept (AstVisitor<T> visitor) {
        return visitor.visitFunctionAssignDeclaration (this);
    }
}
