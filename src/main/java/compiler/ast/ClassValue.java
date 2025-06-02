package main.java.compiler.ast;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;
import java.util.ArrayList;
import java.util.List;

public class ClassValue extends AstNode {
    private String className;
    private List<AstNode> arguments = new ArrayList<>();

    // Getters & Setters
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
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
        sb.append("new ").append(className).append("(");

        for (int i = 0; i < arguments.size(); i++) {
            sb.append(arguments.get(i).toString());
            if (i < arguments.size() - 1) {
                sb.append(", ");
            }
        }

        sb.append(")");
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitClassValue(this);
    }
}