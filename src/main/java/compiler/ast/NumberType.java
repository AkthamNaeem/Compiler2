package main.java.compiler.ast;

public class NumberType extends TypeOptions {
    @Override
    public String toString() {
        return "number";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitNumberType(this);
    }
}