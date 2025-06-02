package main.java.compiler.ast;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class JsonProperty extends AstNode {
    private String key;
    private AstNode value;

    // Constructors
    public JsonProperty() {}

    public JsonProperty(String key, AstNode value) {
        this.key = key;
        this.value = value;
    }

    // Getters & Setters
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        if (key == null || key.trim().isEmpty()) {
            throw new IllegalArgumentException("JSON property key cannot be empty");
        }
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
        return String.format("\"%s\": %s",
                key,
                value != null ? value.toString() : "null");
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitJsonProperty(this);
    }
}