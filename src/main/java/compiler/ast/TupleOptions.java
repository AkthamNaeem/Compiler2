package main.java.compiler.ast;

import java.util.ArrayList;
import java.util.List;

public class TupleOptions extends AstNode {
    private List<AstNode> types = new ArrayList<>();

    public List<AstNode> getTypes() {
        return types;
    }

    public void setTypes(List<AstNode> types) {
        this.types = types;
    }

    public void addType(AstNode type) {
        this.types.add(type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < types.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(types.get(i).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitTupleOptions(this);
    }
}