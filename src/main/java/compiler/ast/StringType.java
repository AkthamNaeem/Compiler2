package main.java.compiler.ast;

public class StringType extends TypeOptions {
    @Override
    public String toString() {
        return "string";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitStringType(this);
    }
}