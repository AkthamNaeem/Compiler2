package main.java.compiler.ast.modifiers;

import main.java.compiler.ast.AstVisitor;

public class PublicModifier extends AccessModifier {
    @Override
    public String toString() {
        return "public";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitPublicModifier(this);
    }
}