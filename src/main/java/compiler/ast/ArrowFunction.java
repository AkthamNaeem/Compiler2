package main.java.compiler.ast;

import java.util.ArrayList;
import java.util.List;

public class ArrowFunction extends AstNode {
    private List<FunctionVariable> parameters = new ArrayList<>();
    private AstNode returnType;
    private AstNode body;
    private boolean isExpressionBody;

    // Getters & Setters
    public List<FunctionVariable> getParameters() {
        return parameters;
    }

    public void addParameter(FunctionVariable parameter) {
        this.parameters.add(parameter);
    }

    public AstNode getReturnType() {
        return returnType;
    }

    public void setReturnType(AstNode returnType) {
        this.returnType = returnType;
    }

    public AstNode getBody() {
        return body;
    }

    public void setBody(AstNode body, boolean isExpressionBody) {
        this.body = body;
        this.isExpressionBody = isExpressionBody;
    }

    public boolean isExpressionBody() {
        return isExpressionBody;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");

        for (int i = 0; i < parameters.size(); i++) {
            sb.append(parameters.get(i).toString());
            if (i < parameters.size() - 1) {
                sb.append(", ");
            }
        }

        sb.append(")");

        if (returnType != null) {
            sb.append(": ").append(returnType.toString());
        }

        sb.append(" => ");
        sb.append(body.toString());

        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitArrowFunction(this);
    }
}