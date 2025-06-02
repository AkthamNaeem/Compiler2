package main.java.compiler.ast.values;

public class ComponentStringValue extends AstNode {
    private String value;

    public ComponentStringValue(String value) {
        this.value = value;
    }

    public String getRawValue() {
        return value.replaceAll("^[\"']|[\"']$", "");
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitComponentStringValue(this);
    }
}