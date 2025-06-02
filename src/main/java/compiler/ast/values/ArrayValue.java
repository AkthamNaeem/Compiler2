package main.java.compiler.ast.values;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class ArrayValue extends AstNode {
    private AstNode arrayValues;

    public AstNode getArrayValues() { return arrayValues; }
    public void setArrayValues(AstNode arrayValues) { this.arrayValues = arrayValues; }

    @Override
    public String toString() {
        return "[" + arrayValues.toString() + "]";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitArrayValue(this);
    }
}