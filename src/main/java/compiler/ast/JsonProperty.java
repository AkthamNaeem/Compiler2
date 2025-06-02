package main.java.compiler.ast;

public class JsonProperty extends AstNode {
    private String key;
    private AstNode value;

    // Getters & Setters
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public AstNode getValue() {
        return value;
    }

    public void setValue(AstNode value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\"" + key + "\": " + (value != null ? value.toString() : "null");
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitJsonProperty(this);
    }
}