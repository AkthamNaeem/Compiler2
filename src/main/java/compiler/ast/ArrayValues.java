package main.java.compiler.ast;

import java.util.ArrayList;
import java.util.List;

public class ArrayValues extends AstNode {
    private List<AstNode> values = new ArrayList<>();

    // Getters & Setters
    public List<AstNode> getValues() {
        return values;
    }

    public void setValues(List<AstNode> values) {
        this.values = values;
    }

    public void addValue(AstNode value) {
        this.values.add(value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < values.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(values.get(i).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitArrayValues(this);
    }
}