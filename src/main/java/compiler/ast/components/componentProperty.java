package main.java.compiler.ast.components;

public class ComponentProperty extends AstNode {
    private String name;
    private AstNode value;

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AstNode getValue() {
        return value;
    }

    public void setValue(AstNode value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return name + ": " + value.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitComponentProperty(this);
    }
}