package main.java.compiler.ast;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;
import java.util.ArrayList;
import java.util.List;

public class InterfaceDeclaration extends AstNode {
    private String name;
    private List<AstNode> members = new ArrayList<>();

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        sb.append("interface ").append(name).append(" {\n");
        for (AstNode member : members) {
            sb.append("  ").append(member.toString()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitInterfaceDeclaration(this);
    }
}