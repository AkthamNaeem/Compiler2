package main.java.compiler.ast.modifiers;

import main.java.compiler.ast.AstVisitor;

public class PrivateModifier extends AccessModifier {
    @Override
    public String toString() {
        return "private";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitPrivateModifier(this);
    }
}