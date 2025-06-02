package main.java.compiler.ast.expressions;

import main.java.compiler.ast.AstVisitor;

public class NestedAddition extends AdditionExpression {
    private AdditionExpression leftAdd;

    public NestedAddition(AdditionExpression leftAdd, AstNode rightExpr) {
        this.leftAdd = leftAdd;
        this.rightExpr = rightExpr;
    }

    public AdditionExpression getLeftAdd() { return leftAdd; }

    @Override
    public String toString() {
        return leftAdd.toString() + " + " + rightExpr.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitNestedAddition(this);
    }
}