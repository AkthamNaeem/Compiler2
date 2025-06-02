package main.java.compiler.ast;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;
import java.util.ArrayList;
import java.util.List;

public class InterfaceValues extends AstNode {
    private List<AstNode> members = new ArrayList<>();

    // Getters & Setters
    public List<AstNode> getMembers() {
        return members;
    }

    public void setMembers(List<AstNode> members) {
        this.members = members;
    }

    public void addMember(AstNode member) {
        this.members.add(member);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");

        for (int i = 0; i < members.size(); i++) {
            sb.append(members.get(i).toString());
            if (i < members.size() - 1) {
                sb.append(", ");
            }
        }

        sb.append("}");
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitInterfaceValues(this);
    }
}