package main.java.compiler.ast;

public class BooleanType extends TypeOptions {
    @Override
    public String toString() {
        return "boolean";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitBooleanType(this);
    }
}