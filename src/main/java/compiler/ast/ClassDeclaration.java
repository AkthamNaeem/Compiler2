package main.java.compiler.ast;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;
import java.util.ArrayList;
import java.util.List;

public class ClassDeclaration extends AstNode {
    private String className;
    private String parentClass; // nullable
    private List<AstNode> members = new ArrayList<>();

    // Getters & Setters
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getParentClass() {
        return parentClass;
    }

    public void setParentClass(String parentClass) {
        this.parentClass = parentClass;
    }

    public List<AstNode> getMembers() {
        return members;
    }

    public void addMember(AstNode member) {
        this.members.add(member);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ").append(className);

        if (parentClass != null) {
            sb.append(" extends ").append(parentClass);
        }

        sb.append(" {\n");
        for (AstNode member : members) {
            sb.append("  ").append(member.toString()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitClassDeclaration(this);
    }
}