package main.java.compiler.ast;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class InterfaceObject extends AstNode {
    private String name;
    private AstNode type;  // نتيجة visit(typeOptions)

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AstNode getType() {
        return type;
    }

    public void setType(AstNode type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return name + " : " + type.toString() + ";";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitInterfaceObject(this);
    }
}