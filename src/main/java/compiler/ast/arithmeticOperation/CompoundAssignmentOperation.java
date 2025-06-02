package main.java.compiler.ast.arithmeticOperation;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class CompoundAssignmentOperation extends ArithmeticOperation {
    String name;
    String operator;
    AstNode expression;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getOperator () {
        return operator;
    }

    public void setOperator (String operator) {
        this.operator = operator;
    }

    public AstNode getExpression () {
        return expression;
    }

    public void setExpression (AstNode expression) {
        this.expression = expression;
    }

    @Override
    public String toString () {
        StringBuilder sb = new StringBuilder ();

        sb.append (this.getName ());
        sb.append (this.getOperator ());
        sb.append ("=");
        sb.append (this.getExpression ().toString ());

        return sb.toString ();
    }

    @Override
    public <T> T accept (AstVisitor<T> visitor) {
        return visitor.visitCompoundAssignmentOperation (this);
    }
}
