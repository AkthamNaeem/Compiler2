package main.java.compiler.ast.services;

import java.util.ArrayList;
import java.util.List;

public class ServiceDef extends AstNode {
    private List<ServiceProperty> properties = new ArrayList<>();

    // Getters & Setters
    public List<ServiceProperty> getProperties() {
        return properties;
    }

    public void addProperty(ServiceProperty property) {
        this.properties.add(property);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("@Injectable({");
        for (int i = 0; i < properties.size(); i++) {
            sb.append(properties.get(i).toString());
            if (i < properties.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("})");
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitServiceDef(this);
    }
}