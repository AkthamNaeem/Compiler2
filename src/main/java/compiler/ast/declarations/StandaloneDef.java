package main.java.compiler.ast.declarations;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class StandaloneDef extends AstNode {
    private boolean value;

    public StandaloneDef(boolean value) {
        this.value = value;
    }

    // Getters & Setters
    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "standalone: " + value;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitStandaloneDef(this);
    }
}