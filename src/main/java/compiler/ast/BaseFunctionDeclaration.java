package main.java.compiler.ast;

import java.util.ArrayList;
import java.util.List;

public class BaseFunctionDeclaration implements AstNode {
    private String name;
    private List<AstNode> accessModifiers = new ArrayList<>();
    private List<AstNode> functionVariables = new ArrayList<>();
    private AstNode allOptions; // Represents return type after colon
    private AstNode functionBody;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AstNode> getAccessModifiers() {
        return accessModifiers;
    }

    public void setAccessModifiers(List<AstNode> accessModifiers) {
        this.accessModifiers = accessModifiers;
    }

    public List<AstNode> getFunctionVariables() {
        return functionVariables;
    }

    public void setFunctionVariables(List<AstNode> functionVariables) {
        this.functionVariables = functionVariables;
    }

    public AstNode getAllOptions() {
        return allOptions;
    }

    public void setAllOptions(AstNode allOptions) {
        this.allOptions = allOptions;
    }

    public AstNode getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(AstNode functionBody) {
        this.functionBody = functionBody;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (name != null) {
            sb.append(name);
        }

        sb.append("(");
        for (int i = 0; i < functionVariables.size(); i++) {
            if (i < accessModifiers.size() && accessModifiers.get(i) != null) {
                sb.append(accessModifiers.get(i).toString()).append(" ");
            }
            sb.append(functionVariables.get(i).toString());

            if (i < functionVariables.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(")");

        if (allOptions != null) {
            sb.append(": ").append(allOptions.toString());
        }

        sb.append(" {\n");
        if (functionBody != null) {
            sb.append("\t").append(functionBody.toString());
        }
        sb.append("\n}");

        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitBaseFunctionDeclaration(this);
    }
}
