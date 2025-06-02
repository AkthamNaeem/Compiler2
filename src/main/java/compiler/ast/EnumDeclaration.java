package main.java.compiler.ast;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;
import java.util.ArrayList;
import java.util.List;

public class EnumDeclaration extends AstNode {
    private String name;
    private List<EnumVariable> values = new ArrayList<>();

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<EnumVariable> getValues() {
        return values;
    }

    public void addValue(EnumVariable value) {
        this.values.add(value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("enum ").append(name).append(" { ");

        for (int i = 0; i < values.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(values.get(i).toString());
        }

        sb.append(" }");
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitEnumDeclaration(this);
    }
}