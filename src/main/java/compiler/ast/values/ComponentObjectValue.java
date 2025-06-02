package main.java.compiler.ast.values;

import java.util.LinkedHashMap;
import java.util.Map;

public class ComponentObjectValue extends AstNode {
    private Map<String, AstNode> properties = new LinkedHashMap<>();

    public void addProperty(String key, AstNode value) {
        properties.put(key, value);
    }

    public Map<String, AstNode> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        boolean first = true;
        for (Map.Entry<String, AstNode> entry : properties.entrySet()) {
            if (!first) sb.append(", ");
            sb.append(entry.getKey()).append(": ").append(entry.getValue());
            first = false;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitComponentObjectValue(this);
    }
}