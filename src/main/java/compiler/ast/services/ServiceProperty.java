package main.java.compiler.ast.services;

public class ServiceProperty extends AstNode {
    private String name;
    private ServicePropertyValue value;

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServicePropertyValue getValue() {
        return value;
    }

    public void setValue(ServicePropertyValue value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return name + ": " + value.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitServiceProperty(this);
    }
}