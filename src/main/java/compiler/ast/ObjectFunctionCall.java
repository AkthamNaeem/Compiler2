package main.java.compiler.ast;

import java.util.ArrayList;
import java.util.List;

public class ObjectFunctionCall extends AstNode {
    private boolean isThis;
    private boolean isSuper;
    private AstNode object;
    private String methodName;
    private List<AstNode> arguments = new ArrayList<>();

    // Getters & Setters
    public boolean isThis() {
        return isThis;
    }

    public void setThis(boolean isThis) {
        this.isThis = isThis;
    }

    public boolean isSuper() {
        return isSuper;
    }

    public void setSuper(boolean isSuper) {
        this.isSuper = isSuper;
    }

    public AstNode getObject() {
        return object;
    }

    public void setObject(AstNode object) {
        this.object = object;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public List<AstNode> getArguments() {
        return arguments;
    }

    public void setArguments(List<AstNode> arguments) {
        this.arguments = arguments;
    }

    public void addArgument(AstNode argument) {
        this.arguments.add(argument);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (isThis) {
            sb.append("this.");
        } else if (isSuper) {
            sb.append("super.");
        }

        sb.append(object.toString())
                .append(".")
                .append(methodName)
                .append("(");

        for (int i = 0; i < arguments.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(arguments.get(i).toString());
        }

        sb.append(")");
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitObjectFunctionCall(this);
    }
}