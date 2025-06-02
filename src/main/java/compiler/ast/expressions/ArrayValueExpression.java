package main.java.compiler.ast.expressions;

import main.java.compiler.ast.expressions.Expression;
import main.java.compiler.ast.AstVisitor;
import java.util.ArrayList;
import java.util.List;

public class ArrayValueExpression extends Expression {
    private List<Expression> elements = new ArrayList<>();

    // Methods
    public void addElement(Expression element) {
        elements.add(element);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        elements.forEach(e -> sb.append(e.toString()).append(", "));
        if (!elements.isEmpty()) {
            sb.setLength(sb.length() - 2); // إزالة آخر ", "
        }
        sb.append(" ]");
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitArrayValueExpression(this);
    }
}