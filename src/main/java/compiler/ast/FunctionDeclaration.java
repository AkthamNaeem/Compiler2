package main.java.compiler.ast;

public class FunctionDeclaration implements AstNode {
    public AstNode returnType;
    public AstNode func;
    public AstNode getFunc() {
        return func;
    }

    public void setFunc(AstNode func) {
        this.func = func;
    }

    public AstNode getReturnType() {
        return returnType;
    }

    public void setReturnType(AstNode returnType) {
        this.returnType = returnType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("function ").append(returnType.toString());
        if (func != null) {
            sb.append(func);
        }
        sb.append("\n");
        return sb.toString();
    }

    @Override
    public <T> T accept (AstVisitor<T> visitor) {
        return visitor.visitFunctionDeclaration (this);
    }
}
