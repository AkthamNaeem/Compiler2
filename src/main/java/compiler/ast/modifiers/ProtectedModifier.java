package main.java.compiler.ast.modifiers;

import main.java.compiler.ast.AstVisitor;

public class ProtectedModifier extends AccessModifier {
    @Override
    public String toString() {
        return "protected";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitProtectedModifier(this);
    }
}