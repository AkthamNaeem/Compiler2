package main.java.compiler.ast.expressions;

import main.java.compiler.ast.AstVisitor;
import java.util.Map;

public class PrimaryObject extends PrimaryExpression {
    private final Map<String, AstNode> properties;

    public PrimaryObject(Map<String, AstNode> props) {
        this.properties = props;
    }

    public Map<String, AstNode> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return properties.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitPrimaryObject(this);
    }
}