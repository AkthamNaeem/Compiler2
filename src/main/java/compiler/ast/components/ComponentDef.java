package compiler.ast.components;

import compiler.ast.AstNode;
import compiler.ast.AstVisitor;
import java.util.ArrayList;
import java.util.List;

public class ComponentDef extends AstNode {
    private final List<ComponentPropertyDef> properties = new ArrayList<>();

    public void addProperty(ComponentPropertyDef property) {
        properties.add(property);
    }

    public List<ComponentPropertyDef> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("@Component({");
        properties.forEach(p -> sb.append(p).append(", "));
        if (!properties.isEmpty()) sb.setLength(sb.length() - 2);
        return sb.append("})").toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitComponentDef(this);
    }
}