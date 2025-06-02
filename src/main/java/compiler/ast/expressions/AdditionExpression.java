package main.java.compiler.ast.expressions;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public abstract class AdditionExpression extends AstNode {
    protected AstNode rightExpr;

    public AstNode getRightExpr() { return rightExpr; }
    public void setRightExpr(AstNode rightExpr) { this.rightExpr = rightExpr; }
}