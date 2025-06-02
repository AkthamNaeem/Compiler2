package main.java.compiler.ast;

import java.util.ArrayList;
import java.util.List;

public class BaseFunctionDeclaration extends AstNode {
    private String name;
    private List<Parameter> params = new ArrayList<>();
    private AstNode returnType;
    private AstNode body;

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Parameter> getParams() { return params; }
    public void addParam(Parameter param) { this.params.add(param); }

    public AstNode getReturnType() { return returnType; }
    public void setReturnType(AstNode returnType) { this.returnType = returnType; }

    public AstNode getBody() { return body; }
    public void setBody(AstNode body) { this.body = body; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (name != null) sb.append(name);
        sb.append("(");
        for (int i = 0; i < params.size(); i++) {
            sb.append(params.get(i).toString());
            if (i < params.size() - 1) sb.append(", ");
        }
        sb.append(")");
        if (returnType != null) sb.append(" : ").append(returnType.toString());
        sb.append(" ").append(body.toString());
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitBaseFunctionDeclaration(this);
    }
}