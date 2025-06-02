package main.java.compiler.ast;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;
import java.util.ArrayList;
import java.util.List;

public class JsonDef extends AstNode {
    private List<JsonProperty> properties = new ArrayList<>();

    // Getters & Setters
    public List<JsonProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<JsonProperty> properties) {
        this.properties = properties;
    }

    public void addProperty(JsonProperty property) {
        this.properties.add(property);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");

        for (int i = 0; i < properties.size(); i++) {
            sb.append(properties.get(i).toString());
            if (i < properties.size() - 1) {
                sb.append(", ");
            }
        }

        sb.append("}");
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitJsonDef(this);
    }
}