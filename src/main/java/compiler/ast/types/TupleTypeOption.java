package main.java.compiler.ast.types;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class TupleTypeOption extends AstNode {
    private AstNode tupleOptions;

    public AstNode getTupleOptions() { return tupleOptions; }
    public void setTupleOptions(AstNode tupleOptions) { this.tupleOptions = tupleOptions; }

    @Override
    public String toString() {
        return tupleOptions.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitTupleTypeOption(this);
    }
}