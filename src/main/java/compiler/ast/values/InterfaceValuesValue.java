package main.java.compiler.ast.values;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class InterfaceValuesValue extends AstNode {
    private AstNode interfaceValues;

    public AstNode getInterfaceValues() { return interfaceValues; }
    public void setInterfaceValues(AstNode interfaceValues) { this.interfaceValues = interfaceValues; }

    @Override
    public String toString() { return interfaceValues.toString(); }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitInterfaceValuesValue(this);
    }
}