package main.java.compiler.ast.types;


import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class GenericArrayType extends AstNode {
    private AstNode type;  // The type inside angle brackets

    public AstNode getType() { return type; }
    public void setType(AstNode type) { this.type = type; }

    @Override
    public String toString() {
        return "Array<" + type.toString() + ">";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitGenericArrayType(this);
    }
}