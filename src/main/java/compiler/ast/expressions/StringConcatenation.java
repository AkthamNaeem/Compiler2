package main.java.compiler.ast.expressions;

import main.java.compiler.ast.AstVisitor;

public class StringConcatenation extends AdditionExpression {
    private String leftStr;

    public StringConcatenation(String leftStr, AstNode rightExpr) {
        this.leftStr = leftStr;
        this.rightExpr = rightExpr;
    }

    public String getLeftStr() { return leftStr; }

    @Override
    public String toString() {
        return "\"" + leftStr + "\" + " + rightExpr.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitStringConcatenation(this);
    }
}