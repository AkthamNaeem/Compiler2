package main.java.compiler.ast.values;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class IdentifierValue extends AstNode {
    private String name;

    public IdentifierValue(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitIdentifierValue(this);
    }
}