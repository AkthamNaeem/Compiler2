package compiler.ast.components;

import compiler.ast.AstVisitor;
import java.util.Map;

public class CustomProperty extends ComponentPropertyDef {
    private Map<String, Object> properties;

    public Map<String, Object> getProperties() { return properties; }
    public void setProperties(Map<String, Object> properties) { this.properties = properties; }

    @Override
    public String toString() {
        return "custom: " + properties;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitCustomProperty(this);
    }
}