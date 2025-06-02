package main.java.compiler.ast.types;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class ArrayTypeOption extends AstNode {
    private AstNode arrayOptions;  // The array type definition

    public AstNode getArrayOptions() { return arrayOptions; }
    public void setArrayOptions(AstNode arrayOptions) { this.arrayOptions = arrayOptions; }

    @Override
    public String toString() {
        return arrayOptions.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitArrayTypeOption(this);
    }
}