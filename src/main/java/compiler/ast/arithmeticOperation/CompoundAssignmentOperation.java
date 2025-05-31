package main.java.compiler.ast.arithmeticOperation;

import main.java.compiler.ast.AstVisitor;

public class CompoundAssignmentOperation extends ArithmeticOperation {
    @Override
    public <T> T accept (AstVisitor<T> visitor) {
        return null;
    }
}
