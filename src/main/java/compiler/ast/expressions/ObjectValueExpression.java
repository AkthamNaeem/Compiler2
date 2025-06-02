package main.java.compiler.ast.expressions;

import main.java.compiler.ast.expressions.Expression;
import main.java.compiler.ast.AstVisitor;
import java.util.LinkedHashMap;
import java.util.Map;

public class ObjectValueExpression extends Expression {
    private Map<String, Expression> properties = new LinkedHashMap<>();

    // Methods
    public void addProperty(String key, Expression value) {
        properties.put(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{ ");
        properties.forEach((k, v) -> sb.append(k).append(": ").append(v).append(", "));
        if (!properties.isEmpty()) {
            sb.setLength(sb.length() - 2); // إزالة آخر ", "
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitObjectValueExpression(this);
    }
}