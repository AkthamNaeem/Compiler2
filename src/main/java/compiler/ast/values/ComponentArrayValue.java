package main.java.compiler.ast.values;

import java.util.ArrayList;
import java.util.List;

public class ComponentArrayValue extends AstNode {
    private List<AstNode> elements = new ArrayList<>();

    public void addElement(AstNode element) {
        elements.add(element);
    }

    public List<AstNode> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < elements.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(elements.get(i));
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitComponentArrayValue(this);
    }
}