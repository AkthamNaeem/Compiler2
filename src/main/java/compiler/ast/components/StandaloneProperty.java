package compiler.ast.components;

import compiler.ast.AstVisitor;

public class StandaloneProperty extends ComponentPropertyDef {
    private boolean isStandalone;

    public boolean isStandalone() { return isStandalone; }
    public void setStandalone(boolean standalone) { isStandalone = standalone; }

    @Override
    public String toString() {
        return "standalone: " + isStandalone;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitStandaloneProperty(this);
    }
}